package com.psl.soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dvdPlayer")
public class DVDPlayer implements MediaPlayer {
	
	private CompactDisc cd;
	
	public void play() {
		cd.play();
	}

	public CompactDisc getCd() {
		return cd;
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
	
	

}
