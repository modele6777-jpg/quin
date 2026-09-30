package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class er7 {
    public static final er7 a;
    public static final er7 b;
    public static final er7 c;
    public static final er7 d;
    public static final /* synthetic */ er7[] e;

    static {
        er7 er7Var = new er7("LANGUAGE_VERSION", 0);
        a = er7Var;
        er7 er7Var2 = new er7("COMPILER_VERSION", 1);
        b = er7Var2;
        er7 er7Var3 = new er7("API_VERSION", 2);
        c = er7Var3;
        er7 er7Var4 = new er7("UNKNOWN", 3);
        d = er7Var4;
        e = new er7[]{er7Var, er7Var2, er7Var3, er7Var4};
    }

    public static er7 valueOf(String str) {
        return (er7) Enum.valueOf(er7.class, str);
    }

    public static er7[] values() {
        return (er7[]) e.clone();
    }
}
