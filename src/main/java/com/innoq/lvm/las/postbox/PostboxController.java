package com.innoq.lvm.las.postbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mjansing on 08/03/16.
 */
@Controller
public class PostboxController {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Test";
    }
}
