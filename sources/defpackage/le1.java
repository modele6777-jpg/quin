package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class le1 {
    public static final le1 a;
    public static final le1 b;
    public static final le1 c;
    public static final le1 d;
    public static final le1 e;
    public static final le1 f;
    public static final le1 g;
    public static final /* synthetic */ le1[] v;

    static {
        le1 le1Var = new le1("UNKNOWN", 0);
        a = le1Var;
        le1 le1Var2 = new le1("INACTIVE", 1);
        b = le1Var2;
        le1 le1Var3 = new le1("SCANNING", 2);
        c = le1Var3;
        le1 le1Var4 = new le1("PASSIVE_FOCUSED", 3);
        d = le1Var4;
        le1 le1Var5 = new le1("PASSIVE_NOT_FOCUSED", 4);
        e = le1Var5;
        le1 le1Var6 = new le1("LOCKED_FOCUSED", 5);
        f = le1Var6;
        le1 le1Var7 = new le1("LOCKED_NOT_FOCUSED", 6);
        g = le1Var7;
        v = new le1[]{le1Var, le1Var2, le1Var3, le1Var4, le1Var5, le1Var6, le1Var7};
    }

    public static le1 valueOf(String str) {
        return (le1) Enum.valueOf(le1.class, str);
    }

    public static le1[] values() {
        return (le1[]) v.clone();
    }
}
