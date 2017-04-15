package game.com.perfomance;

import java.util.ArrayList;

/**
 * Created by Kuznetsov on 16.04.2017.
 */
public class DotCom {


    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

    private String name;

    public void setName(String string) {
        name = string;
    }
}

