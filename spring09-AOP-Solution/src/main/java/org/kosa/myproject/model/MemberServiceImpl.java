package org.kosa.myproject.model;


import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	//공통 로그 컴포넌트를 사용하기 위해 객체 생선한다
	
	@Override
	public void findMemberById() {
		
		System.out.println(getClass().getName()+" core concern findMemberById");
	}
	@Override
	public void findMemberByAddress() {
		
		System.out.println(getClass().getName()+" core concern findMemberByAddress");
	}
	@Override
	public void findMemberList() {
		
		System.out.println(getClass().getName()+" core concern findMemberList");
	}
	@Override
	public void register() {
		System.out.println(getClass().getName()+" core concern register");
	}
}
