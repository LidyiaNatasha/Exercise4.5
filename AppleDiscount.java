
public class AppleDiscount implements getdiscount {
	
	public float rateofdiscount() {
		return 0.20f;
	}

}

class KiwiDiscount implements getdiscount{
	public float rateofdiscount() {
		return 0.15f;
		}
}

class LemonDiscount implements getdiscount{
	public float rateofdiscount() {
		return 0.10f;
	}

}
