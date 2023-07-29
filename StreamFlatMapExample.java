package com.biconsumer;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

	public static List<String> printStudentActivities(){
	return	StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println(printStudentActivities());
	}
	
}
//o/p:[swimming, basketball, volleyball, swimming, gymnastic, soccer, swimming, basketball, aerobics, swimming, basketball, volleyball, swimming, dancing, football, swimming, basketball, baseball, football]
