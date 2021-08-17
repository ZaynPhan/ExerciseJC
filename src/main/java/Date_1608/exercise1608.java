package Date_1608;

public class exercise1608 {
    public static String upperCaseString(String s) {
        char[] arr = s.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                result += arr[i] + "";
            }
        }
        return result;
    }

    public static String nonNumericCharacter(String s) {
        char[] arr = s.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isDigit(arr[i])) {
                result += arr[i] + "";
            }
        }
        return result;
    }

    public static int printTimes(String s, char c) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countVowel(String s7) {
        String s = s7.toLowerCase();
        int vowelCharacter = 0;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == 'u' || character == 'e' || character == 'o' ||
                    character == 'a' || character == 'i') {
                vowelCharacter++;
            }
        }
        return vowelCharacter;
    }

    public static int countConsonant(String s7) {
        String s = s7.toLowerCase();
        int consonantCharacter = 0;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character > 'a' && character <= 'z' && character != 'u' &&
                    character != 'e' && character != 'o' && character != 'i') {
                consonantCharacter++;
            }
        }
        return consonantCharacter;
    }
}
