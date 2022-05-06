package com.globalin.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

// 이 클래스를 스프링 환경에서 테스트
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
// Controller를 위한 테스트 클래스라고 알려줘야 함 
@WebAppConfiguration // (웹 설정을 사용합니다.)
public class BoardControllerTest {
	private static Logger log = LoggerFactory.getLogger(BoardControllerTest.class);
	// 스프링의 웹 설정 불러오기
	@Autowired
	private WebApplicationContext ctx;

	// Mock-up
	private MockMvc mockMvc;

	// 테스트 메소드 실행하기 전에 항상 먼저 실행되는 메소드 처리
	// 가짜 MVC 만들어주기 (기능만 테스트 하기 위해)
	@Before
	public void setup() {
		// TODO Auto-generated method stub
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	@Test
	public void testList() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list").param("pageNum", "2").param("amount", "10"))
				.andReturn().getModelAndView().getModelMap().toString());
	}

//	@Test
//	public void testRegister() throws Exception {
//		String result = "";
//		result = mockMvc
//				.perform(MockMvcRequestBuilders.post("/board/register").param("title", "MOCK TEST TITLE")
//						.param("content", "MOCK TEST CONTENT").param("writer", "MOCKUSER"))
//				.andReturn().getModelAndView().getViewName();
//		// viewName : 다음에 갈 뷰 이름 ( 사용자가 볼 페이지 경로)
//		log.info(result);
//	}
//
//	@Test
//	public void testGet() throws Exception {
//		// mockMvc.perform(MockMvcRequestBuilders -> 가짜 목 요청 만들기
//		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/get").param("bno", "2")).andReturn()
//				.getModelAndView().getModelMap().toString());
//	}
//
//	@Test
//	public void testPost() throws Exception {
//		String result = "";
//		result = mockMvc
//				.perform(MockMvcRequestBuilders.post("/board/modify").param("bno", "0").param("title", "수정된 테스트 제목")
//						.param("content", "수정된 테스트 내용").param("writer", "수정된 테스트 글쓴이"))
//				.andReturn().getModelAndView().getViewName(); // 가짜 Mvc 실행
//		log.info(result);
//	}

//	@Test
//	public void testRemove() throws Exception {
//		log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/remove").param("bno", "0")).andReturn()
//				.getModelAndView().getViewName());
//	}
}
