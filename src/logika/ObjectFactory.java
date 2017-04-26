
package logika;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the logika package. 
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

    private final static QName _DiscountCart_QNAME = new QName("http://logika/", "discountCart");
    private final static QName _DiscountCartResponse_QNAME = new QName("http://logika/", "discountCartResponse");
    private final static QName _GetCartValue_QNAME = new QName("http://logika/", "getCartValue");
    private final static QName _GetCartValueResponse_QNAME = new QName("http://logika/", "getCartValueResponse");
    private final static QName _GetMostExpensiveProduct_QNAME = new QName("http://logika/", "getMostExpensiveProduct");
    private final static QName _GetMostExpensiveProductResponse_QNAME = new QName("http://logika/", "getMostExpensiveProductResponse");
    private final static QName _NoCartException_QNAME = new QName("http://logika/", "NoCartException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: logika
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiscountCart }
     * 
     */
    public DiscountCart createDiscountCart() {
        return new DiscountCart();
    }

    /**
     * Create an instance of {@link DiscountCartResponse }
     * 
     */
    public DiscountCartResponse createDiscountCartResponse() {
        return new DiscountCartResponse();
    }

    /**
     * Create an instance of {@link GetCartValue }
     * 
     */
    public GetCartValue createGetCartValue() {
        return new GetCartValue();
    }

    /**
     * Create an instance of {@link GetCartValueResponse }
     * 
     */
    public GetCartValueResponse createGetCartValueResponse() {
        return new GetCartValueResponse();
    }

    /**
     * Create an instance of {@link GetMostExpensiveProduct }
     * 
     */
    public GetMostExpensiveProduct createGetMostExpensiveProduct() {
        return new GetMostExpensiveProduct();
    }

    /**
     * Create an instance of {@link GetMostExpensiveProductResponse }
     * 
     */
    public GetMostExpensiveProductResponse createGetMostExpensiveProductResponse() {
        return new GetMostExpensiveProductResponse();
    }

    /**
     * Create an instance of {@link NoCartException }
     * 
     */
    public NoCartException createNoCartException() {
        return new NoCartException();
    }

    /**
     * Create an instance of {@link Cart }
     * 
     */
    public Cart createCart() {
        return new Cart();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logika/", name = "discountCart")
    public JAXBElement<DiscountCart> createDiscountCart(DiscountCart value) {
        return new JAXBElement<DiscountCart>(_DiscountCart_QNAME, DiscountCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logika/", name = "discountCartResponse")
    public JAXBElement<DiscountCartResponse> createDiscountCartResponse(DiscountCartResponse value) {
        return new JAXBElement<DiscountCartResponse>(_DiscountCartResponse_QNAME, DiscountCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCartValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logika/", name = "getCartValue")
    public JAXBElement<GetCartValue> createGetCartValue(GetCartValue value) {
        return new JAXBElement<GetCartValue>(_GetCartValue_QNAME, GetCartValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCartValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logika/", name = "getCartValueResponse")
    public JAXBElement<GetCartValueResponse> createGetCartValueResponse(GetCartValueResponse value) {
        return new JAXBElement<GetCartValueResponse>(_GetCartValueResponse_QNAME, GetCartValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMostExpensiveProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logika/", name = "getMostExpensiveProduct")
    public JAXBElement<GetMostExpensiveProduct> createGetMostExpensiveProduct(GetMostExpensiveProduct value) {
        return new JAXBElement<GetMostExpensiveProduct>(_GetMostExpensiveProduct_QNAME, GetMostExpensiveProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMostExpensiveProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logika/", name = "getMostExpensiveProductResponse")
    public JAXBElement<GetMostExpensiveProductResponse> createGetMostExpensiveProductResponse(GetMostExpensiveProductResponse value) {
        return new JAXBElement<GetMostExpensiveProductResponse>(_GetMostExpensiveProductResponse_QNAME, GetMostExpensiveProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoCartException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logika/", name = "NoCartException")
    public JAXBElement<NoCartException> createNoCartException(NoCartException value) {
        return new JAXBElement<NoCartException>(_NoCartException_QNAME, NoCartException.class, null, value);
    }

}
