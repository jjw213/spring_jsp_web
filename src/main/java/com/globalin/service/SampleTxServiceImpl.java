package com.globalin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalin.mapper.Sample1Mapper;
import com.globalin.mapper.Sample2Mapper;

@Service
public class SampleTxServiceImpl implements SampleTxService {

	// 로그
	private Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);

	@Autowired
	private Sample1Mapper mapper1;
	@Autowired
	private Sample2Mapper mapper2;

	@Override
	public void addData(String value) {
		// TODO Auto-generated method stub
		log.info("mapper1 .......????");
		mapper1.insertCol1(value);
		log.info("mapper2 .......????");
		mapper2.insertCol2(value);

		log.info("end .......????");
	}

}
