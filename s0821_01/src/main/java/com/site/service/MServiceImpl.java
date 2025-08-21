package com.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.MemberMapper;
import com.site.dto.Member;

@Service	// 객체 자동생성
public class MServiceImpl implements MService {

	@Autowired MemberMapper memberMapper;
	
	@Override	// id,pw확인
	public Member findByIdAndPw(String id, String pw) {
		Member member = memberMapper.findByIdAndPw(id,pw);
		return member;
	}

	@Override	// 회원리스트
	public List<Member> fineAll() {
		List<Member> list = memberMapper.findAll();
		return list;
	}

	@Override	// 회원상세보기
	public Member fineAndId(String id) {
		Member member = memberMapper.findAndId(id);
		return member;
	}

}
