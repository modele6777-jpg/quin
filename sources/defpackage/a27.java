package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a27 {
    public static final a27 a;
    public static final a27 b;
    public static final a27 c;
    public static final /* synthetic */ a27[] d;

    static {
        a27 a27Var = new a27("Yes", 0);
        a = a27Var;
        a27 a27Var2 = new a27("No", 1);
        b = a27Var2;
        a27 a27Var3 = new a27("NotInitialized", 2);
        c = a27Var3;
        d = new a27[]{a27Var, a27Var2, a27Var3};
    }

    public static a27 valueOf(String str) {
        return (a27) Enum.valueOf(a27.class, str);
    }

    public static a27[] values() {
        return (a27[]) d.clone();
    }
}
