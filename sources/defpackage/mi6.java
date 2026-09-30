package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mi6 {
    public static final mi6 a;
    public static final mi6 b;
    public static final /* synthetic */ mi6[] c;

    static {
        mi6 mi6Var = new mi6("Effect", 0);
        a = mi6Var;
        mi6 mi6Var2 = new mi6("Source", 1);
        b = mi6Var2;
        c = new mi6[]{mi6Var, mi6Var2};
    }

    public static mi6 valueOf(String str) {
        return (mi6) Enum.valueOf(mi6.class, str);
    }

    public static mi6[] values() {
        return (mi6[]) c.clone();
    }
}
