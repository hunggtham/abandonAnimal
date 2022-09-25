package com.nipa.abandon.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


//POJO Plain Object Java Object
@Entity(name = "animal")
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="desertion_no")
    private long desertionNo;

    @NotNull
    @Column(name="filename")
    private String image;


    @Column(name="happen_day")
    private String happenDay;

    @NotNull
    @Size(min=1, max = 30)
    @Column(name="process_state")
    private String status;

    @NotNull
    @Size(min=1, max = 30)
    @Column(name="kind")
    private String kind;

    @NotNull
    @Size(min=1, max = 200)
    @Column(name="special_mark")
    private String specialMark;

    @NotNull
    @Size(min=1, max = 30)
    @Column(name="care_addr")
    private String careAddr;

    @NotNull
    @Size(min=1, max = 30)
    @Column(name="officetel")
    private String officeTel;

    @NotNull
    @Size(min=1, max = 30)
    private String color;

    @NotNull
    @Size(min=1, max = 30)
    private String age;

    @NotNull
    @Size(min=1, max = 30)
    private String weight;

    @NotNull
    @Size(min=1, max = 100)
    @Column(name = "notice_no")
    private String noticeNo;

    @NotNull
    @Size(min=1, max = 30)
    @Column(name = "notice_sdt")
    private String noticeSdt;

    @NotNull
    @Size(min=1, max = 30)
    @Column(name = "notice_edt")
    private String noticeEdt;

    private String popfile;

    @NotNull
    @Size(min=1, max = 30)
    @Column(name = "sex_cd")
    private String sex;

    @NotNull
    @Size(min=1, max = 30)
    @Column(name = "neuter_yn")
    private String neuterYn;

    @NotNull
    @Size(min=1, max = 100)
    @Column(name = "care_nm")
    private String careNm;

    @NotNull
    @Size(min=1, max = 100)
    @Column(name = "org_nm")
    private String orgNm;

    @Column(name = "charge_nm")
    private String chargeNm;

    @Column(name = "other_note")
    private String otherNote;

    public long getDesertionNo() {
        return desertionNo;
    }

    public void setDesertionNo(long desertionNo) {
        this.desertionNo = desertionNo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHappenDay() {
        return happenDay;
    }

    public void setHappenDay(String happenDay) {
        this.happenDay = happenDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSpecialMark() {
        return specialMark;
    }

    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    public String getCareAddr() {
        return careAddr;
    }

    public void setCareAddr(String careAddr) {
        this.careAddr = careAddr;
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public String getNoticeSdt() {
        return noticeSdt;
    }

    public void setNoticeSdt(String noticeSdt) {
        this.noticeSdt = noticeSdt;
    }

    public String getNoticeEdt() {
        return noticeEdt;
    }

    public void setNoticeEdt(String noticeEdt) {
        this.noticeEdt = noticeEdt;
    }

    public String getPopfile() {
        return popfile;
    }

    public void setPopfile(String popfile) {
        this.popfile = popfile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNeuterYn() {
        return neuterYn;
    }

    public void setNeuterYn(String neuterYn) {
        this.neuterYn = neuterYn;
    }

    public String getCareNm() {
        return careNm;
    }

    public void setCareNm(String careNm) {
        this.careNm = careNm;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }

    public String getChargeNm() {
        return chargeNm;
    }

    public void setChargeNm(String chargeNm) {
        this.chargeNm = chargeNm;
    }

    public String getOtherNote() {
        return otherNote;
    }

    public void setOtherNote(String otherNote) {
        this.otherNote = otherNote;
    }

    //constructor
    public Board() {}

    public Board(String image, String happenDay, String status, String kind, String specialMark, String careAddr, String officeTel, String color, String age, String weight, String noticeNo, String noticeSdt, String noticeEdt, String popfile, String sex, String neuterYn, String careNm, String orgNm, String chargeNm, String otherNote) {
        this.image = image;
        this.happenDay = happenDay;
        this.status = status;
        this.kind = kind;
        this.specialMark = specialMark;
        this.careAddr = careAddr;
        this.officeTel = officeTel;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.noticeNo = noticeNo;
        this.noticeSdt = noticeSdt;
        this.noticeEdt = noticeEdt;
        this.popfile = popfile;
        this.sex = sex;
        this.neuterYn = neuterYn;
        this.careNm = careNm;
        this.orgNm = orgNm;
        this.chargeNm = chargeNm;
        this.otherNote = otherNote;
    }

}
