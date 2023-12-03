package ru.venidiktov.jet.common.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class AirPort {
    private String name;
    private List<String> boards = new ArrayList<>();
    private int x;
    private int y;

    private void addBoard(String boardName) {
        int existIndex = boards.indexOf(boardName);
        if (existIndex >= 0) {
            boards.set(existIndex, boardName);
        } else {
            boards.add(boardName);
        }
    }

    private void removeBoard(String boardName) {
        boards.remove(boardName);
    }
}
