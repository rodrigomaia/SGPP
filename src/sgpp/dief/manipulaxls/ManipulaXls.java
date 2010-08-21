package sgpp.dief.manipulaxls;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import jxl.Sheet;
import jxl.Workbook;
import sgpp.dief.beans.BeanLinhaExcel;

/**
 *
 * @author rodrigo
 */
public class ManipulaXls {

    private Sheet planilha = null;

    public ManipulaXls(String caminho) throws Exception{
        Workbook workbook = Workbook.getWorkbook(new File(caminho));
        planilha = workbook.getSheet(0);
    }

    public void geraVetor(HashMap<String, BeanLinhaExcel> hash) {

        try{
            int qtdLinhas = planilha.getRows();

            for(int linha=1; linha<qtdLinhas; linha++){

                ArrayList<String> campos = new ArrayList<String>();

                for(int coluna=0; coluna<6; coluna++){
                    String campo = planilha.getCell(coluna,linha).getContents();

                    if(campo.equals(""))
                        break;

                    campos.add(campo);
                }

                if(campos.size() < 6)
                    break;

                hash.put(campos.get(0), new BeanLinhaExcel(campos.get(1), campos.get(2), campos.get(3), campos.get(4), campos.get(5)));
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            throw new ArrayIndexOutOfBoundsException("Planilha Fora do Formato Esperado.");
        }
    }
}
