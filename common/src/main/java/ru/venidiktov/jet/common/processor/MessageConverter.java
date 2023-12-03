package ru.venidiktov.jet.common.processor;

import com.google.gson.Gson;
import ru.venidiktov.jet.common.messages.Message;

// TODO: 12/3/2023 Чет не очень мне нравится gson, и работа с данными как со строками + в кафку кидать json а не объект ну такое себе!!!!
// TODO: 12/3/2023 Улучшить
public class MessageConverter {
    private final Gson gson = new Gson();

    public String extractCode(String data) {
        return gson.fromJson(data, Message.class).getCode(); // TODO: 12/2/2023 Из за этого сделали Message не абстрактным классом
    }

    public <T extends Message> T extractMessage(String data, Class<T> clazz) {
        return gson.fromJson(data, clazz);
    }

    public String toJson(Object message) {
        return gson.toJson(message);
    }
}
