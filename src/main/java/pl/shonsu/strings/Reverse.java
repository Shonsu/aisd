package pl.shonsu.strings;

class Reverse {

    public static String FirstReverse(String str) {
        StringBuilder sb = new StringBuilder();
        return replace(str, sb).toString();
    }

    public static StringBuilder replace(String str, StringBuilder sb) {
        int strLength = str.length() - 1;
        if (strLength < 1) return sb.append(str.charAt(0));
        sb.append(str.charAt(strLength));
        return replace(str.substring(0, strLength), sb);
    }
}
