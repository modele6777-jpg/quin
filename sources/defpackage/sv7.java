package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sv7 {
    public static final sv7 a;
    public static final sv7 b;
    public static final sv7 c;
    public static final /* synthetic */ sv7[] d;

    static {
        sv7 sv7Var = new sv7("InMeasureBlock", 0);
        a = sv7Var;
        sv7 sv7Var2 = new sv7("InLayoutBlock", 1);
        b = sv7Var2;
        sv7 sv7Var3 = new sv7("NotUsed", 2);
        c = sv7Var3;
        d = new sv7[]{sv7Var, sv7Var2, sv7Var3};
    }

    public static sv7 valueOf(String str) {
        return (sv7) Enum.valueOf(sv7.class, str);
    }

    public static sv7[] values() {
        return (sv7[]) d.clone();
    }
}
