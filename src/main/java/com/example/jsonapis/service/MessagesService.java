/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.service;

import com.example.jsonapis.Dto.MessageAppDto;
import com.example.jsonapis.Dto.MessageListDto;
import com.example.jsonapis.Dto.MessageUpdateDto;
import com.example.jsonapis.Dto.MessagesCreateDto;
import com.example.jsonapis.Dto.MessagesDto;
import com.example.jsonapis.Dto.MessagesGetDto;
import com.example.jsonapis.Repository.MessagesRepository;
import com.example.jsonapis.mapper.Mapper;
import com.example.jsonapis.model.Messages;
import java.util.List;
import javax.persistence.NoResultException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class MessagesService {

    private static final Logger logger = LogManager.getLogger(MessagesService.class);

    @Autowired
    MessagesRepository messagesRepository;

//    public MessagesGetDto getAllModule(){
//        List<Messages> messages=messagesRepository.findAll();   
//        List<MessagesDto> dtos=Mapper.INSTANCE.convertClassToDto(messages);
//        return new MessagesGetDto(dtos);
//        
//    }
    public MessagesGetDto getAllModule(MessageAppDto propdto) {
        try {
            logger.info("Enter:[{}]", propdto);
            List<Messages> messagess = messagesRepository.findAll();
            for (Messages object : messagess) {
                if (propdto.getAppName().equalsIgnoreCase("") && propdto.getDescription().equalsIgnoreCase(object.getDescription())) {
                    List<Messages> config1 = messagesRepository.getByDescription(propdto.getDescription());
                    List<MessagesDto> propDto = Mapper.INSTANCE.convertClassToDto(config1);
                    return new MessagesGetDto(propDto);
                } else if (propdto.getAppName().equalsIgnoreCase(object.getAppName()) && propdto.getDescription().equalsIgnoreCase("")) {
                    List<Messages> config2 = messagesRepository.getByAppname(propdto.getAppName());
                    List<MessagesDto> propDto = Mapper.INSTANCE.convertClassToDto(config2);
                    return new MessagesGetDto(propDto);
                } else if (propdto.getAppName().equalsIgnoreCase("") && propdto.getDescription().equalsIgnoreCase("")) {
                    List<Messages> config3 = messagesRepository.getAllData();
                    List<MessagesDto> propDto = Mapper.INSTANCE.convertClassToDto(config3);
                    return new MessagesGetDto(propDto);
                } else if (propdto.getAppName().equalsIgnoreCase(object.getAppName()) && propdto.getDescription().equalsIgnoreCase(object.getDescription())) {
                    List<Messages> config1 = messagesRepository.getByDescription(propdto.getDescription());
                    List<MessagesDto> propDto = Mapper.INSTANCE.convertClassToDto(config1);
                    return new MessagesGetDto(propDto);
                }

            }
            return new MessagesGetDto();
        } catch (Exception e) {
            return new MessagesGetDto();
        }
    }

    public int createModule(MessageListDto createDto) {
        try {
            Messages messages = null;

            List<MessagesCreateDto> list = createDto.getMsgList();
            for (MessagesCreateDto dto : list) {
                if (dto.getSubModule().equalsIgnoreCase("")) {

                    if (validateKeyNameByModule(dto.getModule(), dto.getKey(), dto.getAppName())) {

                        messages = Mapper.INSTANCE.convertDtoToClass(dto);
                        System.out.println("mesg1" + messages);
                        messagesRepository.saveAndFlush(messages);
// return messages.getId();
                    }
                } else {
                    if (validateByKeyBySubModule(dto.getModule(), dto.getSubModule(), dto.getKey(), dto.getAppName())) {
                        messages = Mapper.INSTANCE.convertDtoToClass(dto);
                        System.out.println("mesg2" + messages);
                        messagesRepository.saveAndFlush(messages);
// return messages.getId();
                    }
                }
            }
// messagesRepository.saveAndFlush(messages);
            return 1;

        } catch (Exception e) {
            return 0;
        }
// return 0;
    }

    public int deleteMessage(int id) {
        try {
            messagesRepository.deleteById(id);
            return id;
        } catch (Exception e) {
            return 0;
        }
    }

    public int updateValueById(MessageUpdateDto messagesDto) {
        try {
            Messages messages = Mapper.INSTANCE.convertUpdateDtoToClass(messagesDto);
            messages = messagesRepository.saveAndFlush(messages);
            return messages.getId();
        } catch (Exception e) {
            return 0;
        }

    }

    public boolean validateByKeyBySubModule(String module, String subModule, String key, String appName) {
        try {
            if (logger.isDebugEnabled()) {
                logger.info(">> Request:[{}]", key);
            }
            int count = messagesRepository.validateByKeySubName(module, subModule, key, appName);
            logger.info("<< Response:[{}]", count);
            System.out.println("=========>>>>>>>>validatetrue");
            return count <= 0;
        } catch (NoResultException ne) {
            return false;
        } catch (Exception e) {
            System.out.println("=================>>>>>>>validatefalse");
            return false;
        }
    }

    public boolean validateKeyNameByModule(String module, String key, String appName) {
        try {
            if (logger.isDebugEnabled()) {
                logger.info(">> Request:[{}]", key);
            }
            int count = messagesRepository.validateByKeyModuleName(module, key, appName);
            logger.info("<< Response:[{}]", count);
            System.out.println("=========>>>>>>>>validatetrue");
            return count <= 0;
        } catch (NoResultException ne) {
            return false;
        } catch (Exception e) {
            System.out.println("=================>>>>>>>validatefalse");
            return false;
        }
    }

}
