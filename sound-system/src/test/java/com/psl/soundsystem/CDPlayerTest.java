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
public class CDPlayerTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Autowired
	@Qualifier("cdPlayer")
	private MediaPlayer cdPlayer;

	@Autowired
	@Qualifier("sgtPeppers")
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		Assert.assertNotNull(cd);
	}

	@Test
	public void mediaPlayerNotBeNull() {
		Assert.assertNotNull(cdPlayer);
	}

	@Test
	public void playSgtPeppers() {
		((CDPlayer) cdPlayer).setCd(cd);
		String expectedMessage = "Playing Sgt. Pepper's Lonely Hearts Club by The Beatles\n";
		cdPlayer.play();
		Assert.assertEquals(expectedMessage, systemOutRule.getLogWithNormalizedLineSeparator());
	}

}
