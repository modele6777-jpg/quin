package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bn6 {
    public static final bn6 a;
    public static final bn6 b;
    public static final bn6 c;
    public static final /* synthetic */ bn6[] d;

    static {
        bn6 bn6Var = new bn6("Hidden", 0);
        a = bn6Var;
        bn6 bn6Var2 = new bn6("Calendar", 1);
        b = bn6Var2;
        bn6 bn6Var3 = new bn6("FortuneTooltip", 2);
        c = bn6Var3;
        d = new bn6[]{bn6Var, bn6Var2, bn6Var3};
    }

    public static bn6 valueOf(String str) {
        return (bn6) Enum.valueOf(bn6.class, str);
    }

    public static bn6[] values() {
        return (bn6[]) d.clone();
    }
}
