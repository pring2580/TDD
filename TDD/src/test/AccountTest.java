package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import main.Account;

public class AccountTest {
	
	private Account account;

	@Before
	public void setup() {
		account = new Account(10000);
	}
	
	//생성자 테스트
	@Test
	public void testAccount() throws Exception {
	}
	
	//잔고 조회에 대한 테스트
	@Test
	public void testGetBalance() throws Exception {
		//assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());
		assertEquals(10000, account.getBalance());
//		if(account.getBalance() != 10000) {
//			fail("getBalance() => "+account.getBalance());
//		}
		
		account = new Account(1000);
		assertEquals(1000, account.getBalance());
//		if(account.getBalance() != 1000) {
//			fail();
//		}
		
		account = new Account(0);
		assertEquals(0, account.getBalance());
//		if(account.getBalance() != 0) {
//			fail();
//		}
	}

	//입금에 대한 테스트
	@Test
	public void testDeposit() throws Exception{
		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}
	
	//출금에 대한 테스트
	@Test
	public void testWithdraw() throws Exception{
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
	}
	
	//assert 테스트
	@Test
	public void testAssert() throws Exception{
		//값이 같은지 비교
		int a = 10;
		int b = 10;
		assertEquals("a != b", a, b);
		
		b = 5;
		assertNotEquals("a == b", a, b);
		
		//객체가 같은지 비교
		assertNotSame("객체 같음", a, b);
		
		a = b;
		assertSame("객체 다름", a, b);
		
		//Null or Not Null
		String s1 = null;
		String s2 = "11";
		assertNull("Not NULL", s1);
		assertNotNull("NUll", s2);
		
		//True or False
		a = 1;
		b = 1;
		assertTrue(a == b);
		
		b = 2;
		assertFalse(a == b);
	}
	
	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		try {
			test.testAccount();	//계좌 생성
			test.testGetBalance();	//잔고 조회 테스트
			test.testDeposit();	//입금 테스트
			test.testWithdraw();	//출금 테스트
			test.testAssert();	//assert 테스트
			
			
		} catch (Exception e) {
			System.out.println("실패(X)");
			return;
		}
		System.out.println("성공(O)");
	}
}
