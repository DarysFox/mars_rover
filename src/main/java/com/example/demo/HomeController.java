package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @Autowired
    private MarsRoverApiService roverService;

    @GetMapping("/")
    public String getHomeView(ModelMap model){
        MarsRoverApiResponse roverData = roverService.getRoverData();
        model.put("roverData", roverData);
        return "index";
    }
}
