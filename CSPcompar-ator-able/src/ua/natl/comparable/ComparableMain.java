package ua.natl.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Oleksandr Bandurka
 */
public class ComparableMain {

    public static void main(String[] args) {

        Country gbCountry = new Country(1, "Great Britain");
        Country chinaCountry = new Country(4, "China");
        Country germanyCountry = new Country(5, "Germany");
        Country canadaCountry = new Country(3, "Canada");
        Country usaCountry = new Country(2, "USA");

        List<Country> listOfCountries = new ArrayList<Country>();
        listOfCountries.add(gbCountry);
        listOfCountries.add(chinaCountry);
        listOfCountries.add(germanyCountry);
        listOfCountries.add(canadaCountry);
        listOfCountries.add(usaCountry);

        System.out.println("\tBefore Sort: ");
        for (Country country : listOfCountries) {
            System.out.println("Country Id: " + country.getCountryId()
                    + "\t|| " + "Country name: " + country.getCountryName());
        }

        // Sorts accordingly to overrided method in entity-class
        Collections.sort(listOfCountries);

        System.out.println("\tAfter Sort: ");
        for (Country country : listOfCountries) {
            System.out.println("Country Id: " + country.getCountryId()
                    + "\t|| " + "Country name: " + country.getCountryName());
        }

    }

}
