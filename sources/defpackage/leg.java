package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class leg {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        map.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        map.put(-2, "The requested pack is not available.");
        map.put(-3, "The request is invalid.");
        map.put(-4, "The requested download is not found.");
        map.put(-5, "The Asset Delivery API is not available.");
        map.put(-6, "Network error. Unable to obtain the asset pack details.");
        map.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        map.put(-10, "Asset pack download failed due to insufficient storage.");
        map.put(-11, "The Play Store app is either not installed or not the official version.");
        map.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        map.put(-13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        map.put(-14, "Tried to show the confirmation dialog but no asset packs are waiting for user confirmation.");
        map.put(-14, "The installed app version was not installed by Play.");
        map.put(-100, "Unknown error downloading an asset pack.");
        map2.put(-1, "APP_UNAVAILABLE");
        map2.put(-2, "PACK_UNAVAILABLE");
        map2.put(-3, "INVALID_REQUEST");
        map2.put(-4, "DOWNLOAD_NOT_FOUND");
        map2.put(-5, "API_NOT_AVAILABLE");
        map2.put(-6, "NETWORK_ERROR");
        map2.put(-7, "ACCESS_DENIED");
        map2.put(-10, "INSUFFICIENT_STORAGE");
        map2.put(-11, "PLAY_STORE_NOT_FOUND");
        map2.put(-12, "NETWORK_UNRESTRICTED");
        map2.put(-13, "APP_NOT_OWNED");
        map2.put(-14, "CONFIRMATION_NOT_REQUIRED");
        map2.put(-15, "UNRECOGNIZED_INSTALLATION");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
