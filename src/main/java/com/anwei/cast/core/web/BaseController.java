package com.anwei.cast.core.web;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpServletResponse response;

}
