package com.qlsv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

@Document(collection = "diem")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiemEntity {
	
	@Id
	private Long id;
	
	@Field(name = "cc")
	private float cc;
	
	@Field(name = "gk")
	private float gk;
	
	@Field(name = "ck")
	private float ck;
	
	@Field(name = "tb")
	private float tb;
	
	@Field(name = "xep_loai")
	@NotBlank(message = "Vui Lòng Nhập Xếp Loại")
	private String xepLoai;

	/* FOREIGN KEY */
	@Field(name = "masv_id")
	private Long masvId;
	
	@Field(name = "maloptc_id")
	private Long maloptcId;
	
}
