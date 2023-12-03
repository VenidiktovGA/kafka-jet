package ru.venidiktov.jet.common.messages.enums;

import lombok.RequiredArgsConstructor;

/**
 * Используется для идентификации сообщений в kafka
 */
@RequiredArgsConstructor
public enum MessageType {
    STATE("состояние самолета"),
    ROUTE("маршрут"),
    START("маршрут принят в обработку");

    private final String description;
}
