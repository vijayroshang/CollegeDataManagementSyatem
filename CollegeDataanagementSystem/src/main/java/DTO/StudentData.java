package DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Roll_Nom;
	String Name;
	String DOB;
	String Branch;
	int marks1;
	int marks2;
	int marks3;
	public int getRoll_Nom() {
		return Roll_Nom;
	}
	public void setRoll_Nom(int roll_Nom) {
		Roll_Nom = roll_Nom;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}

	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
}
