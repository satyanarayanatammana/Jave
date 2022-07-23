/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.Dto;

/**
 *
 * @author Manohar
 */
public class MessageUpdateDto {
    private Integer id;
    private String value;
    private String valueAr;
    
    public MessageUpdateDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueAr() {
        return valueAr;
    }

    public void setValueAr(String valueAr) {
        this.valueAr = valueAr;
    }

    @Override
    public String toString() {
        return "MessageUpdateDto{" + "id=" + id + ", value=" + value + ", valueAr=" + valueAr + '}';
    }
    
    

    
    
}
