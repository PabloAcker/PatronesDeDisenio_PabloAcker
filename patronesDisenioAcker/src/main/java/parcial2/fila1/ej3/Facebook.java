package segundoParcial.fila1.ej3;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements IFacebook {
    private List<Usuario> subs = new ArrayList<>();

    public Facebook(){}

    public void sendNotificacion(String tipo, String msg){
        this.notificarSubs(msg, tipo);
    }

    @Override
    public void suscribir(Usuario usuario) {
        subs.add(usuario);
    }

    @Override
    public void borrar(Usuario usuario) {
        subs.remove(usuario);
    }

    @Override
    public void notificarSubs(String msg, String tipo) {
        if(tipo.equals("video")){
            for (Usuario user: subs) {
                if(user.getTipoNotificacion().equals("video")){
                    user.update(msg);
                }
            }
        } else if (tipo.equals("imagen")){
            for (Usuario user: subs) {
                if(user.getTipoNotificacion().equals("imagen")){
                    user.update(msg);
                }
            }
        }
    }
}
