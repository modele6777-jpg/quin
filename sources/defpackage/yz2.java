package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yz2 {
    public static final yz2 a;
    public static final yz2 b;
    public static final yz2 c;
    public static final yz2 d;
    public static final yz2 e;
    public static final yz2 f;
    public static final yz2 g;
    public static final yz2 v;
    public static final yz2 w;
    public static final /* synthetic */ yz2[] x;

    static {
        yz2 yz2Var = new yz2("TOP_LEFT", 0);
        a = yz2Var;
        yz2 yz2Var2 = new yz2("TOP_RIGHT", 1);
        b = yz2Var2;
        yz2 yz2Var3 = new yz2("BOTTOM_LEFT", 2);
        c = yz2Var3;
        yz2 yz2Var4 = new yz2("BOTTOM_RIGHT", 3);
        d = yz2Var4;
        yz2 yz2Var5 = new yz2("LEFT", 4);
        e = yz2Var5;
        yz2 yz2Var6 = new yz2("TOP", 5);
        f = yz2Var6;
        yz2 yz2Var7 = new yz2("RIGHT", 6);
        g = yz2Var7;
        yz2 yz2Var8 = new yz2("BOTTOM", 7);
        v = yz2Var8;
        yz2 yz2Var9 = new yz2("CENTER", 8);
        w = yz2Var9;
        x = new yz2[]{yz2Var, yz2Var2, yz2Var3, yz2Var4, yz2Var5, yz2Var6, yz2Var7, yz2Var8, yz2Var9};
    }

    public static yz2 valueOf(String str) {
        return (yz2) Enum.valueOf(yz2.class, str);
    }

    public static yz2[] values() {
        return (yz2[]) x.clone();
    }
}
