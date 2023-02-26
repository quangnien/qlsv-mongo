package com.qlsv.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Field;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "mon_hoc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonHocEntity {
	
	@Id
	private Long id;
	
	@Field(name = "ma_mh", unique=true)
	@NotBlank(message = "Vui Lòng Nhập Mã Môn Học")
	@Length(min = 4 , message = "Mã môn học chứa ít nhất 4 ký tự!")
	private String maMh;
	
	@Field(name = "ten_mh")
	@NotBlank(message = "Vui Lòng Nhập Tên Môn Học")
	@Length(min = 4 , message = "Tên môn học chứa ít nhất 4 ký tự!")
	private String tenMh;
	
	@Field(name = "so_tc")
	private int soTc;
}
