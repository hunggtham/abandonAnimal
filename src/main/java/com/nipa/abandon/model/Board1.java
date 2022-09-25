//package com.nipa.abandon.model;
//
//import lombok.Setter;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Setter
//@Document(indexName = "abandon")
//public class Board1 {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        @Column(name="desertion_no")
//        private long desertionNo;
//
//        @NotNull
//        @Column(name="filename")
//        private String image;
//
//
//        @Column(name="happen_day")
//        private String happenDay;
//
//        @Column(name="process_state")
//        private String status;
//
//        @Column(name="kind")
//        private String kind;
//
//        @Column(name="special_mark")
//        private String specialMark;
//
//        @Column(name="care_addr")
//        private String careAddr;
//
//        @Column(name="officetel")
//        private String officeTel;
//
//        @Column(name="color")
//        private String color;
//
//        @Column(name="age")
//        private String age;
//
//        @Column(name="weight")
//        private String weight;
//
//        @Column(name = "notice_no")
//        private String noticeNo;
//
//        @Column(name = "notice_sdt")
//        private String noticeSdt;
//
//        @Column(name = "notice_edt")
//        private String noticeEdt;
//
//        private String popfile;
//
//        @Column(name = "sex_cd")
//        private String sex;
//
//        @Column(name = "neuter_yn")
//        private String neuterYn;
//
//        @Column(name = "care_nm")
//        private String careNm;
//
//        @Column(name = "org_nm")
//        private String orgNm;
//
//        @Column(name = "charge_nm")
//        private String chargeNm;
//
//        @Column(name = "other_note")
//        private String otherNote;
//
//    @Field(type = FieldType.Nested, includeInParent = true)
//    private List<Board1> board1;
//
//    }
//
//
