package crud.controllers;

import crud.models.User;
import crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {
    private final UserService service;

    @Autowired
    public UsersController(UserService service) {
        this.service = service;
    }

    @GetMapping("/a")
    public String index(Model model) {
        User user1 = new User("Victor", 45);
        service.add(user1);
        List<String> messages = new ArrayList<>();
//        messages.add("Hello!");
//        messages.add("I'm Spring MVC application");
        messages.add(user1.getName() + " " + user1.getAge());// проверка
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        // получим одного юзера по его id из дао и передадим его на отображение в представление
        return null;
    }
}
