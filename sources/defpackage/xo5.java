package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xo5 {
    public static final xo5 a;
    public static final xo5 b;
    public static final /* synthetic */ xo5[] c;

    static {
        xo5 xo5Var = new xo5("Deleted", 0);
        a = xo5Var;
        xo5 xo5Var2 = new xo5("Unavailable", 1);
        b = xo5Var2;
        c = new xo5[]{xo5Var, xo5Var2};
    }

    public static xo5 valueOf(String str) {
        return (xo5) Enum.valueOf(xo5.class, str);
    }

    public static xo5[] values() {
        return (xo5[]) c.clone();
    }
}
