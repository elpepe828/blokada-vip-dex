package com.blokada.plus.license;

public class LicenseManager {

    // Siempre devuelve true para indicar que el usuario tiene VIP activo
    public boolean isVipActive() {
        return true;
    }

    // Devuelve una fecha de expiración muy lejana para simular VIP ilimitado
    public String getVipExpiry() {
        return "2099-12-31";
    }

    // Nivel máximo VIP simulado, ajusta si la app usa niveles
    public int getVipLevel() {
        return 5;
    }

    // Método que puede indicar si el usuario tiene alguna función Plus/VIP extra
    public boolean hasPlusFeature(String featureName) {
        // Retorna true para todas las funciones para simular acceso total
        return true;
    }

    // Consulta para obtener el tipo de licencia (p. ej. anual, vitalicia)
    public String getLicenseType() {
        return "Lifetime";
    }
}
