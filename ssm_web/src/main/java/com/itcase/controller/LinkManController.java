package com.itcase.controller;

import com.itcase.pojo.LinkMan;
import com.itcase.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author LeiXQ
 * @version 1.0
 * @description: TODO
 * @date 2020/9/28 17:45
 */
@Controller
@RequestMapping("/linkMan")
public class LinkManController {

    @Autowired
    private LinkManService linkManService;

    @RequestMapping("/list")
    public String getList(Model model) {

        List<LinkMan> linkManList = linkManService.findAll();
        model.addAttribute("lists", linkManList);
        return "list";
    }

    @RequestMapping("/save")
    public String save(LinkMan linkMan) {
        linkManService.save(linkMan);
        return "redirect:/linkMan/list";
    }
}
