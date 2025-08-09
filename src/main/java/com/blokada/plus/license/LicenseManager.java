package com.blokada.plus.license;

public class LicenseManager {
    public boolean isVipActive() {
        return true; // Siempre VIP
    }

    public String getVipExpiry() {
        return "2099-12-31"; // Fecha muy lejana
    }

    public int getVipLevel() {
        return 5; // Nivel VIP máximo
    }
}
