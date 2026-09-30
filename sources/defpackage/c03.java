package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c03 {
    public static final c03 a;
    public static final c03 b;
    public static final c03 c;
    public static final /* synthetic */ c03[] d;

    static {
        c03 c03Var = new c03("CROSSED", 0);
        a = c03Var;
        c03 c03Var2 = new c03("NOT_CROSSED", 1);
        b = c03Var2;
        c03 c03Var3 = new c03("COLLAPSED", 2);
        c = c03Var3;
        d = new c03[]{c03Var, c03Var2, c03Var3};
    }

    public static c03 valueOf(String str) {
        return (c03) Enum.valueOf(c03.class, str);
    }

    public static c03[] values() {
        return (c03[]) d.clone();
    }
}
