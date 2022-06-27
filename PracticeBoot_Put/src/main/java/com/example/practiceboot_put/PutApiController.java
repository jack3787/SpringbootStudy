package com.example.practiceboot_put;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public PostRequestDto_Put put(@RequestBody PostRequestDto_Put requestDto_put){
        System.out.println(requestDto_put);
        return requestDto_put;
    }

}
