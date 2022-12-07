package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.models.Areakerja;
import com.app.repository.AreaKerjaRepo;

@Service
@Transactional
public class AreaKerjaService {
	
	@Autowired
	private AreaKerjaRepo ar;
	
	public List<Areakerja>listall(){
		return ar.findAll();
	}	

}
