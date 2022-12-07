package com.app.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.models.Areakerja;
import com.app.services.AreaKerjaService;

@RestController
@RequestMapping("api/v1/areakerja")
public class AreakerjaRestController {
	
	@Autowired
	private AreaKerjaService as;
	
	@GetMapping(value = "listall")
	public List<Areakerja>listall(){
		return as.listall();
	}
	

}
