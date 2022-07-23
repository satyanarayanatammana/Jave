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
public class MessagesCreateDto {

    private String key;
    private String value;
    private String module;
    private String subModule;
    private String valueAr;
    private String appName;
    private String description;

    public MessagesCreateDto() {
    }

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getSubModule() {
        return subModule;
    }

    public void setSubModule(String subModule) {
        this.subModule = subModule;
    }

    public String getValueAr() {
        return valueAr;
    }

    public void setValueAr(String valueAr) {
        this.valueAr = valueAr;
    }

    public MessagesCreateDto(String key, String value, String module, String subModule, String valueAr, String appName, String description) {
        this.key = key;
        this.value = value;
        this.module = module;
        this.subModule = subModule;
        this.valueAr = valueAr;
        this.appName = appName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MessagesCreateDto{" + "key=" + key + ", value=" + value + ", module=" + module + ", subModule=" + subModule + ", valueAr=" + valueAr + ", appName=" + appName + ", description=" + description + '}';
    }

}
