package lang.print.gaps.finalModuleTask;

public class NumberReverter {

    public  void revert(int number) {
            int num = 457;
            int reverseNum = 0;
            while(num != 0){
                reverseNum += num % 10;
                reverseNum *= 10;
                num /= 10;
            }
            reverseNum = reverseNum/10;
            System.out.println(reverseNum);
        }



}
