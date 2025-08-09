package com.blokada.plus.license;

/**
 * LicenseManager - Simula validación VIP eterna para Blokada 6.
 */
public class LicenseManager {

    public boolean isVipActive() {
        return true;  // Forzar VIP activo siempre
    }

    public String getVipExpiry() {
        return "2099-12-31";  // Fecha muy lejana
    }

    public int getVipLevel() {
        return 5;  // Nivel máximo simulado
    }
}
