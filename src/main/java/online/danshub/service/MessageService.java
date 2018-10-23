package online.danshub.service;

import online.danshub.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    public List<Message> getAllMessages() {
        Message m1 = new Message(1L, "CheeseBoard", "Dan");
        Message m2 = new Message(2L, "87 Fifty Three", "Jersey");

        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);

        return list;
    }
}
