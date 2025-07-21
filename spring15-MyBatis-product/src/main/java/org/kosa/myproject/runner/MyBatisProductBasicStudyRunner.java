package org.kosa.myproject.runner;

import org.kosa.myproject.mapper.ProductMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//@Order(2)  // 기본 MyBatis ㅇㅖ제는 테스트 마무리 되었으므로 실행해서 일단 제외 시킨다
public class MyBatisProductBasicStudyRunner implements CommandLineRunner {
	private static final Logger logger=LoggerFactory.getLogger(MyBatisProductBasicStudyRunner.class);
	private final ProductMapper productMapper;
	public MyBatisProductBasicStudyRunner(ProductMapper productMapper) {
		this.productMapper=productMapper;
	}

	//@Autowired 생략 가능
	@Override
	public void run(String... args) throws Exception {
		logger.debug("className {} run.. DI{}", getClass(),productMapper);
//		int totalProductCount = productMapper.getTotalProductCount();
//		logger.debug("총 상품 수: {}" +totalProductCount);
	/*
	 	현 러너에서 DI : ProductMapper
	 	org.kosa.myproject.mapper.ProductMapper interface를 정의한다
	 	src/main/resources 아래에 동일한 패키지에 ProductMapper.xml 정의한다
	 */
		// 전체 상품 조회
//		List<Product> list=productMapper.findAllProductList();
//		for(Product p : list)
//			logger.debug(p.toString());
		
		// 상품 id로 개별 상품 조회
//		Long productId = 1L;
//		Product product = productMapper.findProductById(productId);
//		logger.debug("상품 정보: {}", product);
//		
//		// 상품 정보를 수정 : 상품명 productName 제조사 maker 가격 price
//		Product param = new Product();
//		param.setProductId(1L); // 상품 아이디가 1인 상품 정보를 수정
//		param.setProductName("갤럭시북");
//		param.setMaker("삼성");
//		param.setPrice(new BigDecimal("15000000"));
//		int updateResult = productMapper.updateProduct(param);
//		logger.debug("상품 정보 수정: {}",updateResult);
//		
//		Product product2 = productMapper.findProductById(1L);
//		logger.debug("수정된 상품 정보 확인: {}", product2);
		
		// 상품 등록 후 primary ket인 product_id에 자동생성된 정보를 확보했는지 확인
//		Product newProduct = new Product("갤럭시 28","삼성",new BigDecimal("1200000"));
//		int insertResult = productMapper.registerProduct(newProduct);
//		logger.debug("등록 상품수 {}",insertResult);
//		logger.debug("총 상품수{}",productMapper.getTotalProductCount()); // 12
//		logger.debug("등록된 상품의 productId 정보{}",newProduct.getProductId());// 12
		
		// 가격대별 검색(낮은 가격 이상 높은가격 이하)
//		BigDecimal minPrice = new BigDecimal("500000");
//		BigDecimal maxPrice = new BigDecimal("1000000");
//		List<Product> list = productMapper.findByPriceRange(minPrice,maxPrice);
//		for(Product p : list)
//			logger.debug("상품 정보{}",p);

	}
}
