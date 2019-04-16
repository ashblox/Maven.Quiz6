package rocks.zipcode.io.fundamentals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        List<String> strList = new ArrayList<>();
        String[] letters = string.split("");
        strList.add(letters[0].toLowerCase());
        strList.add(letters[0].toUpperCase());
        for (int i = 1; i < string.length(); i++) {
            List<String> strList2 = new ArrayList<>();
            for (String str : strList) {
                strList2.add(str + letters[i].toLowerCase());
                strList2.add(str + letters[i].toUpperCase());
                strList = strList2;
            }
        }
        return strList;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        List<Integer> integersAsList = new ArrayList<>(Arrays.asList(indices));
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            String letter = string.charAt(i) + "";
            if (integersAsList.contains(i)) {
                str += letter.toUpperCase();
            } else {
                str += letter;
            }
        }
        return str;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuilder stringBuilder = new StringBuilder(stringToBeManipulated);
        stringBuilder.insert(index, valueToBeInserted);
        return stringBuilder.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder stringBuilder = new StringBuilder(stringToBeManipulated);
        stringBuilder.setCharAt(index, replacementValue);
        return stringBuilder.toString();
    }
}