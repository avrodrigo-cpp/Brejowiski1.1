import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class PrincipalBrejowiski {
	static List<Cerveja> minhasCervejas = new ArrayList<Cerveja>();
	List<Preferencia> minhasPreferencias = new ArrayList<Preferencia>();
	private static void lerPlanilha() {
		FileInputStream fisRegistro = null;
		try {
			File file = new File("registro.xlsx");
            fisRegistro = new FileInputStream(file);

            //cria um workbook = planilha toda com todas as abas
            HSSFWorkbook workbook = new HSSFWorkbook(fisRegistro);

            //recuperamos apenas a primeira aba ou primeira planilha
            HSSFSheet sheet = workbook.getSheetAt(0);

            //retorna todas as linhas da planilha 0 (aba 1)
            Iterator<Row> rowIterator = sheet.iterator();

            //varre todas as linhas da planilha 0
            while (rowIterator.hasNext()) {
                //recebe cada linha da planilha
                Row row = rowIterator.next();
                //pegamos todas as celulas desta linha
                Iterator<Cell> cellIterator = row.iterator();
                Cerveja cerveja =  new Cerveja();
                minhasCervejas.add(cerveja);
                //varremos todas as celulas da linha atual
                while (cellIterator.hasNext()) {
                    //criamos uma celula
                    Cell cell = cellIterator.next();
                    //Selecionando por indice de coluna
                    switch (cell.getColumnIndex()) {
                  //"Cerveja", "Recipiente", "Pre\u00E7o", "Estabelecimento", "Cidade"
                        case 0:
                        	cerveja.setNome(cell.getStringCellValue());
                            break;

                        case 1:
                        	cerveja.setTipo(cell.getStringCellValue());
                            break;
                        case 2:
                        	cerveja.setRecipiente(cell.getStringCellValue());
                            break;
                        case 3:
                        	cerveja.setPreco(cell.getCellType());
                            break;
                        case 4:
                        	cerveja.setEstabelecimento(cell.getStringCellValue());
                            break;
                        case 5:
                        	cerveja.setCidade(cell.getStringCellValue());
                            break;
                            
                    }
                }
            }

		}catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalBrejowiski.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalBrejowiski.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fisRegistro.close();
            } catch (IOException ex) {
                Logger.getLogger(PrincipalBrejowiski.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	}
	
	public static void main(String[] args) {
		lerPlanilha();
		
		new preferenciaUsuario().setVisible(true);
		new feed(minhasCervejas).setVisible(true);
		//JOptionPane.showMessageDialog(null, exibeRegistro());
	}
	public void cadastra(Preferencia p) {
		minhasPreferencias.add(p);
		
	}




	
	
}
