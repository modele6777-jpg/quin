package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v50 {
    public static final v50 a;
    public static final v50 b;
    public static final v50 c;
    public static final v50 d;
    public static final v50 e;
    public static final v50 f;
    public static final /* synthetic */ v50[] g;

    static {
        v50 v50Var = new v50("NOT_PURCHASED", 0);
        a = v50Var;
        v50 v50Var2 = new v50("NOT_STARTED", 1);
        b = v50Var2;
        v50 v50Var3 = new v50("MONTHLY_DRAWN", 2);
        c = v50Var3;
        v50 v50Var4 = new v50("MONTHLY_COMPLETED", 3);
        d = v50Var4;
        v50 v50Var5 = new v50("DOMAIN_DRAWN", 4);
        e = v50Var5;
        v50 v50Var6 = new v50("COMPLETED", 5);
        f = v50Var6;
        g = new v50[]{v50Var, v50Var2, v50Var3, v50Var4, v50Var5, v50Var6};
    }

    public static v50 valueOf(String str) {
        return (v50) Enum.valueOf(v50.class, str);
    }

    public static v50[] values() {
        return (v50[]) g.clone();
    }
}
