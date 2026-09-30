package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s68 {
    public static final s68 a;
    public static final s68 b;
    public static final s68 c;
    public static final /* synthetic */ s68[] d;

    static {
        s68 s68Var = new s68("URL", 0);
        a = s68Var;
        s68 s68Var2 = new s68("EMAIL", 1);
        b = s68Var2;
        s68 s68Var3 = new s68("WWW", 2);
        c = s68Var3;
        d = new s68[]{s68Var, s68Var2, s68Var3};
    }

    public static s68 valueOf(String str) {
        return (s68) Enum.valueOf(s68.class, str);
    }

    public static s68[] values() {
        return (s68[]) d.clone();
    }
}
