package com.qlsv.entity;

import java.io.Serializable;
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
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import jp.sf.amateras.mirage.annotation.PrimaryKey;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "lop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LopEntity {
	
	@Id
	private Long id;
	
	@Field(name = "ma_lop", unique=true)
	@NotBlank(message = "Vui Lòng Nhập Mã Lớp")
	@Length(min = 4 , message = "Mã lớp chứa ít nhất 4 ký tự!")
	private String maLop;
	
	@Field(name = "ten_lop")
	@NotBlank(message = "Vui Lòng Nhập Mã Khoa")
	@Length(min = 4 , message = "Mã lớp chứa ít nhất 4 ký tự!")
	private String tenLop;

	/* FOREIGN KEY */
	@Field(name = "makhoa_id")
	private Long makhoaId;

}
