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
public class MessagesDto {

    private Integer id;
    private String key;
    private String value;
    private String valueAr;
    private String module;
    private String subModule;
    private String appName;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public MessagesDto() {
    }

    public MessagesDto(Integer id, String key, String value, String valueAr, String module, String subModule, String appName, String description) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.valueAr = valueAr;
        this.module = module;
        this.subModule = subModule;
        this.appName = appName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MessagesDto{" + "id=" + id + ", key=" + key + ", value=" + value + ", valueAr=" + valueAr + ", module=" + module + ", subModule=" + subModule + ", appName=" + appName + ", description=" + description + '}';
    }

}
