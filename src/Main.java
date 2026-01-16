import model.*;
import service.MenuService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuService service = new MenuService();
        try {
            MenuItem pizza = new FoodItem(0, "Pizza", 2500);
            service.addMenuItem(pizza);

            List<MenuItem> menu = service.getAllItems();
            for (MenuItem item : menu) {
                System.out.println(item.getBaseDetails() + " Tax: " + item.calculateTax());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}