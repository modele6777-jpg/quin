package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mo8 {
    public static final mo8 a;
    public static final mo8 b;
    public static final /* synthetic */ mo8[] c;

    static {
        mo8 mo8Var = new mo8("Width", 0);
        a = mo8Var;
        mo8 mo8Var2 = new mo8("Height", 1);
        b = mo8Var2;
        c = new mo8[]{mo8Var, mo8Var2};
    }

    public static mo8 valueOf(String str) {
        return (mo8) Enum.valueOf(mo8.class, str);
    }

    public static mo8[] values() {
        return (mo8[]) c.clone();
    }
}
