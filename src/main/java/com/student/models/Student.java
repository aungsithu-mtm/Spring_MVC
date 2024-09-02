package com.student.models;

public class Student {
	private String name;
	private int age;
	private String academicYear;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String academicYear) {
		this.name = name;
		this.age = age;
		this.academicYear = academicYear;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//               "name='" + name + '\'' +
//	           ", age=" + age +
//	           ", academicYear='" + academicYear + '\'' +
//	           '}';
//	}	
	
}
