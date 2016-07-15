package com.psl.soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("internationalVillager")
public class InternationalVillager implements CompactDisc {

	private String title = "International Villager";
	private String artist = "Yo Yo Honey Singh";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
