package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qg8 {
    public static final qg8 a;
    public static final qg8 b;
    public static final qg8 c;
    public static final /* synthetic */ qg8[] d;

    static {
        qg8 qg8Var = new qg8("IsPlacedInLookahead", 0);
        a = qg8Var;
        qg8 qg8Var2 = new qg8("IsPlacedInApproach", 1);
        b = qg8Var2;
        qg8 qg8Var3 = new qg8("IsNotPlaced", 2);
        c = qg8Var3;
        d = new qg8[]{qg8Var, qg8Var2, qg8Var3};
    }

    public static qg8 valueOf(String str) {
        return (qg8) Enum.valueOf(qg8.class, str);
    }

    public static qg8[] values() {
        return (qg8[]) d.clone();
    }
}
