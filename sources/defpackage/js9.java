package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class js9 {
    public static final js9 a;
    public static final js9 b;
    public static final /* synthetic */ js9[] c;

    static {
        js9 js9Var = new js9("PORTRAIT", 0);
        a = js9Var;
        js9 js9Var2 = new js9("LANDSCAPE", 1);
        b = js9Var2;
        c = new js9[]{js9Var, js9Var2, new js9("SQUARE", 2)};
    }

    public static js9 valueOf(String str) {
        return (js9) Enum.valueOf(js9.class, str);
    }

    public static js9[] values() {
        return (js9[]) c.clone();
    }
}
