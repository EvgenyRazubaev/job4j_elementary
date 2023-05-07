package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1to2to7Then7() {
        int first = 1;
        int second = 2;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3to1to10to2Then7() {
        int first = 3;
        int second = 1;
        int third = 10;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3to1to0to2Then7() {
        int first = 3;
        int second = 1;
        int third = 0;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}