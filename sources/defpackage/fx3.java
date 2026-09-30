package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fx3 {
    public static final fx3 a;
    public static final fx3 b;
    public static final fx3 c;
    public static final /* synthetic */ fx3[] d;

    static {
        fx3 fx3Var = new fx3("WARNING", 0);
        a = fx3Var;
        fx3 fx3Var2 = new fx3("ERROR", 1);
        b = fx3Var2;
        fx3 fx3Var3 = new fx3("HIDDEN", 2);
        c = fx3Var3;
        d = new fx3[]{fx3Var, fx3Var2, fx3Var3};
    }

    public static fx3 valueOf(String str) {
        return (fx3) Enum.valueOf(fx3.class, str);
    }

    public static fx3[] values() {
        return (fx3[]) d.clone();
    }
}
