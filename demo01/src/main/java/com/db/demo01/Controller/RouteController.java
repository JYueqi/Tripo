package com.db.demo01.Controller;

import com.db.demo01.Mapper.RouteMapper;
import com.db.demo01.Mapper.roucomMapper;
import com.db.demo01.Mapper.routehitMapper;
import com.db.demo01.pojo.Route;
import com.db.demo01.pojo.roucomments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RouteController {

    @Autowired
    private RouteMapper routeMapper;

    @Autowired
    private roucomMapper roucomMapper;

    @Autowired
    private routehitMapper routehitMapper;

    @RequestMapping("/tour/{place}")
    public String getSpotRouteByName(@PathVariable String place, Model model){

        Route route = routeMapper.getRouteBySpot(place);
        model.addAttribute("tour",route);

        List<roucomments> roucommentsList = roucomMapper.getAllComments(route.getRouteName());
        model.addAttribute("rcoms",roucommentsList);

        int hit = routehitMapper.getRouteHit(route.getRouteName());
        hit = hit +1;
        routehitMapper.updateRouteHit(route.getRouteName(),hit);

        return "tour-details";

    }
}
