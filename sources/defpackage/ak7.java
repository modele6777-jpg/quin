package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ak7 {
    public static final ak7 a;
    public static final ak7 b;
    public static final ak7 c;
    public static final ak7 d;
    public static final ak7 e;
    public static final /* synthetic */ ak7[] f;

    static {
        ak7 ak7Var = new ak7("HIDDEN", 0);
        a = ak7Var;
        ak7 ak7Var2 = new ak7("VISIBLE", 1);
        b = ak7Var2;
        ak7 ak7Var3 = new ak7("DEPRECATED_LIST_METHODS", 2);
        c = ak7Var3;
        ak7 ak7Var4 = new ak7("NOT_CONSIDERED", 3);
        d = ak7Var4;
        ak7 ak7Var5 = new ak7("DROP", 4);
        e = ak7Var5;
        f = new ak7[]{ak7Var, ak7Var2, ak7Var3, ak7Var4, ak7Var5};
    }

    public static ak7 valueOf(String str) {
        return (ak7) Enum.valueOf(ak7.class, str);
    }

    public static ak7[] values() {
        return (ak7[]) f.clone();
    }
}
