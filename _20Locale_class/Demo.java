package _20Locale_class;

import java.util.Locale;

public class Demo {
    public static void main(String[] args){

        Locale locale=Locale.getDefault();
        System.out.println("locale="+locale);

        System.out.println("DisplayCountry="+locale.getDisplayCountry());
        System.out.println("DisplayLanguage="+locale.getDisplayLanguage());
        System.out.println("DisplayName="+locale.getDisplayName());
        System.out.println("ISO3Country="+locale.getISO3Country());
        System.out.println("ISO3Language"+locale.getISO3Language());
        System.out.println("language="+locale.getLanguage());
        System.out.println("Country="+locale.getCountry());
        


    }
}
