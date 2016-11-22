package uk.ac.gla.das4_auctionsystem.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by p on 22/11/16.
 */
public class AuctionServerImpl extends UnicastRemoteObject implements AuctionServer {
    protected AuctionServerImpl() throws RemoteException {
    }
}
