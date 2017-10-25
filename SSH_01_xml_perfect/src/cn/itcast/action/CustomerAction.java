package cn.itcast.action;

import java.util.List;

import cn.itcast.entity.Customer;
import cn.itcast.service.ICustomerService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * ¶¯×÷Àà
 * @author Administrator
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private ICustomerService customerService;
	private Customer customer = new Customer();
	private List<Customer> customers;
	
	@Override
	public Customer getModel() {
		return customer;
	}

	
	public String addCustomerUI(){
		
		return SUCCESS;
	}
	
	
	public String findAllCustomer(){
		customers = customerService.findAllCustomer();
		return SUCCESS;
	}
	
	
	
	
//===========================================	
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	
	
}
