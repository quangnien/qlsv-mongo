package com.qlsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiemDto {

	private String id;

	private float cc;
	private float gk;
	private float ck;
	private float tb;
	private String xepLoai;

	/* FOREIGN KEY */
	private String maSv;
	private String maLopTc;
	
}
