package AsocArray;

public class AsocArray {

private static final int MAX = 10;
private int tam;
private String[][] map;

public int size() {
		
		return tam;
	}

public AsocArray (){
	tam=0;
	map = new String[MAX][2];
}
public String get(String clave) throws UndefinedKeyException {
	for(int i=0;i<tam;i++){
		if(clave==map[i][0]){
			return map[i][1];
		}
	}
	throw new UndefinedKeyException("No se ha encontrado la clave");
}

public void put(String CLAVE, String VALOR) {
	map[tam][0]=CLAVE;
	map[tam][1]=VALOR;
	tam++;
	
}

public boolean containsKey(String clave) {
	try{
		get(clave);
	}catch(UndefinedKeyException e){
		return false;
	}
	return true;
}

public String getOrElse(String clave, String valorPorDefecto) {
	String pal;
	try{
		pal=get(clave);
	}catch(UndefinedKeyException e){
		pal=valorPorDefecto;
	}
	return pal;
}
public boolean remove(String clave) {
	int n=0;
	while((map[n][0]!=clave)&&(n<tam)){
		n++;
	}if(n==tam){
		return false;
	}else{
		while(n!=tam){
			map[n][0]=map[n+1][0];
			n++;
		}
		tam--;
		return true;
	}
}



}
