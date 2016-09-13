
// Example shows labda exressions with functional interface
// Defination : Lamda expressios are used primarily to define inline implementation of functional interface 
// i.e. an interface with single method only
public class LamdaEx {
	interface GreeringService{
		public void sayMessage(String msg);
	}
	public static void main(String args[])
	{
			GreeringService service1 = msg -> System.out.println("Hello " + msg);
			service1.sayMessage("Mahendra");
		
	}
}
