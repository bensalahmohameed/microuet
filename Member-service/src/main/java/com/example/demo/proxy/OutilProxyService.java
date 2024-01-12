package com.example.demo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.bean.OutilBean;

@FeignClient(name = "OUTIL-SERVICE")
public interface OutilProxyService {
	@GetMapping("/outil/{id}")
	public OutilBean findOutilById(@PathVariable(name = "id") Long id);
	

	
}
