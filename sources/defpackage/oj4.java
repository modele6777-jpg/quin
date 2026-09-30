package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oj4 {
    public static final oj4 a;
    public static final oj4 b;
    public static final oj4 c;
    public static final /* synthetic */ oj4[] d;

    static {
        oj4 oj4Var = new oj4("Yes", 0);
        a = oj4Var;
        oj4 oj4Var2 = new oj4("No", 1);
        b = oj4Var2;
        oj4 oj4Var3 = new oj4("NotInitialized", 2);
        c = oj4Var3;
        d = new oj4[]{oj4Var, oj4Var2, oj4Var3};
    }

    public static oj4 valueOf(String str) {
        return (oj4) Enum.valueOf(oj4.class, str);
    }

    public static oj4[] values() {
        return (oj4[]) d.clone();
    }
}
