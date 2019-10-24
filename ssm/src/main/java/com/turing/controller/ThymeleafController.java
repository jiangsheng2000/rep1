package com.turing.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "��ã�Thymeleaf��");
		return "hello";
	}
	
	//�������
	@RequestMapping("/inner")
	public String inner(HttpServletRequest request) {
		//������
		request.setAttribute("requestMsg", "������-����");
		//�ػ���
		request.getSession().setAttribute("sessionMsg", "�ػ���-����");
		//ȫ����
		request.getServletContext().setAttribute("applicationMsg", "ȫ����-����");
		return "hello";
	}	
}
