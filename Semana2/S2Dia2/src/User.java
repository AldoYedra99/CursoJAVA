public class User {
    String username;
    String password;

    public void login(String user, String pass){
        System.out.println("Intentando iniciar sesión");

        if (username.equals(user) && password.equals(pass)){
            System.out.println("Inicio de sesión exitoso ✅");
        }else {
            System.out.println("Usuario o contraseña incorrectos ❌");
        }
    }
}
