package com.emp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


// Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@Data
@AllArgsConstructor
@Builder
public class Employee {
	
	private long empId;
	private String empName;
	private double empSal;
	
	Address address;

}
