package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qe9 {
    public static final qe9 a;
    public static final qe9 b;
    public static final qe9 c;
    public static final qe9 d;
    public static final qe9 e;
    public static final qe9 f;
    public static final /* synthetic */ qe9[] g;

    static {
        qe9 qe9Var = new qe9("NOT_REQUIRED", 0);
        a = qe9Var;
        qe9 qe9Var2 = new qe9("CONNECTED", 1);
        b = qe9Var2;
        qe9 qe9Var3 = new qe9("UNMETERED", 2);
        c = qe9Var3;
        qe9 qe9Var4 = new qe9("NOT_ROAMING", 3);
        d = qe9Var4;
        qe9 qe9Var5 = new qe9("METERED", 4);
        e = qe9Var5;
        qe9 qe9Var6 = new qe9("TEMPORARILY_UNMETERED", 5);
        f = qe9Var6;
        g = new qe9[]{qe9Var, qe9Var2, qe9Var3, qe9Var4, qe9Var5, qe9Var6};
    }

    public static qe9 valueOf(String str) {
        return (qe9) Enum.valueOf(qe9.class, str);
    }

    public static qe9[] values() {
        return (qe9[]) g.clone();
    }
}
