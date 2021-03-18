package com.db.demo01.Controller;

import com.db.demo01.Mapper.*;
import com.db.demo01.pojo.Spot;
import com.db.demo01.pojo.spotTraffic;
import com.db.demo01.pojo.spotcomments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ScenicSpotController {

    @Autowired
    private SpotMapper spotMapper;

    @Autowired
    private TrafficMapper trafficMapper;

    @Autowired
    private PriceMapper priceMapper;


    @Autowired
    private com.db.demo01.Mapper.spotcomMapper spotcomMapper;

    @Autowired
    private spothitMapper spothitMapper;


   @GetMapping("/spotdetails")
   //@ResponseBody
   public String getScenicSpotDetailsByName(@RequestParam("place") String spotname ,Model model) {

       Spot spots = spotMapper.getSpotByName(spotname);
       model.addAttribute("spotdetail", spots);

       int pri_hot;
       pri_hot = priceMapper.getSpotPricehot(spotname);
       model.addAttribute("hotprice",pri_hot);

       int pri_no;
       pri_no = priceMapper.getSpotPriceno(spotname);
       model.addAttribute("noprice",pri_no);

       String pri_info;
       pri_info = priceMapper.getSpotPriceinfo(spotname);
       model.addAttribute("priinfo",pri_info);

       spotTraffic spotTraffic = trafficMapper.getSpotTraffic(spotname);
       model.addAttribute("spottraffic",spotTraffic);

       List<spotcomments> spotcommentsList = spotcomMapper.getAllSpotCom(spotname);
       model.addAttribute("scomts",spotcommentsList);


       //执行更新热度语句
       int hit = spothitMapper.getSpotHit(spotname);
       hit = hit+1;
       spothitMapper.updateSpotHit(spotname,hit);

       return "destinations-details";

   }
}
