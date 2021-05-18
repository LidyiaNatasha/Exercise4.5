import java.text.DecimalFormat;
public class Main {
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		Kiwi k = new Kiwi("Kiwi",120,6.00);
		System.out.println(k);//print using overriding method
		System.out.println();
		
		Lemon l = new Lemon("Lemon",110,3.50);
		System.out.println(l);//print using overriding method
		System.out.println();
		
		Apple a = new Apple("Apple",200,1.80);
		System.out.println(a);//print using overriding method
		System.out.println();
		
		
		RedApple pl = new RedApple("Gala" , 300 ,1.80 , "Red" ,"Royal Gala", "New Zaeland" , "August to July" , 133.0, 0.3);
		System.out.println(pl);//print using overriding method
		System.out.println();
		
		GreenApple gs = new GreenApple("Newtown Pippin Heirloom" , 300 ,240.00,  "Green" , "" ,  "US-NewYork" , "Late October" , 128.0, 1);
		System.out.println(gs);//print using overriding method
		System.out.println();
		
		
	
		
		}
		
}
