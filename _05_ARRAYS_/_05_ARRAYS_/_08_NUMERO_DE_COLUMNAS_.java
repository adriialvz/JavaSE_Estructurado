package _05_ARRAYS_;

import java.util.*;

public class _08_NUMERO_DE_COLUMNAS_ {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		
		int datos[][]= new int[5][];							//MATRIZ CON 5 FILAS
		
		int num[]= new int[5];									//ARRAY ON 5 FILAS
		
		
			for (int i=0;i<num.length;i++) {
				System.out.println("INTRODUCE UN NUMERO");				//GUARDAMOS EN EL ARRAY "NUM" LOS NUMEROS INTRODUCIDOS
				int num2=in.nextInt();
				num[i]=num2;	
			}
			
			
			datos[0]= new int[num[0]];
			datos[1]= new int[num[1]];
			datos[2]= new int[num[2]];				//GUARDAMOS EN LAS 5 FILAS DE LA MATRIZ "DATOS" LOS NUMEROS INTRODUCIDOS DEL ARRAY "NUM" 
			datos[3]= new int[num[3]];				//CON ESTO CREAMOS LAS COLUMNAS DE LA MATRIZ
			datos[4]= new int[num[4]];
	
			
			for(int i=0;i<datos.length;i++) {
				for(int j=0;j<datos[i].length;j++) {
					datos[i][j]=(int)(Math.random()*9+0);		//IMPRIMIMOS LA MATRIZ CON NUMEROS ALEATORIOS DE 5 FILAS Y LAS COLUMNAS 
					System.out.print(datos[i][j]);				//CON NUMEROS ALEATORIOS DE X COLUMNAS QUE LE PASAMOS 
				}
				System.out.println();							//SALTO DE LINEA EN CADA PASADA
			}

	}

}
