public class Temperature{
    
    int degrees;
    
    public void CelsiusToKelvin(){
        System.out.println(degrees+" degrees Celsius to Kelvin is: "+
        (degrees+273.15));
    }
    
    public void CelsiusToFahrenheit(){
        System.out.println(degrees+" degrees Celsius to Fahrenheit is: "+
        (degrees+32));
    }
    
    public void KelvinToCelsius(){
        System.out.println(degrees+" degrees Kelvin to Celsius is: "+
        (degrees-273.15));
    }
    
    public void KelvinToFahrenheit(){
        System.out.println(degrees+" degrees Kelvin to Fahrenheit is: "+
        (degrees-459.67));
    }
    
    public void FahrenheitToCelsius(){
        System.out.println(degrees+" degrees Fahrenheit to Celsius is: "+
        (degrees-17.78));
    }
    
    public void FahrenheitToKelvin(){
        System.out.println(degrees+" degrees Fahrenheit to Kelvin is: "+
        (degrees-255.372));
    }
    
    public static void main (String[] args){
        Temperature t1 = new Temperature();
        t1.degrees = 25;
        t1.CelsiusToKelvin();
        t1.CelsiusToFahrenheit();
        
        Temperature t2 = new Temperature();
        t2.degrees = 100;
        t2.FahrenheitToCelsius();
        t2.FahrenheitToKelvin();
        
        Temperature t3 = new Temperature();
        t3.degrees = 0;
        t3.KelvinToCelsius();
        t3.KelvinToFahrenheit();
    }
}
