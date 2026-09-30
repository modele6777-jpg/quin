package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class an5 {
    public static final an5 a;
    public static final /* synthetic */ an5[] b;

    /* JADX INFO: Fake field, exist only in values array */
    an5 EF0;

    static {
        an5 an5Var = new an5("Visible", 0);
        an5 an5Var2 = new an5("Clip", 1);
        a = an5Var2;
        b = new an5[]{an5Var, an5Var2, new an5("ExpandIndicator", 2), new an5("ExpandOrCollapseIndicator", 3)};
    }

    public static an5 valueOf(String str) {
        return (an5) Enum.valueOf(an5.class, str);
    }

    public static an5[] values() {
        return (an5[]) b.clone();
    }
}
