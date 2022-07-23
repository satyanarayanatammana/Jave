/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "jsonmessage1")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Messages.findAll", query = "SELECT l FROM Messages l")
//    , @NamedQuery(name = "Messages.findById", query = "SELECT l FROM Messages l WHERE l.id = :id")
//    , @NamedQuery(name = "Messages.findByLocale", query = "SELECT l FROM Messages l WHERE l.locale = :locale")
//    , @NamedQuery(name = "Messages.findByMessagekey", query = "SELECT l FROM Messages l WHERE l.messagekey = :messagekey")
//    , @NamedQuery(name = "Messages.findByMessagecontent", query = "SELECT l FROM Messages l WHERE l.messagecontent = :messagecontent")})
public class Messages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
//    @Size(max = 255)
    @Column(name = "key", updatable = false)
    private String key;
//    @Size(max = 255)
    @Column(name = "value")
//    @Type(type = "org.hibernate.type.TextType")
    private String value;

    @Column(name = "module", updatable = false)
    private String module;

    @Column(name = "submodule", updatable = false)
    private String subModule;

    @Column(name = "value_ar")
    private String valueAr;

    @Column(name = "app_name", updatable = false)
    private String appName;

    @Column(name = "description",updatable = false)
    private String description;

    public Messages() {
    }

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
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.key);
        hash = 29 * hash + Objects.hashCode(this.value);
        hash = 29 * hash + Objects.hashCode(this.module);
        hash = 29 * hash + Objects.hashCode(this.subModule);
        hash = 29 * hash + Objects.hashCode(this.valueAr);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Messages other = (Messages) obj;
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        if (!Objects.equals(this.module, other.module)) {
            return false;
        }
        if (!Objects.equals(this.subModule, other.subModule)) {
            return false;
        }
        if (!Objects.equals(this.valueAr, other.valueAr)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Messages{" + "id=" + id + ", key=" + key + ", value=" + value + ", module=" + module + ", subModule=" + subModule + ", valueAr=" + valueAr + ", appName=" + appName + ", description=" + description + '}';
    }

   

}
