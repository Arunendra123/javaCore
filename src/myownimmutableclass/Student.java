package myownimmutableclass;

public final class Student {

	private String name;
	private int rollNo;
	
	Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}
	
	public Student modify(String name,int rollNo) {
		if(this.name.equals(name) && this.rollNo==rollNo) {
			return this;
		} else {
			return new Student(name,rollNo);
		}
	}
}
