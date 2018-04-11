package com.darren.test.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        int port = 1098;
        String url = "rmi://localhost:1098/com.darren.test.rmi.HelloServiceImpl";
        LocateRegistry.createRegistry(port);
        Naming.rebind(url, new HelloServiceImpl());
    }
    
}
