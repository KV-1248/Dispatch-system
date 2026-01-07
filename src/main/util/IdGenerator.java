package util;

import java.util.UUID;

public class IdGenerator {
    public static String generateTripId() {
        return "TRIP-" + UUID.randomUUID().toString().substring(0, 8);
    }
}