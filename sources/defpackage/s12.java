package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s12 {
    public static final s12 a;
    public static final s12 b;
    public static final /* synthetic */ s12[] c;

    static {
        s12 s12Var = new s12("Drawing", 0);
        a = s12Var;
        s12 s12Var2 = new s12("Interpreting", 1);
        b = s12Var2;
        c = new s12[]{s12Var, s12Var2};
    }

    public static s12 valueOf(String str) {
        return (s12) Enum.valueOf(s12.class, str);
    }

    public static s12[] values() {
        return (s12[]) c.clone();
    }
}
