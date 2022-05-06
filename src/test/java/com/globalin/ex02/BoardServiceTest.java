package com.globalin.ex02;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.globalin.domain.BoardVO;
import com.globalin.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTest {
	@Autowired
	private BoardService service;

	@Test
	public void testExist() {
		assertNotNull(service);
	}

//	@Test
//	public void testRegist() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새 service");
//		board.setContent("새 service");
//		board.setWriter("newbie");
//		service.register(board);
//		System.out.println("생성된 게시물 번호 : " + board.getBno());
//	}

	@Test
	public void listTest() {
		for (BoardVO board : service.getList()) {
			System.out.println(board);
		}
	}

	@Test
	public void testModify() {
		BoardVO board = service.get(1);
		if (board == null)
			return;
		System.out.println(service.modify(board));
	}

	@Test
	public void testDelete() {
		System.out.println(service.remove(1));
	}

	@Test
	public void testRead() {
		System.out.println(service.get(2));
	}

}
