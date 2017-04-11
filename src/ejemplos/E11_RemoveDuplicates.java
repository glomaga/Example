package ejemplos;

import java.util.*;

import javax.print.DocFlavor.STRING;

public class E11_RemoveDuplicates {

	public static void main(String[] args) {
		List<String> arg= new ArrayList<String>();
		arg.add("good");
		arg.add("better");
		arg.add("best");
		arg.add("best");
		arg.add("first");
		arg.add("last");
		arg.add("last");
		arg.add("last");
		arg.add("good");
		RemoveDuplicates(arg);
		RemoveDuplicatesHash(arg);
		
		NoRepeated(new int[] { 7, 6, 8, 7, 5, 8 });
		repeated2(new int[] { 7, 6, 8, 7, 5, 8 });

	}

	private static void RemoveDuplicates(List<String> arg) {
		System.out.println(arg.toString());
		
		if(!arg.isEmpty()){
			String temp=" ";
			List<String>  res= new ArrayList<String>(arg);
			for(int i=0; i< res.size();i++){
				temp= res.get(i);
				for(int j=0;j < res.size();j++){
					if(j!=i){
						if (temp.equals(res.get(j))){
							res.remove(j);
						}
					}
				}
			}
			System.out.println(res.toString());
		}
		
	}

	private static void RemoveDuplicatesHash(List<String> arg) {   //Creamos un objeto HashSet
		System.out.println(arg.toString());
		HashSet hs = new HashSet();
        //Lo cargamos con los valores del array, esto hace quite los repetidos
        hs.addAll(arg);
        //Limpiamos el array
        arg.clear();
        //Agregamos los valores sin repetir
        arg.addAll(hs);
        //Imprimimos  el resultado
    	System.out.println(arg.toString());
		
	}
	

	static void NoRepeated(int a[]) {
		boolean existe = false;
		if (a.length == 1) {
			System.out.println(a[0]);
		} else {
			int cont = 0;
			ArrayList unicos = new ArrayList();
			for (int i = 0; i < a.length; i++) {
				existe = false;
				for (int j = 0; j < cont; j++) {
					if ((int) unicos.get(j) == a[i]) {
						existe = true;
						break;
					}

				}
				if (!existe) {
					unicos.add(a[i]);
					cont++;
				}
			}
			System.out.println(unicos.toString());

		}

	}

	static void repeated2(int[] a) {
		HashSet<Integer> res = new HashSet();
		for (int i = 0; i < a.length; i++) {
			res.add(a[i]);
		}

		System.out.println(res.toString());

	}
	




}
