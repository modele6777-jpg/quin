package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g06 {
    public static final g06 a;
    public static final g06 b;
    public static final g06 c;
    public static final /* synthetic */ g06[] d;

    static {
        g06 g06Var = new g06("Monthly", 0);
        a = g06Var;
        g06 g06Var2 = new g06("Annual", 1);
        b = g06Var2;
        g06 g06Var3 = new g06("Unspecified", 2);
        c = g06Var3;
        d = new g06[]{g06Var, g06Var2, g06Var3};
    }

    public static g06 valueOf(String str) {
        return (g06) Enum.valueOf(g06.class, str);
    }

    public static g06[] values() {
        return (g06[]) d.clone();
    }
}
