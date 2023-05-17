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
        for (int i = 0; i <= 10; i++ ){
            summe = summe + i;
        }
        
        int mult =1;
        for (int i = 1; i <= 10; i++){
            mult *= i;
        }
        
        System.out.println("Summe " + summe + "Mult :" + mult);
    }
   
}
