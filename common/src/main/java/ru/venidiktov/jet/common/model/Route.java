package ru.venidiktov.jet.common.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * Маршрут полета
 */
@Data
public class Route {
    private String boardName; // Имя самолета которому назначен маршрут
    private List<RoutePath> path = new ArrayList<>(); // Отрезки маршрута

    public boolean notAssigned() {
        return boardName == null;
    }
}
