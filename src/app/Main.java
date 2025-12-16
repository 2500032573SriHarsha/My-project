package app;

import java.util.Scanner;

import converter.Converter;
import converter.LengthConverter;
import converter.MassConverter;
import exception.IncompatibleUnitException;
import util.DimensionChecker;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UNIT CONVERTER ===");
        System.out.println("Command format:");
        System.out.println("convert <value> <fromUnit> <toUnit>");
        System.out.print("Enter command: ");

        String command = sc.next();

        if (!command.equalsIgnoreCase("convert")) {
            System.out.println("❌ Invalid command");
            sc.close();
            return;
        }

        double value = sc.nextDouble();
        String fromUnit = sc.next();
        String toUnit = sc.next();

        try {
            Converter converter;

            if (DimensionChecker.isLength(fromUnit, toUnit)) {
                converter = new LengthConverter();
            } else if (DimensionChecker.isMass(fromUnit, toUnit)) {
                converter = new MassConverter();
            } else {
                throw new IncompatibleUnitException("❌ Dimension mismatch");
            }

            double result = converter.convert(value, fromUnit, toUnit);
            System.out.println("✅ Result: " + result + " " + toUnit);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}