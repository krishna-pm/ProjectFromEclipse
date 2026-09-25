package threadpack;

class OTPService {

    static int otp = 100000;

    synchronized static void generateOTP(String user) {

        otp++;
        System.out.println(user + " OTP : " + otp);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class User extends Thread {

    String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        OTPService.generateOTP(userName);
    }
}

public class OTPGeneration {

    public static void main(String[] args) {

        User user1 = new User("User 1");
        User user2 = new User("User 2");
        User user3 = new User("User 3");

        user1.start();
        user2.start();
        user3.start();
    }
}