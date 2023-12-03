package ru.venidiktov.jet.common.messages;

import lombok.Getter;
import lombok.Setter;
import ru.venidiktov.jet.common.messages.enums.MessageSource;
import ru.venidiktov.jet.common.messages.enums.MessageType;
import ru.venidiktov.jet.common.model.Board;

@Getter
@Setter
public class BoardStateMessage extends Message {
    private Board board;

    public BoardStateMessage() {
        source = MessageSource.BOARD;
        type = MessageType.STATE;
    }

    public BoardStateMessage(Board board) {
        this();
        this.board = board;
    }
}
