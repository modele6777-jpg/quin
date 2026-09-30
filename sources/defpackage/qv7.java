package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qv7 {
    public static final qv7 a;
    public static final qv7 b;
    public static final qv7 c;
    public static final qv7 d;
    public static final qv7 e;
    public static final /* synthetic */ qv7[] f;

    static {
        qv7 qv7Var = new qv7("Measuring", 0);
        a = qv7Var;
        qv7 qv7Var2 = new qv7("LookaheadMeasuring", 1);
        b = qv7Var2;
        qv7 qv7Var3 = new qv7("LayingOut", 2);
        c = qv7Var3;
        qv7 qv7Var4 = new qv7("LookaheadLayingOut", 3);
        d = qv7Var4;
        qv7 qv7Var5 = new qv7("Idle", 4);
        e = qv7Var5;
        f = new qv7[]{qv7Var, qv7Var2, qv7Var3, qv7Var4, qv7Var5};
    }

    public static qv7 valueOf(String str) {
        return (qv7) Enum.valueOf(qv7.class, str);
    }

    public static qv7[] values() {
        return (qv7[]) f.clone();
    }
}
