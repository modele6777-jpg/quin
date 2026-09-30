package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum r8a {
    SystemDialog("system_dialog"),
    SystemSettings("system_settings");

    private final String wireValue;

    r8a(String str) {
        this.wireValue = str;
    }

    public final String a() {
        return this.wireValue;
    }
}
