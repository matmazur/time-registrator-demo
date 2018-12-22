package com.matmazur.timeregistratordemo.controller;

import com.matmazur.timeregistratordemo.model.TimeStamp;
import com.matmazur.timeregistratordemo.repositories.TimeStampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AllTimesController {

    private final
    TimeStampRepository timeStampRepository;

    @Autowired
    public AllTimesController(TimeStampRepository timeStampRepository) {
        this.timeStampRepository = timeStampRepository;
    }

    @GetMapping("/allTimes")
    public String allTimes(ModelMap modelMap) {

        List<TimeStamp> stamps = timeStampRepository.findAll();
        modelMap.put("stamps", stamps);
        System.out.println(stamps.isEmpty());
        System.out.println(stamps);

        return "allTimes";
    }
}
