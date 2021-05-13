import java.io.*;
import java.net.*;
public class Server {
    Server(){

        try{
            System.out.println("SERVER.....\n");
            ServerSocket s = new ServerSocket(98);
            System.out.println("Server waiting for the client");
            Socket cs = s.accept();
            InetAddress ia = cs.getInetAddress();
            String cli = ia.getHostAddress();
            System.out.println("Conntected to the client with IP " + cli);
            BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter out = new PrintWriter(cs.getOutputStream(), true);
            do{
            BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
             int r = Integer.parseInt(in.readLine());
            System.out.println("Radius:" + r);
        }while(true);
            in.close();
            out.close();
            cs.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
        public static void main(String[] args) throws Exception{
            new Server();
        }
}
    
