package com.app.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.models.PendudukModel;

@RestController
@RequestMapping(value = "api/")
public class DefaultRestControl {
	
	@GetMapping(value = "nama1")
	public String nama1() {
		String nama = "Warga";
		return nama;
	}
	
	@GetMapping(value = "nilai1")
	public int nilai1() {
		int nilai = 100;
		return nilai;
	}
	
	//set http status
	@GetMapping(value = "nilai2")
	public Map<String, Integer> nilai2() {
		
		//collection
		Map<String, Integer> data = new LinkedHashMap<>();
		//isi collection
		data.put("Hasil", 100);
		return data;
	}
	
	//set http status
		@GetMapping(value = "nilai3")
		//@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
		@ResponseStatus(code = HttpStatus.OK)
		public Map<String, Integer> nilai3denganstatus() {
			
			//collection
			Map<String, Integer> data = new LinkedHashMap<>();
			//isi collection
			data.put("Hasil", 100);
			return data;
		}
		
		
		@GetMapping(value = "nilai4")
		public ResponseEntity<Object> nilai4ResponseEntity() {
			//collection
			Map<String, Integer> data = new LinkedHashMap<>();
			//isi collection
			data.put("Hasil", 100);
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(data);
		}
		
		@PostMapping(value = "senddata1")
		public void getData(@RequestParam(value = "nama")String nm,
							@RequestParam(value = "nilai")int ni) {
			System.out.println(nm);
			System.out.println(ni);
		}
		
		
		@PostMapping(value = "senddata2/{kelas}")
		public void getData2(@RequestParam(value = "kelas")String kl) {
			System.out.println(kl);
		}
		
		
		
		@PostMapping(value = "senddata3")
		public ResponseEntity<Object>getData3(@RequestBody Map<String, Object> data) {
			System.out.println(data.get("nama"));
			System.out.println(data.get("alamat"));
			System.out.println(data.get("umur"));
			
			String nama=(String) data.get("nama");
			
				if(nama.equalsIgnoreCase("")) {
					return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ada yang kosong");
					
				}else {
					return ResponseEntity.status(HttpStatus.OK).body("...");
					
				}
				
		}
		
		@PostMapping(value = "senddata4")
		public ResponseEntity<Object> getData4(@Valid @RequestBody PendudukModel pm, BindingResult br ) {
//			System.out.println(br.getFieldError().getDefaultMessage());
//			System.out.println(pm.getNama());
//			System.out.println(pm.getAlamat());
//			System.out.println(pm.getUmur());
//			System.out.println(pm.getEmail());
			String errors="";
			
			
			if(br.hasErrors()) {
//				System.out.println(br.getFieldError().getDefaultMessage());
				errors = br.getFieldError().getDefaultMessage();
//				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("sebab:"+errors);
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(br.getAllErrors());
				
			}else {
				return ResponseEntity.status(HttpStatus.OK).body("success");
			}
			
			
			
		}
		
		@PostMapping(value = "checknilai")
		public ResponseEntity<Object>checkNilai(@RequestBody Map<String, Integer> data){
			int nilai = data.get("nilai");
			//result
			Map<String, String>hasil = new LinkedHashMap<>();
			
			System.out.println(nilai);
			if(nilai>60) {
				hasil.put("Hasil", "Anda Lulus");
			    return new ResponseEntity<>(hasil,HttpStatus.ACCEPTED);
			}else {
				hasil.put("Hasil", "Anda Tidak Lulus");
				return new ResponseEntity<>(hasil,HttpStatus.NOT_ACCEPTABLE);
				
			}
			
		}
}
