public class rec_7 {
   public static void main (String[] args) {
      // RECITATION - MARCH 31, 2015

      Employee e1 = new Employee("Bob", 50.0);

      e1.addToBalance(4.0);
      e1.spendMoney(50.0);

      e1.displayBalance();

   } // end main
}
/////////////////////////////////////////

class Employee {
   private double balance;
   private double rate;
   private String name;

   public Employee (String name, Double balance, Double rate) {
      this.balance = balance;
      this.rate = rate;
      this.name = name;
   }

   public Employee (String name, Double rate) {
      this.balance = 0;
      this.rate = rate;
      this.name = name;
   }

   public void addToBalance (Double hours) {
      this.balance += (hours * this.rate);
   }

   public void spendMoney (Double money) {
      this.balance -= money;
   }

   public void displayBalance () {
      System.out.println(this.balance);
   }
} // end Employee class
