package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sp5 {
    public static final sp5 a;
    public static final sp5 b;
    public static final /* synthetic */ sp5[] c;

    static {
        sp5 sp5Var = new sp5("Monthly", 0);
        a = sp5Var;
        sp5 sp5Var2 = new sp5("Weekly", 1);
        b = sp5Var2;
        c = new sp5[]{sp5Var, sp5Var2};
    }

    public static sp5 valueOf(String str) {
        return (sp5) Enum.valueOf(sp5.class, str);
    }

    public static sp5[] values() {
        return (sp5[]) c.clone();
    }
}
