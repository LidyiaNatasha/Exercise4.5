import java.util.*;
public class Lemon extends Apple {
	Scanner scan = new Scanner(System.in);
	private int choice;
	private String comment;
	private double kcal = 29.0;
	
	public Lemon(String name,int q,double price) {//subclass
		super(name, q, price);
		System.out.println("Lemon constructor is invoked");
		calcCalories(q,kcal);
		colour();
		
		}
	
	public void choice(){
		do {
		System.out.print("Enter taste choice (1.Sour , 2.Sweet):");
		this.choice = scan.nextInt();
		
		if(choice == 1) {
			this.comment = "Lemon taste is sour";break;
			}
		else if(choice == 2) {
			this.comment = "Lemon taste is sweet.";break;
			}
		else {
			System.out.println("Invalid input.");
		}
		
		}while(choice != 1||choice != 2);
	}
	
	public String getcomment() {
		return this.comment;
	}
	public void calculateCarbohydrate(int Carbohydrate,double fiber) {//overloading in same class(can also be in dif class)
		double total = Carbohydrate-fiber;
		System.out.println("Total Carbohydrate is "+ Carbohydrate + " Lemon :" + total + "fiber.");
	}
	public void calcCalories(int q,double kcal) {//overriding method-dif classes
		double total = q*kcal;
		System.out.println("Total calories of "+ q + " Lemon :" + total + "kcal.");
	}
	
	public String toString() { //overriding method-dif classes
		return "\nFruit name        :" + super.name +
			   "\n" + "Comment           :" + getcomment();
		
	}

}
