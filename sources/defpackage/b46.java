package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b46 {
    public static final b46 a;
    public static final b46 b;
    public static final b46 c;
    public static final /* synthetic */ b46[] d;

    static {
        b46 b46Var = new b46("UNKNOWN", 0);
        a = b46Var;
        b46 b46Var2 = new b46("DEFAULT", 1);
        b = b46Var2;
        b46 b46Var3 = new b46("YUV", 2);
        c = b46Var3;
        d = new b46[]{b46Var, b46Var2, b46Var3};
    }

    public static b46 valueOf(String str) {
        return (b46) Enum.valueOf(b46.class, str);
    }

    public static b46[] values() {
        return (b46[]) d.clone();
    }
}
