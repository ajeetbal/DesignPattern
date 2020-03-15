import javax.swing.JOptionPane;

public class Browser {
	public void sendRequest() {
		String site = JOptionPane.showInputDialog("Enter the site Url");
		String response = this.getInternetProvider().getResource(site);
		this.loadResponse(response);

	}

	private void loadResponse(String response) {
		System.out.println(response);
	}

	private ISP getInternetProvider() {
		return new NetworkSetting().getInternet();
	}

}
