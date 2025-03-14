package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IMail<T>> {

    private final Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, Collections.emptyList());
        }
    };

    public void accept(IMail<T> mail){
        mailBox.computeIfAbsent(mail.getTo(), key -> new ArrayList<>())
                .add(mail.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}