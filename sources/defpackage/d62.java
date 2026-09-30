package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d62 {
    public static final d62 a;
    public static final d62 b;
    public static final d62 c;
    public static final d62 d;
    public static final d62 e;
    public static final d62 f;
    public static final /* synthetic */ d62[] g;

    static {
        d62 d62Var = new d62("APP_CLOSED", 0);
        a = d62Var;
        d62 d62Var2 = new d62("APP_DISCONNECTED", 1);
        b = d62Var2;
        d62 d62Var3 = new d62("CAMERA2_CLOSED", 2);
        c = d62Var3;
        d62 d62Var4 = new d62("CAMERA2_DISCONNECTED", 3);
        d = d62Var4;
        d62 d62Var5 = new d62("CAMERA2_ERROR", 4);
        e = d62Var5;
        d62 d62Var6 = new d62("CAMERA2_EXCEPTION", 5);
        f = d62Var6;
        g = new d62[]{d62Var, d62Var2, d62Var3, d62Var4, d62Var5, d62Var6};
    }

    public static d62 valueOf(String str) {
        return (d62) Enum.valueOf(d62.class, str);
    }

    public static d62[] values() {
        return (d62[]) g.clone();
    }
}
