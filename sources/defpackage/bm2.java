package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bm2 {
    public static final bm2 a;
    public static final bm2 b;
    public static final /* synthetic */ bm2[] c;

    static {
        bm2 bm2Var = new bm2("VIEW_APPEAR", 0);
        a = bm2Var;
        bm2 bm2Var2 = new bm2("VIEW_DISAPPEAR", 1);
        b = bm2Var2;
        c = new bm2[]{bm2Var, bm2Var2};
    }

    public static bm2 valueOf(String str) {
        return (bm2) Enum.valueOf(bm2.class, str);
    }

    public static bm2[] values() {
        return (bm2[]) c.clone();
    }
}
