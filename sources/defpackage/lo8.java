package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lo8 {
    public static final lo8 a;
    public static final lo8 b;
    public static final /* synthetic */ lo8[] c;

    static {
        lo8 lo8Var = new lo8("Min", 0);
        a = lo8Var;
        lo8 lo8Var2 = new lo8("Max", 1);
        b = lo8Var2;
        c = new lo8[]{lo8Var, lo8Var2};
    }

    public static lo8 valueOf(String str) {
        return (lo8) Enum.valueOf(lo8.class, str);
    }

    public static lo8[] values() {
        return (lo8[]) c.clone();
    }
}
