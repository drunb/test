package cn.itcast.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.entity.Customer;
import cn.itcast.service.ICustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {

	@Autowired
	private ICustomerService customerService;
	
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}

	@Test
	public void saveTest() {
		try {
			Customer c = new Customer();
			c.setCustName("SSH test");
			customerService.addCustomer(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
