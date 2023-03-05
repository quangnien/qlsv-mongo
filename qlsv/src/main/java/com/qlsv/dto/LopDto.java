package com.qlsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LopDto {

	private String id;

	private String maLop;
	private String tenLop;

	/* FOREIGN KEY */
	private String makhoa;
}
