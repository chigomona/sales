package com.eshop.sales.web;

import com.eshop.sales.model.VisitRecord;
import com.eshop.sales.serviceapi.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class VisitController {

    @Autowired
    protected VisitService visitService;

    @RequestMapping("/visitorsign")
    public String visitorsign() {
        return "visitor/sign";
    }

    @RequestMapping("/signout")
    public String visitorsignout(HttpServletRequest request) {
        request.getSession().removeAttribute("visitorName");
        return "visitor/sign";
    }

    @RequestMapping(value = "/welcomevisitor", method = RequestMethod.POST)
    public String welcomevisitor(HttpServletRequest request,
            @RequestParam(value = "visitorname") String visitorName, Model model) {
        if (visitorName!=null && !visitorName.isEmpty()) {
            request.getSession().setAttribute("visitorName", visitorName);
        }else{
            return "visitor/sign" ;
        }
        VisitRecord lastVisit = visitService.findLastVisit(visitorName);
        long visitCount = visitService.countVisitTimes(visitorName);
        VisitRecord currentVisit = visitService.createVisitRecord(visitorName) ;
        model.addAttribute("visitorName", visitorName);
        model.addAttribute("visitCount", visitCount) ;
        model.addAttribute("lastVisitTime", (lastVisit != null) ? lastVisit.getVisitTime() : "");
        model.addAttribute("currentTime", currentVisit.getVisitTime());
        return "visitor/welcome";
    }

}
