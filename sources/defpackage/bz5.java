package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bz5 {
    public static final bz5 a;
    public static final bz5 b;
    public static final bz5 c;
    public static final bz5 d;
    public static final /* synthetic */ bz5[] e;

    static {
        bz5 bz5Var = new bz5("STARTED", 0);
        a = bz5Var;
        bz5 bz5Var2 = new bz5("FRAME_INFO_COMPLETE", 1);
        b = bz5Var2;
        bz5 bz5Var3 = new bz5("STREAM_RESULTS_COMPLETE", 2);
        c = bz5Var3;
        bz5 bz5Var4 = new bz5("COMPLETE", 3);
        d = bz5Var4;
        e = new bz5[]{bz5Var, bz5Var2, bz5Var3, bz5Var4};
    }

    public static bz5 valueOf(String str) {
        return (bz5) Enum.valueOf(bz5.class, str);
    }

    public static bz5[] values() {
        return (bz5[]) e.clone();
    }
}
