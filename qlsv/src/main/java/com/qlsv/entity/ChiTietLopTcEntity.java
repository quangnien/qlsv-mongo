package com.qlsv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

@Document(collection = "chi_tiet_lop_tc")
@Data
@AllArgsConstructor
@NoArgsConstructor
@CompoundIndex(def = "{'maloptc_id': 1, 'number': 1}", unique = true)
public class ChiTietLopTcEntity {
	
	@Id
	private Long id;

	@Field(name = "tiet")
	private int tiet;
	
	@Field(name = "thu")
	@NotBlank(message = "Vui Lòng Nhập Thứ")
	@Length(min = 2 , message = "Thứ chỉ chứa ít nhất 2 ký tự!")
	private String thu;
	
	@Field(name = "so_tiet")
	private int soTiet;
	
	@Field(name = "phong")
	@NotBlank(message = "Vui Lòng Nhập Phòng")
	@Length(min = 2 , message = "Phòng chỉ chứa ít nhất 2 ký tự!")
	private String Phong;
	
	/* FOREIGN KEY */
	@Field(name = "maloptc_id")
	private Long maloptcId;

}
