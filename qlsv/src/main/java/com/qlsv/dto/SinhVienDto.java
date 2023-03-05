package com.qlsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinhVienDto {

	private String id;

	private String maSv;
	private String ho;
	private String ten;
	private String phai;
	private Date ngaySinh;
	private String noiSinh;
	private String diaChi;
	private int trangThai;
	private String hinhAnh;
	private String matKhau;
	private String sdt;

	/* FOREIGN KEY */
	private String maLop;

}
