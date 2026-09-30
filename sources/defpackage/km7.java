package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class km7 {
    public static final km7 a;
    public static final km7 b;
    public static final /* synthetic */ km7[] c;

    static {
        km7 km7Var = new km7("DECLARED", 0);
        a = km7Var;
        km7 km7Var2 = new km7("INHERITED", 1);
        b = km7Var2;
        c = new km7[]{km7Var, km7Var2};
    }

    public static km7 valueOf(String str) {
        return (km7) Enum.valueOf(km7.class, str);
    }

    public static km7[] values() {
        return (km7[]) c.clone();
    }
}
