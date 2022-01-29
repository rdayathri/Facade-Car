
public class ClientFacade {
	public static void main (String []args)
	{
		CarFacade obj = new CarFacade();
		System.out.println(obj.orderBMW());
		System.out.println(obj.orderMercedes());
		System.out.println(obj.orderAudi());
	}

}
