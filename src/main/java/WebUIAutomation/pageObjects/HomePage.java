package WebUIAutomation.pageObjects;

import java.io.IOException;

public class HomePage extends BasePage{

	public HomePage() throws IOException {
		super();
	}

	public HomePage getHomePage() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		getDriver().get("http://www.nasdaq.com");
		Thread.sleep(3000);
		return new HomePage();
	}

	public void enterSymbol(String symbol) throws IOException {
		// TODO Auto-generated method stub
	
	}

	public void verifySymbolData() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
