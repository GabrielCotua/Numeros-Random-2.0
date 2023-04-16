import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Bienvenido a el creador de numeors random, tiens 4 oportunidades. ");
    System.out.println("\n inserta el valor mínimo de tu rango.");
    
    Scanner ans0 = new Scanner(System.in);
    int lower = ans0.nextInt();
    
    System.out.println("\n inserta el valor máximo de tu rango.");
    
    Scanner ans1 = new Scanner(System.in);
    int max = ans1.nextInt();
    int c = (max - lower) + 1;
    
    System.out.print("\n Tu numero random es: ");
    System.out.println((int) (Math.random() * c) + lower);
    System.out.println("Quieres otro? (s/n)");
    Scanner ans2 = new Scanner(System.in);
    String res = ans2.nextLine();
    while (!res.equals(" ")){
      
      if(res.equals("s") || res.equals("S")){
        System.out.println((int) (Math.random() * c) + lower);
        System.out.println("Quieres otro? (s/n)");0
        Scanner ans3 = new Scanner(System.in);    
        res = ans3.nextLine();
      }
      else {
        System.out.println("Adios!");
        res = " ";
      }
      
      
    }     
  }
}