public class CampbellClass{
    
    private CampbellClass(){

    }

    public static String convertString(int value){
        return String.valueof(value);
    }
    public static String convertString(double value){
        return String.valueof(word);
    }
    public static String convertString(char value){
        return String.valueof(word);
    }
    public static String convertString(boolean value){
        return String.valueof(word);
    }

    public static int convertMetresToCenti(int metre){
        return metre*100;
    }
    public static double convertMetresToCenti(double metre){
        return metre*100;
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