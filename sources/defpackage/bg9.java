package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bg9 {
    public static final bg9 a;
    public static final bg9 b;
    public static final /* synthetic */ bg9[] c;

    static {
        bg9 bg9Var = new bg9("Min", 0);
        a = bg9Var;
        bg9 bg9Var2 = new bg9("Max", 1);
        b = bg9Var2;
        c = new bg9[]{bg9Var, bg9Var2};
    }

    public static bg9 valueOf(String str) {
        return (bg9) Enum.valueOf(bg9.class, str);
    }

    public static bg9[] values() {
        return (bg9[]) c.clone();
    }
}
