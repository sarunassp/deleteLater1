package lt.vu.services;

import lt.vu.interceptors.LoggedInvocation;

import javax.enterprise.inject.Alternative;

@Alternative
@LoggedInvocation
public class PrinterB implements Printer{
    @Override
    public void print() {
        System.out.println("printer B");
    }
}
