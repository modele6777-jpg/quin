package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eg6 {
    public static final eg6 a;
    public static final eg6 b;
    public static final /* synthetic */ eg6[] c;

    static {
        eg6 eg6Var = new eg6("Intro", 0);
        a = eg6Var;
        eg6 eg6Var2 = new eg6("Guide", 1);
        b = eg6Var2;
        c = new eg6[]{eg6Var, eg6Var2};
    }

    public static eg6 valueOf(String str) {
        return (eg6) Enum.valueOf(eg6.class, str);
    }

    public static eg6[] values() {
        return (eg6[]) c.clone();
    }
}
