package com.epam.tc.selenium.lesson1.tests.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import com.epam.tc.selenium.lesson1.Tags;
import com.epam.tc.selenium.lesson1.utils.TaxCalculationUnit;
import org.testng.annotations.Test;

public class FlatTaxCalculationUnitTest {

    public static final double COIN_DELTA = 0.01;

    @Test(groups = {Tags.BIG_AMOUNT, Tags.FLAT_TAX})
    public void flatTaxBigAmountTest() {
        double actual = TaxCalculationUnit.calculateIncomeTaxValue(10_000_000);
        double expected = 1_300_000;
        assertThat(actual)
            .isEqualTo(expected);
    }

    @Test(groups = {Tags.SMALL_AMOUNT, Tags.FLAT_TAX})
    public void flatTaxSmallAmountTest() {
        double actual = TaxCalculationUnit.calculateIncomeTaxValue(0.27);
        double expected = 0.04;
        // actual is equals to 0.0351, but currency precision in real life of legal entity is 1 cent
        assertThat(actual)
            .isCloseTo(expected, within(COIN_DELTA));
    }
}
