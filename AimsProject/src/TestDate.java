public class TestDate {
    public static void main(String[] args) {
        System.out.println(parseYear("thirty and nine"));
    }

    public static String parseYear(String year) {
        String[] firstTwoDigitsReading = {"ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty-one",
                "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven",
                "twenty-eight", "twenty-nine", "thirty"};
        String[] lastTwoDigitsReading = {"one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four",
                "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty", "hundred"};
        int countSpace = 0;
        for (int i = 0; i < year.trim().length(); i++) {
            if (year.charAt(i) == ' ') {
                countSpace++;
            }
        }
        if (countSpace == 1) {
            String[] yearPhraseOneSpace = year.trim().split(" ");
            String[] yearDigitOneSpace = new String[2];
            for (int i = 0; i < firstTwoDigitsReading.length; i++) {
                if (yearPhraseOneSpace[0].equalsIgnoreCase(firstTwoDigitsReading[i])) {
                    yearDigitOneSpace[0] = String.valueOf(i + 10);
                }
            }
            for (int i = 0; i < lastTwoDigitsReading.length - 1; i++) {
                if (yearPhraseOneSpace[1].equalsIgnoreCase(lastTwoDigitsReading[i])) {
                    yearDigitOneSpace[1] = String.valueOf(i + 1);
                }
            }
            if (yearPhraseOneSpace[1].equalsIgnoreCase(lastTwoDigitsReading[30])) {
                yearDigitOneSpace[1] = "00";
            }
            return yearDigitOneSpace[0] + yearDigitOneSpace[1];
        } else if (countSpace == 2) {
            String[] yearPhraseTwoSpace = year.trim().split(" ");
            String[] yearDigitTwoSpace = new String[2];
            for (int i = 0; i < firstTwoDigitsReading.length; i++) {
                if (yearPhraseTwoSpace[0].equalsIgnoreCase(firstTwoDigitsReading[i])) {
                    yearDigitTwoSpace[0] = String.valueOf(i + 10);
                }
            }
            for (int i = 0; i < 9; i++) {
                if (yearPhraseTwoSpace[2].equalsIgnoreCase(lastTwoDigitsReading[i])) {
                    yearDigitTwoSpace[1] = String.valueOf(i + 1);
                }
            }
            return yearDigitTwoSpace[0] + "0" + yearDigitTwoSpace[1];
        }
        return null;
    }
}
