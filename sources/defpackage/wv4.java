package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wv4 {
    public static final wv4 a;
    public static final wv4 b;
    public static final wv4 c;
    public static final /* synthetic */ wv4[] d;

    static {
        wv4 wv4Var = new wv4("PreEnter", 0);
        a = wv4Var;
        wv4 wv4Var2 = new wv4("Visible", 1);
        b = wv4Var2;
        wv4 wv4Var3 = new wv4("PostExit", 2);
        c = wv4Var3;
        d = new wv4[]{wv4Var, wv4Var2, wv4Var3};
    }

    public static wv4 valueOf(String str) {
        return (wv4) Enum.valueOf(wv4.class, str);
    }

    public static wv4[] values() {
        return (wv4[]) d.clone();
    }
}
