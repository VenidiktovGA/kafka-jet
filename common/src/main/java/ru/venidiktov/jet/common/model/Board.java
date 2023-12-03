package ru.venidiktov.jet.common.model;

import lombok.Data;

@Data
public class Board {
    private String name;
    private String location;
    private Route route;
    private boolean busy;
    private double speed;
    private double x;
    private double y;
    private double angle;

    private boolean isBusy() {
        return busy;
    }

    /**
     * Для вычисления длинны отрезка между двумя точками используется Кривая Безье
     * Метод вычисляет на какой длине отрезка находится самолет и под каким углом ему лететь
     *
     * @param routeDirection
     */
    private void calculatePosition(RoutePath routeDirection) {
        double t = routeDirection.getProgress() / 100;

        // Считаем пройденное расстояние (где на отрезке в данный момент самолет)
        double toX = (1 - t) * routeDirection.getFrom().getX() + t * routeDirection.getTo().getX();
        double toY = (1 - t) * routeDirection.getFrom().getY() + t * routeDirection.getTo().getY();

        // Выясняем угол поворота, ответ в радианах
        double deltaX = x - toX;
        double deltaY = y - toY;

        // Переводим угол поворота в градусы
        angle = Math.toDegrees(Math.atan2(deltaY, deltaX));
        if (angle < 0) {
            angle = 360 + angle;
        }
        x = toX;
        y = toY;
    }
}
