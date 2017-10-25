package cn.itcast.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.entity.Customer;

/**
 * 持久层实现类
 * @author Administrator
 *
 */
public class CustomerDaoImpl implements ICustomerDao {

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void addCustomer(Customer c) {
		hibernateTemplate.save(c);
	}

	@Override
	public List<Customer> findAllCustomer() {
		List<Customer> list = (List<Customer>) hibernateTemplate.find("from Customer");
		return list;
	}

}
