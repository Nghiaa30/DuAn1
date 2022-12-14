package com.it17327.duan1.DomalModel;
// Generated Nov 19, 2022 2:17:47 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * LoaiKh generated by hbm2java
 */
@Entity
@Table(name="LoaiKH"
    ,schema="dbo"
    ,catalog="ProjectOne"
    , uniqueConstraints = @UniqueConstraint(columnNames="Ten") 
)
public class LoaiKh  implements java.io.Serializable {


     private String id;
     private Serializable ten;
     private Serializable moTa;
     private Set<KhachHang> khachHangs = new HashSet<KhachHang>(0);

    public LoaiKh() {
    }

	
    public LoaiKh(String id) {
        this.id = id;
    }
    public LoaiKh(String id, Serializable ten, Serializable moTa, Set<KhachHang> khachHangs) {
       this.id = id;
       this.ten = ten;
       this.moTa = moTa;
       this.khachHangs = khachHangs;
    }
   
     @Id 

    
    @Column(name="Id", unique=true, nullable=false, length=10)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    
    @Column(name="Ten", unique=true)
    public Serializable getTen() {
        return this.ten;
    }
    
    public void setTen(Serializable ten) {
        this.ten = ten;
    }

    
    @Column(name="MoTa")
    public Serializable getMoTa() {
        return this.moTa;
    }
    
    public void setMoTa(Serializable moTa) {
        this.moTa = moTa;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loaiKh")
    public Set<KhachHang> getKhachHangs() {
        return this.khachHangs;
    }
    
    public void setKhachHangs(Set<KhachHang> khachHangs) {
        this.khachHangs = khachHangs;
    }




}


