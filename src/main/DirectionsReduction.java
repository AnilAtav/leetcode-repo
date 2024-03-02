package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectionsReduction {

    public String[] dirReduc(String[] arr) {
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        boolean ischanged = false;
        if (list.size() == 1)
            return list.toArray(new String[0]);

        for (int i = 0; i < list.size() - 1; i++) {
            String tmp = list.get(i);
            String tmpp = list.get(i + 1);
            if (tmp.equals("NORTH") && tmpp.equals("SOUTH") ||
                    tmp.equals("SOUTH") && tmpp.equals("NORTH")) {
                list.remove(i);
                list.remove(i);
                ischanged = true;
                break;
            } else if (tmp.equals("EAST") && tmpp.equals("WEST") ||
                    tmp.equals("WEST") && tmpp.equals("EAST")) {
                list.remove(i);
                list.remove(i);
                ischanged = true;
                break;
            }
        }

        if (!ischanged)
            return list.toArray(new String[0]);

        return dirReduc(list.toArray(new String[0]));
    }
}
