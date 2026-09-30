package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wz5 {
    public static final wz5 a;
    public static final wz5 b;
    public static final wz5 c;
    public static final wz5 d;
    public static final wz5 e;
    public static final wz5 f;
    public static final wz5 g;
    public static final wz5 v;
    public static final /* synthetic */ wz5[] w;

    static {
        wz5 wz5Var = new wz5("NegativeRemaining", 0);
        a = wz5Var;
        wz5 wz5Var2 = new wz5("NegativeTotalGranted", 1);
        b = wz5Var2;
        wz5 wz5Var3 = new wz5("TotalGrantedBelowRemaining", 2);
        c = wz5Var3;
        wz5 wz5Var4 = new wz5("NonPositiveCreditsPerPass", 3);
        d = wz5Var4;
        wz5 wz5Var5 = new wz5("NonPositiveValidDays", 4);
        e = wz5Var5;
        wz5 wz5Var6 = new wz5("MissingCode", 5);
        f = wz5Var6;
        wz5 wz5Var7 = new wz5("MissingShareUrl", 6);
        g = wz5Var7;
        wz5 wz5Var8 = new wz5("InvalidShareUrl", 7);
        v = wz5Var8;
        w = new wz5[]{wz5Var, wz5Var2, wz5Var3, wz5Var4, wz5Var5, wz5Var6, wz5Var7, wz5Var8};
    }

    public static wz5 valueOf(String str) {
        return (wz5) Enum.valueOf(wz5.class, str);
    }

    public static wz5[] values() {
        return (wz5[]) w.clone();
    }
}
