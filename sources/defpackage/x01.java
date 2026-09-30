package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x01 {
    public static final x01 a;
    public static final x01 b;
    public static final /* synthetic */ x01[] c;

    static {
        x01 x01Var = new x01("Start", 0);
        a = x01Var;
        x01 x01Var2 = new x01("End", 1);
        b = x01Var2;
        c = new x01[]{x01Var, x01Var2};
    }

    public static x01 valueOf(String str) {
        return (x01) Enum.valueOf(x01.class, str);
    }

    public static x01[] values() {
        return (x01[]) c.clone();
    }
}
