package ru.venidiktov.jet.common.messages;

import lombok.Getter;
import lombok.Setter;
import ru.venidiktov.jet.common.messages.enums.MessageSource;
import ru.venidiktov.jet.common.messages.enums.MessageType;
import ru.venidiktov.jet.common.model.Route;

@Getter
@Setter
public class OfficeRouteMessage extends Message {
    private Route route;

    public OfficeRouteMessage() {
        source = MessageSource.OFFICE;
        type = MessageType.ROUTE;
    }

    public OfficeRouteMessage(Route route) {
        this();
        this.route = route;
    }
}
