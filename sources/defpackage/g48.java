package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g48 {
    public static final g48 a;
    public static final g48 b;
    public static final g48 c;
    public static final g48 d;
    public static final g48 e;
    public static final /* synthetic */ g48[] f;

    static {
        g48 g48Var = new g48("DESTROYED", 0);
        a = g48Var;
        g48 g48Var2 = new g48("INITIALIZED", 1);
        b = g48Var2;
        g48 g48Var3 = new g48("CREATED", 2);
        c = g48Var3;
        g48 g48Var4 = new g48("STARTED", 3);
        d = g48Var4;
        g48 g48Var5 = new g48("RESUMED", 4);
        e = g48Var5;
        f = new g48[]{g48Var, g48Var2, g48Var3, g48Var4, g48Var5};
    }

    public static g48 valueOf(String str) {
        return (g48) Enum.valueOf(g48.class, str);
    }

    public static g48[] values() {
        return (g48[]) f.clone();
    }

    public final boolean a(g48 g48Var) {
        return compareTo(g48Var) >= 0;
    }
}
