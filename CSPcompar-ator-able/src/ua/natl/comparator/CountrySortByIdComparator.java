package ua.natl.comparator;

import java.util.Comparator;
import ua.natl.entity.Country;

/**
 * @author Oleksandr Bandurka
 */
public class CountrySortByIdComparator implements Comparator<Country> {

    @Override
    public int compare(Country country1, Country country2) {
        return (country1.getCountryId() < country2.getCountryId()) ? -1
                : (country1.getCountryId() > country2.getCountryId()) ? 1 : 0;
        /*
         * If country1.getCountryId() < country2.getCountryId() : then compare
         * method will return -1 
         * If country1.getCountryId() > country2.getCountryId() : then compare 
         * method will return 1 
         * If country1.getCountryId() == country2.getCountryId() : then compare
         * method will return 0
         */
    }

}
