package lt.vu.rest;

import lt.vu.services.Printer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/test")
public class TestController {

    @Inject
    private Printer printer;

    @GET
    public void test(){
        printer.print();
    }
}
