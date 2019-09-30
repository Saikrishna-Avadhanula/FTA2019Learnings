package org.sai.DesignPattern.Singleton.LazyInitialization;

public class LazyInitializationNetworkConnection {

    private static LazyInitializationNetworkConnection connection ;
    private boolean isConnected = false;

    private LazyInitializationNetworkConnection(){
    }

    public void connect(){
        if(!isConnected){
            System.out.println("connecting to network");
            isConnected=true;
        }
        else{
            System.out.println("Already connected");
        }
    }

    public void disconnect(){
        if(isConnected){
            System.out.println("disconnecting to network");
            isConnected=false;
        }
        else{
            System.out.println("Already disconnected");
        }

    }

    public static LazyInitializationNetworkConnection getConnection() {
        if(connection == null)
        connection = new LazyInitializationNetworkConnection();

        return connection;
    }
}
