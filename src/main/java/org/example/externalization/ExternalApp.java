package org.example.externalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExternalApp {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigExternal.class);
        MusicPlayer player = context.getBean(MusicPlayer.class);
        System.out.println("playing "+player.getSong()+" by "+player.getArtist());
        Truck truck = context.getBean(Truck.class);
        System.out.println(truck.getTruckName() +" "+truck.getNumber() );
    }
}
