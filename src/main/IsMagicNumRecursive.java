package main;

public class IsMagicNumRecursive {

    public String isMagicNumRecursive(Integer i){
        String result = "false";
        char[] ca = String.valueOf(i).toCharArray();
        if ((ca[0] == '1' && ca[1] == '0') && String.valueOf(ca).toCharArray().length < 3)
            result = "true";

        int ismagic = 0;
        for (char s : ca) {
            ismagic += Integer.parseInt(String.valueOf(s));
        }
        char[] caFinal = String.valueOf(ismagic).toCharArray();

        if (caFinal.length > 1)
            result = isMagicNumRecursive(ismagic);
        return result;
    }
}
