package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p47 {
    public static final p47 a;
    public static final p47 b;
    public static final p47 c;
    public static final /* synthetic */ p47[] d;

    static {
        p47 p47Var = new p47("Focused", 0);
        a = p47Var;
        p47 p47Var2 = new p47("UnfocusedEmpty", 1);
        b = p47Var2;
        p47 p47Var3 = new p47("UnfocusedNotEmpty", 2);
        c = p47Var3;
        d = new p47[]{p47Var, p47Var2, p47Var3};
    }

    public static p47 valueOf(String str) {
        return (p47) Enum.valueOf(p47.class, str);
    }

    public static p47[] values() {
        return (p47[]) d.clone();
    }
}
