package ru.j4j.tracker;

import java.util.StringJoiner;

public enum MenuEnum {
    ADD_TICKET("Добавить новую заявку"),
    SHOW_ALL_TICKET("Показать все заявки"),
    CHANGE_TICKET("Изменить заявку"),
    REMOVE_TICKET("Удалить заявку"),
    FIND_ID_TICKET("Показать заявку по id"),
    FIND_NAME_TICKET("оказать заявки по имени"),
    EXIT("Завершить программу");

    private final String info;

    MenuEnum(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MenuEnum.class.getSimpleName() + "[", "]")
                .add("info='" + info + "'")
                .toString();
    }
}
