import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

class mashinTestTest {
    class Mashin{
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double tol;
        double arz;

        void mashinRoshanast(){
            out.println("mashin roshan ast");
            ayaMashinRoshanAst=true;
        }
        void mashinKhamoshAst(){
            out.println("mashin khamosh ast");
            ayaMashinRoshanAst=false;
        }
        void darMashinBazAst(){
            out.println("dar mashin baz ast");
            ayaMashinRoshanAst=true;

        }
        void darMashinBasteAst(){
            out.println("dar mashin baste ast");
            ayaDarMashinBazAst=false;
        }
        void harkatMashin(){
            if(!ayaDarMashinBazAst && ayaMashinRoshanAst){
                out.println("mashin dar hal harekat ast");
            }else{
                out.println("mashin park ast");
            }
        }

    }

}