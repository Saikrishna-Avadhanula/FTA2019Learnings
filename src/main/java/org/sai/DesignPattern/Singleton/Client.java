package org.sai.DesignPattern.Singleton;

import org.sai.DesignPattern.Singleton.EagerInitialization.EagerInitializationNetworkConnection;
import org.sai.DesignPattern.Singleton.LazyInitialization.LazyInitializationNetworkConnection;

public class Client {

    public static void main(String[] args){

        EagerInitializationNetworkConnection eagerInitializationNetworkConnection = EagerInitializationNetworkConnection.getConnection();
        eagerInitializationNetworkConnection.connect();
        System.out.println(eagerInitializationNetworkConnection.getConnection());

        EagerInitializationNetworkConnection connection01 = EagerInitializationNetworkConnection.getConnection();
        connection01.connect();
        System.out.println(connection01.getConnection());
        connection01.disconnect();

        LazyInitializationNetworkConnection lazyInitializationNetworkConnection = LazyInitializationNetworkConnection.getConnection();
        lazyInitializationNetworkConnection.connect();

        LazyInitializationNetworkConnection lazyInitializationNetworkConnection01 = LazyInitializationNetworkConnection.getConnection();
        lazyInitializationNetworkConnection01.connect();




    }
}
