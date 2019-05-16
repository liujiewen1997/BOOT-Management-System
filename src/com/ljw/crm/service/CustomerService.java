package com.ljw.crm.service;

import org.omg.PortableInterceptor.INACTIVE;

import com.ljw.common.utils.Page;
import com.ljw.crm.pojo.Customer;
import com.ljw.crm.pojo.QueryVo;

public interface CustomerService {
	
	// 通过四个条件 查询分页对象
	public Page<Customer> selectPageByQueryVo(QueryVo vo);
	
	//通过ID查询用户
	public Customer selectCustomerById(Integer id);

	//修改客户通过ID
	public void updateCustomerById(Customer customer);
	
	//删除客户通过ID
	public void deleteCustomerById(Integer id); 
}
