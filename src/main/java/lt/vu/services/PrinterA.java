package lt.vu.services;

import lt.vu.interceptors.LoggedInvocation;

import javax.enterprise.inject.Alternative;

@Alternative
@LoggedInvocation
public class PrinterA implements Printer{
    @Override
    public void print() {
        System.out.println("printer A");
    }

    public void test(){}
}
