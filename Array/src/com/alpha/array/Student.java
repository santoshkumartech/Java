package com.alpha.array;

public class Student
{
	String name;
	int age;
	
	Student(String name, int age)
	{
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "1.name: "+ name + "\n2.age: "+ age + "\n another student";
	}
	
}

