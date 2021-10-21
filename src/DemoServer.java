import com.shephertz.app42.server.AppWarpServer;

public class DemoServer {
    public static void main(String[] args){
        String appconfigPath = System.getProperty("user.dir")+System.getProperty("file.separator")+"AppConfig.json";
        boolean started= AppWarpServer.start(new DemoServerAdapter(),appconfigPath);
        System.out.println("Server started "+started);
    }
}
