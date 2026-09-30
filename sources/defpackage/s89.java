package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s89 {
    public static final s89 a;
    public static final s89 b;
    public static final s89 c;
    public static final /* synthetic */ s89[] d;

    static {
        s89 s89Var = new s89("Default", 0);
        a = s89Var;
        s89 s89Var2 = new s89("UserInput", 1);
        b = s89Var2;
        s89 s89Var3 = new s89("PreventUserInput", 2);
        c = s89Var3;
        d = new s89[]{s89Var, s89Var2, s89Var3};
    }

    public static s89 valueOf(String str) {
        return (s89) Enum.valueOf(s89.class, str);
    }

    public static s89[] values() {
        return (s89[]) d.clone();
    }
}
