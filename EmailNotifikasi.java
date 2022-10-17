package notifikasi;

public class EmailNotifikasi implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim email ke " + receiver + " dengan isi:");
        System.out.println(content);
    }
    
}