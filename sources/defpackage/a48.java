package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a48 {
    public static final a48 a;
    public static final a48 b;
    public static final a48 c;
    public static final a48 d;
    public static final a48 e;
    public static final /* synthetic */ a48[] f;

    static {
        a48 a48Var = new a48("DEBUG", 0);
        a = a48Var;
        a48 a48Var2 = new a48("INFO", 1);
        b = a48Var2;
        a48 a48Var3 = new a48("WARNING", 2);
        c = a48Var3;
        a48 a48Var4 = new a48("ERROR", 3);
        d = a48Var4;
        a48 a48Var5 = new a48("NONE", 4);
        e = a48Var5;
        f = new a48[]{a48Var, a48Var2, a48Var3, a48Var4, a48Var5};
    }

    public static a48 valueOf(String str) {
        return (a48) Enum.valueOf(a48.class, str);
    }

    public static a48[] values() {
        return (a48[]) f.clone();
    }
}
