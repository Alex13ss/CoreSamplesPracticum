package ua.natl.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ua.natl.entity.Country;

/**
 * @author Oleksandr Bandurka
 */
public class ComparatorMain {

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

        System.out.println("\tBefore Sort by id: ");
        for (Country country : listOfCountries) {
            System.out.println("Country Id: " + country.getCountryId()
                    + "\t|| " + "Country name: " + country.getCountryName());
        }

        // Sort by countryId
        Collections.sort(listOfCountries, new CountrySortByIdComparator());

        System.out.println("\tAfter Sort by id: ");
        for (Country country : listOfCountries) {
            System.out.println("Country Id: " + country.getCountryId()
                    + "\t|| " + "Country name: " + country.getCountryName());
        }

        // Sort by countryName
        Collections.sort(listOfCountries, new Comparator<Country>() {

            @Override
            public int compare(Country o1, Country o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }

        });

        System.out.println("\tAfter Sort by name: ");
        for (Country country : listOfCountries) {
            System.out.println("Country Id: " + country.getCountryId()
                    + "\t|| " + "Country name: " + country.getCountryName());
        }

    }

}
