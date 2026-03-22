package org.manoj.problem.array;

public class ReverseWordsinString {

    public static void main(String[] args) {
        String input = "  hello world  ";

        String reversedWord = reverseWords(input);

        IO.println(reversedWord);
    }

    public static String reverseWords(String s) {
        String[] splitWords = s.split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for (int end = splitWords.length - 1; end >= 0; end--) {

            reversedString.append(splitWords[end]).append(" ");

        }

        return reversedString.toString().strip();
    }
}

