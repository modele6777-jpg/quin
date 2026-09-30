package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tz2 {
    public static final tz2 a;
    public static final tz2 b;
    public static final tz2 c;
    public static final /* synthetic */ tz2[] d;
    public static final /* synthetic */ mx4 e;

    static {
        tz2 tz2Var = new tz2("FIT_CENTER", 0);
        a = tz2Var;
        tz2 tz2Var2 = new tz2("CENTER", 1);
        tz2 tz2Var3 = new tz2("CENTER_CROP", 2);
        b = tz2Var3;
        tz2 tz2Var4 = new tz2("CENTER_INSIDE", 3);
        c = tz2Var4;
        tz2[] tz2VarArr = {tz2Var, tz2Var2, tz2Var3, tz2Var4};
        d = tz2VarArr;
        e = new mx4(tz2VarArr);
    }

    public static tz2 valueOf(String str) {
        return (tz2) Enum.valueOf(tz2.class, str);
    }

    public static tz2[] values() {
        return (tz2[]) d.clone();
    }
}
