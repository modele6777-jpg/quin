package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hh6 {
    public static final hh6 a;
    public static final hh6 b;
    public static final hh6 c;
    public static final hh6 d;
    public static final /* synthetic */ hh6[] e;

    static {
        hh6 hh6Var = new hh6("Rigid", 0);
        a = hh6Var;
        hh6 hh6Var2 = new hh6("Medium", 1);
        b = hh6Var2;
        hh6 hh6Var3 = new hh6("Light", 2);
        c = hh6Var3;
        hh6 hh6Var4 = new hh6("Heavy", 3);
        hh6 hh6Var5 = new hh6("Selection", 4);
        d = hh6Var5;
        e = new hh6[]{hh6Var, hh6Var2, hh6Var3, hh6Var4, hh6Var5};
    }

    public static hh6 valueOf(String str) {
        return (hh6) Enum.valueOf(hh6.class, str);
    }

    public static hh6[] values() {
        return (hh6[]) e.clone();
    }
}
