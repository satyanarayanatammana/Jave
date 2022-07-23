/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.Dto;

/**
 *
 * @author Admin
 */
public class MessageAppDto {

    private String appName;
    private String description;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MessageAppDto() {
    }

    public MessageAppDto(String appName, String description) {
        this.appName = appName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MessageAppDto{" + "appName=" + appName + ", description=" + description + '}';
    }

}
