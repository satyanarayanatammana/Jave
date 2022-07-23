/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.Dto;

import java.util.List;

/**
 *
 * @author Admin
 */
public class MessagesGetDto {
    
    List<MessagesDto> messagesDtos;

    public List<MessagesDto> getMessagesDtos() {
        return messagesDtos;
    }

    public void setMessagesDtos(List<MessagesDto> messagesDtos) {
        this.messagesDtos = messagesDtos;
    }

    public MessagesGetDto() {
    }

    public MessagesGetDto(List<MessagesDto> messagesDtos) {
        this.messagesDtos = messagesDtos;
    }

    @Override
    public String toString() {
        return "MessagesGetDto{" + "messagesDtos=" + messagesDtos + '}';
    }
    
    
    


    
    
    
}
