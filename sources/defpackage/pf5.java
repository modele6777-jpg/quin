package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pf5 {
    public static final pf5 a;
    public static final pf5 b;
    public static final pf5 c;
    public static final /* synthetic */ pf5[] d;

    static {
        pf5 pf5Var = new pf5("BAD_CONFIG", 0);
        a = pf5Var;
        pf5 pf5Var2 = new pf5("UNAVAILABLE", 1);
        b = pf5Var2;
        pf5 pf5Var3 = new pf5("TOO_MANY_REQUESTS", 2);
        c = pf5Var3;
        d = new pf5[]{pf5Var, pf5Var2, pf5Var3};
    }

    public static pf5 valueOf(String str) {
        return (pf5) Enum.valueOf(pf5.class, str);
    }

    public static pf5[] values() {
        return (pf5[]) d.clone();
    }
}
