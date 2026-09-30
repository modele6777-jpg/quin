package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wg1 {
    public static final wg1 a;
    public static final wg1 b;
    public static final /* synthetic */ wg1[] c;

    static {
        wg1 wg1Var = new wg1("Back", 0);
        a = wg1Var;
        wg1 wg1Var2 = new wg1("Front", 1);
        b = wg1Var2;
        c = new wg1[]{wg1Var, wg1Var2};
    }

    public static wg1 valueOf(String str) {
        return (wg1) Enum.valueOf(wg1.class, str);
    }

    public static wg1[] values() {
        return (wg1[]) c.clone();
    }
}
