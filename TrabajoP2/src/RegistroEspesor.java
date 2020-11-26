
import java.util.ArrayList;


public class RegistroEspesor {

    public static ArrayList <Espesor> espesor = new ArrayList();
    
    public void registrarEspesor (){
        espesor.add(new Espesor("Aplicando 50  mm",53.60,2.25));
        espesor.add(new Espesor("Aplicando 70  mm",87,3.15));
        espesor.add(new Espesor("Aplicando 100 mm",117.49,4.5));
        espesor.add(new Espesor("Aplicando 120 mm",128.48,5.4));
        espesor.add(new Espesor("Aplicando 160 mm",143.05,7.2));
        espesor.add(new Espesor("Aplicando 200 mm",180.79,9));
    }
    
    public void mostrarEspesor(){
        System.out.println("\n\t\t\t  Lista de Espesor\n");
        for(Espesor item: espesor){
            System.out.println(item);
        }
    }
}
