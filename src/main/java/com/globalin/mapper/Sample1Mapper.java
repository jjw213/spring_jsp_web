package com.globalin.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample1Mapper {
	// 데이터 삽입
	@Insert("insert into tbl_sample (col1) values (#{data})")
	public int insertCol1(String data);
}
