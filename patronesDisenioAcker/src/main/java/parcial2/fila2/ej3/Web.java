package segundoParcial.fila2.ej3;

import java.util.ArrayList;
import java.util.List;

public class Web implements IPagina{
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void add(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void remove(Usuario usuario) {
        usuarios.remove(usuario);
    }

    @Override
    public void notificarUsurio(INotificacion notification) {
        System.out.println("Mostrando la notificacion>>>>> \n"+notification.getMsg());
        for(Usuario user: usuarios){
            if(notification instanceof Video && user.isSoloVideos()){
                user.getUpdated(notification);
            } else if (!user.isSoloVideos()){
                user.getUpdated(notification);
            }
        }
    }
}
