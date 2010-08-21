package sgpp.dief.beans;

import java.math.BigDecimal;

/**
 *
 * @author rodrigo
 */
public class BeanLinhaExcel {
    private String vlContabil;
    private String bCICMS;
    private String vlICMS;
    private String isentas;
    private String outras;

    public BeanLinhaExcel(String vlContabil, String bCICMS, String vlICMS, String isentas, String outras) {
        if(vlContabil.trim().equals("-"))
            vlContabil = "0";
        if(bCICMS.trim().equals("-"))
            bCICMS = "0";
        if(vlICMS.trim().equals("-"))
            vlICMS = "0";
        if(isentas.trim().equals("-"))
            isentas = "0";
        if(outras.trim().equals("-"))
            outras = "0";

        this.vlContabil = vlContabil.replace(".", "").replace(",", ".");
        this.bCICMS = bCICMS.replace(".", "").replace(",", ".");
        this.vlICMS = vlICMS.replace(".", "").replace(",", ".");
        this.isentas = isentas.replace(".", "").replace(",", ".");
        this.outras = outras.replace(".", "").replace(",", ".");
    }

    public BigDecimal getVlContabil(){
        try{
            return new BigDecimal(vlContabil);
        }catch(Exception e){
            return new BigDecimal(0.0);
        }
    }

    public BigDecimal getBCICMS(){
        try{
            return new BigDecimal(bCICMS);
        }catch(Exception e){
            return new BigDecimal(0.0);
        }
    }

    public BigDecimal getVlICMS(){
        try{
            return new BigDecimal(vlICMS);
        }catch(Exception e){
            return new BigDecimal(0.0);
        }
    }

    public BigDecimal getIsentas(){
        try{
            return new BigDecimal(isentas);
        }catch(Exception e){
            return new BigDecimal(0.0);
        }
    }

    public BigDecimal getOutras(){
        try{
            return new BigDecimal(outras);
        }catch(Exception e){
            return new BigDecimal(0.0);
        }
    }
}
