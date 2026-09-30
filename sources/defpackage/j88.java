package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j88 {
    public static final j88 a;
    public static final j88 b;
    public static final /* synthetic */ j88[] c;

    static {
        j88 j88Var = new j88("Ordered", 0);
        a = j88Var;
        j88 j88Var2 = new j88("Unordered", 1);
        b = j88Var2;
        c = new j88[]{j88Var, j88Var2};
    }

    public static j88 valueOf(String str) {
        return (j88) Enum.valueOf(j88.class, str);
    }

    public static j88[] values() {
        return (j88[]) c.clone();
    }
}
