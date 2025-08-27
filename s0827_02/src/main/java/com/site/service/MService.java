package com.site.service;

import com.site.dto.Member;

public interface MService {

	//로그인확인(id,pw)
	Member findByIdAndPw(String id, String pw);

}
