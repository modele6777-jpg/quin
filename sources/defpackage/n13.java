package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n13 {
    public static final n13 a;
    public static final n13 b;
    public static final n13 c;
    public static final /* synthetic */ n13[] d;

    static {
        n13 n13Var = new n13("None", 0);
        a = n13Var;
        n13 n13Var2 = new n13("Cancelled", 1);
        b = n13Var2;
        n13 n13Var3 = new n13("Redirected", 2);
        c = n13Var3;
        d = new n13[]{n13Var, n13Var2, n13Var3, new n13("RedirectCancelled", 3)};
    }

    public static n13 valueOf(String str) {
        return (n13) Enum.valueOf(n13.class, str);
    }

    public static n13[] values() {
        return (n13[]) d.clone();
    }
}
