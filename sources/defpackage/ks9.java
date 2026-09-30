package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ks9 {
    public static final ks9 a;
    public static final ks9 b;
    public static final /* synthetic */ ks9[] c;

    static {
        ks9 ks9Var = new ks9("Vertical", 0);
        a = ks9Var;
        ks9 ks9Var2 = new ks9("Horizontal", 1);
        b = ks9Var2;
        c = new ks9[]{ks9Var, ks9Var2};
    }

    public static ks9 valueOf(String str) {
        return (ks9) Enum.valueOf(ks9.class, str);
    }

    public static ks9[] values() {
        return (ks9[]) c.clone();
    }
}
