package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cg9 {
    public static final cg9 a;
    public static final cg9 b;
    public static final /* synthetic */ cg9[] c;

    static {
        cg9 cg9Var = new cg9("Width", 0);
        a = cg9Var;
        cg9 cg9Var2 = new cg9("Height", 1);
        b = cg9Var2;
        c = new cg9[]{cg9Var, cg9Var2};
    }

    public static cg9 valueOf(String str) {
        return (cg9) Enum.valueOf(cg9.class, str);
    }

    public static cg9[] values() {
        return (cg9[]) c.clone();
    }
}
