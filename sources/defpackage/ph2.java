package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ph2 {
    public static final ph2 a;
    public static final ph2 b;
    public static final ph2 c;
    public static final ph2 d;
    public static final /* synthetic */ ph2[] e;

    static {
        ph2 ph2Var = new ph2("ALWAYS_OVERRIDE", 0);
        a = ph2Var;
        ph2 ph2Var2 = new ph2("HIGH_PRIORITY_REQUIRED", 1);
        b = ph2Var2;
        ph2 ph2Var3 = new ph2("REQUIRED", 2);
        c = ph2Var3;
        ph2 ph2Var4 = new ph2("OPTIONAL", 3);
        d = ph2Var4;
        e = new ph2[]{ph2Var, ph2Var2, ph2Var3, ph2Var4};
    }

    public static ph2 valueOf(String str) {
        return (ph2) Enum.valueOf(ph2.class, str);
    }

    public static ph2[] values() {
        return (ph2[]) e.clone();
    }
}
