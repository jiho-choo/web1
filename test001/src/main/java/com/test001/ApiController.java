package com.test001;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {


    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest() {

        return "{\"result\", \"qweqwe\"}";
    }

    @RequestMapping(value = "/api/test2", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest2() {

        return "{\"result\", \"qqqqqqqq\"}";
    }
}
