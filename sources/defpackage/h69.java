package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h69 {
    public static final h69 a;
    public static final h69 b;
    public static final /* synthetic */ h69[] c;

    static {
        h69 h69Var = new h69("READ_ONLY", 0);
        a = h69Var;
        h69 h69Var2 = new h69("MUTABLE", 1);
        b = h69Var2;
        c = new h69[]{h69Var, h69Var2};
    }

    public static h69 valueOf(String str) {
        return (h69) Enum.valueOf(h69.class, str);
    }

    public static h69[] values() {
        return (h69[]) c.clone();
    }
}
