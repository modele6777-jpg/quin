package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ho1 {
    public static final ho1 a;
    public static final ho1 b;
    public static final ho1 c;
    public static final ho1 d;
    public static final ho1 e;
    public static final /* synthetic */ ho1[] f;

    static {
        ho1 ho1Var = new ho1("PENDING", 0);
        a = ho1Var;
        ho1 ho1Var2 = new ho1("CREATING", 1);
        b = ho1Var2;
        ho1 ho1Var3 = new ho1("CREATED", 2);
        c = ho1Var3;
        ho1 ho1Var4 = new ho1("CLOSING", 3);
        d = ho1Var4;
        ho1 ho1Var5 = new ho1("CLOSED", 4);
        e = ho1Var5;
        f = new ho1[]{ho1Var, ho1Var2, ho1Var3, ho1Var4, ho1Var5};
    }

    public static ho1 valueOf(String str) {
        return (ho1) Enum.valueOf(ho1.class, str);
    }

    public static ho1[] values() {
        return (ho1[]) f.clone();
    }
}
