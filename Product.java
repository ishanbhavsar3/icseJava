class Product 
{
    double price;
    int quantity;
    public static void main()
    {
        Product obj = new Product();
        obj.price = 12.50;
        obj.quantity = 12;
        System.out.println("Price of a mango: "+obj.price);
        System.out.println("Quantity of mangoes: " + obj.quantity);
        System.out.println("Cost of 12 mangoes = Rs."+(obj.price*obj.quantity));
       
    }
}
