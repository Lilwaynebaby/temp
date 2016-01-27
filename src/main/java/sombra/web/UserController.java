package sombra.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Владимир on 27.01.2016.
 */
@Controller
@RequestMapping(name = "/users")
public class UserController {

    @RequestMapping
    public String getUsers() {
        return "users";
    }
}
