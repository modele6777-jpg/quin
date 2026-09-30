package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qp1 {
    public static final qp1 a;
    public static final qp1 b;
    public static final qp1 c;
    public static final qp1 d;
    public static final qp1 e;
    public static final qp1 f;
    public static final qp1 g;
    public static final qp1 v;
    public static final /* synthetic */ qp1[] w;

    static {
        qp1 qp1Var = new qp1("WaitingForDissolve", 0);
        a = qp1Var;
        qp1 qp1Var2 = new qp1("WaitingForCardBack", 1);
        b = qp1Var2;
        qp1 qp1Var3 = new qp1("Shuffling", 2);
        c = qp1Var3;
        qp1 qp1Var4 = new qp1("Gathering", 3);
        d = qp1Var4;
        qp1 qp1Var5 = new qp1("Spreading", 4);
        e = qp1Var5;
        qp1 qp1Var6 = new qp1("Drawing", 5);
        f = qp1Var6;
        qp1 qp1Var7 = new qp1("Ready", 6);
        g = qp1Var7;
        qp1 qp1Var8 = new qp1("Navigating", 7);
        v = qp1Var8;
        w = new qp1[]{qp1Var, qp1Var2, qp1Var3, qp1Var4, qp1Var5, qp1Var6, qp1Var7, qp1Var8};
    }

    public static qp1 valueOf(String str) {
        return (qp1) Enum.valueOf(qp1.class, str);
    }

    public static qp1[] values() {
        return (qp1[]) w.clone();
    }
}
