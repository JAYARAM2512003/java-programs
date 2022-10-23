public class TestOverride {
	public void sayHello(String arr)	{
		System.out.println("hello "+arr);
	}
	public void sayHello(){
		System.out.println("Hello_GHF");
	}
	public static void main(String[] args) {
		String s="hi";
		TestOverride a1=new TestOverride();
		a1.sayHello();
		a1.sayHello(s);
		
	}
}
