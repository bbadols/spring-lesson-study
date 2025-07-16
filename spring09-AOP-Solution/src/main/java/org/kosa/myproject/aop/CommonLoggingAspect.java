package org.kosa.myproject.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // AOP Cross Cutting Concern Logic을 담당하는 클래스임을 스프링 컨테이너에 알린다
public class CommonLoggingAspect {
	// @Before(매개변수) Advice : AOP 적용시점. Core 즉 타겟 메서드 실행 전에 AOP 기능이 수행되게 한다
	// @After Advice : AOP 적용시점. Core 실행 후 적용
	/*
	 	execution() : pointcut AOP 적용 대상 지정할 때 씀
	 	public : 메서드 접근 제어자
	 	* : 리턴타입 모든 것이 대상(void 포함)
	 	org.kosa.myproject.model. : 해당 패키지 하위 클래스들을 대상으로 지정
	 						or model.. : 해당 패키지 하위의 패키지들과 하위 클래스들을 대상
	 	* Service : Service로 마치는 인터페이스 또는 클래스들을 대상으로
	 	find* : find로 시작하는 메서드들을 대상으로
	 	(..) : 매개변수 0..* 이렇게쓴다.
	 */
	@After("execution(public * org.kosa.myproject.model.*Service.find*(..))")
	public void logging(JoinPoint point){ //JoinPoint : 실제 수행되는 core 대상 정보를 저장
		String className = point.getTarget().getClass().getName(); // 실제 core 대상 클래스명
		String methodName = point.getSignature().getName(); // 실제 core 대상 메서드명
		System.out.println("**AOP Cross Cutting Concern Logic 수행!**"+className+" " + methodName);
	}
}
