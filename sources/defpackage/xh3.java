package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xh3 {
    public static final xh3 a;
    public static final xh3 b;
    public static final xh3 c;
    public static final xh3 d;
    public static final /* synthetic */ xh3[] e;

    static {
        xh3 xh3Var = new xh3("Picker", 0);
        a = xh3Var;
        xh3 xh3Var2 = new xh3("Box", 1);
        b = xh3Var2;
        xh3 xh3Var3 = new xh3("Opening", 2);
        c = xh3Var3;
        xh3 xh3Var4 = new xh3("Vinyl", 3);
        d = xh3Var4;
        e = new xh3[]{xh3Var, xh3Var2, xh3Var3, xh3Var4};
    }

    public static xh3 valueOf(String str) {
        return (xh3) Enum.valueOf(xh3.class, str);
    }

    public static xh3[] values() {
        return (xh3[]) e.clone();
    }
}
