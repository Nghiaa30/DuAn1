package com.it17327.duan1.DomalModel;
// Generated Nov 19, 2022 2:17:47 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AnhNv generated by hbm2java
 */
@Entity
@Table(name="AnhNV"
    ,schema="dbo"
    ,catalog="ProjectOne"
)
public class AnhNv  implements java.io.Serializable {


     private String id;
     private User user;
     private Serializable duongDan;

    public AnhNv() {
    }

	
    public AnhNv(String id) {
        this.id = id;
    }
    public AnhNv(String id, User user, Serializable duongDan) {
       this.id = id;
       this.user = user;
       this.duongDan = duongDan;
    }
   
     @Id 

    
    @Column(name="Id", unique=true, nullable=false, length=10)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idUser")
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="DuongDan")
    public Serializable getDuongDan() {
        return this.duongDan;
    }
    
    public void setDuongDan(Serializable duongDan) {
        this.duongDan = duongDan;
    }




}

