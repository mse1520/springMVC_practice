package com.board.member.tx;

import org.apache.ibatis.annotations.Param;

public interface ITXDAO {
	void insertStr10(@Param("str") String str);
	void insertStr30(@Param("str") String str);
}
