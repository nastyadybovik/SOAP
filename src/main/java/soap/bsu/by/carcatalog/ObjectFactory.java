//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.20 at 02:29:47 PM MSK 
//


package soap.bsu.by.carcatalog;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.bsu.by.carcatalog package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.bsu.by.carcatalog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCarByCriteriaRequest }
     * 
     */
    public GetCarByCriteriaRequest createGetCarByCriteriaRequest() {
        return new GetCarByCriteriaRequest();
    }

    /**
     * Create an instance of {@link GetCarRequest }
     * 
     */
    public GetCarRequest createGetCarRequest() {
        return new GetCarRequest();
    }

    /**
     * Create an instance of {@link CreateCarRequest }
     * 
     */
    public CreateCarRequest createCreateCarRequest() {
        return new CreateCarRequest();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link GetCarResponse }
     * 
     */
    public GetCarResponse createGetCarResponse() {
        return new GetCarResponse();
    }

}