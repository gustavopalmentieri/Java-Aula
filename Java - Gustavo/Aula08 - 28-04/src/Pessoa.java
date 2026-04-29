public class Pessoa {

    float nota;
    int presencas;


    //METÓDO APLICAR NOTA:

    public void aplicar_nota(float nota){

        if (nota >= 0){

            this.nota = nota; //"THIS" - NESSA LINHA SIGNIFICA A NOTA DO ATRIBUTO
            System.out.printf("\nOperação Realizada!!! Nota: %.1f.\n", this.nota);
        }
        
        else{

            System.out.printf("\nOperação Não Realizada!!! Nota: %.1f.\n", this.nota);
        }

    }
    
    //METÓDO APLICAR PRESENÇAS:

    public void aplicar_presencas(int presencas){

        if (presencas > 0){

            this.presencas = presencas;
            System.out.printf("\nOperação Realizada!!! Total de Presenças: %d\n", this.presencas);

        }

        else{

            System.out.printf("\nOperação Não Realizada!!! Total de Presenças: %d\n", this.presencas);
            
        }

    }
}

class Aluno extends Pessoa{

    //METÓDO APLICAR BÔNUS:

    public void aplicar_bonus(float bonus){

        if (presencas > 20){

            bonus = bonus / 100; //TRANSFORMANDO EM DECIMAL
            nota += nota * bonus; //ACRESCENTANDO 
            System.out.printf("\nOperação Realizada!!! Nota Final (Nota + Bônus): %.1f\n", nota);

        }

        else{

            System.out.printf("\nOperação Não Realizada!!! Nota Final: %.1f\n", nota);
        }
    }

}