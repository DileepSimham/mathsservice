package boris.maths.controller;

import boris.maths.MathService;
import boris.maths.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MathService mathService;

    @GetMapping("/")
    public Result getAdditionResult(@RequestParam int no1, @RequestParam int no2) {
        return mathService.doAddition(no1, no2);
    }
}
