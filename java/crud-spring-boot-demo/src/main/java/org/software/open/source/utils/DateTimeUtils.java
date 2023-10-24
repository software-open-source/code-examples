package org.software.open.source.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import org.software.open.source.utils.constants.Constants;

public class DateTimeUtils {

    private DateTimeUtils() {
    }

    public static LocalDateTime now() {
        return LocalDateTime.now(ZoneOffset.UTC);
    }

    public static String now(String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(LocalDateTime.now(ZoneOffset.UTC));
    }

    public static LocalDateTime parse(String dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateTime, formatter).atZone(ZoneId.of(Constants.UTC_TIME_ZONE)).toLocalDateTime();
    }

}
