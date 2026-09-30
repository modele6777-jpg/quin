package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dg0 {
    public static final dg0 a;
    public static final dg0 b;
    public static final dg0 c;
    public static final /* synthetic */ dg0[] d;

    static {
        dg0 dg0Var = new dg0("LEFT", 0);
        a = dg0Var;
        dg0 dg0Var2 = new dg0("CENTER", 1);
        b = dg0Var2;
        dg0 dg0Var3 = new dg0("RIGHT", 2);
        c = dg0Var3;
        d = new dg0[]{dg0Var, dg0Var2, dg0Var3};
    }

    public static dg0 valueOf(String str) {
        return (dg0) Enum.valueOf(dg0.class, str);
    }

    public static dg0[] values() {
        return (dg0[]) d.clone();
    }
}
