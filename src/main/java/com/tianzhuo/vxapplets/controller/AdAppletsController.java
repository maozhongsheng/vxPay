package com.tianzhuo.vxapplets.controller;


import com.tianzhuo.vxapplets.service.AdAppletsService;
import com.tianzhuo.vxapplets.utils.ResponseStatus;
import com.tianzhuo.vxapplets.vo.AdApplets;
import com.tianzhuo.vxapplets.vo.Response.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
//@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdAppletsController {

    @Autowired
    private AdAppletsService adAppletsService;

    @ApiOperation(value = "用户记录")
    @RequestMapping(value = "/api/adAppletsAdd", method = RequestMethod.POST)
    public ResponseResult insertAdApplets(@RequestBody AdApplets adApplets) throws Exception {

            Integer result = adAppletsService.insertAdApplets(adApplets);
            if (result == 0) {
                return new ResponseResult(ResponseStatus.SERVICE_ERROR);
            }
            return new ResponseResult();
        }

}