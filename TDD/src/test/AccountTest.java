package test;

import static org.junit.Assert.fail;

import org.junit.Test;

import main.Account;

public class AccountTest {
	
	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}
	
	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		
		if(account.getBalance() != 10000) {
			fail();
		}
	}
	
	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		try {
			test.testAccount();	//계좌 생성
			test.testGetBalance();	//잔고 조회 테스트
		} catch (Exception e) {
			System.out.println("실패(X)");
			return;
		}
		System.out.println("성공(O)");
	}
}
