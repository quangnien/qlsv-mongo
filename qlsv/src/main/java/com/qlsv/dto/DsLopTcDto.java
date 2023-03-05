package com.qlsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DsLopTcDto {

	private String id;

	private String maLopTc;
	private int nienKhoa;
	private int ky;
	private Date timeBd;
	private Date timeKt;

	/* FOREIGN KEY */
	private String maMh;
	private String maGv;
	private String maLop;
}
