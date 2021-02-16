abstract class Reservation
{
	abstract void reserve();
}

class ReserveTrain extends Reservation
{
	public void reserve()
	{
		System.out.println("Reservation of Train");
	}
}
class ReserveBus extends Reservation
{
	public void reserve()
	{
		System.out.println("Reservation of Bus");
	}
}
class ReservationDemo
{
	public static void main(String[] args)
	{
		ReserveTrain rt = new ReserveTrain();
		ReserveBus rb = new ReserveBus();
		
		rt.reserve();
		rb.reserve();
	}
}