package com.javapractice.misc;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamsTest {
    @Test
    void canFlatmap() {
        var list = List.of(List.of("hello", "you"), List.of("happy", "person"));
        var result = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        assertThat(result).hasSize(4);
    }

    @Test
    void canReduce() {
        var result = IntStream.range(0, 5).reduce(0, Integer::sum);
        assertThat(result).isEqualTo(10);
    }
}
