package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jh0 {
    public static final jh0 a;
    public static final jh0 b;
    public static final /* synthetic */ jh0[] c;

    static {
        jh0 jh0Var = new jh0("AUTOMATIC", 0);
        a = jh0Var;
        jh0 jh0Var2 = new jh0("ENABLED", 1);
        b = jh0Var2;
        c = new jh0[]{jh0Var, jh0Var2, new jh0("DISABLED", 2)};
    }

    public static jh0 valueOf(String str) {
        return (jh0) Enum.valueOf(jh0.class, str);
    }

    public static jh0[] values() {
        return (jh0[]) c.clone();
    }
}
