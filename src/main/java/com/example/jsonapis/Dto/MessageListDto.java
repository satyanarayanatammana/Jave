/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.Dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manohar
 */
public class MessageListDto {
 private List<MessagesCreateDto> msgList =new ArrayList<>();  

    public List<MessagesCreateDto> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<MessagesCreateDto> msgList) {
        this.msgList = msgList;
    }

    public MessageListDto() {
    }

    @Override
    public String toString() {
        return "MessageListDto{" + "msgList=" + msgList + '}';
    }
    
    
    

 
}
