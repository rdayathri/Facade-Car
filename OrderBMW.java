public class OrderBMW implements OrderCar {
 
    @Override
    public String makeOrder()
    {
        return "Ordering a BMW Car.";
    }
    
private static OrderBMW obj;
    
    private OrderBMW() {}
 
    public static synchronized OrderBMW getInstance()
    {
        if (obj==null)
            obj = new OrderBMW();
        return obj;
    }
}