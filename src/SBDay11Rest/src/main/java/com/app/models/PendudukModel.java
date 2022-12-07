package com.app.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PendudukModel {
	
	@NotBlank(message = "Nama tidak boleh kosong")
	@Size(min = 8, message = "Nama min 8 karaker")
	private String nama;
	
	@NotBlank(message = "Alamat harus diisi woi")
	@Size(min = 10, message = "alamat min 10 karakter")
	private String alamat;
	
	@Min(value = 20, message = "umur kemudaan")
	private int umur;
	
	@Email(message = "email harus sesuai format")
	private String email;
	
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
