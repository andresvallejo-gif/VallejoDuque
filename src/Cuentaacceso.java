public class Cuentaacceso {
    private int id;
    private String nombreusuario;
    private boolean intento;
    private int intentofallido=0;
    private int cuentacreadacorrectamente=0;

    public Cuentaacceso(int id, String nombreusuario) {
        if(id>0){
            this.id = id;
        }
        if (nombreusuario !=null && !nombreusuario.trim().isEmpty()){
            this.nombreusuario = nombreusuario.trim();
        }

    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;

    }

    public void setintento(boolean intento) {
        this.intento = intento;
    }

    public boolean intentofallo(){
        if(intento==false){
            intentofallido+=1;
        }
        return true;
    }

    public boolean correcto(){
        if (intento==true){
            intentofallido=0;
            cuentacreadacorrectamente++;
        }
        return true;

    }


    public void mostrarestado(){
        if (intento==true){
            System.out.println("Ingreso correctamente intentos restablecidos: "+ intentofallido);
            System.out.println("Cuentas creadas correctamente: "+ cuentacreadacorrectamente);
        }
        if (intento==false){
            System.out.println("Intento fallido: "+ intentofallido);

        }
        if(intentofallido>=3){
            System.out.println("El sistema se a bloqueado demasiados intentos");

        }

    }

}
