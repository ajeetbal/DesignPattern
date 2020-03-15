
public class NetworkSetting {
	public ISP getInternet() {
		return new ISPProxy();
	}

	public ISP getISP() {
		return new Vodafone();
	}
}
