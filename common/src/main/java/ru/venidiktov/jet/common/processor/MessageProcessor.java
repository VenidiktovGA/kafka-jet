package ru.venidiktov.jet.common.processor;

import ru.venidiktov.jet.common.messages.Message;

public interface MessageProcessor<T extends Message> {

    void process(String jsonMessage);
}
