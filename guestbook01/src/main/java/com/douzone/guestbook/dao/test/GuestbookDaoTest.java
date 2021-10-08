package com.douzone.guestbook.dao.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		// insertTest();
		// findAllTest();
		 deleteTest();
	}

	private static void deleteTest() {
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(4L);
		vo.setPassword("1234");
		
		new GuestbookDao().delete(vo);
		
		
	}

	private static void findAllTest() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("승현");
		vo.setPassword("1234");
		vo.setMessage("하이");
		
		new GuestbookDao().insert(vo);
	}

}
