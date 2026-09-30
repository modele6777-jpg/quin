package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ke1 {
    public static final ke1 a;
    public static final ke1 b;
    public static final ke1 c;
    public static final ke1 d;
    public static final ke1 e;
    public static final ke1 f;
    public static final /* synthetic */ ke1[] g;

    static {
        ke1 ke1Var = new ke1("UNKNOWN", 0);
        a = ke1Var;
        ke1 ke1Var2 = new ke1("INACTIVE", 1);
        b = ke1Var2;
        ke1 ke1Var3 = new ke1("SEARCHING", 2);
        c = ke1Var3;
        ke1 ke1Var4 = new ke1("FLASH_REQUIRED", 3);
        d = ke1Var4;
        ke1 ke1Var5 = new ke1("CONVERGED", 4);
        e = ke1Var5;
        ke1 ke1Var6 = new ke1("LOCKED", 5);
        f = ke1Var6;
        g = new ke1[]{ke1Var, ke1Var2, ke1Var3, ke1Var4, ke1Var5, ke1Var6};
    }

    public static ke1 valueOf(String str) {
        return (ke1) Enum.valueOf(ke1.class, str);
    }

    public static ke1[] values() {
        return (ke1[]) g.clone();
    }
}
