import java.math.BigInteger;
/**
 * 在这里给出对类 Main 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Main
{
    public static void main(String args[]){
        int ob = 50;
        int summe = 0;
        for (int i = 0; i <= ob; i++ ){
            summe = summe + i;
        }
        

        BigInteger mult = new BigInteger("1");
        for (int i = 1; i <= ob; i++){
            mult = mult.multiply(BigInteger.valueOf(i));

        
        System.out.println("Summe " + summe + "Mult :" + mult);
    }
}
}
   

