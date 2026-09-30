package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ia7 {
    public static final ia7 a;
    public static final ia7 b;
    public static final /* synthetic */ ia7[] c;

    static {
        ia7 ia7Var = new ia7("Min", 0);
        a = ia7Var;
        ia7 ia7Var2 = new ia7("Max", 1);
        b = ia7Var2;
        c = new ia7[]{ia7Var, ia7Var2};
    }

    public static ia7 valueOf(String str) {
        return (ia7) Enum.valueOf(ia7.class, str);
    }

    public static ia7[] values() {
        return (ia7[]) c.clone();
    }
}
