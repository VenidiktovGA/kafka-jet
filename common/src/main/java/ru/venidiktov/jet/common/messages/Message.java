package ru.venidiktov.jet.common.messages;

import lombok.NoArgsConstructor;
import ru.venidiktov.jet.common.messages.enums.MessageSource;
import ru.venidiktov.jet.common.messages.enums.MessageType;

@NoArgsConstructor
public class Message {
    public MessageType type;
    public MessageSource source;

    /**
     * Метод помогает на лету понять какой вид обработчика использовать для сообщения
     *
     * @return
     */
    public String getCode() {
        return source.name() + type.name();
    }

}
