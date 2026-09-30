package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oq7 {
    public static final oq7 a;
    public static final oq7 b;
    public static final oq7 c;
    public static final oq7 d;
    public static final /* synthetic */ oq7[] e;

    static {
        oq7 oq7Var = new oq7("RETURNS_CONSTANT", 0);
        a = oq7Var;
        oq7 oq7Var2 = new oq7("CALLS", 1);
        b = oq7Var2;
        oq7 oq7Var3 = new oq7("RETURNS_NOT_NULL", 2);
        c = oq7Var3;
        oq7 oq7Var4 = new oq7("RETURNS_RESULT_OF", 3);
        d = oq7Var4;
        e = new oq7[]{oq7Var, oq7Var2, oq7Var3, oq7Var4};
    }

    public static oq7 valueOf(String str) {
        return (oq7) Enum.valueOf(oq7.class, str);
    }

    public static oq7[] values() {
        return (oq7[]) e.clone();
    }
}
