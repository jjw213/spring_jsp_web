package com.globalin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SampleTxServiceTest {
	@Autowired
	private SampleTxService service;

	@Test
	public void testAddData() {
		String data = "적당히 긴 문자열\r\n" + "아주 적당히 긴 문자열\r\n";
		System.out.println(data.getBytes().length);
		service.addData(data);
	}
}
