package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fe8 {
    public static final fe8 a;
    public static final fe8 b;
    public static final fe8 c;
    public static final /* synthetic */ fe8[] d;

    static {
        fe8 fe8Var = new fe8("NOT_COMPUTED", 0);
        a = fe8Var;
        fe8 fe8Var2 = new fe8("COMPUTING", 1);
        b = fe8Var2;
        fe8 fe8Var3 = new fe8("RECURSION_WAS_DETECTED", 2);
        c = fe8Var3;
        d = new fe8[]{fe8Var, fe8Var2, fe8Var3};
    }

    public static fe8 valueOf(String str) {
        return (fe8) Enum.valueOf(fe8.class, str);
    }

    public static fe8[] values() {
        return (fe8[]) d.clone();
    }
}
