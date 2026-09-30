package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dw2 {
    public static final dw2 a;
    public static final dw2 b;
    public static final dw2 c;
    public static final dw2 d;
    public static final /* synthetic */ dw2[] e;

    static {
        dw2 dw2Var = new dw2("DEFAULT", 0);
        a = dw2Var;
        dw2 dw2Var2 = new dw2("LAZY", 1);
        b = dw2Var2;
        dw2 dw2Var3 = new dw2("ATOMIC", 2);
        c = dw2Var3;
        dw2 dw2Var4 = new dw2("UNDISPATCHED", 3);
        d = dw2Var4;
        e = new dw2[]{dw2Var, dw2Var2, dw2Var3, dw2Var4};
    }

    public static dw2 valueOf(String str) {
        return (dw2) Enum.valueOf(dw2.class, str);
    }

    public static dw2[] values() {
        return (dw2[]) e.clone();
    }
}
