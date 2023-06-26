package pl.shonsu.strings;

class Main {
    public static void main(String[] args) {
        String s = "TesT";
        String s1 = "Ttse";

        System.out.println(Anagram.isAnagrams(s, s1));
        System.out.println(Anagram.isAnagramsCounting(s, s1));
    }
}
