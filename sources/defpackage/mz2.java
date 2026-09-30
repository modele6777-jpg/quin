package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mz2 {
    public static final mz2 a;
    public static final mz2 b;
    public static final /* synthetic */ mz2[] c;
    public static final /* synthetic */ mx4 d;

    /* JADX INFO: Fake field, exist only in values array */
    mz2 EF0;

    static {
        mz2 mz2Var = new mz2("OFF", 0);
        mz2 mz2Var2 = new mz2("ON_TOUCH", 1);
        a = mz2Var2;
        mz2 mz2Var3 = new mz2("ON", 2);
        b = mz2Var3;
        mz2[] mz2VarArr = {mz2Var, mz2Var2, mz2Var3};
        c = mz2VarArr;
        d = new mx4(mz2VarArr);
    }

    public static mz2 valueOf(String str) {
        return (mz2) Enum.valueOf(mz2.class, str);
    }

    public static mz2[] values() {
        return (mz2[]) c.clone();
    }
}
