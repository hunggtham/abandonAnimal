package com.nipa.abandon.model;


import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Date;


// This tells Hibernate to make a table out of this class
//(name = "animal")

@Entity(name = "animal")
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="desertion_no")
    private long desertionNo;

    @NotNull
    @Column(name="filename")
    private String image;

    @NotNull
    @Column(name="happen_day")
    private String happenDay;

    @NotNull
    @Column(name="process_state")
    private String status;

    @NotNull
    @Column(name="kind")
    private String kind;

    @NotNull
    @Column(name="special_mark")
    private String specialMark;

    @NotNull
    @Column(name="care_addr")
    private String careAddr;

    @NotNull
    @Column(name="officetel")
    private String officeTel;

    private String color;

    private String age;

    private String weight;

    @Column(name = "notice_no")
    private String noticeNo;
    @Column(name = "notice_sdt")
    private String noticeSdt;
    @Column(name = "notice_edt")
    private String noticeEdt;

    private String popfile;

    @Column(name = "sex_cd")
    private String sex;
    @Column(name = "neuter_yn")
    private String neuterYn;

    @Column(name = "care_nm")
    private String careNm;
    @Column(name = "org_nm")
    private String orgNm;
    @Column(name = "charge_nm")
    private String chargeNm;

    @Column(name = "other_note")
    private String otherNote;

    public Board() {

    }

//    @DateTimeFormat(pattern="YYYY-MM-dd")
//    public Date getHappenDay() {
//        return happenDay;
//    }
}
