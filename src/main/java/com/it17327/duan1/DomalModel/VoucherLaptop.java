package com.it17327.duan1.DomalModel;
// Generated Nov 19, 2022 2:17:47 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VoucherLaptop generated by hbm2java
 */
@Entity
@Table(name="VoucherLaptop"
    ,schema="dbo"
    ,catalog="ProjectOne"
)
public class VoucherLaptop  implements java.io.Serializable {


     private String id;
     private Serializable moTa;
     private BigDecimal tienGiam;
     private Integer phanTramGiam;
     private Date ngayApDung;
     private Date ngayKetThuc;
     private Set<ChiTietSp> chiTietSps = new HashSet<ChiTietSp>(0);

    public VoucherLaptop() {
    }

	
    public VoucherLaptop(String id) {
        this.id = id;
    }
    public VoucherLaptop(String id, Serializable moTa, BigDecimal tienGiam, Integer phanTramGiam, Date ngayApDung, Date ngayKetThuc, Set<ChiTietSp> chiTietSps) {
       this.id = id;
       this.moTa = moTa;
       this.tienGiam = tienGiam;
       this.phanTramGiam = phanTramGiam;
       this.ngayApDung = ngayApDung;
       this.ngayKetThuc = ngayKetThuc;
       this.chiTietSps = chiTietSps;
    }
   
     @Id 

    
    @Column(name="Id", unique=true, nullable=false, length=10)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    
    @Column(name="MoTa")
    public Serializable getMoTa() {
        return this.moTa;
    }
    
    public void setMoTa(Serializable moTa) {
        this.moTa = moTa;
    }

    
    @Column(name="TienGiam", scale=4)
    public BigDecimal getTienGiam() {
        return this.tienGiam;
    }
    
    public void setTienGiam(BigDecimal tienGiam) {
        this.tienGiam = tienGiam;
    }

    
    @Column(name="phanTramGiam")
    public Integer getPhanTramGiam() {
        return this.phanTramGiam;
    }
    
    public void setPhanTramGiam(Integer phanTramGiam) {
        this.phanTramGiam = phanTramGiam;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NgayApDung", length=10)
    public Date getNgayApDung() {
        return this.ngayApDung;
    }
    
    public void setNgayApDung(Date ngayApDung) {
        this.ngayApDung = ngayApDung;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NgayKetThuc", length=10)
    public Date getNgayKetThuc() {
        return this.ngayKetThuc;
    }
    
    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="voucherLaptop")
    public Set<ChiTietSp> getChiTietSps() {
        return this.chiTietSps;
    }
    
    public void setChiTietSps(Set<ChiTietSp> chiTietSps) {
        this.chiTietSps = chiTietSps;
    }




}


