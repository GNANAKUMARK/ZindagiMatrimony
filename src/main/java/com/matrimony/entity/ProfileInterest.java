package com.matrimony.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProfileInterest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long senderUserId;
	private Long receiverUserId;
	private String receiverFirstName;
	private String receiverLastName;
	private Integer receiverAge;
	private Double receiverSalary;
}
