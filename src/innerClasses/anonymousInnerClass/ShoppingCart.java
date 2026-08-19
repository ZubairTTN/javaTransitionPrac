package innerClasses.anonymousInnerClass;
/* What is an anonymous class?
An anonymous class is simply:
A class that has no name and is created at the same time as its object. */

public class ShoppingCart {
    private double totalAmount;

//    Constructor
    public ShoppingCart(double totalAmount)
    {
        this.totalAmount = totalAmount;
    }

    /* paymentMethod is a reference whose type is Payment; It does not mean that paymentMethod is necessarily an object directly created from Payment
    Remember:
    Payment paymentMethod; is just a reference declaration of Payment type. Just like: Animal animal; doesn't create an Animal object.

    Because Payment is an interface, paymentMethod can refer to an object whose class implements Payment
    eg. Dynamic Method Dispatch: Payment paymentMethod = new "Payment interface implemented class name"()
    For example, imagine:
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}
Then we could do:
Payment paymentMethod = new CreditCardPayment();
Our code doesn't create a CreditCardPayment class
Instead, you're using an anonymous inner class.*/
    public void processPayment(Payment paymentMethod)
    {
        paymentMethod.pay(totalAmount);
    }
}

class Main{
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(5000);
        /*
        new Payment() {
        @Override
        public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card ");
        }
       }

        At first glance, you might think:
        "Wait, isn't Payment an interface? How can we write new Payment()?"
        Normally: new Payment(); is illegal. You cannot directly instantiate an interface:
        Payment p = new Payment(); //
        But here code is different.
        we have:
        new Payment() {
        @Override
        public void pay(double amount) {
        ...
        }
    }
        This means:
        "Create an anonymous class that implements Payment, and create an object of that anonymous class." */
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid $" + amount + " using Credit Card ");
            }
        });

        Payment debitCard = new DebitCard();
        shoppingCart.processPayment(debitCard);
    }
}
