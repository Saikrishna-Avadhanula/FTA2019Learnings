package org.sai.DesignPattern.Singleton.EagerInitialization;

public class EagerInitializationNetworkConnection {

    private static EagerInitializationNetworkConnection connection = new EagerInitializationNetworkConnection();
    private boolean isConnected = false;

    private EagerInitializationNetworkConnection(){
        }

    public void connect(){
        if(!isConnected){
            System.out.println("connecting to EagerInitializationNetworkConnection network");
            isConnected=true;
        }
        else{
            System.out.println("Already connected to EagerInitializationNetworkConnection");
        }
    }

    public void disconnect(){
        if(isConnected){
            System.out.println("disconnecting to EagerInitializationNetworkConnection network");
            isConnected=false;
        }
        else{
            System.out.println("Already disconnected from EagerInitializationNetworkConnection");
        }

    }

    public static EagerInitializationNetworkConnection getConnection() {

        return connection;
    }
}
