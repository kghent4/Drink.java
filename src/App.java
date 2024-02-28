class App{
    public static void main(String[] args) {
      
      Drink a = new Drink(16, "Cola");
      Drink b = new Drink(16, "Kombucha");
      Drink c = new Drink(12, "Kombucha");
  
      //When you implement the toString() method, this will print something different.
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
  
      //Call the compareTo() method here. Print the boolean that is returned.
    }
  }