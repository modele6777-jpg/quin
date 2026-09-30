package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jz5 {
    public static final jz5 a;
    public static final jz5 b;
    public static final jz5 c;
    public static final jz5 d;
    public static final jz5 e;
    public static final /* synthetic */ jz5[] f;

    static {
        jz5 jz5Var = new jz5("ON_CONFIGURE", 0);
        a = jz5Var;
        jz5 jz5Var2 = new jz5("ON_CREATE", 1);
        b = jz5Var2;
        jz5 jz5Var3 = new jz5("ON_UPGRADE", 2);
        c = jz5Var3;
        jz5 jz5Var4 = new jz5("ON_DOWNGRADE", 3);
        d = jz5Var4;
        jz5 jz5Var5 = new jz5("ON_OPEN", 4);
        e = jz5Var5;
        f = new jz5[]{jz5Var, jz5Var2, jz5Var3, jz5Var4, jz5Var5};
    }

    public static jz5 valueOf(String str) {
        return (jz5) Enum.valueOf(jz5.class, str);
    }

    public static jz5[] values() {
        return (jz5[]) f.clone();
    }
}
