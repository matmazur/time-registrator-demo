package com.matmazur.timeregistratordemo.controller;

import com.matmazur.timeregistratordemo.model.TimeStamp;
import com.matmazur.timeregistratordemo.repositories.TimeStampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;

@Controller
public class IndexController {

    private final
    TimeStampRepository timeStampRepository;

    @Autowired
    public IndexController(TimeStampRepository timeStampRepository) {
        this.timeStampRepository = timeStampRepository;
    }

    @GetMapping("/")
    public String index(ModelMap modelMap) {

        modelMap.put("formTimeStamp", new TimeStamp());
        return "index";
    }

    @PostMapping("/add")
    public String index(
            @ModelAttribute TimeStamp formTimeStamp,
            @RequestParam int hour,
            @RequestParam int minute,
            @RequestParam int second
    ) {
        LocalTime time = LocalTime.of(hour, minute, second);
        formTimeStamp.setTime(time);

        timeStampRepository.save(formTimeStamp);
        return "index";
    }
}
