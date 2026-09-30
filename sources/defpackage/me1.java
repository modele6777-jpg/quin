package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class me1 {
    public static final me1 a;
    public static final me1 b;
    public static final me1 c;
    public static final me1 d;
    public static final me1 e;
    public static final /* synthetic */ me1[] f;

    static {
        me1 me1Var = new me1("UNKNOWN", 0);
        a = me1Var;
        me1 me1Var2 = new me1("INACTIVE", 1);
        b = me1Var2;
        me1 me1Var3 = new me1("METERING", 2);
        c = me1Var3;
        me1 me1Var4 = new me1("CONVERGED", 3);
        d = me1Var4;
        me1 me1Var5 = new me1("LOCKED", 4);
        e = me1Var5;
        f = new me1[]{me1Var, me1Var2, me1Var3, me1Var4, me1Var5};
    }

    public static me1 valueOf(String str) {
        return (me1) Enum.valueOf(me1.class, str);
    }

    public static me1[] values() {
        return (me1[]) f.clone();
    }
}
