package com.ljw.crm.service;

import java.util.List;

import com.ljw.crm.pojo.BaseDict;

public interface BaseDictService {
	public List<BaseDict> selectBaseDictListByCode(String code);


}
