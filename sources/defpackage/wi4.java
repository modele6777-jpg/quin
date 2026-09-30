package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wi4 {
    public static final wi4 a;
    public static final wi4 b;
    public static final wi4 c;
    public static final wi4 d;
    public static final /* synthetic */ wi4[] e;

    static {
        wi4 wi4Var = new wi4("Up", 0);
        a = wi4Var;
        wi4 wi4Var2 = new wi4("Drag", 1);
        b = wi4Var2;
        wi4 wi4Var3 = new wi4("Timeout", 2);
        c = wi4Var3;
        wi4 wi4Var4 = new wi4("Cancel", 3);
        d = wi4Var4;
        e = new wi4[]{wi4Var, wi4Var2, wi4Var3, wi4Var4};
    }

    public static wi4 valueOf(String str) {
        return (wi4) Enum.valueOf(wi4.class, str);
    }

    public static wi4[] values() {
        return (wi4[]) e.clone();
    }
}
