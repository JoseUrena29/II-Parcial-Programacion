//JOSE UREÑA AGUILAR

package Principal;

import static Principal.Componentes.tareas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class Reportes {
    String nombre_reporte;
    String fecha;
    String rutaimagen;
    public static ArrayList<Datos_Tareas> lista_tareas;
    
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
                imagen = Image.getInstance("src\\Imagenes\\LogoReporte.png");
                imagen.scaleAbsolute(140,70);
                imagen.setAbsolutePosition(415,750);
                
                
            } catch (Exception e) {
                
            }
            
            documento.add(imagen);
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("El nombre del reporte es: "+nombre_reporte));

            
            documento.add(Chunk.NEWLINE);
            
            Paragraph texto = new Paragraph("Estimado usuario usted cuenta con las siguientes tareas");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            
            documento.add(texto);
            
            PdfPTable tabla = new PdfPTable(3);
            tabla.setWidthPercentage(100);
            PdfPCell fecha = new PdfPCell(new Phrase("Fecha de Tarea"));
            fecha.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            PdfPCell nombre = new PdfPCell(new Phrase("Nombre de Tarea"));
            nombre.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            PdfPCell encargado = new PdfPCell(new Phrase("Encargado de Tarea"));
            encargado.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            
            tabla.addCell(fecha);
            tabla.addCell(nombre);
            tabla.addCell(encargado);
            
            for (Datos_Tareas tarea : tareas){
                tabla.addCell(tarea.getFecha_tarea());
                tabla.addCell(tarea.getNombre_tarea());
                tabla.addCell(tarea.getEncargado_tarea());
            }
            
            
            
            
            
            documento.add(Chunk.NEWLINE);
            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha "+this.fecha));
            
            documento.close();
            
            
        } catch (Exception e) {
            
            
            
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
