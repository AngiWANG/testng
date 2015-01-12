package com.allinpay.testng.sample;

public class Money {

	private int value;

	private String descritionp;

	public Money add(Money target) {
		return new Money(target.getValue() + value, descritionp);
	}

	public Money(int value, String descritionp) {
		super();
		this.value = value;
		this.descritionp = descritionp;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescritionp() {
		return descritionp;
	}

	public void setDescritionp(String descritionp) {
		this.descritionp = descritionp;
	}

}
