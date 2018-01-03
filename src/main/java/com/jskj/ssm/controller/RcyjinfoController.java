package com.jskj.ssm.controller;


import com.jskj.ssm.model.Rcyjinfo;
import com.jskj.ssm.service.RcyjinfoService;
import com.jskj.ssm.util.ActionReturnUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/rcyjinfo")
public class RcyjinfoController {

    @Resource
    private RcyjinfoService rcyjinfoService;

    @RequestMapping(value="/addRcyjinfo",method = RequestMethod.GET)
    public ActionReturnUtil addRcyjinfo(Rcyjinfo rcyjinfo)throws Exception{
        return rcyjinfoService.addRcyjinfo(rcyjinfo);
    }
}
