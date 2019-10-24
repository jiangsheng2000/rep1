package com.turing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turing.entity.Car;
import com.turing.service.ICarService;

/**
 * ������
 * @author fred
 *
 */
@Controller
public class CarController {
	
	//���Ʋ�����ҵ��㣬ע��ҵ������
	@Autowired
	private ICarService carService;

	@RequestMapping("/test")
	@ResponseBody //�ڸ�ע�ⷽ���У�������ص��Ƕ��󣬾ͻ������JSON��������ص���String���Ǿͷ���String
	public String test() {
		return "ssm success";
	}
	
	//��ַ����/car/1,����JSON
	@RequestMapping("/car/{id}")
	@ResponseBody
	public Car getCar(@PathVariable("id")Integer id) {
		return carService.findById(id);
	}
}
