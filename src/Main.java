public class Main {
    public static void main(String[] args) {
        Cuentaacceso cuenta1= new Cuentaacceso(122,"Usuario A");

        cuenta1.setintento(false);
        cuenta1.intentofallo();
        cuenta1.correcto();

        System.out.println();
        cuenta1.mostrarestado();
        System.out.println();

        cuenta1.setintento(true);
        cuenta1.correcto();
        cuenta1.intentofallo();


        cuenta1.mostrarestado();
        System.out.println();

        cuenta1.setintento(false);
        cuenta1.intentofallo();
        cuenta1.correcto();
        cuenta1.setintento(false);
        cuenta1.intentofallo();
        cuenta1.correcto();
        cuenta1.setintento(false);
        cuenta1.intentofallo();
        cuenta1.correcto();
        cuenta1.mostrarestado();
    }

}
