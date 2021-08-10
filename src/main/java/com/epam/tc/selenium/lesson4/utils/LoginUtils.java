package com.epam.tc.selenium.lesson4.utils;

import com.epam.tc.selenium.lesson4.entities.User;
import io.qameta.allure.Step;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LoginUtils {

    public static final User DEFAULT_USER = new User("Alice", "pRettyGoodPa$sword");
    public static final User EMPTY_USER = new User("", "");

    @Step
    public void typeLogin(@NonNull final String username) {
    }

    @Step
    public void typePassword(@NonNull final String password) {
    }

    @Step("text {user.name} : {user.password}")
    public void login(@NonNull final User user) {
        if (EMPTY_USER.equals(user)) {
            throw new IllegalArgumentException("Empty user :(");
        }
        typeLogin(user.getName());
        typePassword(user.getPassword());
    }
}
