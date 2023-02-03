package HelperFunctions;

import Database.Address;

public class HelperFunctions {


    public static String checkCity(String city) {
//        String m=" ";
//        for (String a : Address.getCityList()) {
//            if (city.equals(a))
//                m=a;
//        }
//        if (m.equals(" "))
//            throw new RuntimeException("We can not continue your process because, there is no shipping that location.");
//return m;


        if (Address.getCityList().contains(city))
            return city;
        else
            throw new RuntimeException("We can not continue your process because, there is no shipping that location.");
    }

    public static String generateShippingTrackingNumber(String fullname, String city, String zipcode) {
        String isimKodu;
        isimKodu = String.valueOf(fullname.charAt(0));
        for (int i = 0; i < fullname.length(); i++) {
            if (fullname.charAt(i) == ' ') {
                isimKodu = isimKodu.concat(String.valueOf(fullname.charAt(i + 1)));
            }
        }

        String city3HArf = city.substring(0, 3);


        return (city3HArf + zipcode + isimKodu).toUpperCase();
    }

    public static String checkZipCode(String zipCode) {
        if (zipCode.length() != 5) {
            throw new RuntimeException("Please enter valid Zip Code");
        } else return zipCode;


    }
}


