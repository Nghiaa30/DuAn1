package com.it17327.duan1.DomalModel;
// Generated Nov 19, 2022 2:17:47 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ChiTietSp generated by hbm2java
 */
@Entity
@Table(name="ChiTietSP"
    ,schema="dbo"
    ,catalog="ProjectOne"
)
public class ChiTietSp  implements java.io.Serializable {


     private String id;
     private DongSp dongSp;
     private Nsx nsx;
     private VoucherLaptop voucherLaptop;
     private Serializable tenSp;
     private Integer namSx;
     private Integer namBh;
     private Serializable moTa;
     private Integer soLuongTon;
     private BigDecimal giaBan;
     private Set<AnhLaptop> anhLaptops = new HashSet<AnhLaptop>(0);
     private Set<Serial> serials = new HashSet<Serial>(0);

    public ChiTietSp() {
    }

	
    public ChiTietSp(String id) {
        this.id = id;
    }
    public ChiTietSp(String id, DongSp dongSp, Nsx nsx, VoucherLaptop voucherLaptop, Serializable tenSp, Integer namSx, Integer namBh, Serializable moTa, Integer soLuongTon, BigDecimal giaBan, Set<AnhLaptop> anhLaptops, Set<Serial> serials) {
       this.id = id;
       this.dongSp = dongSp;
       this.nsx = nsx;
       this.voucherLaptop = voucherLaptop;
       this.tenSp = tenSp;
       this.namSx = namSx;
       this.namBh = namBh;
       this.moTa = moTa;
       this.soLuongTon = soLuongTon;
       this.giaBan = giaBan;
       this.anhLaptops = anhLaptops;
       this.serials = serials;
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
    @JoinColumn(name="IdDongSP")
    public DongSp getDongSp() {
        return this.dongSp;
    }
    
    public void setDongSp(DongSp dongSp) {
        this.dongSp = dongSp;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IdNsx")
    public Nsx getNsx() {
        return this.nsx;
    }
    
    public void setNsx(Nsx nsx) {
        this.nsx = nsx;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IdVoucherSP")
    public VoucherLaptop getVoucherLaptop() {
        return this.voucherLaptop;
    }
    
    public void setVoucherLaptop(VoucherLaptop voucherLaptop) {
        this.voucherLaptop = voucherLaptop;
    }

    
    @Column(name="tenSP")
    public Serializable getTenSp() {
        return this.tenSp;
    }
    
    public void setTenSp(Serializable tenSp) {
        this.tenSp = tenSp;
    }

    
    @Column(name="NamSX")
    public Integer getNamSx() {
        return this.namSx;
    }
    
    public void setNamSx(Integer namSx) {
        this.namSx = namSx;
    }

    
    @Column(name="NamBH")
    public Integer getNamBh() {
        return this.namBh;
    }
    
    public void setNamBh(Integer namBh) {
        this.namBh = namBh;
    }

    
    @Column(name="MoTa")
    public Serializable getMoTa() {
        return this.moTa;
    }
    
    public void setMoTa(Serializable moTa) {
        this.moTa = moTa;
    }

    
    @Column(name="SoLuongTon")
    public Integer getSoLuongTon() {
        return this.soLuongTon;
    }
    
    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    
    @Column(name="GiaBan", scale=4)
    public BigDecimal getGiaBan() {
        return this.giaBan;
    }
    
    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="chiTietSp")
    public Set<AnhLaptop> getAnhLaptops() {
        return this.anhLaptops;
    }
    
    public void setAnhLaptops(Set<AnhLaptop> anhLaptops) {
        this.anhLaptops = anhLaptops;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="chiTietSp")
    public Set<Serial> getSerials() {
        return this.serials;
    }
    
    public void setSerials(Set<Serial> serials) {
        this.serials = serials;
    }




}


