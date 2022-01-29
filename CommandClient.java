
public class CommandClient {
	
	public static void main (String []args)
	{
		CommandCar commandCar = new CommandCar();
		commandCar.setCommand(OrderBMW.getInstance());
		System.out.println(commandCar.buttonClicked());
		commandCar.setCommand(OrderMercedes.getInstance());
		System.out.println(commandCar.buttonClicked());
		commandCar.setCommand(OrderAudi.getInstance());
		System.out.println(commandCar.buttonClicked());
		
	}

}
