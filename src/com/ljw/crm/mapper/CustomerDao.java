package com.ljw.crm.mapper;

import java.util.List;

import com.ljw.crm.pojo.Customer;
import com.ljw.crm.pojo.QueryVo;

public interface CustomerDao {

	
	//总条数
	public Integer customerCountByQueryVo(QueryVo vo);
	//结果集
	public List<Customer> selectCustomerListByQueryVo(QueryVo vo);
	
	//通过ID查询用户
	public Customer selectCustomerById(Integer id);

	//修改客户通过ID
	public void updateCustomerById(Customer customer);
	
	//删除客户通过ID
	public void deleteCustomerById(Integer id); 
}
