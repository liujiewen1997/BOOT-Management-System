package com.ljw.crm.mapper;

import java.util.List;

import com.ljw.crm.pojo.BaseDict;

public interface BaseDictDao {

	
	//查询
	public List<BaseDict> selectBaseDictListByCode(String code);
}
