package demo.callback.client;

import org.apache.callback.CallbackPortType;


@javax.jws.WebService(serviceName = "CallbackService", 
                      portName = "CallbackPort",
                      endpointInterface = "org.apache.callback.CallbackPortType",
                      targetNamespace = "http://apache.org/callback")
                  
public class CallbackImpl implements CallbackPortType  {

    
    /**
     * serverSayHi
     * @param: return_message (String)
     * @return: String
     */
    public String serverSayHi(String message) {
        System.out.println("Callback object invoked");
        System.out.println("Message recieved: " + message);
        return new String("Hi " + message);
    }
    
}
