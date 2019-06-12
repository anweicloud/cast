package com.anwei.cast.modules.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anwei
 * @date 2019/6/12
 */
@ApiOperation("RestFull")
@RestController
@RequestMapping("rest")
public class HelloRestController {

    @ApiOperation("ResponseEntity 返回数据")
    @RequestMapping("resp")
    public ResponseEntity<String> resp() {
        return new ResponseEntity<String>("Anwei", HttpStatus.OK);

    }


}
