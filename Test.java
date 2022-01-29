import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void FacadeTest() {
		
		CarFacade obj = new CarFacade();
		assertEquals("Ordering an Audi Car.", obj.orderAudi());
		assertEquals("Ordering a BMW Car.", obj.orderBMW());
		assertEquals("Ordering a Mercedes Car.", obj.orderMercedes());
		
		
	}
	
	@org.junit.jupiter.api.Test
	void commandTest() {
		CommandCar cw = new CommandCar();
		cw.setCommand(OrderAudi.getInstance());
		assertEquals("Ordering an Audi Car.", cw.buttonClicked());
		cw.setCommand(OrderBMW.getInstance());
		assertEquals("Ordering a BMW Car.", cw.buttonClicked());
		cw.setCommand(OrderMercedes.getInstance());
		assertEquals("Ordering a Mercedes Car.", cw.buttonClicked());
		
	}


}
