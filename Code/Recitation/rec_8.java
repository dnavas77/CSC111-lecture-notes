class rec_8 {

   public static void main(String[] args){
      //

      Car car1 = new Car();
      Car car2 = new Car();
      Car car3 = new Car();
      
      car1.method1();
      car1.method2();
      car1.method3();

      car2.method1();
      car2.method2();
      car2.method3();

      car3.method1();
      car3.method2();
      car3.method3();
   }

}


class Car {
   private int a, b, c, d;

   public Car () {}
   public Car (int a) {}

   public void method1(){}
   public void method2(){}
   public void method3(){}

}
