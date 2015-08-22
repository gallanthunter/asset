package pers.zhangzhijun.amp.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhang Zhijun on 2015/8/22.
 */
@RestController
public class AssetResources {

    @RequestMapping("/")
    public String index(){
        return "This is index page!";
    }
}
