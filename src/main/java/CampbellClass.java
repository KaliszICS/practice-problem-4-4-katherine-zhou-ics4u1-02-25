public class CampbellClass{
    
    private CampbellClass(){

    }

    public static String convertString(int value){
        return Integer.toString(value);
    }
    public static String convertString(double value){
        return Double.toString(value);
    }
    public static String convertString(char value){
        return Character.toString(value);
    }
    public static String convertString(boolean value){
        return Boolean.toString(value);
    }

    public static int convertMetersToCenti(int metre){
        return metre*100;
    }
    public static double convertMetersToCenti(double metre){
        return metre*100.0;
}

    public static String removeNonAlpha(String word){
        word = word.replaceAll("[^a-zA-Z]", "");
        return word;
    }

    public static String removeNonAlpha(String word, boolean yes){
        word = word.replaceAll("[^a-zA-Z]", "");
        if (yes){
            return word.toUpperCase();
        }
        return word.toLowerCase();
    }
}