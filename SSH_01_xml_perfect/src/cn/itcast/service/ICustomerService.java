package cn.itcast.service;

import java.util.List;

import cn.itcast.entity.Customer;

/**
 * ҵ���ӿ�
 * @author Administrator
 *
 */
public interface ICustomerService {

	public void addCustomer(Customer c);
	
	public List<Customer> findAllCustomer();
	
}
