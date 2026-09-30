package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dr7 {
    public static final dr7 a;
    public static final dr7 b;
    public static final dr7 c;
    public static final /* synthetic */ dr7[] d;

    static {
        dr7 dr7Var = new dr7("WARNING", 0);
        a = dr7Var;
        dr7 dr7Var2 = new dr7("ERROR", 1);
        b = dr7Var2;
        dr7 dr7Var3 = new dr7("HIDDEN", 2);
        c = dr7Var3;
        d = new dr7[]{dr7Var, dr7Var2, dr7Var3};
    }

    public static dr7 valueOf(String str) {
        return (dr7) Enum.valueOf(dr7.class, str);
    }

    public static dr7[] values() {
        return (dr7[]) d.clone();
    }
}
