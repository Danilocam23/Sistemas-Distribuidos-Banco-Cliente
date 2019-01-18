/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JerseyClient;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;
/**
 * Jersey REST client generated for REST resource:RestDebito [/Debito]<br>
 * USAGE:
 * <pre>
 *        BancoJerseyClient client = new BancoJerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author xcojcama
 */
public class BancoJerseyClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/Banco_Rest/resource";

    public BancoJerseyClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("Debito");
    }

    public String Debito(String cuenta, String dinero) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{cuenta, dinero}));        
        Invocation.Builder ib = resource.request(MediaType.APPLICATION_JSON);
        Response r = ib.get();
        return r.readEntity(String.class);
    }

    public void close() {
        client.close();
    }
    
}
