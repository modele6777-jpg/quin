package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vj9 {
    public static final vj9 a;
    public static final vj9 b;
    public static final vj9 c;
    public static final /* synthetic */ vj9[] d;

    static {
        vj9 vj9Var = new vj9("FORCE_FLEXIBILITY", 0);
        a = vj9Var;
        vj9 vj9Var2 = new vj9("NULLABLE", 1);
        b = vj9Var2;
        vj9 vj9Var3 = new vj9("NOT_NULL", 2);
        c = vj9Var3;
        d = new vj9[]{vj9Var, vj9Var2, vj9Var3};
    }

    public static vj9 valueOf(String str) {
        return (vj9) Enum.valueOf(vj9.class, str);
    }

    public static vj9[] values() {
        return (vj9[]) d.clone();
    }
}
