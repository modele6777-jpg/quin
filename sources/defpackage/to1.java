package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class to1 {
    public static final to1 a;
    public static final /* synthetic */ to1[] b;

    static {
        to1 to1Var = new to1("FOR_SUBTYPING", 0);
        a = to1Var;
        b = new to1[]{to1Var, new to1("FOR_INCORPORATION", 1), new to1("FROM_EXPRESSION", 2)};
    }

    public static to1 valueOf(String str) {
        return (to1) Enum.valueOf(to1.class, str);
    }

    public static to1[] values() {
        return (to1[]) b.clone();
    }
}
