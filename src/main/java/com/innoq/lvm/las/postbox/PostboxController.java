package com.innoq.lvm.las.postbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

/**
 * Created by mjansing on 08/03/16.
 */
@Controller
public class PostboxController {
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index", "messages", Arrays.asList("Foo", "Bar"));
    }
}