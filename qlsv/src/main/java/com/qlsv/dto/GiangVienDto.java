package com.qlsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiangVienDto {

	private String id;
	private String maGv;
	private String ho;
	private String ten;
	private String phai;
	private Date ngaySinh;
	private String sdt;
	private String email;
	private String matKhau;
	private int vaiTro;
	private String hinhAnh;

	/* FOREIGN KEY */
	private String maKhoa;
}
