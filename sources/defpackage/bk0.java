package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bk0 {
    public static final bk0 a;
    public static final bk0 b;
    public static final bk0 c;
    public static final /* synthetic */ bk0[] d;

    static {
        bk0 bk0Var = new bk0("IDLE", 0);
        a = bk0Var;
        bk0 bk0Var2 = new bk0("RECORDING", 1);
        b = bk0Var2;
        bk0 bk0Var3 = new bk0("STOPPED", 2);
        c = bk0Var3;
        d = new bk0[]{bk0Var, bk0Var2, bk0Var3};
    }

    public static bk0 valueOf(String str) {
        return (bk0) Enum.valueOf(bk0.class, str);
    }

    public static bk0[] values() {
        return (bk0[]) d.clone();
    }
}
