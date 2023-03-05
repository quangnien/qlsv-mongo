package com.qlsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietLopTcDto {

	private String id;

	private int tiet;
	private String thu;
	private int soTiet;
	private String Phong;

	/* FOREIGN KEY */
	private String maLopTc;
	
}
