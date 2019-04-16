package rocks.zipcode.io.fundamentals;

import rocks.zipcode.io.arrays.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            str += chars[i];
        }
        return str;
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        char[] unboxed = ArrayUtils.unbox(chars);
        return getString(unboxed);
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            char c = Character.toLowerCase(string.charAt(i));
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                str += string.charAt(i);
            }
        }
        return str;
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        String str = "";
        List<String> chars = new ArrayList<>(Arrays.asList(charactersToRemove.split("")));
        for (int i = 0; i < string.length(); i++) {
            String currentChar = string.charAt(i) + "";
            if (!chars.contains(currentChar)) {
                str += currentChar;
            }
        }
        return str;
    }
}
