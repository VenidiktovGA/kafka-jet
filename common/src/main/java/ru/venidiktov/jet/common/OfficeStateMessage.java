package ru.venidiktov.jet.common;

import lombok.Getter;
import lombok.Setter;
import ru.venidiktov.jet.common.messages.Message;
import ru.venidiktov.jet.common.messages.enums.MessageSource;
import ru.venidiktov.jet.common.messages.enums.MessageType;
import ru.venidiktov.jet.common.model.Route;

@Getter
@Setter
public class OfficeStateMessage extends Message {
    private Route route;

    public OfficeStateMessage() {
        source = MessageSource.OFFICE;
        type = MessageType.STATE;
    }

    public OfficeStateMessage(Route route) {
        this();
        this.route = route;
    }
}
