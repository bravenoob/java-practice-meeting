package com.businessdecision.practicemeeting;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

    public static List<String> toListOldSchool(Stream<String> stream) {
        return stream
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> toListNew(Stream<String> stream) {
        return stream
                .map(String::toUpperCase)
                .toList();
    }

}
