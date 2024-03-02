package main;

import java.util.regex.Pattern;

public class SimplePigLatin {

    public void PigLatin(String prm){
        StringBuilder result = new StringBuilder();
        String[] sarry = prm.split(" ");
        for (int i = 0; i < sarry.length; i++) {
            //If it matches any punctuation mark
            if (Pattern.matches("\\p{Punct}", sarry[i])) {
                result.append(sarry[i]);
                continue;
            }
            char tmp = sarry[i].charAt(0);
            sarry[i] = sarry[i].substring(1);
            sarry[i] = sarry[i] + tmp + "ay";
            result.append(sarry[i] + " ");
        }
        System.out.println(result.toString());
    }
}
