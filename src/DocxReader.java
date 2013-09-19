//import org.apache.poi.hwpf.HWPFDocument;
//import org.apache.poi.hwpf.usermodel.Paragraph;
//import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.xwpf.usermodel.*;
 
import java.io.*;


public class DocxReader {

	public static void main(String[] args) {
        File someFile = new File("/Users/opendream/Downloads/nbtc-115.docx");
        try {
            InputStream inputStream = new FileInputStream(someFile);
            XWPFDocument wordDoc = new XWPFDocument(inputStream);
            int cnt = 0;
            String doc_scan = "";
            for (XWPFTable xwpfTable : wordDoc.getTables()) {
//                System.out.println("----------table:" + cnt);
                int rows = xwpfTable.getNumberOfRows();
                for (int i = 0; i < rows; i++) {
//                    System.out.println(">>>>>>row:" + i);
                    XWPFTableRow row = xwpfTable.getRow(i);
                    for (XWPFTableCell cell : row.getTableCells()) {
                        for (XWPFParagraph paragraph : cell.getParagraphs()) {
//                            System.out.println(paragraph.getText());
                            doc_scan += paragraph.getText() + '\n';
                        }
                    }
                }
                cnt++;
            }
            
            RegexMatcher.extractAllData(doc_scan);

        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
 
    }

}
