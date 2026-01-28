package teccr.justdoitcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import teccr.justdoitcloud.data.Task;
import teccr.justdoitcloud.data.User;

import java.time.LocalDateTime;

@Slf4j
@Controller
@RequestMapping("/user/tasks")
@SessionAttributes("user")
public class UserTasksController {

    @ModelAttribute(name = "user")
    public User user() {
        User usr =  new User("christine", "Christine McVie", "christine@fm.com", User.Type.REGULAR);
        // Add a few sample tasks
        Task task = new Task("Comprar Leche", LocalDateTime.now(), null, Task.Status.DONE);
        usr.addTask(task);
        task = new Task("Reparacion de sistema de frenos del carro", LocalDateTime.now(),
                LocalDateTime.now().plusDays(3).toLocalDate(), Task.Status.INPROGRESS);
        usr.addTask(task);
        return usr;
    }

    @GetMapping
    public String showUserTasks() {
        return "usertasks";
    }
}
