package ru.venidiktov.jet.common.messages.enums;

import lombok.RequiredArgsConstructor;

/**
 * От кого сообщение
 */
@RequiredArgsConstructor
public enum MessageSource {
    BOARD("самолет"),
    OFFICE("офис"),
    AIRPORT("аэропорт");

    private final String description;
}
