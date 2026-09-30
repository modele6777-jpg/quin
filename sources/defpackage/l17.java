package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l17 {
    public static final l17 a;
    public static final l17 b;
    public static final l17 c;
    public static final l17 d;
    public static final /* synthetic */ l17[] e;

    static {
        l17 l17Var = new l17("Untransformed", 0);
        a = l17Var;
        l17 l17Var2 = new l17("Insertion", 1);
        b = l17Var2;
        l17 l17Var3 = new l17("Replacement", 2);
        c = l17Var3;
        l17 l17Var4 = new l17("Deletion", 3);
        d = l17Var4;
        e = new l17[]{l17Var, l17Var2, l17Var3, l17Var4};
    }

    public static l17 valueOf(String str) {
        return (l17) Enum.valueOf(l17.class, str);
    }

    public static l17[] values() {
        return (l17[]) e.clone();
    }
}
