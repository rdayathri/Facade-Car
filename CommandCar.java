class CommandCar
{
	OrderCar command = null;
  
    public CommandCar()
    {
    }
  
    public void setCommand(OrderBMW bmw)
    {
        command = bmw;
    }
    public void setCommand(OrderMercedes merc)
    {
        command = merc;
    }
    public void setCommand(OrderAudi audi)
    {
        command = audi;
    }
  
    public String buttonClicked()
    {
        return command.makeOrder();
    }
}