package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class et1 {
    public static final et1 a;
    public static final et1 b;
    public static final /* synthetic */ et1[] c;

    static {
        et1 et1Var = new et1("ShrinkingToLiftedPosition", 0);
        a = et1Var;
        et1 et1Var2 = new et1("ReinsertingIntoWheel", 1);
        b = et1Var2;
        c = new et1[]{et1Var, et1Var2};
    }

    public static et1 valueOf(String str) {
        return (et1) Enum.valueOf(et1.class, str);
    }

    public static et1[] values() {
        return (et1[]) c.clone();
    }
}
