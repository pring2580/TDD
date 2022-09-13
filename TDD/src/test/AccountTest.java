package test;

import static org.junit.Assert.assertEquals;
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
	
	//출금에 대한 테스트
	
	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		try {
			test.testAccount();	//계좌 생성
			test.testGetBalance();	//잔고 조회 테스트
			test.testDeposit();	//입금 테스트
			test.testWithdraw();	//출금 테스트
		} catch (Exception e) {
			System.out.println("실패(X)");
			return;
		}
		System.out.println("성공(O)");
	}
}
