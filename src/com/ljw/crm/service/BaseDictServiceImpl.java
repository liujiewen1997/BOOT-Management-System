package com.ljw.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ljw.crm.mapper.BaseDictDao;
import com.ljw.crm.pojo.BaseDict;

@Service
public class BaseDictServiceImpl implements BaseDictService {
	
	@Autowired
	private BaseDictDao baseDictDao;
	@Override
	public List<BaseDict> selectBaseDictListByCode(String code) {
		return baseDictDao.selectBaseDictListByCode(code);
	}

}
