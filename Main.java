package notifikasi;

public class Main {

    public static void main(String[] args) {
        String emailPenerima = "mutiaraayuniruri@gmail.com";
        String nomerHp = "+628";
        String mobileId = "android-123456";

        EmailNotifikasi emailNotif = new EmailNotifikasi();
        SMSNotifikasi smsNotif = new SMSNotifikasi();
        PushNotifikasi pushNotif = new PushNotifikasi();

        String message = "Tutorial Polimorfisme sudah terbit di Petani Kode, cek sekarang di https://www.petanikode.com/java-oop-polimorfisme";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}