package ru.job4j.condition;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void whenDay1ThenMonday() {
        int day = 1;
        String expected = "Monday";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDay10ThenError() {
        int day = 10;
        String expected = "Error";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDay5ThenFriday() {
        int day = 5;
        String expected = "Friday";
        String result = SwitchWeek.nameOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

}