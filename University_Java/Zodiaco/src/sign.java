package zodiaco;

public class sign {

private int mes, dia;
private String signo;
private boolean fValida =false;
public sign(int mes, int dia){
    this.mes = mes;
    this.dia = dia;
}

public void setMounth (int mes){
    this.mes=mes;
}

public void setDay (int dia){
    this.dia=dia;
}

public void getSign(){
    if (signo!= null){
    System.out.println("El signo zodiacal es: " + this.signo);
    }
    
}

public void validDate(){
    switch (mes){
        case 1:
            if (dia>0 & dia<32){
                this.fValida=true;
            }
            break;
        case 2:
            if (dia>0 & dia<30){
                this.fValida=true;
            }
            break;
        case 3:
            if(dia>0 & dia<32){
                this.fValida=true;
            }
            break;
        case 4:
            if(dia>0 & dia<31){
                this.fValida=true;
            }
            break;
        case 5:
            if(dia>0 & dia<32){
                this.fValida=true;
            }
            break;
        case 6:
            if(dia>0 & dia<31){
                this.fValida=true;
            }
            break;case 7:
            if(dia>0 & dia<32){
                this.fValida=true;
            }
        case 8:
            if(dia>0 & dia<32){
                this.fValida=true;
            }
            break;
        case 9:
            if(dia>0 & dia<31){
                this.fValida=true;
            }
            break;
        case 10:
            if(dia>0 & dia<32){
                this.fValida=true;
            }
            break;
                    
        case 11:
            if(dia>0 & dia<31){
                this.fValida=true;
            }
            break;  case 12:
            if(dia>0 & dia<32){
                this.fValida=true;
            }
            break;
        
    }
}

public void fSign(){
    if (fValida==true){
    switch (mes){
        case 1://Enero
            if (dia>20){
                signo = "Acuario";
            }
            else{
                signo = "Capricornio";
            }
            break;
        case 2://Febrero
            if (dia>19){
                signo = "Piscis";
            }
            else{
                signo = "Acuario";
            }
         break;case 3://Marzo
            if (dia>20){
                signo = "Aries";
            }
            else{
                signo = "Piscis";
            }
            break;
        case 4://Abril
            if (dia>20){
                signo = "Tauro";
            }      
            else{
                signo = "Aries";
            }
            break;
        case 5://Mayo
            if (dia>21){
                signo = "Geminis";
            }
            else{
                signo = "Tauro";
            }
            break;case 6://Junio
            if(dia>20){
                signo = "Cancer";
            }
            else{
                signo = "Geminis";
            }
            break;
        case 7://Julio
            if (dia>22){
                signo = "Leo";
            }
            else{
                signo = "Cancer";
            }
            break;
        case 8://Agosto
            if (dia>21){
                signo = "Virgo";
            }
            else{
                signo = "Leo";
            }
            break;
        case 9://septiembre
            if (dia>22){
                signo = "Libra";
            }
            else{
                signo = "Virgo";
            }
            break;case 10://octubre
            if (dia>22){
                signo = "Escorpio";
            }
            else{
                signo = "Libra";
            }
            break;
        case 11://nobiembre
            if (dia>21){
                signo = "Sagitario";
            }
            else{
                signo = "Escorpio";
            }
            break;
        case 12://diciembre
            if (dia>21){
                signo = "Capricornio";
            }
            else{
                signo = "Sagitario";
            }
            break;
    }
    }
    else {
        System.out.println("La fecha es invalida");
    }
    
    
}    
}