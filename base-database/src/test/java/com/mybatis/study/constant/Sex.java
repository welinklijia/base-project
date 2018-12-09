package com.mybatis.study.constant;

public enum Sex {
	male("男",1),
	female("女",0);
	private String name;
	private int value;
	private Sex(String name,int value){
		this.name=name;
		this.value=value;
	}
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	public static Sex getEnum(int value){
		Sex[] sexs = Sex.values();
		Sex se = null;
		for(Sex sex:sexs){
			if (sex.getValue() == value){
				se = sex;
				return se;
			}
		}
		return se;
	}
}
