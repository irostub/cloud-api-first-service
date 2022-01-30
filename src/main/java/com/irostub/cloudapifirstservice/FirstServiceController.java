package com.irostub.cloudapifirstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/first")
public class FirstServiceController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the first service";
    }

    @GetMapping("/header")
    public String header(@RequestHeader("first-request-header") String header) {
        log.info("Header: {}", header);
        return "first-request-header: " + header;
    }

    @GetMapping("/custom-filter")
    public String customFilter() {
        return "Hello from the first service";
    }
}
