package com.psl.soundsystem.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.psl.soundsystem.CDPlayer;
import com.psl.soundsystem.DVDPlayer;
import com.psl.soundsystem.InternationalVillager;
import com.psl.soundsystem.SgtPeppers;

@Configuration
@ComponentScan(basePackageClasses = { SgtPeppers.class, CDPlayer.class, InternationalVillager.class, DVDPlayer.class })
public class CDPlayerConfig {

}

// @Configuration
// public class CDPlayerConfig {
//
// @Bean
// public CompactDisc sgtPeppers() {
// return new SgtPeppers();
// }
//
// @Bean
// public MediaPlayer cdPlayer(CompactDisc cd) {
// CDPlayer cdPlayerObj = new CDPlayer();
// cdPlayerObj.setCd(cd);
// return cdPlayerObj;
// }
// }
