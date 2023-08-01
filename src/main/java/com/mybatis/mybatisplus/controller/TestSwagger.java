package com.mybatis.mybatisplus.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "knife4j测试")
@RestController
public class TestSwagger {
    @ApiOperation(value = "knife4j测试")
    @ApiImplicitParam(name = "name",value = "姓名",required = true)
   @GetMapping("/swaggerTest")
   public String swaggerTest(@RequestParam(value = "name")String name){
     return  "Hi:"+name;
   }
}
