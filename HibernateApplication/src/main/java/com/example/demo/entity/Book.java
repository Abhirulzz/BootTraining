package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity 
@Table(name="vdsibook")
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bookCode")
	private long bookCode;
	
	@Column(name="bookName")
	
	private String bookName;
	
	
	
	
	
}
