package Model;

import Repository.HibernateUtil;

public class LoginModel {
    public static boolean validarIngreso(String user, String password) {
        boolean acceso = HibernateUtil.inicializarAcceso(user, password);
        if (acceso) {
            return true;
        }else
            return false;

    }
}
