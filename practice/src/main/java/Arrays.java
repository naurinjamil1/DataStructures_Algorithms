package main.java;

public class Arrays {

	String[] countries;
	
	void setCountries() {
		countries = new String[] {"USA", "INDIA", "UK", "DE"};
	}
	
	void getCountries() {
		System.out.println("Arrays:");
		for(String country : countries) {
			System.out.println(country);
		}
	}
	
	void modifyCountry(String country) {
		for(int i=0; i<countries.length; i++) {
			if(countries[i].equals(country)) {
				System.out.println(i);
				countries[i] = "DUMMY";
			}
		}
		getCountries();
	}
}
