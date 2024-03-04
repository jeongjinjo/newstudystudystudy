package com.example.restapi01.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {

    //@Autowired Autowired보다 private final을 사용하고 @RequiredArgsConstructor을 사용하는 것을 더 권장한다.
    private final MainService mainService;
    @GetMapping("main")
    public String main(){
        System.out.println(mainService);
        return "main";
    }
    @GetMapping("mainapi")
    public @ResponseBody String mainapi(){
        return "mainapi";
    }
}
