package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cb7 {
    public static final cb7 a;
    public static final cb7 b;
    public static final cb7 c;
    public static final cb7 d;
    public static final /* synthetic */ cb7[] e;

    static {
        cb7 cb7Var = new cb7("LookaheadMeasurement", 0);
        a = cb7Var;
        cb7 cb7Var2 = new cb7("LookaheadPlacement", 1);
        b = cb7Var2;
        cb7 cb7Var3 = new cb7("Measurement", 2);
        c = cb7Var3;
        cb7 cb7Var4 = new cb7("Placement", 3);
        d = cb7Var4;
        e = new cb7[]{cb7Var, cb7Var2, cb7Var3, cb7Var4};
    }

    public static cb7 valueOf(String str) {
        return (cb7) Enum.valueOf(cb7.class, str);
    }

    public static cb7[] values() {
        return (cb7[]) e.clone();
    }
}
