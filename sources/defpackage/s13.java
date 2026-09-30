package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s13 {
    public static final s13 a;
    public static final s13 b;
    public static final s13 c;
    public static final s13 d;
    public static final /* synthetic */ s13[] e;

    static {
        s13 s13Var = new s13("Idle", 0);
        a = s13Var;
        s13 s13Var2 = new s13("Splitting", 1);
        b = s13Var2;
        s13 s13Var3 = new s13("Swapping", 2);
        c = s13Var3;
        s13 s13Var4 = new s13("Merging", 3);
        d = s13Var4;
        e = new s13[]{s13Var, s13Var2, s13Var3, s13Var4};
    }

    public static s13 valueOf(String str) {
        return (s13) Enum.valueOf(s13.class, str);
    }

    public static s13[] values() {
        return (s13[]) e.clone();
    }
}
