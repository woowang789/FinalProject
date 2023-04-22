package com.samgyeobsal.controller;

import com.samgyeobsal.domain.funding.FundingCriteria;
import com.samgyeobsal.service.FundingService;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @filename FundingDetailController
 * @author 소규석
 * @since 2023.02.24
 * 펀딩 관련 Controller
 *
 * <pre>
 * 수정일        	수정자       			수정내용
 * ----------  --------    ---------------------------
 * 2023.02.24	소규석		최초 생성 (펀딩 페이지, 펀딩 상세 페이지 렌더링)
 * </pre>
 */
@Controller
@Log4j2
@RequestMapping("/web/funding")
public class FundingController {
    @Autowired
    FundingService fundingService;

    @GetMapping
    public String funding(String keyword, Model model){
        model.addAttribute("keyword",keyword);
        return "funding/funding";
    }

    @GetMapping("/{fid}")
    public String fundingDetail(@PathVariable String fid, Model model){
        model.addAttribute("funding",fundingService.getFundingDetail(fid,"FUNDING"));
        return "funding/funding_detail";
    }
}