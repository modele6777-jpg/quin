package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ps9 {
    public static final ps9 a;
    public static final /* synthetic */ ps9[] b;

    static {
        ps9 ps9Var = new ps9("EndOfRow", 0);
        a = ps9Var;
        b = new ps9[]{ps9Var, new ps9("EndOfGrid", 1)};
    }

    public static ps9 valueOf(String str) {
        return (ps9) Enum.valueOf(ps9.class, str);
    }

    public static ps9[] values() {
        return (ps9[]) b.clone();
    }
}
