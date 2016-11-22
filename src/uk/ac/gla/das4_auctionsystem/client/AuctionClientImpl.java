package uk.ac.gla.das4_auctionsystem.client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by p on 22/11/16.
 */
public class AuctionClientImpl  extends UnicastRemoteObject implements AuctionClient {
    protected AuctionClientImpl() throws RemoteException {
    }
}
