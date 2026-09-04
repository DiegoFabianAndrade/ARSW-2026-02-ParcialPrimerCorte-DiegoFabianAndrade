package edu.eci.arsw.math;
import static edu.eci.arsw.math.Main.bytesToHex;

public class CalcularThread extends Thread{
    @Override
    public void run(){
        System.out.println(bytesToHex(PiDigits.getDigits(0, 30)));
    }
}
