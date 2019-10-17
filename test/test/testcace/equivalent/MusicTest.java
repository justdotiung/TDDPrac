package test.testcace.equivalent;

import static org.junit.Assert.*;

import org.junit.Test;

import main.testcace.equivalent.Music;

public class MusicTest {
	@Test
	public void testEquals_case1() throws Exception {
		Music musicA = new Music("song", "B");
		Music musicB = musicA;
		assertEquals(musicA,musicB);
	}
	@Test
	public void testEquals_case2() throws Exception {
		//동치성 비교
		Music musicA = new Music("song", "B");
		Music musicB = new Music("song", "B");
		//필드값 비교
		assertEquals(musicA.getPerformerName(), musicB.getPerformerName());
		assertEquals(musicA.getSongName(), musicB.getSongName());
		//toString을 이용한 비교 일종의 트릭
		assertEquals(musicA.toString(), musicB.toString());
		//equal() 구현을 통한 비교
		assertEquals(musicA,musicB);
	}
}
