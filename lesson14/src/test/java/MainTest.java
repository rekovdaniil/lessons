import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class MainTest {
  @Test
  public void testTotalCalculation() {
    ShoppingCart cart = new ShoppingCart();
    cart.addBook("Head First Design Patterns", 35.89);
    cart.addBook("Head First Java", 27.33);

    assertEquals(35.89 + 27.33, cart.total, 0.01);
  } 

  @Test
  public void cartAPI() {
    ShoppingCart cart = new ShoppingCart();
    cart.addBook("Head First Design Patterns", 35.89);
    cart.addBook("Head First Java", 27.33);

    cart.pay(new PaymentStrategy() {
      public void pay(double total) {
        // nothing to see here
      }
    });
  }

  @Test 
  public void paymentWithPayPal_example() {
    ShoppingCart cart = new ShoppingCart();
      cart.addBook("Head First Design Patterns", 35.89);
      cart.addBook("Head First Java", 27.33);

      cart.pay(new PayPalPaymentStrategy("buyer@example.com", "12345"));
  }

  @Test 
  public void paymentWithCreditCard_example() {
    ShoppingCart cart = new ShoppingCart();
      cart.addBook("Head First Design Patterns", 35.89);
      cart.addBook("Head First Java", 27.33);

      cart.pay(new CreditCardPaymentStrategy("1234567890987654", "12/12", "000"));
  }
}

class ShoppingCart {
  double total;

  public void addBook(String title, double price) {
    total += price;
  }

  public void pay(PaymentStrategy paymentStrategy) {
    paymentStrategy.pay(total);
  }
}

interface PaymentStrategy {
  void pay(double total);
}

class PayPalPaymentStrategy implements PaymentStrategy {
  public PayPalPaymentStrategy(String username, String password) {

  }
  
  public void pay(double total) {
    // Paying using PayPal web-API
  }
}

class CreditCardPaymentStrategy implements PaymentStrategy {
  public CreditCardPaymentStrategy(String cardNum, String expiry, String cvv) {

  }

  public void pay(double total) {
    // Paying using VISA web-API
  }
}

