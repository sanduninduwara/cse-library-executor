package it.uom.cse.util;

import java.util.Arrays;

public class StringUtil {

    public static double[] operandArray( String operands )
    {
        String strippedOperands = operands.strip();
        String sanitizedOperands = strippedOperands.replaceAll("\\s+", "");
        String[] operandStringArray = sanitizedOperands.split(",");
        return Arrays.stream(operandStringArray).mapToDouble(Double::parseDouble).toArray();
    }

}
