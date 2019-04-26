package io.pivotal.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class WelcomeController {
//    @GetMapping("add/{p1}/{p2}")
    @GetMapping("{p1}+{p2}")
    public String add(@PathVariable Double p1, @PathVariable Double p2) {
        return String.valueOf(p1 + p2);
    }

//    @GetMapping("subtract")
@GetMapping("{p1}-{p2}")
    public String substract(@PathVariable Double p1, @PathVariable Double p2) {
        return String.valueOf(p1 - p2);
    }

//    @GetMapping("multiply")
@GetMapping("{p1}x{p2}")
    public String multiply(@PathVariable Double p1, @PathVariable Double p2) {
        return String.valueOf(p1 * p2);
    }

//    @GetMapping("divide")
@GetMapping("{p1}/{p2}")
    public String divide(@PathVariable Double p1, @PathVariable Double p2) {
        return String.valueOf(p1 / p2);
    }
}
