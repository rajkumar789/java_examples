class student{
	int id;
	String name;
}
class Demo{
	public static void main(String args[]){
		student s = new student();
		s.id = 1;
		s.name = "AMC";
		System.out.println(s.id+""+s.name);
	}
}