package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i41 {
    public static final i41 a;
    public static final i41 b;
    public static final i41 c;
    public static final /* synthetic */ i41[] d;

    static {
        i41 i41Var = new i41("SUSPEND", 0);
        a = i41Var;
        i41 i41Var2 = new i41("DROP_OLDEST", 1);
        b = i41Var2;
        i41 i41Var3 = new i41("DROP_LATEST", 2);
        c = i41Var3;
        d = new i41[]{i41Var, i41Var2, i41Var3};
    }

    public static i41 valueOf(String str) {
        return (i41) Enum.valueOf(i41.class, str);
    }

    public static i41[] values() {
        return (i41[]) d.clone();
    }
}
