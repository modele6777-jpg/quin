package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hh3 {
    public static final hh3 a;
    public static final hh3 b;
    public static final hh3 c;
    public static final /* synthetic */ hh3[] d;

    static {
        hh3 hh3Var = new hh3("InDate", 0);
        a = hh3Var;
        hh3 hh3Var2 = new hh3("MonthDate", 1);
        b = hh3Var2;
        hh3 hh3Var3 = new hh3("OutDate", 2);
        c = hh3Var3;
        d = new hh3[]{hh3Var, hh3Var2, hh3Var3};
    }

    public static hh3 valueOf(String str) {
        return (hh3) Enum.valueOf(hh3.class, str);
    }

    public static hh3[] values() {
        return (hh3[]) d.clone();
    }
}
