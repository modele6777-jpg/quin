package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lp7 {
    public static final lp7 a;
    public static final lp7 b;
    public static final /* synthetic */ lp7[] c;

    static {
        lp7 lp7Var = new lp7("Singleton", 0);
        a = lp7Var;
        lp7 lp7Var2 = new lp7("Factory", 1);
        b = lp7Var2;
        c = new lp7[]{lp7Var, lp7Var2, new lp7("Scoped", 2)};
    }

    public static lp7 valueOf(String str) {
        return (lp7) Enum.valueOf(lp7.class, str);
    }

    public static lp7[] values() {
        return (lp7[]) c.clone();
    }
}
