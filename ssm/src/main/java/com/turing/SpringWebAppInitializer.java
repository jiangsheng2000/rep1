package com.turing;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.turing.config.RootConfig;
import com.turing.config.WebConfig;
import com.turing.web.MyFilter;
import com.turing.web.MyServlet;
/**
 * �������������ʼ��ǰ�˿���������������
 * ����DispatcherServlet
 * @author fred
 *
 */
public class SpringWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	//ȫ������
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {RootConfig.class};
	}

	//����SpringMVC
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	//����ServletMapping
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	//���ù�����
	@Override
	protected Filter[] getServletFilters() {
		//���ñ��봦�������
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter("utf-8",true);
		return new Filter[] {encodingFilter};
	}
	
	//��������Servlet��Filter
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		super.onStartup(servletContext);
//		
//		//����һ��Servlet
//		Dynamic myServlet = servletContext.addServlet("MyServlet", MyServlet.class);
//		//����Servlet��ӳ��
//		myServlet.addMapping("/MyServlet");
//		
//		//����һ��Filter
//		javax.servlet.FilterRegistration.Dynamic myFilter = servletContext.addFilter("MyFilter", MyFilter.class);
//		//��������·��
//		myFilter.addMappingForUrlPatterns(null, true, "/*");
//	}

}
