package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b38 {
    public static final b38 a;
    public static final b38 b;
    public static final b38 c;
    public static final /* synthetic */ b38[] d;

    static {
        b38 b38Var = new b38("COMPLETED", 0);
        a = b38Var;
        b38 b38Var2 = new b38("PERMANENT_FAILURE", 1);
        b = b38Var2;
        b38 b38Var3 = new b38("RETRY_REQUIRED", 2);
        c = b38Var3;
        d = new b38[]{b38Var, b38Var2, b38Var3};
    }

    public static b38 valueOf(String str) {
        return (b38) Enum.valueOf(b38.class, str);
    }

    public static b38[] values() {
        return (b38[]) d.clone();
    }
}
