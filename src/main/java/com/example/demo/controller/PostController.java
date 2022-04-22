package com.example.demo.controller;

import model.SearchParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {
    // html <Form>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form /text-plain

    //    @RequestMapping(method = RequestMethod.POST, path = "/postMethod")
    @PostMapping("/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {
        return searchParam;
    }
}
