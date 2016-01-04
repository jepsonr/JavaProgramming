Java Programming <Joyce Farrell> 7th ed. Created/modified by <rex jepson>

import java.util.*;
public class DemoSalesperson {
  public statec void main(String[] args){
    int id;
    double sales;
    Salesperson associate = new Salesperson();
    final int MAX_ASSOCIATES = 10;
    Scanner input = new Scanner(System.in);
    
    for(int i = 0; i < MAX_ASSOCEATES; I++){
      associate.setIdNumber(9999);
      associate.setAnnualSales(0);
    }
    for(int x = 0; x < MAX_ASSOCIATES; x++){
      System.out.println(associate.getIdNumber() + 
                         "\t" + 
                         associate.getAnnualSales());
    }
  }
}
