package Model;

import Repository.HibernateUtil;

import javax.swing.*;

public class LoginModel {
    private boolean validarIngreso(String user, String password) {
        boolean acceso = HibernateUtil.inicializarAcceso(user, password);
        if (acceso) {
            return true;
        }else
            return false;
    }

    public boolean iniciarSession(String user, String password) {
        boolean flag = false;
        try {
            flag = validarIngreso(user, password);
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
        return flag;
    }
}