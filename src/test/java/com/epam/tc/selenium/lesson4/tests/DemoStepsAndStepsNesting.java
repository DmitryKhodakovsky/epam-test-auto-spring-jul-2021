package com.epam.tc.selenium.lesson4.tests;

import com.epam.tc.selenium.lesson4.storynames.EpicsTags;
import com.epam.tc.selenium.lesson4.storynames.FeaturesTags;
import com.epam.tc.selenium.lesson4.storynames.StoriesTags;
import com.epam.tc.selenium.lesson4.utils.AttachmentUtils;
import com.epam.tc.selenium.lesson4.utils.LoginUtils;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoStepsAndStepsNesting {

    public static final String CAT_URL =
        "https://upload.wikimedia.org/wikipedia/commons/b/b6/Felis_catus-cat_on_snow.jpg";

    @BeforeClass
    public void beforeClass(ITestContext context) {
        WebDriver driver = null;  //some driver initialization
        context.setAttribute("driver", driver);
    }

    @Test
    public void testLoginWIthDefault() {
        LoginUtils.login(LoginUtils.DEFAULT_USER);
        Assertions.assertThat(true).isTrue();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEmptyUser() {
        LoginUtils.login(LoginUtils.EMPTY_USER);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNullUserExceptionExpected() {
        LoginUtils.login(null);
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    @Epic(EpicsTags.IMPORTANT_TAG)
    @Feature(FeaturesTags.LOGIN)
    @Story(StoriesTags.GREGORY)
    public void testFail() {
        Assertions.fail("manually failed");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void testForAttachmentsDemo() {
        attachCatPictures();

        List<String> input = List.of("a", "aA", "aA9");
        AttachmentUtils.makeStringAttachment(input);

        Assertions.assertThat(true)
                  .isTrue();
    }

    @SneakyThrows
    private void attachCatPictures() {
        try (InputStream is = new URL(CAT_URL).openStream()) {
            AttachmentUtils.attachFromInputStream("Everybody loves cat", is);
        }
    }
}
