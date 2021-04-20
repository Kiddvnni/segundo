import java.util.Scanner;
public class menu {
    public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	int opcion=0, hora=0, mes=0, numero=0;
	
	System.out.println("Elige una opcion");
        System.out.println("1.- Calculo Hora");
        System.out.println("2.- Calculo Mes");
        System.out.println("3.- Par o Impar");
        System.out.println("4.- Salir");
        
        opcion = teclado.nexInt();

        do {
	if( opcion=1 ) {
		System.out.println("Has elegido la Opcion 1");
		System.out.println("Elige una hora");
		Scanner teclado = new Scanner(System.in);
			if (hora < 12) {
      			System.out.println("Buenos dias");
    			} else if (hora < 21) {
      			System.out.println("Buenas tardes.");
    			} else if (hora < 24) {
      			System.out.println("Buenas noches");
    			}  else {
      			System.out.println("Hora invalida");
    			}; 
	} 
	else if( opcion=2 ) { 
		System.out.println("Has elegido la Opcion 2");
		System.out.println("Elige un mes");
		switch(mes){
		case 1:
	    		System.out.println("Es Enero");
		break;
		case 2:
	    		System.out.println("Es Febrero");
		break;
		case 3:
	    		System.out.println("Es Marzo");
		break;
		case 4:
	    		System.out.println("Es Abril");
		break;
		case 5:
	    		System.out.println("Es Mayo");
		break;
		case 6:
	    		System.out.println("Es Junio");
		break;
		case 7:
	    		System.out.println("Es Julio");
		break;
		case 8:
	    		System.out.println("Es Agosto");
		break;
		case 9:
	    		System.out.println("Es Septiembre");
		break;
		case 10:
	    		System.out.println("Es Octubre");
		break;
		case 11:
	    		System.out.println("Es Noviembre");
		break;
		case 12:
	    		System.out.println("Es Diciembre");
		break;
		default:
	    		System.out.println("Mes invalido");
		break;
	} 
} 
	else if( opcion=3 ) {
		System.out.println("Has elegido la Opcion 3");
		System.out.println("Elige un numero");
			if ( numero % 2 == 0 )
        		{
            		System.out.printf( "ES PAR" );
        		}
        		else
        		{
            		System.out.printf( "ES IMPAR" );
        		} 
}
	else if( opcion=4 ){
		 }
	else{
		System.out.println("Numero invalido");
}
	

}while (opcion>=1 && opcion<5);
	}
}