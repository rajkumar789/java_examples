// Multithreding in java by extending Thread class
class Threadone extends Thread{
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println("Thread one" + i);
		}
			System.out.println("Exit Thread one");
	}
}
	class Threadtwo extends Thread{
		public void run(){
			for(int i = 0; i<5; i++){
				System.out.println("Thread two" + i);
			}
				System.out.println("Exit Thread two");
		}
	}
	class TestThread{
		public static void main(String args[]){
			Threadone obj1 = new Threadone(); 
			Threadtwo obj2 = new Threadtwo();
			obj1.start();
			obj2.start();
		}
	}