/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.mapper;

import com.example.jsonapis.Dto.MessageUpdateDto;
import com.example.jsonapis.Dto.MessagesCreateDto;
import com.example.jsonapis.Dto.MessagesDto;
import com.example.jsonapis.model.Messages;
import java.util.List;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Manohar
 */
@org.mapstruct.Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "String")
public interface Mapper {

    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

    List<MessagesDto> convertClassToDto(List<Messages> messageses);

    Messages convertDtoToClass(MessagesCreateDto createDto);

    Messages convertUpdateDtoToClass(MessageUpdateDto messagesDto);

}
