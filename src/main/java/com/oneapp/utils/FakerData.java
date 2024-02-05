package com.oneapp.utils;

import com.github.javafaker.Faker;

public class FakerData {
	
	
	public static String GetPinCode() {
		Faker faker = new Faker();
//		return faker.regexify("[A-Za-z0-9 ,_-]{10}");
		return faker.regexify("[0-9]{6}");

	}
	
	public static void main(String[] args)
	{
		System.out.print(FakerData.GetPinCode());
	}
}
