package org.kosa.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * 요구사항
 * 기존의 회원 서비스와 상품 서비스들을
 * 대상으로 application.log 파일에 각 서비스의 메서드 실행 후
 * 시간 정보를 기록(로깅)하도록 해야 한다
 * 1. Logging 관련 프레임워크 학습 후 데모 앱 테스트
 * 2. 어떻게 Logging을 적용할 것인가 토론
 * 	1) 직접 각 메서드에 기술해보자 -> 중복 작업이 많아 개발 및 유지보수에 어려움 예상
 * 	2) AOP 적용하자
 * 		step1 AOP 의존성 Pom.xml 추가
 * 		step2 LoggingAspect 클래스 정의
 * 		step3 적용 대상 pointcut 적용 시점 advice를 결정하여 Logging을 진행
 * 			  서비스 계층의 모든 메서드에 로깅시에 클래스명, 메서드명과 매개변수가 있다면
 * 			  매개변수까지 출력
 */
@SpringBootApplication
public class Spring11AopLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring11AopLoggingApplication.class, args);
	}

}
