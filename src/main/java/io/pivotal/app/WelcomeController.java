package io.pivotal.app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class WelcomeController {
//    @GetMapping("add/{p1}/{p2}")

//    @RequestMapping
//    public String route() {
//        return "";
//    }

    @GetMapping("/{input:.+}")
    public String returnSomething(@PathVariable String input) {
        if(input.matches("[0-9]+\\+[0-9]+")){
            String[] values = input.split("\\+");
            Integer x = Integer.valueOf(values[0]);
            Integer y = Integer.valueOf(values[1]);

            return String.valueOf(x+y);
        }
        else if(input.matches("[0-9]+-[0-9]+")) {
            String[] values = input.split("\\-");
            Integer x = Integer.valueOf(values[0]);
            Integer y = Integer.valueOf(values[1]);

            return String.valueOf(x-y);
        }
        else if(input.matches("[0-9]+x[0-9]+")) {
            String[] values = input.split("x");
            Integer x = Integer.valueOf(values[0]);
            Integer y = Integer.valueOf(values[1]);

            return String.valueOf(x*y);
        }
        else if(input.matches("[0-9]+\\*[0-9]+")) {
            String[] values = input.split("\\*");
            Integer x = Integer.valueOf(values[0]);
            Integer y = Integer.valueOf(values[1]);

            return String.valueOf(x*y);
        }
        else if(input.matches("[0-9]+\\\\/[0-9]+")) {
            String[] values = input.split("\\\\/");
            Integer x = Integer.valueOf(values[0]);
            Integer y = Integer.valueOf(values[1]);

            return String.valueOf(x/y);
        }
        return "INVALID";
    }

    @GetMapping("/{input:.+}/")
    public String returnSomething2(@PathVariable String input){
        if(input.matches("[0-9]+/[0-9]+")) {
            String[] values = input.split("/");
            Integer x = Integer.valueOf(values[0]);
            Integer y = Integer.valueOf(values[1]);

            return String.valueOf(x/y);
        }
        else{
            return "INVALID";
        }
    }

    @GetMapping("{x:.+}/{y:.+}")
    public String divideValues(@PathVariable String x, @PathVariable String y) {
            if(x.matches("[0-9]+") && y.matches("[0-9]+")) {
                return String.valueOf(Double.valueOf(x)/Double.valueOf(y));
            }
            else
                return "INVALID";

    }
//    @GetMapping("{input:.+}")
//    public String returnValue(@PathVariable String input) {
////        String[] pieces = input.split("\\+");
////        String firstValue = pieces[0].substring(1,pieces[0].indexOf("\\]"));
//        return "hello";
////        if(input.matches("[0-9]+[+][0-9]+")
//    }
//
//    @GetMapping("{x:[0-9]+}+{y:[0-9]+}")
//    public String addValues(@PathVariable Double x, @PathVariable Double y) {
//
//        return String.valueOf(x + y);
//    }
//
//    @GetMapping("{x:[0-9]+}-{y:[0-9]+}")
//    public String subtractValues(@PathVariable Double x, @PathVariable Double y) {
//        return String.valueOf(x-y);
//    }
//
//
//    @GetMapping("{x:[0-9]+}x{y:[0-9]+}")
//    public String multiplyValues(@PathVariable Double x, @PathVariable Double y) {
//        return String.valueOf(x*y);
//    }
//
//
//    @GetMapping("{x:[0-9]+}/{y:[0-9]+}")
//    public String divideValues(@PathVariable Double x, @PathVariable Double y) {
//        return String.valueOf(x/y);
//    }



//    @GetMapping
//    @GetMapping("{p1}+{p2}")
//    public String add(@PathVariable Double p1, @PathVariable Double p2) {
//
//        return String.valueOf(p1 + p2);
//    }
//
////    @GetMapping("subtract")
//@GetMapping("{p1}-{p2}")
//    public String substract(@PathVariable Double p1, @PathVariable Double p2) {
//        return String.valueOf(p1 - p2);
//    }
//
////    @GetMapping("multiply")
//@GetMapping("{p1}x{p2}")
//    public String multiply(@PathVariable Double p1, @PathVariable Double p2) {
//        return String.valueOf(p1 * p2);
//    }
//
////    @GetMapping("divide")
//@GetMapping("{p1}/{p2}")
//    public String divide(@PathVariable Double p1, @PathVariable Double p2) {
//        return String.valueOf(p1 / p2);
//    }
//
//
//    @GetMapping("{id:[a-zA-Z]+}")
//    public String oneOrMoreLetters(){
//        return "NOT A VALID INPUT.";
//    }
//
//    @GetMapping("{id:[a-zA-Z]+[0-9]+}")
//    public String oneOrMoreLettersFollowedByOneOrMoreNumbers(){
//        return "NOT A VALID INPUT.";
//    }
}
