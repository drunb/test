package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Customer;

/**
 * ³Ö¾Ã²ã½Ó¿Ú
 * @author Administrator
 *
 */
public interface ICustomerDao {

	public void addCustomer(Customer c);

	public List<Customer> findAllCustomer();
}
