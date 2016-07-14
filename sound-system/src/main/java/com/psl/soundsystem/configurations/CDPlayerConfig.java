package com.psl.soundsystem.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psl.soundsystem.CDPlayer;
import com.psl.soundsystem.CompactDisc;
import com.psl.soundsystem.MediaPlayer;
import com.psl.soundsystem.SgtPeppers;

//@Configuration
//@ComponentScan(basePackageClasses={SgtPeppers.class, CDPlayer.class})
//public class CDPlayerConfig {
//
//}

@Configuration
public class CDPlayerConfig {
	
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	public MediaPlayer cdPlayer(CompactDisc cd) {
		CDPlayer cdPlayerObj = new CDPlayer();
		cdPlayerObj.setCd(cd);
		return cdPlayerObj;
	}
}
