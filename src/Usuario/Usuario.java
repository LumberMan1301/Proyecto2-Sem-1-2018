package Usuario;
import Estructuras.Listas.ListaSimple;

public class Usuario {
    private String nombreDeUsuario;
    private String nombre;
    private int edad;
    private String Contrasena;

    //generos favoritos
    //amigos
    ListaSimple<ListaSimple<String>> listaUsuario = new ListaSimple<ListaSimple<String>>();


    public void incializarLista(){
     for(int i = 0; i<= 3; i++){
         listaUsuario.add(new ListaSimple<String>());

    }}

    public static void main(String[] args) {
        ListaSimple<ListaSimple<String>> l = new ListaSimple<ListaSimple<String>>();
        l.get(0).add("Karla");
        l.get(0).add("Mariano");
        l.get(0).add("Steven");

        l.get(1).add("Karla Rivera");
        l.get(1).add("Mariano Mu;oz");
        l.get(1).add("Steven Mesen");

        l.get(2).add("20");
        l.get(2).add("21");
        l.get(2).add("20");

        l.get(3).add("123");
        l.get(3).add("345");
        l.get(3).add("567");

        System.out.println("Lista de Usuarios");
        System.out.println("-------------------------");
        for (int i = 0; i <= l.get(0).size() - 1; i++) {
            System.out.println("Nombre: " + l.get(0).get(i) + " Nombre Completo: "
                    + l.get(1).get(i) + " " + l.get(2).get(i)
                    + " Contrase;a: " + l.get(3).get(i)
            );
        }

    }

}
