package com.jskj.ssm.service.serviceImpl;

import com.jskj.ssm.model.Rcyjinfo;
import com.jskj.ssm.util.ActionReturnUtil;
import com.jskj.ssm.mapper.RcyjinfoMapper;
import com.jskj.ssm.service.RcyjinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("rcyjinfoService")
public class RcyjinfoServiceImpl implements RcyjinfoService{

    @Autowired
    private RcyjinfoMapper  rcyjinfoMapper;

    @Override
    public ActionReturnUtil addRcyjinfo(Rcyjinfo rcyjinfo){
        if(rcyjinfoMapper.addRcyjinfo(rcyjinfo)!=0){
            return ActionReturnUtil.returnSuccess();
        }else{
            return ActionReturnUtil.returnError();
        }
    }
}
