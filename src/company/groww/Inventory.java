package company.groww;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Inventory {

    static Map<String, Product> invetory = new HashMap<>();
    static Map<Integer, Currency> changeInvetory = new TreeMap<>(Comparator.reverseOrder());

    private static void fillInvetory() {

        invetory.put(ProductEnum.DAIRY_MILK.name(), new Product(ProductEnum.DAIRY_MILK.name(), 10, 10));
        invetory.put(ProductEnum.LAYS.name(), new Product(ProductEnum.LAYS.name(), 20, 25));
        invetory.put(ProductEnum.PEPSI.name(), new Product(ProductEnum.PEPSI.name(), 50, 15));

    }

    private static void fillCurrencyInvetory() {

        changeInvetory.put(10, new Currency(10, CurrencyEnum.RUPEE.name(), 100));
        changeInvetory.put(20, new Currency(20, CurrencyEnum.RUPEE.name(), 50));
        changeInvetory.put(50, new Currency(50, CurrencyEnum.RUPEE.name(), 50));
        changeInvetory.put(100, new Currency(100, CurrencyEnum.RUPEE.name(), 3));


    }

    public static void fillAll() {
        fillInvetory();
        fillCurrencyInvetory();
    }

}
