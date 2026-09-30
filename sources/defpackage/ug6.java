package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ug6 {
    public static final ug6 a;
    public static final ug6 b;
    public static final ug6 c;
    public static final /* synthetic */ ug6[] d;

    static {
        ug6 ug6Var = new ug6("None", 0);
        a = ug6Var;
        ug6 ug6Var2 = new ug6("Selection", 1);
        b = ug6Var2;
        ug6 ug6Var3 = new ug6("Cursor", 2);
        c = ug6Var3;
        d = new ug6[]{ug6Var, ug6Var2, ug6Var3};
    }

    public static ug6 valueOf(String str) {
        return (ug6) Enum.valueOf(ug6.class, str);
    }

    public static ug6[] values() {
        return (ug6[]) d.clone();
    }
}
