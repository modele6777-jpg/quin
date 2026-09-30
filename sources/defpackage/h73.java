package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h73 {
    public static final h73 a;
    public static final h73 b;
    public static final /* synthetic */ h73[] c;

    static {
        h73 h73Var = new h73("Today", 0);
        a = h73Var;
        h73 h73Var2 = new h73("Tomorrow", 1);
        b = h73Var2;
        c = new h73[]{h73Var, h73Var2};
    }

    public static h73 valueOf(String str) {
        return (h73) Enum.valueOf(h73.class, str);
    }

    public static h73[] values() {
        return (h73[]) c.clone();
    }
}
