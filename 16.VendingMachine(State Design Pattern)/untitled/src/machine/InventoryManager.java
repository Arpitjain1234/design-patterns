package machine;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    Map<Integer, Integer> productQuantityMap;
    // store the code and quantity of the product

    InventoryManager(){
        this.productQuantityMap = new HashMap<>();
    }

    public void addItemToVendingMachine(int productCode,int quantity){
        if(productQuantityMap.containsKey(productCode)){
            int updatedQuantity = productQuantityMap.get(productCode) + quantity;
            productQuantityMap.put(productCode, updatedQuantity);
        }
        else {
            productQuantityMap.put(productCode,quantity);
        }
    }
    public void dispatchChosenProduct(int productCode,int quantity){
        if(productQuantityMap.containsKey(productCode) && productQuantityMap.get(productCode)>=quantity){
            int updatedQuantity = productQuantityMap.get(productCode) - quantity;
            productQuantityMap.put(productCode, updatedQuantity);
        }
        else{
            System.out.println("Excessive quantity placed in order");
        }
    }



}
