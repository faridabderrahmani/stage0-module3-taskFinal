package lang.print.gaps.finalModuleTask;

public class NumberReverter {

    public  void revert(int number) {
            int reverseNum = 0;
            while(number != 0){
                reverseNum += number % 10;
                reverseNum *= 10;
                number /= 10;
            }
            reverseNum = reverseNum/10;
            System.out.println(reverseNum);
        }



}
