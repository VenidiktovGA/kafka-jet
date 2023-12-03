package ru.venidiktov.jet.common.messages;

import lombok.Getter;
import lombok.Setter;
import ru.venidiktov.jet.common.messages.enums.MessageSource;
import ru.venidiktov.jet.common.messages.enums.MessageType;
import ru.venidiktov.jet.common.model.AirPort;

@Getter
@Setter
public class AirPortStateMessage extends Message {
    private AirPort airPort;

    public AirPortStateMessage() {
        source = MessageSource.AIRPORT;
        type = MessageType.STATE;
    }

    public AirPortStateMessage(AirPort airPort) {
        this();
        this.airPort = airPort;
    }
}
