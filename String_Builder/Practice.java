package String_Builder;

public class Practice {
	
public static void main(String[] args) 
{
	// Base URL of the website being tested
	String baseUrl = "https://grotechminds.com/search";
	// Test data or parameters 
	String searchQuery ="laptop";
	 String sortBy = "price";
	String order = "ascending";
	// Use StringBuilder to construct the full URL 
	StringBuilder urlBuilder = new StringBuilder(baseUrl);
	urlBuilder.append("?query="); 
	urlBuilder.append(searchQuery);
	urlBuilder.append("&sort=");
	urlBuilder.append(sortBy);
	urlBuilder.append("&order=");
	urlBuilder.append(order);
	// Convert StringBuilder to String to be used in Selenium 
	String fullUrl = urlBuilder.toString();
	// Output the URL (in practice, this would be where you navigate to the URL using Selenium)
	System.out.println("Constructed URL: " + fullUrl);
	// Example Selenium usage (assuming WebDriver setup is done elsewhere)
	// WebDriver driver = new ChromeDriver();
	// driver.get(fullUrl);

	
}	

}
