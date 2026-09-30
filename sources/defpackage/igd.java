package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class igd {
    public static final igd a;
    public static final igd b;
    public static final /* synthetic */ igd[] c;

    static {
        igd igdVar = new igd("Authentication", 0);
        a = igdVar;
        igd igdVar2 = new igd("PhoneBinding", 1);
        b = igdVar2;
        c = new igd[]{igdVar, igdVar2};
    }

    public static igd valueOf(String str) {
        return (igd) Enum.valueOf(igd.class, str);
    }

    public static igd[] values() {
        return (igd[]) c.clone();
    }
}
