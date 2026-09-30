package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xf1 {
    public static final xf1 a;
    public static final /* synthetic */ xf1[] b;

    static {
        xf1 xf1Var = new xf1("AT_LEAST", 0);
        a = xf1Var;
        b = new xf1[]{xf1Var, new xf1("EXACT", 1)};
    }

    public static xf1 valueOf(String str) {
        return (xf1) Enum.valueOf(xf1.class, str);
    }

    public static xf1[] values() {
        return (xf1[]) b.clone();
    }
}
