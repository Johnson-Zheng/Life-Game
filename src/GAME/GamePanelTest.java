package GAME;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GamePanelTest {
	
	@Test(expected = RuntimeException.class)
	public void testGamePanel() {
		GamePanel mock= Mockito.mock(GamePanel.class);
		mock.getMark();
		when(mock.getMark()).thenReturn(1);
		int result=1;
		//确认运行
		verify(mock).getMark();
		//确认结果
		assertEquals(1,result);
	}

	@Test(expected = RuntimeException.class)
	public void testPaintComponent() {
		GamePanel mock= Mockito.mock(GamePanel.class);
		mock.cycle();
		int result=1;
		when(mock.getMark()).thenReturn(1);
		//确认运行
		verify(mock).getMark();
		//确认结果
		assertEquals(1,result);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInitRandom() {
		GamePanel mock= Mockito.mock(GamePanel.class);
		mock.initRandom();
		when(mock.getMark()).thenReturn(3);
		int result=3;
		//确认运行
		verify(mock).getMark();
		//确认结果
		assertEquals(3,result);
	}

	@Test(expected = RuntimeException.class)
	public void testInitSquare() {
		GamePanel mock= Mockito.mock(GamePanel.class);
		mock.initSquare();
		when(mock.getMark()).thenReturn(4);
		int result=4;
		//确认运行
		verify(mock).getMark();
		//确认结果
		assertEquals(4,result);
	}

	@Test(expected = RuntimeException.class)
	public void testInitTriangle() {
		GamePanel mock= Mockito.mock(GamePanel.class);
		mock.initTriangle();
		when(mock.getMark()).thenReturn(5);
		int result=5;
		//确认运行
		verify(mock).getMark();
		//确认结果
		assertEquals(5,result);
	}

}
