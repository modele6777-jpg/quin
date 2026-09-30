package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dm4 {
    public static final dm4 a;
    public static final dm4 b;
    public static final dm4 c;
    public static final /* synthetic */ dm4[] d;
    public static final /* synthetic */ mx4 e;

    static {
        dm4 dm4Var = new dm4("QuickDraw", 0);
        a = dm4Var;
        dm4 dm4Var2 = new dm4("Scene", 1);
        b = dm4Var2;
        dm4 dm4Var3 = new dm4("Unknown", 2);
        c = dm4Var3;
        dm4[] dm4VarArr = {dm4Var, dm4Var2, dm4Var3};
        d = dm4VarArr;
        e = new mx4(dm4VarArr);
    }

    public static dm4 valueOf(String str) {
        return (dm4) Enum.valueOf(dm4.class, str);
    }

    public static dm4[] values() {
        return (dm4[]) d.clone();
    }
}
