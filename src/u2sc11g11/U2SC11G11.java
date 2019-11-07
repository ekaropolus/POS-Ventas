/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2sc11g11;

import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author edvaldes
 */
public class U2SC11G11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Factura> productos = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        String next = "S";

        //Valor inicial de número
        int numero = 1;
        //ciclo de obtención de los valores de los productos
        while (numero != 0) {
            System.out.println("\nIntroduzca el número de producto y la cantidad:");
            System.out.println("\n( presione 0 para salir )");
            numero = input.nextInt(); //numero del producto
            if (numero == 0) {
                break;
            }
            int cantidad = input.nextInt(); //cantidad del producto3

            double precio = 0; //precio del producto
            //control para llenar el precio del producto
            switch (Integer.toString(numero)) {
                case "1":
                    precio = 2.98;
                    break;
                case "2":
                    precio = 4.50;
                    break;
                case "3":
                    precio = 9.98;
                    break;
                case "4":
                    precio = 4.49;
                    break;
                case "5":
                    precio = 6.87;
                    break;
                default:
                    precio = 0.0;
                    break;
            }

            // Creamos Instancia de los productos
            productos.add(new Factura(Integer.toString(numero), "Producto " + Integer.toString(numero), cantidad, precio));
        }
        //ciclo de impresión de los productos
        productos.forEach(producto -> {
            System.out.print("item: " + producto.getnumeroPieza()
                    + " Descipcción: " + producto.getdescripcionPieza()
                    + " Cantidad: " + producto.getcantidad()
                    + " Precio: " + producto.getprecio()
                    + " Total: " + producto.obtenerMontoFactura()
                    + "\n");
        });

        //System.out.print( + "\n");
    }

}
