
public class RedApple extends Apple{
	private String retailname, placeOfOrigin ,seasons,colour;
	private double weight, protein;
	
	public RedApple(String name,int q,double p,String colour,String n,String po,String s,double weight, double protein) {
		super(name,q,p);
		this.weight = weight;
		this.protein = protein;
		this.retailname = n;
		this.placeOfOrigin = po;
		this.seasons = s;
		this.colour = colour;
	}
	
	public String retailname(){
		return retailname;
	}
	
	public String placeProduce(){
		return placeOfOrigin;
	}
	
	public String seasons(){
		return seasons;
	}
	
	public double weight(){
		return weight;
	}
	public double protein(){
		return protein;
	}
	
	public String toString() { //overriding method-dif classes
		return "\nApple name      :" + super.name +"\n" + "Colour          :" + this.colour + "\nRetail name     :" + this.retailname +
		       "\nPlace of Origin :" + this.placeOfOrigin +"\nSeasons Harvest :" + this.seasons + "\nAverage Weight  :" + this.weight + "g per apple" +
		       "\nProtein         :" + this.protein;
	}

}
