package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sg6 {
    public static final sg6 a;
    public static final sg6 b;
    public static final sg6 c;
    public static final /* synthetic */ sg6[] d;

    static {
        sg6 sg6Var = new sg6("Cursor", 0);
        a = sg6Var;
        sg6 sg6Var2 = new sg6("SelectionStart", 1);
        b = sg6Var2;
        sg6 sg6Var3 = new sg6("SelectionEnd", 2);
        c = sg6Var3;
        d = new sg6[]{sg6Var, sg6Var2, sg6Var3};
    }

    public static sg6 valueOf(String str) {
        return (sg6) Enum.valueOf(sg6.class, str);
    }

    public static sg6[] values() {
        return (sg6[]) d.clone();
    }
}
