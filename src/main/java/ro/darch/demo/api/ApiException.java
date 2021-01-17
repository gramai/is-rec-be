package ro.darch.demo.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCustomCodegen", date = "2021-01-17T19:13:55.210+02:00")
public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
