//Criar um Programa com a classe Casa, e colocar 3 portas na casa, pintar a casa e depois imprimir a quantidade de portas abertas;
// Grupo: Thalys Henrique e Levi Oliveira
// Matéria: Programação Orientada a Objetos


package Program3;

class Porta {
    boolean aberta = false;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    boolean abre() {
        if ( this.aberta == false ) {
            return this.aberta = true;
        }
        else {

            return true;
        }
    }

    boolean fecha() {
        if ( this.aberta == true ) {
            return this.aberta = false;
        }
        else {

            return false;
        }
    }

    void sitPorta() {
        if ( this.aberta == true ) {
            System.out.println ( "aberta" );
        }
        else {
            System.out.println ( "fechada");
        }
    }

    void pinta(String c) {
        this.cor = c;
        System.out.println ( "A porta foi pintada de " + this.cor );
    }

    void tamanho( double x, double y, double z ) {
        this.dimensaoX = x;
        this.dimensaoY = y;
        this.dimensaoZ = z;
    }

    void mostra() {
        System.out.print( "A porta " + this.cor + " de tamanho: " + this.dimensaoX + "x" + this.dimensaoY + "x" + this.dimensaoZ + " Está " ); sitPorta();
    }
}


class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    void pinta( String tinta ){
        this.cor = tinta;
    }

    int qtPtAberta(){ // verifica quantas portas estão abertas
        int qtAberta = 0;

        if( this.porta1.aberta == true ){
            qtAberta += 1;
        }

        if ( this.porta2.aberta == true ){
            qtAberta += 1;
        }

        if ( this.porta3.aberta == true ){
            qtAberta += 1;
        }
        return qtAberta;
    }

    void mostrar(){
        int qtAberta;

        qtAberta = this.qtPtAberta();
        System.out.println( "A casa " + this.cor + " está com " + qtAberta + " porta(s) aberta(s)");
    }
}


class TestaCasa{
    public static void main( String[] args ){
       Casa c1 = new Casa();
       c1.porta1 = new Porta();
       c1.porta2 = new Porta();
       c1.porta3 = new Porta();

        c1.porta1.fecha();
        c1.porta1.pinta( "verde" );
        c1.porta1.dimensaoX = 1.80;
        c1.porta1.dimensaoY = 0.80;
        c1.porta1.dimensaoZ = 0.04;
        c1.porta1.mostra();

        c1.porta2.abre();
        c1.porta2.pinta( "azul" );
        c1.porta2.dimensaoX = 2.10;
        c1.porta2.dimensaoY = 0.90;
        c1.porta2.dimensaoZ = 0.05;
        c1.porta2.mostra();

        c1.porta3.abre();
        c1.porta3.pinta( "amarela" );
        c1.porta3.dimensaoX = 2.00;
        c1.porta3.dimensaoY = 0.85;
        c1.porta3.dimensaoZ = 0.03;
        c1.porta3.mostra();

        c1.pinta( "Branca" );

        c1.mostrar();


    }
}


