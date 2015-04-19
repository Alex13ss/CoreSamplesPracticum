package ua.natl.exception;

import java.rmi.RemoteException;

import ua.natl.exceptiondemo.InsufficientFundsException;

public class ThrowsExc {

    public static void main(String[] args) {

    }

    public void deposit(double amount) throws RemoteException {
        // Method implementation
        throw new RemoteException();
    }

    public void withdraw(double amount) throws RemoteException,
            InsufficientFundsException {
        // Method implementation
    }

}
