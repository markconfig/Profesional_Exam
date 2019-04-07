
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class generarPDF {

    private Font fuenteBold = new Font(Font.FontFamily.COURIER, 24, Font.BOLD);
    private Font fuenteNormal = new Font(Font.FontFamily.COURIER, 12, Font.NORMAL);
    private Font fuenteItalic = new Font(Font.FontFamily.COURIER, 12, Font.ITALIC);
    private Font fuente = new Font(Font.FontFamily.COURIER,11,Font.BOLDITALIC);
    private Font fuenteParaLinea = new Font(Font.FontFamily.COURIER,11,Font.BOLD);

    public void generarPDF(String Header, String Info, String Footer, String Pie, String Empresa,String Linea, String RutaImagen, String salida) {
        try {
            Document document = new Document(PageSize.CROWN_QUARTO,36,36,10,10);
            PdfWriter.getInstance(document, new FileOutputStream(salida));
            document.open();
            document.add(getHeader(Header));
            Image image = Image.getInstance(RutaImagen);
            image.scaleAbsolute(100, 100);
            image.setAlignment(Element.ALIGN_CENTER);
            document.add(image);
            document.add(getInfo(Info));
            document.add(getFooter(Footer));
            document.add(getPie(Pie));
            document.add(getEmpresa(Empresa));
            document.add(getLinea(Linea));
            document.close();
        } catch (Exception e) {
        }
        
        
        
    }

    private Paragraph getHeader(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(Texto);
        c.setFont(fuenteBold);
        p.add(c);
        return p;
    }
    private Paragraph getInfo(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(Texto);
        c.setFont(fuenteItalic);
        p.add(c);
        return p;
    }
    private Paragraph getFooter(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_LEFT);
        c.append(Texto);
        c.setFont(fuenteNormal);
        p.add(c);
        return p;
    }
    private Paragraph getPie(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(Texto);
        c.setFont(fuenteNormal);
        p.add(c);
        return p;
    }
    
    private Paragraph getEmpresa(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(Texto);
        c.setFont(fuente);
        p.add(c);
        return p;
    }
    private Paragraph getLinea(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(Texto);
        c.setFont(fuenteParaLinea);
        p.add(c);
        return p;
    
    }
    
    
}
