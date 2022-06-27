package com.example.practiceboot_get_post.controller;

import com.example.practiceboot_get_post.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    // 현재 방식
    @GetMapping(path = "/hello") // http://localhost:9090/api/get/hello
    public String Hello() {
        return "get Hello";
    }

    // 예전 방식
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get  http://localhost:9090/api/get/hi
    public String hi(){
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{spring-boot}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName) {

        System.out.println("PathVariable : " + pathName);

        return pathName;
    }

    // http://localhost:9090/api/get/query-param?user=진경재&email=kyungjae0318@gmail.com&age=25
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    // search?q = intellij
    // &newwindow = 1
    // &sxsrf = ALiCzsZiNZ8cMxrVrtY_k_SkD1li4s4ypQ%3A1655805317171
    // &ei = hZWxYuCFCt-V2roP5uy8mA4
    // &ved = 0ahUKEwig3Py9o774AhXfilYBHWY2D-MQ4dUDCA4&uact=5
    // &oq = intellij
    // &gs_lcp = Cgdnd3Mtd2l6EAMyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEc6BwgAEEcQsANKBAhBGABKBAhGGABQhwZYhwZg9AZoAXACeACAAQCIAQCSAQCYAQCgAQHIAQrAAQE&sclient=gws-wiz

    // ?key=value &key2=value2

    @GetMapping("query-param02")
    public String gueryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String age
    ) {

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    // 현업에서 가장 많이 쓰고, 추천하는 방법 = dto // 객체 미리 정의해서 받는 방법
    // ?user=진경재&email=kyungjae0318@gmail.com&age=25
    @GetMapping("query-param03")
    public String gueryParam03(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
