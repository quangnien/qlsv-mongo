package com.qlsv.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Field;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinField;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;

@Document(collection = "giang_vien")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiangVienEntity {
	
	@Id
	private Long id;
	
	@Field(name = "ma_gv", unique=true)
	@NotBlank(message = "Vui Lòng Nhập Mã Sinh Viên")
	@Length(min = 4 , message = "Mã sinh viên chứa ít nhất 4 ký tự!")
	private String maGv;
	
	@Field(name = "ho")
	@NotBlank(message = "Vui Lòng Nhập Họ")
	private String ho;
	
	@Field(name = "ten")
	@NotBlank(message = "Vui Lòng Nhập Tên")
	private String ten;
	
	@Field(name = "phai")
	@NotBlank(message = "Vui Lòng Nhập Giới Tính")
	private String phai;
	
	@Field(name = "ngay_sinh")
	@DateTimeFormat(pattern =  "yyyy-MM-dd")
	private Date ngaySinh;
	
	@Field(name = "sdt")
	private String sdt;
	
	@Field(name = "email")
	@NotBlank(message = "Vui lòng nhập Email!")
	@Email(message = "Nhập đúng định dạng email!")
	private String email;
	
	@Field(name = "mat_khau")
	@NotBlank(message = "Vui Lòng Nhập Mật Khẩu")
	@Length(min = 4 , message = "Mật khẩu chứa ít nhất 4 ký tự!")
	private String matKhau;
	
	
	@Field(name = "vai_tro")
	private int vaiTro;
	
	@Field(name = "hinh_anh")
	private String hinhAnh;
	
	/* FOREIGN KEY */	
	@Field(name = "makhoa_id")
	private Long makhoaId;
	
}
