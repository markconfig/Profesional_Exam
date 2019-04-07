
import java.awt.Desktop;
import java.awt.print.PrinterJob;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Imprimir {
    public void Imprimir(String rutaDoc)
{
       PrinterJob job = PrinterJob.getPrinterJob();
       job.printDialog();
       String impresora=job.getPrintService().getName();
 
       //ESTE ES TU CÓDIGO
       java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
       java.io.File fichero = new java.io.File(rutaDoc);
       if (desktop.isSupported(Desktop.Action.PRINT)){
            try {
              try{
                 Process pr = Runtime.getRuntime().exec("Rundll32 printui.dll,PrintUIEntry /y /n \""+impresora+"\"");
                  }catch(Exception ex){
                    System.out.println("Ha ocurrido un error al ejecutar el comando. Error: "+ex);
                  }
            desktop.print(fichero);
           } catch (Exception e){
System.out.print("El sistema no permite imprimir usando la clase Desktop");
e.printStackTrace();
}
}else{
System.out.print("El sistema no permite imprimir usando la clase Desktop");
}
}
    
}
