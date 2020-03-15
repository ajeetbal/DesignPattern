import java.util.Calendar;

public class ISPProxy implements ISP {

	@Override
	public String getResource(String site) {
		this.logRequest(site);
		if (this.isBlocked(site)) {
			return (site + "is blocked as per company policy");
		}
		NetworkSetting networkSetting = new NetworkSetting();
		return networkSetting.getISP().getResource(site);
	}

	private boolean isBlocked(String site) {
		switch (site) {
		case "www.google.com":
			return false;
		case "www.youtube.com":
			return true;
		default:
			return true;
		}
	}

	private void logRequest(String site) {
		System.out.println("Request for " + site + " at " + Calendar.getInstance().getTime());

	}

}
