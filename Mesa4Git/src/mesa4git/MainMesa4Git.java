package mesa4git;

/**
 *
 * @author Julián Correas
 */
public class MainMesa4Git {
    public static void main(String[] args) {
   
        String mensaje = "";
        
        EnzoItaliani miembroEnzo = new EnzoItaliani();
        FranciscoGaliani miembroFran = new FranciscoGaliani();
        JuampiKeimColl miembroJuampi = new JuampiKeimColl();
        JulianCorreas miembroJuli = new JulianCorreas();
        MatiasBiassi miembroMati = new MatiasBiassi();
        UrielGiardini miembroUri = new UrielGiardini();
        
        miembroEnzo.enzoImprime("A continuación, el miembro Enzo mostrara su mensaje...");
        miembroFran.franImprime("A continuación, el miembro Fran mostrara su mensaje...");
        miembroJuampi.juampiImprime("A continuación, el miembro Juampi mostrara su mensaje...");
        miembroJuli.juliImprime("A continuación, el miembro Juli mostrara su mensaje...");
        miembroMati.matiImprime("A continuación, el miembro Mati mostrara su mensaje...");
        miembroUri.uriImprime("A continuación, el miembro Uri mostrara su mensaje...");
        
        
    }

}
