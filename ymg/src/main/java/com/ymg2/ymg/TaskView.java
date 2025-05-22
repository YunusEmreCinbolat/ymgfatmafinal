package com.ymg2.ymg;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskView {
    @GetMapping("/")
    public String TaskView() {
        return "Merhaba Dünya";
    }
}
