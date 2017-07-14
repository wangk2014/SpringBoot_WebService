
package cn.wk.webservice.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.wk.webservice.model package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and cn.wk.webservice.model
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.wk.webservice.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateSuspectIrisRequest }
     * 
     */
    public CreateSuspectIrisRequest createCreateSuspectIrisRequest() {
        return new CreateSuspectIrisRequest();
    }

    /**
     * Create an instance of {@link CreateMatchedInfoRequest }
     * 
     */
    public CreateMatchedInfoRequest createCreateMatchedInfoRequest() {
        return new CreateMatchedInfoRequest();
    }

    /**
     * Create an instance of {@link CreateMatchedInfoResponse }
     * 
     */
    public CreateMatchedInfoResponse createCreateMatchedInfoResponse() {
        return new CreateMatchedInfoResponse();
    }

    /**
     * Create an instance of {@link CreateSuspectIrisResponse }
     * 
     */
    public CreateSuspectIrisResponse createCreateSuspectIrisResponse() {
        return new CreateSuspectIrisResponse();
    }

}
