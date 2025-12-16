package converter;

import util.UnitRepository;

public class MassConverter implements Converter {

    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        double fromFactor = UnitRepository.massUnits.get(fromUnit);
        double toFactor = UnitRepository.massUnits.get(toUnit);
        return value * (toFactor / fromFactor);
    }
}