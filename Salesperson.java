Java Programming <Joyce Farrell> 7th ed. Created/modified by <rex jepson>

public class Salesperson {
  private int idNumber;
  private double annualSales;
  private Salesperson[] associates = new Salesperson[1];
  
  public void setUdNumber(int num){
    idNumber = num;
  }
  public void setAnnualSales(double sales){
    annualSales = sales;
  }
  public int getIdNumber(){
    return idNumber;
  }
  public double getAnnualSales(){
    return  annualSales;
  }
}
