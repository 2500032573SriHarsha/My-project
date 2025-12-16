package util;

import java.util.HashMap;
import java.util.Map;

public class UnitRepository {

    public static Map<String, Double> lengthUnits = new HashMap<>();
    public static Map<String, Double> massUnits = new HashMap<>();

    static {
        // Length
        lengthUnits.put("cm", 1.0);
        lengthUnits.put("m", 0.01);
        lengthUnits.put("km", 1000.0);

        // Mass
        massUnits.put("g", 1.0);
        massUnits.put("kg", 0.001);
        massUnits.put("ton", 1000.0);
    }
}