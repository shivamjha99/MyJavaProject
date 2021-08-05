package Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.*;
public class PrintBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BillClass> bill = new ArrayList<>();
		bill.add(new BillClass("Samosa",5,10));
		bill.add(new BillClass("Dosa",6,2));
		bill.add(new BillClass("Jalebi",10,10));
		bill.add(new BillClass("Rosgulla",10,18));
		Collections.sort(bill);
		System.out.println("\n\n *********Welcome To ShivamDhaba********\n");
		System.out.println("  ItemName  "+"Price    "+"Qty  "+"LineTotal  ");
		for (BillClass transaction : bill) {
			transaction.printStatement();
		}
		System.out.println("                           .........");
		
		double s=bill.stream().map(e->e.getPrice()*e.getQty()).reduce(0.0, (sum, element) -> sum + element);
		System.out.println("                      Total= "+s);
		System.out.println("                           .........");
		System.out.println("                  BillTotal= "+s*1.05+"\n "
				+ "          (Inclusive of 5% tax)");
		System.out.println("\n\n **************Keep Coming*****************");
		
	}
}
 