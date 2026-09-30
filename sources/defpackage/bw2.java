package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bw2 {
    public static final bw2 a;
    public static final bw2 b;
    public static final bw2 c;
    public static final /* synthetic */ bw2[] d;

    static {
        bw2 bw2Var = new bw2("COROUTINE_SUSPENDED", 0);
        a = bw2Var;
        bw2 bw2Var2 = new bw2("UNDECIDED", 1);
        b = bw2Var2;
        bw2 bw2Var3 = new bw2("RESUMED", 2);
        c = bw2Var3;
        d = new bw2[]{bw2Var, bw2Var2, bw2Var3};
    }

    public static bw2 valueOf(String str) {
        return (bw2) Enum.valueOf(bw2.class, str);
    }

    public static bw2[] values() {
        return (bw2[]) d.clone();
    }
}
