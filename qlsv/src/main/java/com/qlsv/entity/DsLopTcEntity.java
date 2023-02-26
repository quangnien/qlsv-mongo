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

@Document(collection = "ds_lop_tc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DsLopTcEntity {
	
	@Id
	private Long id;
	
	@Field(name = "ma_lop_tc", unique = true)
	@NotBlank(message = "Vui Lòng Nhập Mã Lớp Tín Chỉ")
	@Length(min = 4 , message = "Mã lớp tín chỉ chứa ít nhất 4 ký tự!")
	private String maLopTc;
	
	@Field(name = "nien_khoa")
	private int nienKhoa;
	
	@Field(name = "ky")
	private int ky;
	
	@Field(name = "time_bd")
	@DateTimeFormat(pattern =  "yyyy-MM-dd")
	private Date timeBd;
	
	@Field(name = "time_kt")
	@DateTimeFormat(pattern =  "yyyy-MM-dd")
	private Date timeKt;
	
	/* FOREIGN KEY */	
	@Field(name = "mamh_id")
	private Long mamhId;
	
	@Field(name = "magv_id")
	private Long magvId;
	
	@Field(name = "malop_id")
	private Long malopId;
	
}
