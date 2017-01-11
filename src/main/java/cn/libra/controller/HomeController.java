package cn.libra.controller;

import cn.libra.dao.IUserMapper;
import cn.libra.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by clam on 2017/1/11.
 */
@Controller
@RequestMapping("/home")
public class HomeController {


    @Autowired
    private IUserMapper userMapper = null;

    @RequestMapping("")
    public String index(){
        return "index";
    }



    @RequestMapping(value={"get","get/{id}"})
    @ResponseBody
    public User getUser(@PathVariable(required = false) Integer id){
        Integer i = null;
        User u =  userMapper.selectByPrimaryKey(1);
        return u;
    }
}
