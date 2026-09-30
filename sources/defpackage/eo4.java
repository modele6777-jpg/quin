package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eo4 {
    public static final eo4 a;
    public static final eo4 b;
    public static final /* synthetic */ eo4[] c;

    static {
        eo4 eo4Var = new eo4("Closed", 0);
        a = eo4Var;
        eo4 eo4Var2 = new eo4("Open", 1);
        b = eo4Var2;
        c = new eo4[]{eo4Var, eo4Var2};
    }

    public static eo4 valueOf(String str) {
        return (eo4) Enum.valueOf(eo4.class, str);
    }

    public static eo4[] values() {
        return (eo4[]) c.clone();
    }
}
