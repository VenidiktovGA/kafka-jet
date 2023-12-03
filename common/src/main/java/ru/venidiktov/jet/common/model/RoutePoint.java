package ru.venidiktov.jet.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Представляет из себя точку (начальную или конечную) отрезка по которой летит самолет (самолет)
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoutePoint {
    private String name;
    private double x;
    private double y;
}
