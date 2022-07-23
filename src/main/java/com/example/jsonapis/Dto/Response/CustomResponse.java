/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.Dto.Response;



/**
 *
 * @author Manohar
 */

public class CustomResponse extends Response {
   
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public CustomResponse(boolean status, String messages) {
        super(status, messages);
    }

    public CustomResponse(boolean status, String messages, Long id) {
        super(status, messages);
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomResponse{" + "id=" + id + '}';
    }
    
    
    
}
