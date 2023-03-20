package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("pappers")
public class SgtPappers implements CompactDisk{

    private String title= "Achhutyam keshavam Raam narayanam !!";
    private String artist="Shreya Goshal";

    @Override
    public void play(){
        System.out.println("playing "+title+" by "+artist);
    }
}
