/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import controladores.ProductosJpaController;
import controladores.ProveedoresJpaController;
import controladores.exceptions.RollbackFailureException;
import entidades.Productos;
import entidades.Proveedores;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author panlo
 */
@WebService(serviceName = "ProductoProveedor")
public class ProductoProveedor {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProveedores")
    public java.util.List getProveedores() {
        //TODO write your implementation code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemostracionSOAPPU");
        ProveedoresJpaController controladorP = new ProveedoresJpaController(emf);
        return controladorP.findProveedoresEntities();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProductos")
    public java.util.List getProductos() {
        //TODO write your implementation code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemostracionSOAPPU");
        ProductosJpaController controladorP = new ProductosJpaController(emf);
        return controladorP.findProductosEntities();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProducto")
    public Productos getProducto(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemostracionSOAPPU");
        ProductosJpaController controladorP = new ProductosJpaController(emf);
        return controladorP.findProductos(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProveedor")
    public Proveedores getProveedor(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemostracionSOAPPU");
        ProveedoresJpaController controladorP = new ProveedoresJpaController(emf);
        return controladorP.findProveedores(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarProducto")
    public Boolean insertarProducto(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemostracionSOAPPU");
        ProductosJpaController controladorP = new ProductosJpaController(emf);
        try {
            controladorP.create(new Productos(0, nombre));
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ProductoProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarProveedor")
    public Boolean insertarProveedor(@WebParam(name = "nit") String nit, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono, @WebParam(name = "productos_id") int productos_id) {
        //TODO write your implementation code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemostracionSOAPPU");
        ProveedoresJpaController controladorP = new ProveedoresJpaController(emf);
        try {
            controladorP.create(new Proveedores(0,nit,nombre,direccion,telefono,productos_id));
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ProductoProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
