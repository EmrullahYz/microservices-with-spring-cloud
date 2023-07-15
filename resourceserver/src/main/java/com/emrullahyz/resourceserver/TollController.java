package com.emrullahyz.resourceserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TollController {


    private List<TollData> tollDataList;

    public TollController  (){
        tollDataList = new ArrayList<>();

        tollDataList.add(new TollData("900","1VB4GHA","2021-09-21-2021T07:35:12"));
        tollDataList.add(new TollData("901","BBB4003","2021-09-21-2021T07:35:12"));
        tollDataList.add(new TollData("902","B200VH5","2021-09-21-2021T07:35:12"));
    }

    @RequestMapping
    public List<TollData> getTollData(){
        return tollDataList;
    }
}
