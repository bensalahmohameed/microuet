package com.example.demo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.bean.EvenementBean;

@FeignClient(name = "EVENEMENT-SERVICE")
public interface EvenementProxyService {
	@GetMapping("/evenement/{id}")
	public EvenementBean findEvenementById(@PathVariable(name = "id") Long id);
	

}
