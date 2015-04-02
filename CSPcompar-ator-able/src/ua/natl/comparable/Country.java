package ua.natl.comparable;

/**
 * @author Oleksandr Bandurka
 */
public class Country implements Comparable<Country> {

    private int countryId;
    private String countryName;

    public Country(int countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }

    @Override
    public int compareTo(Country country) {
        return (this.countryId < country.countryId) ? -1
                : (this.countryId > country.countryId) ? 1 : 0;
        /*
         * If this.cuntryId < country.countryId : then compare 
         * method will return -1 
         * If this.countryId > country.countryId : then compare 
         * method will return 1 
         * If this.countryId == country.countryId : then compare
         * method will return 0
         */
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
