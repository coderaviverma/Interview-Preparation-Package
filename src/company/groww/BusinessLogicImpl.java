package company.groww;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BusinessLogicImpl implements BusinessLogic {


    @Override
    public Map<Integer, Currency> orderProduct(ProductEnum productEnum, Integer quantity, Integer amount) {

        Product product = Inventory.invetory.get(productEnum.name());
        if (product.getQuantity() > quantity) {
            int tempAmount = quantity * product.getPrice();
            if (tempAmount < amount) {

                int rem = amount - tempAmount;
                Map<Integer, Currency> remainingDominace = returnChange(rem);
                if (remainingDominace != null) {
                    product.setQuantity(product.getQuantity() - quantity);
                    Inventory.invetory.put(product.getName(), product);
                }

                return remainingDominace;
            } else {
                //throw exp
                throw new VendingMachineException("Amount is insufficient");

            }

        } else {
            //Throw
            throw new VendingMachineException("Quantity Not Available");
        }

    }

    @Override
    public Map<Integer, Currency> returnChange(Integer remainingAmount) {
        Map<Integer, Currency> result = new TreeMap<>();

        int tem = remainingAmount;
        while (tem > 0) {

            for (Map.Entry<Integer, Currency> entry : Inventory.changeInvetory.entrySet()) {
                Currency remaning=entry.getValue();
                int currTem = tem / remaning.getDominance();

                if (currTem<=remaning.getQuantity()){
                    result.put(entry.getKey(), new Currency(entry.getKey(), CurrencyEnum.RUPEE.name(), currTem));
                    tem=tem % entry.getKey();
                }else{
                    tem= tem - (remaning.getDominance()*remaning.getQuantity());
                    result.put(entry.getKey(), new Currency(entry.getKey(), CurrencyEnum.RUPEE.name(), remaning.getQuantity()));

                }

            }

            if (tem>0){
                //Throw
                throw new VendingMachineException("All return Not Possible");
            }
        }

        //update result
        for (Map.Entry<Integer, Currency> entry : result.entrySet()) {
            Currency currency = Inventory.changeInvetory.get(entry.getKey());
            currency.setQuantity(currency.getQuantity()-entry.getValue().getQuantity());
            Inventory.changeInvetory.put(entry.getKey(),currency);
        }

        return result;
    }

}
