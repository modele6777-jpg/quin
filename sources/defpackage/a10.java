package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a10 {
    public static final a10 a;
    public static final a10 b;
    public static final a10 c;
    public static final a10 d;
    public static final a10 e;
    public static final a10 f;
    public static final a10 g;
    public static final /* synthetic */ a10[] v;

    static {
        a10 a10Var = new a10("Paragraph", 0);
        a = a10Var;
        a10 a10Var2 = new a10("Span", 1);
        b = a10Var2;
        a10 a10Var3 = new a10("VerbatimTts", 2);
        c = a10Var3;
        a10 a10Var4 = new a10("Url", 3);
        d = a10Var4;
        a10 a10Var5 = new a10("Link", 4);
        e = a10Var5;
        a10 a10Var6 = new a10("Clickable", 5);
        f = a10Var6;
        a10 a10Var7 = new a10("String", 6);
        g = a10Var7;
        v = new a10[]{a10Var, a10Var2, a10Var3, a10Var4, a10Var5, a10Var6, a10Var7};
    }

    public static a10 valueOf(String str) {
        return (a10) Enum.valueOf(a10.class, str);
    }

    public static a10[] values() {
        return (a10[]) v.clone();
    }
}
