package main;

public class Terminal {

	private boolean logon = false;
	
	public void netConnect() {
		// TODO Auto-generated method stub
		System.out.println("Network is estabilished.");
	}

	public void netDisconnect() {
		// TODO Auto-generated method stub
		System.out.println("Network is disconnected.");
	}

	public void logoff() {
		// TODO Auto-generated method stub
		System.out.println("<<logoff");
	}

	public void sendMessage(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

	public Object getReturnMessage() {
		// TODO Auto-generated method stub
		return "world!";
	}

	public boolean isLogon() {
		// TODO Auto-generated method stub
		return logon;
	}

	public void logon(String string, String string2) {
		// TODO Auto-generated method stub
		this.logon = true;
		System.out.println(">>logon "+string+":"+string2);
	}
	
}
