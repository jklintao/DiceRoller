public class Random_Number {

    public int getRandNumber(int num){
        return (int) Math.round(Math.random() * (num - 1) + 1);
    }
}
