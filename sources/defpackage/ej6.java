package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ej6 {
    public static final ej6 a;
    public static final ej6 b;
    public static final ej6 c;
    public static final /* synthetic */ ej6[] d;

    static {
        ej6 ej6Var = new ej6("Idle", 0);
        a = ej6Var;
        ej6 ej6Var2 = new ej6("InFlight", 1);
        b = ej6Var2;
        ej6 ej6Var3 = new ej6("Departed", 2);
        c = ej6Var3;
        d = new ej6[]{ej6Var, ej6Var2, ej6Var3};
    }

    public static ej6 valueOf(String str) {
        return (ej6) Enum.valueOf(ej6.class, str);
    }

    public static ej6[] values() {
        return (ej6[]) d.clone();
    }
}
