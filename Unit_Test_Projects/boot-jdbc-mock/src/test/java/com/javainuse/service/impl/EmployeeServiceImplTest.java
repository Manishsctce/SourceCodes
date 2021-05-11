package com.javainuse.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.javainuse.dao.EmployeeDao;
import com.javainuse.model.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {

	@Mock
	private EmployeeDao employeeDao;

	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

	@Spy
	Employee spyEmp; 
	
	@Test
	public void testEmployee() {
		Employee emp = new Employee();

		employeeServiceImpl.insertEmployee(emp);

		// here we can verify directly with the emp object we are
		// passing while calling to the service
		Mockito.verify(employeeDao).insertEmployee(emp);
	}

	@Test
	public void testEmployeeWithEmployeeId() {
		ArgumentCaptor<Employee> captor = ArgumentCaptor.forClass(Employee.class);

		//Employee emp = new Employee();
		spyEmp.setEmpId("emp1");
		spyEmp.setEmpName("testEmp");

		employeeServiceImpl.insertEmployeeUsingEmployeeId("emp1");

		// here we dont have instance of employee object(since it is created in
		// the service class
		// and not passed externally) but we want to verify the employee
		// object which was used to call repository. So we use captor.
		// passing while calling to the service
		Mockito.verify(employeeDao).insertEmployee(captor.capture());

		Employee actual = captor.getValue();
		assertEquals(spyEmp.getEmpName(), actual.getEmpName());
		assertEquals(spyEmp.getEmpId(), actual.getEmpId());

	}

}