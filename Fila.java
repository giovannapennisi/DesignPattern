package com;

public class Fila {

    private static Fila instancia;

    public static Fila getInstance() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }

    public void ImprimeDocumento() {
    }

    public void RemoveDocumento() {
    }

    public void RemoveTodosDocumentos() {
    }

    private Fila(){
    }
}