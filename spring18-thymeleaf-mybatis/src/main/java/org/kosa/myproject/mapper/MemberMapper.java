package org.kosa.myproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.GetMapping;

@Mapper
public interface MemberMapper {
	@GetMapping
	int getTotalMemberCount();
}
