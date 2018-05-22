package lt.vu.services;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class PrinterDecorator implements Printer {
    @Inject @Delegate @Any Printer printer;

    @Override
    public void print() {
        System.out.println("decorated, wow");
        printer.print();
    }
}
