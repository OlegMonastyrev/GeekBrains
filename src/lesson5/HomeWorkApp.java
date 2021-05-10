package lesson5;

public class HomeWorkApp {

    private static final int AGE=40;

    public static void main(String[] args) {
        Worker[] workArr=new Worker[4];
        workArr[0]=new Worker("Qwerty","Uiop","Mememaker","123@google.com",8800552,800,15);
        workArr[1]=new Worker("Alex","Jones","Engineer","123456@google.com",88004566,2000,35);
        workArr[2]=new Worker("John","Smith","Manager","123456789@google.com",88005112,1500,41);
        workArr[3]=new Worker("Stewart","Grace","Boss","987654321@google.com",88001234,5000,55);
        workArr[4]=new Worker("Thomas","Anderson","Cleaner","101010@google.com",88888888,10000,40);

        for (int i=0;i<workArr.length;i++) {
            if (Worker.getAge()>AGE) {
                Worker.getInfo();
            }
        }

    }
}
