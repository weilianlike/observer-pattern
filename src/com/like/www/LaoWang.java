package com.like.www;

public class LaoWang implements Person {

	private String name="xiaowang";
	
	public LaoWang(){
		
	}
	
	@Override
	public void getMessage(String s) {
	
		System.out.println(name+"接到了小美传来的信息是"+s);
	}

}
