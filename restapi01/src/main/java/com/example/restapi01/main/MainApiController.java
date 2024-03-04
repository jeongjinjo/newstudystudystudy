package com.example.restapi01.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainApiController {
    @GetMapping("main/api/aa")
    public String mainApiaa(String str,String id,String age){
        System.out.println("이름 :"+str);
        System.out.println("아이디 : "+id);
        System.out.println("나이 :"+age);

        return str;
    }
}
