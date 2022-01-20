package com.itea.roman.lection8;

import java.util.ArrayList;
import java.util.List;

public class Department {

    List<Position> positions = new ArrayList<Position>(){{
        for (int i = 0; i <7 ; i++) {
            add(new Position("Position" + i, "ABC" + i));
        }
        for (int i = 3; i <10 ; i++) {
            add(new Position("Position" + i, "DEF" + i));
        }
        for (int i = 8; i <14 ; i++) {
            add(new Position("Position" + i, "GHI" + i));
        }
    }};

    public static class Position{
        String name;
        String positionID;
        boolean isHolding;
        StringBuilder history;

        public Position(String name, String positionID) {
            this.name = name;
            this.positionID = positionID;
            isHolding  = false;
            history = new StringBuilder();
        }
    }

    @Override
    public String toString() {
        StringBuilder positionLog = new StringBuilder();
        for (Position position : positions){
            positionLog.append(position.name);
            positionLog.append("\r\n");
            positionLog.append(position.history);
        }

        return positionLog.toString();
    }
}
