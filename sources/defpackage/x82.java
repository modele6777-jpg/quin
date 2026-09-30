package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x82 {
    public static final x82 a;
    public static final x82 b;
    public static final /* synthetic */ x82[] c;

    static {
        x82 x82Var = new x82("TopAndBottom", 0);
        a = x82Var;
        x82 x82Var2 = new x82("Fill", 1);
        b = x82Var2;
        c = new x82[]{x82Var, x82Var2};
    }

    public static x82 valueOf(String str) {
        return (x82) Enum.valueOf(x82.class, str);
    }

    public static x82[] values() {
        return (x82[]) c.clone();
    }
}
