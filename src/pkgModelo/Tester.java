package pkgModelo;

import java.util.ArrayList;
import java.util.List;
//Este comentario ha sido dejado por Yael OS los tqm :3
//Modifico marco aqui jeje
//Este comentario es de Axel Ornelas------- besitos
//Actualización subida desde Netbenas por Yael Otamendi :D
//Deje este comentario atte: Fatima
//Ultima modificacion por fatima
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j;
		MDB administradorBD =  new MDB();
		List<ArrayList<String>> datosObtenidos= new ArrayList<ArrayList<String>>();
		ArrayList<String> renglonObtenido = new ArrayList<String>();
		String leyenda;
                //insertar
                leyenda= administradorBD.registrarAlta("tbUsuarios", "null, 'Mayra','González',1234");
		System.out.println(leyenda);
                
                //modificar
	//leyenda = administradorBD.modificarRegistro("TbEquipo", "nombre='lapiz' , descripcion = 'digital' ,  cantidad= '4'", "id = 5");
      //     System.out.println(leyenda);
                
                //Borrar
         //  leyenda = administradorBD.borrarRegistro("TbEquipo", "id = 6");
           //   System.out.println(leyenda);
		
                //consulta
		datosObtenidos = administradorBD.consultarDatos("tbUsuarios", "id , nombre,apPaterno, psw", "id=1");
                  System.out.println(leyenda);
		for(i=0;i<datosObtenidos.size();i++)
		{
                    renglonObtenido = datosObtenidos.get(i);
                    for(j=0;j<renglonObtenido.size();j++){
			System.out.print(renglonObtenido.get(j) + " ");
                    }
                    System.out.println();
		}
        }
}
