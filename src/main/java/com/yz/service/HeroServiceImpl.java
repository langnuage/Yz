package com.yz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yz.mapper.HeroMapper;
import com.yz.pojo.Hero;


@Service
public class HeroServiceImpl implements HeroService
{
	@Autowired
	private HeroMapper heroMapper;

	public List<Hero> list() {
		// TODO Auto-generated method stub
		return heroMapper.list();
	}

}
