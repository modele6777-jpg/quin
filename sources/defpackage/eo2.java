package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eo2 {
    public static final eo2 a;
    public static final eo2 b;
    public static final eo2 c;
    public static final /* synthetic */ eo2[] d;

    static {
        eo2 eo2Var = new eo2("ACTIVE", 0);
        a = eo2Var;
        eo2 eo2Var2 = new eo2("TERMINATED", 1);
        b = eo2Var2;
        eo2 eo2Var3 = new eo2("UNKNOWN", 2);
        c = eo2Var3;
        d = new eo2[]{eo2Var, eo2Var2, eo2Var3};
    }

    public static eo2 valueOf(String str) {
        return (eo2) Enum.valueOf(eo2.class, str);
    }

    public static eo2[] values() {
        return (eo2[]) d.clone();
    }
}
