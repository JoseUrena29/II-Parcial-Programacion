//JOSE UREÑA AGUILAR

package Principal;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class Reportes {
    String nombre_reporte;
    String fecha;
    String rutaimagen;
    public static ArrayList<Datos_Tareas> lista_tareas,String;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Reportes(String nombre_reporte, String fecha, ArrayList<Datos_Tareas> lista_tareas,String rutaimagen) {
        this.nombre_reporte = nombre_reporte;
        this.fecha = fecha;
        this.lista_tareas = lista_tareas;
        this.rutaimagen = rutaimagen;
        
        documento = new Document();
        titulo = new Paragraph("Reporte de Tareas");        
    }
    
    public void CrearReporte(){
        try {
            archivo = new FileOutputStream(nombre_reporte+".pdf");
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();
            titulo.setAlignment(1);
            
            Image imagen = null;
            
            try {
                imagen = Image.getInstance("src\\Imagenes\\LogoReporte.JPG");
                imagen.scaleAbsolute(150,90);
                imagen.setAbsolutePosition(415,750);
                
                
            } catch (Exception e) {
                
            }
            
            documento.add(imagen);
            documento.add(titulo);
            
            documento.close();
            
            
        } catch (Exception e) {
            
            
            
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
