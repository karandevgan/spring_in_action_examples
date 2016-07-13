package com.psl.soundsystem.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.psl.soundsystem.CDPlayer;
import com.psl.soundsystem.SgtPeppers;

@Configuration
@ComponentScan(basePackageClasses={SgtPeppers.class, CDPlayer.class})
public class CDPlayerConfig {

}
