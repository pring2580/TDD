package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Terminal;

public class TerminalTest {
	
	private static Terminal term;
	

	@BeforeClass
	public static void setUpBeforeClasS() throws Exception {
		term = new Terminal();	//터미널 클래스 생성
		term.netConnect();	//터미널 접속
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		term.netDisconnect();	//터미널 접속 종료
	}
	
	@Before
	public void setUp() throws Exception{
		term.logon("guest", "guest");
	}
	
	@After
	public void tearDown() throws Exception {
		term.logoff();	//로그아웃
	}
	
	@Test	//정상로그인 테스트
	public void testTerminalConnected() throws Exception{
		assertTrue(term.isLogon());
		System.out.println("==logon test");
	}
	
	@Test	//터미널 메시지 테스트
	public void testGetReturnMessage() throws Exception {
		term.sendMessage("hello");
		assertEquals("world!", term.getReturnMessage());
		System.out.println("== message test");
	}
}
