package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t39 {
    public static final t39 a;
    public static final t39 b;
    public static final t39 c;
    public static final t39 d;
    public static final t39 e;
    public static final /* synthetic */ t39[] f;

    static {
        t39 t39Var = new t39("DefaultSpatial", 0);
        a = t39Var;
        t39 t39Var2 = new t39("FastSpatial", 1);
        b = t39Var2;
        t39 t39Var3 = new t39("SlowSpatial", 2);
        t39 t39Var4 = new t39("DefaultEffects", 3);
        c = t39Var4;
        t39 t39Var5 = new t39("FastEffects", 4);
        d = t39Var5;
        t39 t39Var6 = new t39("SlowEffects", 5);
        e = t39Var6;
        f = new t39[]{t39Var, t39Var2, t39Var3, t39Var4, t39Var5, t39Var6};
    }

    public static t39 valueOf(String str) {
        return (t39) Enum.valueOf(t39.class, str);
    }

    public static t39[] values() {
        return (t39[]) f.clone();
    }
}
