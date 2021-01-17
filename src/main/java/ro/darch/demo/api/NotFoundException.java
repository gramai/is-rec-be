package ro.darch.demo.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCustomCodegen", date = "2021-01-17T19:13:55.210+02:00")
public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
