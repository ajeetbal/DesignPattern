
public class Vodafone implements ISP {

	@Override
	public String getResource(String site) {
		switch (site) {
		case "www.google.com":
			return "Goooogle";
		case "www.youtube.com":
			return "Yooooooooutube";
		default:
			return "Sorry no resource found";
		}
	}

}
