public static boolean isvoweldelimiter(){
    word = word.toLowerCase();

        // Check if the first character is a vowel
        boolean isFirstVowel = word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i'|| word.charAt(0) == 'o' || word.charAt(0) == 'u';

        // Check that every alternate character starting from the second is a vowel
        for (int i = 2; i < word.length(); i += 2) {
            boolean isCurrentVowel = word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'|| word.charAt(i) == 'o' || word.charAt(i) == 'u';
            if (isCurrentVowel != isFirstVowel) {
                return false;
            }
        }

    return true;
}