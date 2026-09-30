package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zdc {
    public static final zdc a;
    public static final zdc b;
    public static final /* synthetic */ zdc[] c;

    static {
        zdc zdcVar = new zdc("FILL", 0);
        a = zdcVar;
        zdc zdcVar2 = new zdc("FIT", 1);
        b = zdcVar2;
        c = new zdc[]{zdcVar, zdcVar2};
    }

    public static zdc valueOf(String str) {
        return (zdc) Enum.valueOf(zdc.class, str);
    }

    public static zdc[] values() {
        return (zdc[]) c.clone();
    }
}
