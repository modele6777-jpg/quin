package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uf7 {
    public static final uf7 a;
    public static final uf7 b;
    public static final uf7 c;
    public static final /* synthetic */ uf7[] d;

    static {
        uf7 uf7Var = new uf7("INFLEXIBLE", 0);
        a = uf7Var;
        uf7 uf7Var2 = new uf7("FLEXIBLE_UPPER_BOUND", 1);
        b = uf7Var2;
        uf7 uf7Var3 = new uf7("FLEXIBLE_LOWER_BOUND", 2);
        c = uf7Var3;
        d = new uf7[]{uf7Var, uf7Var2, uf7Var3};
    }

    public static uf7 valueOf(String str) {
        return (uf7) Enum.valueOf(uf7.class, str);
    }

    public static uf7[] values() {
        return (uf7[]) d.clone();
    }
}
