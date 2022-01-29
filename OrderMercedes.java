public class OrderMercedes implements OrderCar {
 
    @Override
    public String makeOrder()
    {
        return "Ordering a Mercedes Car.";
    }
    
    private static OrderMercedes obj;
    
    private OrderMercedes() {}
 
    public static synchronized OrderMercedes getInstance()
    {
        if (obj==null)
            obj = new OrderMercedes();
        return obj;
    }
}