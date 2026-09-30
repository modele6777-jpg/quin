package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e09 {
    public static final eu4 a;
    public static final e09 b;
    public static final e09 c;
    public static final e09 d;
    public static final e09 e;
    public static final /* synthetic */ e09[] f;

    static {
        e09 e09Var = new e09("FINAL", 0);
        b = e09Var;
        e09 e09Var2 = new e09("SEALED", 1);
        c = e09Var2;
        e09 e09Var3 = new e09("OPEN", 2);
        d = e09Var3;
        e09 e09Var4 = new e09("ABSTRACT", 3);
        e = e09Var4;
        f = new e09[]{e09Var, e09Var2, e09Var3, e09Var4};
        a = new eu4(14);
    }

    public static e09 valueOf(String str) {
        return (e09) Enum.valueOf(e09.class, str);
    }

    public static e09[] values() {
        return (e09[]) f.clone();
    }
}
