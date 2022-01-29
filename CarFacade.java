
public class CarFacade {
	
	
	public String orderBMW()
    {
        OrderCar s = OrderBMW.getInstance();
        String bmw = (String)s.makeOrder();
        return bmw;
    }
	public String orderMercedes()
    {
        OrderCar obj = OrderMercedes.getInstance();
        String merc = (String)obj.makeOrder();
        return merc;
    }
	public String orderAudi()
    {
        OrderAudi obj = OrderAudi.getInstance();
        String audi = (String)obj.makeOrder();
        return audi;
    }

}
