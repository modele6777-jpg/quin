package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rs9 {
    public static final rs9 a;
    public static final rs9 b;
    public static final /* synthetic */ rs9[] c;

    static {
        rs9 rs9Var = new rs9("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = rs9Var;
        rs9 rs9Var2 = new rs9("DROP_WORK_REQUEST", 1);
        b = rs9Var2;
        c = new rs9[]{rs9Var, rs9Var2};
    }

    public static rs9 valueOf(String str) {
        return (rs9) Enum.valueOf(rs9.class, str);
    }

    public static rs9[] values() {
        return (rs9[]) c.clone();
    }
}
