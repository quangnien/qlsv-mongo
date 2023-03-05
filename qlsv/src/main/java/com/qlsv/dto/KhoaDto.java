package com.qlsv.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhoaDto {

	private String id;

	private String maKhoa;
	private String tenKhoa;
	private String sdt;
	private String email;

}
