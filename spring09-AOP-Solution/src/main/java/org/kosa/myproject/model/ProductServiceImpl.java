package org.kosa.myproject.model;


import org.springframework.stereotype.Service;

	
@Service
public class ProductServiceImpl implements ProductService {
	//공통 로그 컴포넌트를 사용하기 위해 객체 생선한다
	
	@Override
	public void updateProduct() {
		
		System.out.println(getClass().getName()+" core concern updateProduct");
	}
	@Override
	public void findProductById() {
		
		System.out.println(getClass().getName()+" core concern findProductById");
	}
	@Override
	public void findProductByName() {
		
		System.out.println(getClass().getName()+" core concern findProductByName");
	}
	@Override
	public void findProductListByMaker() {
		
		System.out.println(getClass().getName()+" core concern findProductListByMaker");
	}

}
