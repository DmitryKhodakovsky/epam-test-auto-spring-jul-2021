package com.epam.tc.selenium.lesson4.tests;

import static io.qameta.allure.Allure.step;

import com.epam.tc.selenium.lesson4.storynames.EpicsTags;
import com.epam.tc.selenium.lesson4.storynames.FeaturesTags;
import com.epam.tc.selenium.lesson4.storynames.StoriesTags;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Epic(EpicsTags.FIRST_BIG_EPIC)
public class BehaviourMapping {
    @Test
    @Feature(FeaturesTags.LOGIN)
    @Stories({
        @Story(StoriesTags.DEFAULT_LOGIN),
        @Story(StoriesTags.LOGOUT)
    })
    @Owner("Bob Ivanovich")
    public void testAlpha() {
        step("step");
    }

    @Test
    @Feature(FeaturesTags.GET_QUESTION_LIST)
    @Story(StoriesTags.DEFAULT_LOGIN)
    @Severity(SeverityLevel.BLOCKER)
    public void testBravo() {
        step("other step");
    }
}
