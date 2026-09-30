package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gx3 {
    public static final gx3 a;
    public static final /* synthetic */ gx3[] b;

    /* JADX INFO: Fake field, exist only in values array */
    gx3 EF0;

    static {
        gx3 gx3Var = new gx3("WARNING", 0);
        gx3 gx3Var2 = new gx3("ERROR", 1);
        a = gx3Var2;
        b = new gx3[]{gx3Var, gx3Var2, new gx3("HIDDEN", 2)};
    }

    public static gx3 valueOf(String str) {
        return (gx3) Enum.valueOf(gx3.class, str);
    }

    public static gx3[] values() {
        return (gx3[]) b.clone();
    }
}
