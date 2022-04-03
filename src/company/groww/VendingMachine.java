package company.groww;


/*
VENDING MACHINE

Products - Dairy Milk , Lays , Pepsi
Price - 10 , 20 , 50
Denomination allowed - 10 , 20, 50, 100


i) Display the product with Prices and quantities available

ii) Ask the user to select product with quantities
    Do a transaction if everything is valid

iii) Return change in the given denomination allowed
*/

//Product
//Currency
//BL
//Inventory



public class VendingMachine {


    public static void main(String[] args) {

        Inventory.fillAll();
//        BusinessLogicImpl l=new BusinessLogicImpl();
//        System.out.println(l.returnChange(531));
//        System.out.println(Inventory.changeInvetory);
        BusinessLogic businessLogic=new BusinessLogicImpl();
//        System.out.println(businessLogic.orderProduct(ProductEnum.DAIRY_MILK,2,50));
        System.out.println(businessLogic.orderProduct(ProductEnum.PEPSI,1,102));


    }


}
