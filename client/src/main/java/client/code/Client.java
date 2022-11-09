package client.code;

public class Client {
    
    public static String ipAddress = "localhost";
    public static int port = 8080;
    
    /**
     * создание клиент-соединения с указанными адресом и номером порта
     * @param args
     */
    
    public static void main(String[] args){
    
        new ClientSomething(ipAddress, port);
        
    }
}
