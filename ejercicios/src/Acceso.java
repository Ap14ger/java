 class Acceso {
    private final String contraseñaCorrecta = "123456";
    private String intento;

    // Constructor para recibir el intento de contraseña
    public Acceso(String intento) {
        this.intento = intento;
    }

    public void verificarAcceso() {
        if (intento.equals(contraseñaCorrecta)) {
            System.out.println("✅ Acceso permitido.");
        } else {
            System.out.println("❌ Acceso denegado. Contraseña incorrecta.");
        }
    }
}
