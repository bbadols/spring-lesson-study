package org.kosa.myproject.model;

import org.springframework.stereotype.Component;

@Component // Spring Container에게 컴포넌트임을 알리는 애너테이션 -> scan 시에 bean으로 생성해서 관리해 주세요
//별도의 명시가 없으면 소문자로 시작하는 클래스명이 자신의 bean name이 된다 :hammer로 bean이 등록
public class Hammer implements Tool{
	public void work() {
		System.out.println("망치로 일하다");
	}

}
