public class Lamp {
    
    String numLamp;
    boolean IsOn;
    
    public void isOn(){
        if (IsOn){
            System.out.println("The lamp "+numLamp+" is switched on");    
        }
        else {
            System.out.println("The lamp "+numLamp+" is switched off");  
        }
    };
    public void SwitchOff(){
        if (IsOn) {
            IsOn = !IsOn;
        }
        else {
            System.out.println("The lamp is already switched off");
        }
    };
    public void SwitchOn(){
        if (!IsOn) {
            IsOn = !IsOn;
        }
        else {
            System.out.println("The lamp is already switched on");
        }
    };
    public static void main(String[] args) {
        Lamp L1 = new Lamp();
        Lamp L2 = new Lamp();
        
        L1.numLamp = "1";
        L1.IsOn = false;
        L1.isOn();
        L1.SwitchOn();
        L1.isOn();
        
        L2.numLamp = "2";
        L2.IsOn = true;
        L2.isOn();
        L2.SwitchOff();
        L2.isOn();

    };
}
