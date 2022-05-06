package com.globalin.mapper;

import java.util.List;

import com.globalin.domain.BoardVO;
import com.globalin.domain.Criteria;

public interface BoardMapper {
	// @Select("select * from tbl_board where bno > 0")
	// BoardMapper.xml (myBatis xml 에서 설정할 것이기 때문에 주석처리
	public List<BoardVO> getList();

	// 페이지 처리된 만큼 가져오기
	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO board);

	public void insertSelectKey(BoardVO board);

	public BoardVO read(int bno);

	public int delete(int bno);

	public int update(BoardVO board);

	public int getTotalCount(Criteria cri);

}
