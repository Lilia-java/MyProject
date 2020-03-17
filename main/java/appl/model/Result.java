package appl.model;
import appl.model.Client;

public class Result {
    String str;

    public Result(String str) {

        this.str = str;
    }

    public Result() {
    }

    public String outputResult() {
        Client client = new Client();
        return client.toString();
    }
}

