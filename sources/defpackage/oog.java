package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oog {
    public static final gbh a;
    public static volatile String b;
    public static final ysd c;

    static {
        nog nogVar = nog.b;
        int i = ry6.c;
        rbh rbhVar = new rbh(nogVar, true, fpb.x);
        gn2 gn2Var = new gn2();
        gn2Var.b = rbhVar;
        c = new ysd(13, gn2Var);
        a = new gbh("__phenotype_server_token", gn2Var, "");
        b = null;
    }

    public static String a() {
        return (String) a.get();
    }
}
