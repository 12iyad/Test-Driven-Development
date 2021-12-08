public class TemperatureConverter {
    public static final double CELSIUS_MAX = 5500000000000d;
    public static double CELSIUS_MIN = -273.15;
    public static final double FAHRENHEIT_MIN = -459.67;
    public static final double FAHRENHEIT_MAX = 9900000000032d;
    public static final double KELVIN_MIN = 0;
    public static final double KELVIN_MAX = 5500000000273.15;


    //Check Fahrenheit value bounds
    public static boolean checkFBounds(double temp) {
        if(temp > FAHRENHEIT_MAX || temp < FAHRENHEIT_MIN){
            throw new IllegalArgumentException("Values should be between -459.67 and 9900000000032");
        }
        else{return false;}
    }
    //Check Celsius value bounds
    public static boolean checkCBounds(double temp) {
        if(temp > CELSIUS_MAX || temp < CELSIUS_MIN){
            throw new IllegalArgumentException("Values should be between -273.15 and 5500000000000");
        }
        else{return false;}
    }
    //Check Kelvin value bounds
    public static boolean checkKBounds(double temp) {
        if(temp > KELVIN_MAX || temp < KELVIN_MIN){
            throw new IllegalArgumentException("Values should be between 0 and 5500000000273.15");
        }
        else{return false;}
    }


    public double F2C(double temp) {
        checkFBounds(temp);
        return (temp - 32) / 1.8;
    }

    public double F2K(double temp) {
        checkFBounds(temp);
        return (temp + 459.67) / 1.8;
    }

    public double C2F(double temp) {
        checkCBounds(temp);
        return (temp*1.8)+32;
    }

    public double C2K(double temp) {
        checkCBounds(temp);
        return (temp+273.15);
    }

    public double K2F(double temp) {
        checkKBounds(temp);
        return (temp*1.8)-459.67;
    }

    public double K2C(double temp) {
        checkKBounds(temp);
        return temp-273.15;
    }
}
