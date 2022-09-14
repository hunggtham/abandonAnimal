package com.nipa.abandon.model;


import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;


// This tells Hibernate to make a table out of this class
//(name = "animal")

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

    public Board() {

    }

//    @DateTimeFormat(pattern="YYYY-MM-dd")
//    public Date getHappenDay() {
//        return happenDay;
//    }
}
