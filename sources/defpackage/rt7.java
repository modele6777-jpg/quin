package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rt7 {
    public static final rt7 a;
    public static final rt7 b;
    public static final rt7 c;
    public static final /* synthetic */ rt7[] d;

    static {
        rt7 rt7Var = new rt7("RUNTIME", 0);
        a = rt7Var;
        rt7 rt7Var2 = new rt7("BINARY", 1);
        b = rt7Var2;
        rt7 rt7Var3 = new rt7("SOURCE", 2);
        c = rt7Var3;
        d = new rt7[]{rt7Var, rt7Var2, rt7Var3};
    }

    public static rt7 valueOf(String str) {
        return (rt7) Enum.valueOf(rt7.class, str);
    }

    public static rt7[] values() {
        return (rt7[]) d.clone();
    }
}
