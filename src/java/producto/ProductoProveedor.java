/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author panlo
 */
@WebService(serviceName = "ProductoProveedor")
public class ProductoProveedor {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProductos")
    public String getProductos(@WebParam(name = "proveedorID") int proveedorID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProducto")
    public String getProducto(@WebParam(name = "productoID") int productoID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProveedor")
    public String getProveedor(@WebParam(name = "proveedorID") int proveedorID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProveedores")
    public String getProveedores() {
        //TODO write your implementation code here:
        return null;
    }
}
