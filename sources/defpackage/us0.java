package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 {
    public static final us0 a;
    public static final us0 b;
    public static final /* synthetic */ us0[] c;

    static {
        us0 us0Var = new us0("EXPONENTIAL", 0);
        a = us0Var;
        us0 us0Var2 = new us0("LINEAR", 1);
        b = us0Var2;
        c = new us0[]{us0Var, us0Var2};
    }

    public static us0 valueOf(String str) {
        return (us0) Enum.valueOf(us0.class, str);
    }

    public static us0[] values() {
        return (us0[]) c.clone();
    }
}
