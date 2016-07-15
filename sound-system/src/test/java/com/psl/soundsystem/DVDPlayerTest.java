package com.psl.soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.psl.soundsystem.configurations.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class DVDPlayerTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Autowired
	@Qualifier("dvdPlayer")
	private MediaPlayer dvdPlayer;

	@Autowired
	@Qualifier("internationalVillager")
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		Assert.assertNotNull(cd);
	}

	@Test
	public void mediaPlayerShouldNotBeNull() {
		Assert.assertNotNull(dvdPlayer);
	}

	@Test
	public void playInternationVillger() {
		String expectedString = "Playing International Villager by Yo Yo Honey Singh\n";
		((DVDPlayer) dvdPlayer).setCd(cd);
		dvdPlayer.play();
		Assert.assertEquals(expectedString, systemOutRule.getLogWithNormalizedLineSeparator());
	}
}
