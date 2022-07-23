/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.controller;

import com.example.jsonapis.Dto.MessageAppDto;
import com.example.jsonapis.Dto.MessageListDto;
import com.example.jsonapis.Dto.MessageUpdateDto;
import com.example.jsonapis.Dto.MessagesGetDto;
import com.example.jsonapis.Dto.Response.CustomResponse;
import com.example.jsonapis.Dto.Response.Response;
import com.example.jsonapis.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
public class MessagesController {

    @Autowired
    MessagesService messagesService;

    @PostMapping(path = "getAllJson", produces = {"application/json", "application/xml"})
    public ResponseEntity<MessagesGetDto> getAllModules(@RequestBody MessageAppDto appDto) {
        try {
            MessagesGetDto getDto = messagesService.getAllModule(appDto);
            return ResponseEntity.status(HttpStatus.OK).body(getDto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping(path = "createMessage", produces = {"application/json", "application/xml"})
    public ResponseEntity<Response> createModuleAndSubModule(@RequestBody MessageListDto createDto) {
        try {
            int id = messagesService.createModule(createDto);
            if (id > 0) {
                return ResponseEntity.status(HttpStatus.CREATED).body(new Response(true, "Message Created Sucessfully"));
            } else {
                return ResponseEntity.status(HttpStatus.CREATED).body(new Response(false, "Message already exists"));
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new CustomResponse(false, "Message failed to Create"));
        }
    }

    @DeleteMapping(path = "DeleteMessageById/{id}", produces = {"application/xml", "application/json"})
    public ResponseEntity<Response> deleteMessageById(@PathVariable("id") int id) {
        try {
            int id1 = messagesService.deleteMessage(id);
            if (id1 > 0) {
                return ResponseEntity.status(HttpStatus.OK).body(new Response(true, "Deleted successfully"));
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(new Response(false, "ID Delete to fail"));
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Response(false, "Not Deleted"));
        }
    }

    @PutMapping(path = "updateMessage", produces = {"application/json", "application/xml"})
    public ResponseEntity<CustomResponse> updateMessage(@RequestBody MessageUpdateDto messagesDto) {
        try {
            int id = messagesService.updateValueById(messagesDto);
            if (id > 0) {
                return ResponseEntity.status(HttpStatus.OK).body(new CustomResponse(true, "Updated successfully", (long) id));
            } else {
                return ResponseEntity.status(HttpStatus.CREATED).body(new CustomResponse(false, "Not Updated"));
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new CustomResponse(false, e.getMessage()));
        }

    }

}
