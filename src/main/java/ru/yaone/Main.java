package ru.yaone;

import ru.yaone.app.CarShopApp;

/**
 * Главный класс приложения CarShop.
 * <p>
 * Этот класс содержит точку входа в приложение. Метод {@code main} инициализирует
 * и запускает приложение CarShop.
 * </p>
 */
public class Main {

    /**
     * Точка входа в приложение CarShop.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        new CarShopApp().run();
    }
}