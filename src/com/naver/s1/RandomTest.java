package com.naver.s1;

import java.util.Random;

public class RandomTest {
	
	//멤버변수
	//멤버변수 선언공식
	//접근지정자 그외지정자 데이터타입 변수명
	private Random random;
	
	//생성자 (클래스 내에 무조건 하나 이상 존재한다.)
	//접근지정자 클래스명과 _동일한_메서드명 (매개변수) { }
	public RandomTest() {
		//디폴트생성자
		//빈생성자
		random = new Random();
	}
	
		
	//멤버메서드
	//메서드 선언 공식
	//접근지정자 그외지정자 리턴타입 메서드명(매개변수) throw Exception { }
	public int getNum() {
		int num = random.nextInt(10); 
		System.out.println(num);
		return num;
	}
	

}
