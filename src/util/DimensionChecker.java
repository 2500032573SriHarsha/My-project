package util;

public class DimensionChecker {

    public static boolean isLength(String from, String to) {
        return UnitRepository.lengthUnits.containsKey(from)
                && UnitRepository.lengthUnits.containsKey(to);
    }

    public static boolean isMass(String from, String to) {
        return UnitRepository.massUnits.containsKey(from)
                && UnitRepository.massUnits.containsKey(to);
    }
}