package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d45 {
    public static final d45 a;
    public static final d45 b;
    public static final d45 c;
    public static final d45 d;
    public static final /* synthetic */ d45[] e;

    static {
        d45 d45Var = new d45("REPLACE", 0);
        a = d45Var;
        d45 d45Var2 = new d45("KEEP", 1);
        b = d45Var2;
        d45 d45Var3 = new d45("APPEND", 2);
        c = d45Var3;
        d45 d45Var4 = new d45("APPEND_OR_REPLACE", 3);
        d = d45Var4;
        e = new d45[]{d45Var, d45Var2, d45Var3, d45Var4};
    }

    public static d45 valueOf(String str) {
        return (d45) Enum.valueOf(d45.class, str);
    }

    public static d45[] values() {
        return (d45[]) e.clone();
    }
}
