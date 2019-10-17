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
		//��ġ�� ��
		Music musicA = new Music("song", "B");
		Music musicB = new Music("song", "B");
		//�ʵ尪 ��
		assertEquals(musicA.getPerformerName(), musicB.getPerformerName());
		assertEquals(musicA.getSongName(), musicB.getSongName());
		//toString�� �̿��� �� ������ Ʈ��
		assertEquals(musicA.toString(), musicB.toString());
		//equal() ������ ���� ��
		assertEquals(musicA,musicB);
	}
}
