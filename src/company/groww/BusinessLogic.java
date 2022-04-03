package company.groww;

import java.util.Map;

public interface BusinessLogic {

    //orderProduct

    Map<Integer, Currency> orderProduct(ProductEnum productEnum,Integer quantity,Integer amount);

    Map<Integer,Currency> returnChange(Integer remainingAmount);
}
