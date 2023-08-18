package com.cts;

public class Axisbank implements Rbibank, Worldbank{

	@Override
	public void fixed() {
		
	}

	@Override
	public void savings() {
		
	}

	@Override
	public void deposit() {
		
	}
	
	public static void main(String[] args) {
		Axisbank a = new Axisbank();
		a.deposit();
		
		Rbibank r = new Axisbank();
		r.savings();
		r.deposit();
	}

	

}
