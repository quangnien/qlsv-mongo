package com.qlsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonHocDto {

	private String id;

	private String maMh;
	private String tenMh;

	private int soTc;
}
