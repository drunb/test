package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Customer;

/**
 * �־ò�ӿ�
 * @author Administrator
 *
 */
public interface ICustomerDao {

	public void addCustomer(Customer c);

	public List<Customer> findAllCustomer();
}
