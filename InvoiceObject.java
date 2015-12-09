
public class Invoice2 {
	private int invoiceNumber;
	private double balanceDue;
	private int month;
	private int day;
	private int year;
	
	public Invoice2(int num, double due, int mth, int dy, int yr){
		invoiceNumber = num;
		balanceDue = due;
		month = mth;
		day = dy;
		year = yr;
		
		if(invoiceNumber < 1000)
			invoiceNumber = 0;
		if(month < 1 || month > 12)
			month = 0;
		if(day < 1 || day > 31)
			day = 0;
		if(year < 2011 || year > 2017)
			year = 0;
	}
	public void displayInvoice(){
		System.out.println("Invoice\tBalance\tDate");
		System.out.println(invoiceNumber +"\t"+ balanceDue +"\t"+ 
							month +"/"+ day +"/"+ year);
		System.out.println();
	}
}
