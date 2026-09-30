package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tn4 {
    public static final tn4 a;
    public static final tn4 b;
    public static final tn4 c;
    public static final /* synthetic */ tn4[] d;

    static {
        tn4 tn4Var = new tn4("Shuffle", 0);
        a = tn4Var;
        tn4 tn4Var2 = new tn4("Pattern", 1);
        b = tn4Var2;
        tn4 tn4Var3 = new tn4("CircleCard", 2);
        c = tn4Var3;
        d = new tn4[]{tn4Var, tn4Var2, tn4Var3};
    }

    public static tn4 valueOf(String str) {
        return (tn4) Enum.valueOf(tn4.class, str);
    }

    public static tn4[] values() {
        return (tn4[]) d.clone();
    }
}
