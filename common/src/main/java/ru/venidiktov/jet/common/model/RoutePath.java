package ru.venidiktov.jet.common.model;

import lombok.Data;

/**
 * Представляет из себя отрезок между двумя точками, отрезок может быть не обязательно всем маршрутом он может быть только частью маршрута
 */
@Data
public class RoutePath {
    private RoutePoint from;
    private RoutePoint to;
    private double progress; // Какая длинна отрезка пройдена в %

    public void addProgress(double speed) {
        progress += speed;
        if (progress > 100D) {
            progress = 100;
        }
    }

    public boolean inProgress() {
        return progress < 100D;
    }

    public boolean done() {
        return progress == 100D;
    }
}
