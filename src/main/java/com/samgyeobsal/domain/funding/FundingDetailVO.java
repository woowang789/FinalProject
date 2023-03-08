package com.samgyeobsal.domain.funding;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class FundingDetailVO {

    private String fstore_name;
    private String fsummary;
    private String ftitle;
    private long totalprice;
    private int  totalemail;
    private String fid;
    private String tname;
    private String ctname;
    private String fstory;
    private Date fdate;
    private Date cfunding_end_date;
    private String fstatus;
    private double fstore_score;
    private double ffunding_score;
    private int expire;

    private int rfcount;

    private int rscount;
    private List<ProductVO> products;

    private List<FundingImgVO> imgs;
}