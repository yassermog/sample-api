package com.ams.sampleapi.home.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@RestController
@Log4j2
public class HomeController {
    @GetMapping(value = "/", produces = "text/html")
    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sample API is Up");
        sb.append("<br>");
        sb.append("Service is running on ").append(StringUtils.isEmpty(System.getenv("HOSTNAME")) ? System.getenv("COMPUTERNAME") : System.getenv("HOSTNAME"));
        sb.append("<br>");
        sb.append("Accessed timestamp: ").append(DateFormat.getDateTimeInstance().format(new Date()));
        return sb.toString();
    }
}

