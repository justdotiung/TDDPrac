package test.testcace.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*; 

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import main.testcace.controller.Employee;
import main.testcace.controller.EmployeeSearchServlet;
import main.testcace.controller.SearchBiz;

public class EmployeeSearchServletTest {

	@Test
	public void testSearchByEmpid() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		MockHttpServletResponse response = new MockHttpServletResponse();
		
		request.addParameter("empid", "1234");
		//mockito 사용시
		//mocck객체 설정
		SearchBiz biz = mock(SearchBiz.class);
		//예상값 생성
		Employee expectedEmployee = new Employee("park","1234","fu","ceo");
		//stub생성
		when(biz.getEmployByEmpid(anyString())).thenReturn(expectedEmployee);
		
		EmployeeSearchServlet searchServlet = new EmployeeSearchServlet();
		//모델 주입
		searchServlet.setModel(biz);
		searchServlet.service(request, response);
		
		Employee employee = (Employee) request.getAttribute("employee");
		//동치성 비교
		assertEquals(expectedEmployee, employee);
		//mockito 비사용시
//		EmployeeSearchServlet searchServlet = new EmployeeSearchServlet();
//		searchServlet.service(request, response);
//		
//		Employee employee = (Employee) request.getAttribute("employee");
//		assertEquals("park", employee.getName());
//		assertEquals("1234", employee.getEmpid());
//		assertEquals("fu", employee.getId());
//		assertEquals("ceo", employee.getPosition());
		
		assertEquals("/SearchResult.jsp", response.getForwardedUrl());
		
		
	}
}
