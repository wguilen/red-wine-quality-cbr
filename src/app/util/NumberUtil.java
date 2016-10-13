package app.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberUtil 
{

    public static double toDouble(double value, int scale)
    {
        return new BigDecimal(value).setScale(scale, RoundingMode.HALF_UP).doubleValue();
    }
    
}
