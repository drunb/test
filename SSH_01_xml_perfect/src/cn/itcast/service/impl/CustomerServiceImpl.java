package cn.itcast.service.impl;

import java.util.List;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.dao.impl.CustomerDaoImpl;
import cn.itcast.entity.Customer;
import cn.itcast.service.ICustomerService;

/**
 * 业务层实现类
 * @author Administrator
 *
 */
public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao customerDao;
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void addCustomer(Customer c) {
		customerDao.addCustomer(c);
	}

	@Override
	public List<Customer> findAllCustomer() {
		return customerDao.findAllCustomer();
	}

}
