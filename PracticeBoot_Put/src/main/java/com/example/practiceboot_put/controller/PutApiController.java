package com.example.practiceboot_put.controller;

import com.example.practiceboot_put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto_put){
        System.out.println(requestDto_put);
        return requestDto_put;
    }

}
