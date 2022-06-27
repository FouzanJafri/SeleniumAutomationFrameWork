package dataProvider;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name = "data")
	public Object[][] dp() {
		return new Object[][] { { "Watches" }, { "Caps" }, { "Kurti" }, { "Saree" } };
	}
}
