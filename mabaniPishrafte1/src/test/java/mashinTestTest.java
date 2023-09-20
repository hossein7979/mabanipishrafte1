import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;


class mashinTestTest {
    @Test
    void Mashin_Bayad_Harkat_Konad() {
        /*Mashin mashin = new Mashin();
        mashin.mashinRoshanast();
        mashin.darMashinBasteAst();
        out.println("dar mashin baz ast?"+mashin.ayaDarMashinBazAst);
        out.println(-----------------------------------);*/

        Mashin benz = new Mashin("Benz");
        benz.darMashinBazAst();
        benz.harkatMashin();
        boolean ayaMashinRoshanAst = benz.ayaMashinRoshanAst;
    }

    class Mashin{
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        String Mark;


        Mashin(String Mark){
            this.Mark=Mark;
        }

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