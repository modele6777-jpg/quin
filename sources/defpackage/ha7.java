package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ha7 {
    public static final ha7 a;
    public static final ha7 b;
    public static final /* synthetic */ ha7[] c;

    static {
        ha7 ha7Var = new ha7("Min", 0);
        a = ha7Var;
        ha7 ha7Var2 = new ha7("Max", 1);
        b = ha7Var2;
        c = new ha7[]{ha7Var, ha7Var2};
    }

    public static ha7 valueOf(String str) {
        return (ha7) Enum.valueOf(ha7.class, str);
    }

    public static ha7[] values() {
        return (ha7[]) c.clone();
    }
}
