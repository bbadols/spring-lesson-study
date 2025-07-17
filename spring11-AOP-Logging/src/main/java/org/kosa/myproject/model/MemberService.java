package org.kosa.myproject.model;


import org.springframework.stereotype.Service;

@Service
public class MemberService {

	public void findMemberById(String id) {
		System.out.println(getClass().getName()+" core concern findMemberById");
		
	}

	public void findMemberByAddress(String address) {
		System.out.println(getClass().getName()+" core concern findMemberByAddress");
	}

	public void findMemberListByDept(String dept) {
		System.out.println(getClass().getName()+" core concern findMemberList");
	}

	public void register(String id,String name) {
		System.out.println(getClass().getName()+" core concern register");
	}

}