public class Pessoa {

    float nota;
    int presencas;
    float nota_final;
    float bonus;

    //METÓDO APLICAR NOTA:

    public void aplicar_nota(float nota){ //"FLOAT NOTA" - É O PÂRAMETRO DO METÓDO

        if (nota >= 0 && nota <= 10){

            this.nota = nota; //"THIS" - NESSA LINHA SIGNIFICA A NOTA DO ATRIBUTO - DIFERENCIANDO DO PARÂMETRO DO METÓDO
            nota_final = this.nota;
            System.out.printf("\nOperação Realizada!!! Nota: %.1f.\n", this.nota);
        }
        
        else{

            System.out.printf("\nOperação Não Realizada!!! Nota: %.1f.\n", this.nota);
        }

    }
    
    //METÓDO APLICAR PRESENÇAS:

    public void aplicar_presencas(int presencas){

        if (presencas > 0 && presencas <= 40){

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

        if (presencas > 20 && bonus <= 10){

            bonus = bonus / 100; //TRANSFORMANDO EM DECIMAL
            nota_final += nota_final * bonus; //ACRESCENTANDO
            this.bonus = bonus; 
            System.out.printf("\nOperação Realizada!!! Nota Final (Nota + Bônus): %.1f\n", nota_final);

        }

        else{

            System.out.printf("\nOperação Não Realizada!!! Nota Final: %.1f\n", nota);
        }
    }

    //METÓDO EXIBIR DADOS:

    public void exibir_dados(){

        System.out.printf("\nNota Inicial: %.1f", nota);
        System.out.printf("\nNota Final: %.1f", nota_final);
        System.out.printf("\nPresenças: %d", presencas);
        System.out.printf("\nBonûs: %.0f%%", bonus * 100);

    }

}
