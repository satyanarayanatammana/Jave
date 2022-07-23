/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.Dto.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 *
 * @author Manohar
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    
    private boolean status;
    private int statusCode;
    private String messages;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public Response(boolean status, String messages) {
        this.status = status;
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "" + "status=" + status + ", statusCode=" + statusCode + ", messages=" + messages ;
    }
    
}
