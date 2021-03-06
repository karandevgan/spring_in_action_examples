package com.psl.soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cdPlayer")
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	
	public CompactDisc getCd() {
		return cd;
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}
	
}
