import java.util.*;
public class Kiwi extends Apple {
	Scanner scan = new Scanner(System.in);
    private String comment;
	private int option;
	private double kcal = 49.0;
	//private double fat = 0.5;
	public Kiwi(String name,int q,double price) {//subclass
		super(name, q, price);
		hasSeed();
		calcCalories(q,kcal);
		 
	}
	
	public void hasSeed() {
		do {
			System.out.print("Enter option (1. Yes , 2. No):");
			this.option = scan.nextInt();
			
			if(option==1) {
				this.comment = "That's good for your heatlh rich of nutritional ";break;
				}
			else if(option==2) {
				this.comment = ".";break;
				}
			else { 
				System.out.println("Invalid input.");
			}
			
			}while(option != 1||option != 2);
		}
	
	public String getcomment() {
		return this.comment;
	}
	
	public void Appletype(int Carbohydrate,double fiber) {//overloading in same class(can also be in dif class)
		double total = Carbohydrate-fiber;
		System.out.println("Total Carbohydrate is "+ Carbohydrate + " kiwi :" + total + "fiber.");
	}
	
	public void calcCalories(int q,double kcal) {//overriding method-dif classes
		double total = q*kcal;
		System.out.println("Total calories of "+ q + " kiwi :" + total + "kcal.");
	}
	
	public String toString() { //overriding method-dif classes
		return "Fruit name        :" + super.name +
			   "\n" + "Colour            :Colour of kiwi is green  " +
			   "\nComment           :" + this.comment;
		
	} 

}
