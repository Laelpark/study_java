package com.laelcompany.study.ch15.second;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
	
		list.add(new Board("제목1", "내용1", "글쓴이1")); // 0 // 0 // 0
		list.add(new Board("제목2", "내용2", "글쓴이2")); // 1 // 1 // 1
		list.add(new Board("제목3", "내용3", "글쓴이3")); // 2 // 삭제 // 삭제
		list.add(new Board("제목4", "내용4", "글쓴이4")); // 3 // 2 // 2
		list.add(new Board("제목5", "내용5", "글쓴이5")); // 4 // 3 // 삭제
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		}
	}

}
