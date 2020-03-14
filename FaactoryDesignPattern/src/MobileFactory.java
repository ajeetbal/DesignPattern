
public class MobileFactory {

	public static Mobile createMobile(String type) {
		if (type.equals(Mobile.IPHONE)) {
			return new Iphone("AS", 23, "ad");
		} else if (type.equals(Mobile.ANDROID)) {
			return new Android("sa", "dad");
		}
		else {
			return null;	
		}

	}

}
