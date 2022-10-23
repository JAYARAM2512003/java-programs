public class TestVehicle {
	public static void main(String[] args)
	{
		Auto a1=new Auto();
	 Scorpio t1=new Scorpio();
		Tvs h1=new Tvs();
		Rx y1=new Rx();
		a1.Name();
		a1.Motors();
		a1.Engine();
		t1.Name();
		t1.Motors();
		t1.Engine();
		b1.Name();
		b1.Motors();
		b1.Engine();
		e1.Name();
		e1.Motors();
		e1.Engine();
	}
}
class Vehicle{
	public void Motors() {
	System.out.println(" Vehicle");
	}
}
class twoWheeler extends Vehicle{
	public void Engine()
	{
		System.out.println("Two Wheeler Engine Starts");
	}
}
class fourWheeler extends Vehicle{
	public void Engine(){
		System.out.println("Four Wheeler Engine Starts");
	}
}
class Tvs extends twoWheeler{
	public void Name()
	{
		System.out.print("Tvs");
	}
}
class Rx extends twoWheeler{
	public void Name()
	{
		System.out.print("Rx");
	}
}
class Scorpio extends fourWheeler{
	public void Name()
	{
		System.out.print("Scorpio");
	}
}
class Auto extends fourWheeler{
	public void Name()
	{
		System.out.print("Auto");
	}
}
