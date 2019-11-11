package com.like.www;

public class LaoLi implements Person {
private String name="xiaoli";
	
	public LaoLi(){
		
	}
	@Override
	public void getMessage(String s) {
		System.out.println(name+"接到了小美传来的信息是"+s);
	}

}
