package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dm1 {
    public static final dm1 a;
    public static final dm1 b;
    public static final /* synthetic */ dm1[] c;

    static {
        dm1 dm1Var = new dm1("READ", 0);
        a = dm1Var;
        dm1 dm1Var2 = new dm1("WRITE", 1);
        b = dm1Var2;
        c = new dm1[]{dm1Var, dm1Var2};
    }

    public static dm1 valueOf(String str) {
        return (dm1) Enum.valueOf(dm1.class, str);
    }

    public static dm1[] values() {
        return (dm1[]) c.clone();
    }
}
