package systemdesign.lld.vendingmachine;/*Patterns used:
* MVC, Proxy, Singleton
* */

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/*View
* This is the backend for vending machine panel. It provides listeners and action methods for fontend panel
* The fontend can be represented as something like html page, or a panel which emit or receive signals
* */
public class VendingMachine {
  private InventoryService inventoryService;
  private LoggingService loggingService;
  private PaymentService paymentService;
  private MechanicalService mechanicalService;

  private List<ItemLocation> locationsOfAvailableItems;
  private ItemLocation selectedItem;
  private BigDecimal amountOwning;
  
  public VendingMachine(InventoryService inventoryService, LoggingService loggingService, PaymentService paymentService, MechanicalService mechanicalService) {
    this.inventoryService = inventoryService;
    this.loggingService = loggingService;
    this.paymentService = paymentService;
    this.mechanicalService = mechanicalService;
  }

  /*This method is called when the vending machine is powered on*/
  private void initVendingMachine() {
    locationsOfAvailableItems = inventoryService.initializeItems();
    mechanicalService.displayAvailableItems(locationsOfAvailableItems);
    selectedItem = null;
    amountOwning = BigDecimal.ZERO;
  }

  private void productSelectedListener(ItemLocation itemLocation) {
    amountOwning = inventoryService.getSelectedItemPrice(itemLocation);
  }

  private void paymentMadeListener(Payment payment) {
    BigDecimal amountPaid = paymentService.makePayment(payment);
    amountOwning = amountOwning.subtract(amountPaid);
    if(amountOwning.compareTo(BigDecimal.ZERO) > 0) {
      processPurchase();
    }
  }
  
  private void processPurchase() {
    loggingService.logPurchase(selectedItem, LocalDateTime.now());
    returnChange(amountOwning);
    releaseProduct();
    resetSelectedProduct();
  }
  
  private void resetSelectedProduct() {
    selectedItem = null;
    amountOwning = BigDecimal.ZERO;
  }
  
  private void returnChange(BigDecimal changes) {
    mechanicalService.returnChanges(changes);
  }
  
  private void releaseProduct() {
    mechanicalService.releaseItem(selectedItem);
  }
}

/*Helper classes used by view*/
class ItemLocation {
  private int row;
  private int column;
}

/*Model Objects */
class Item {
  private String name;
  private BigDecimal price;
  
  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }
}

class Payment {
  private BigDecimal amount;
  private PaymentType paymentType;
}

class PaymentType {
  private String name;
}

/*Controllers
* To be implemented by proxy classes. All service classes are created as singleton
* */
interface InventoryService {
  List<ItemLocation> initializeItems();
  BigDecimal getSelectedItemPrice(ItemLocation itemLocation);
}

interface PaymentService {
  BigDecimal makePayment(Payment payment);
}

interface LoggingService {
  void logPurchase(ItemLocation itemLocation, LocalDateTime purchaseDateTime);
}

interface MechanicalService {
  /*interact with hardware*/
  Payment takePayment();
  void returnChanges(BigDecimal bigDecimal);
  void releaseItem(ItemLocation itemLocation);
  void displayAvailableItems(List<ItemLocation> itemLocations);
}