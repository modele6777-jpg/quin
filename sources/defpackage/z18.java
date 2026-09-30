package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z18 {
    public static final z18 a;
    public static final z18 b;
    public static final z18 c;
    public static final /* synthetic */ z18[] d;

    static {
        z18 z18Var = new z18("SYNCHRONIZED", 0);
        a = z18Var;
        z18 z18Var2 = new z18("PUBLICATION", 1);
        b = z18Var2;
        z18 z18Var3 = new z18("NONE", 2);
        c = z18Var3;
        d = new z18[]{z18Var, z18Var2, z18Var3};
    }

    public static z18 valueOf(String str) {
        return (z18) Enum.valueOf(z18.class, str);
    }

    public static z18[] values() {
        return (z18[]) d.clone();
    }
}
