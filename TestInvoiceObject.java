
public class TestInvoice2 {

	public static void main(String[] args) {
		Invoice2 number1 = new Invoice2(1111, 132.5, 11, 34, 2012);
		number1.displayInvoice();
		Invoice2 number2 = new Invoice2(999, 4493, 5, 14, 2013);
		number2.displayInvoice();
		Invoice2 number3 = new Invoice2(5443, 5.84, 13, 25, 2016);
		number3.displayInvoice();
		Invoice2 number4 = new Invoice2(5444543, 245.84, 4, 78, 2016);
		number4.displayInvoice();
		Invoice2 number5 = new Invoice2(5445, 245.84, 2, 22, 2018);
		number5.displayInvoice();
		Invoice2 number6 = new Invoice2(1000, -22.4, 7, 31, 2011);
		number6.displayInvoice();
	}

}
