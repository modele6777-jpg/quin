package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ep5 {
    public static final ep5 a;
    public static final ep5 b;
    public static final /* synthetic */ ep5[] c;

    static {
        ep5 ep5Var = new ep5("Upgrade", 0);
        a = ep5Var;
        ep5 ep5Var2 = new ep5("Renew", 1);
        b = ep5Var2;
        c = new ep5[]{ep5Var, ep5Var2};
    }

    public static ep5 valueOf(String str) {
        return (ep5) Enum.valueOf(ep5.class, str);
    }

    public static ep5[] values() {
        return (ep5[]) c.clone();
    }
}
