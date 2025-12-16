package converter;

import util.UnitRepository;

public class LengthConverter implements Converter {

    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        double fromFactor = UnitRepository.lengthUnits.get(fromUnit);
        double toFactor = UnitRepository.lengthUnits.get(toUnit);
        return value * (toFactor / fromFactor);
    }
}