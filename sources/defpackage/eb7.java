package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eb7 {
    public static final eb7 a;
    public static final eb7 b;
    public static final eb7 c;
    public static final eb7 d;
    public static final /* synthetic */ eb7[] e;

    static {
        eb7 eb7Var = new eb7("IGNORED", 0);
        a = eb7Var;
        eb7 eb7Var2 = new eb7("SCHEDULED", 1);
        b = eb7Var2;
        eb7 eb7Var3 = new eb7("DEFERRED", 2);
        c = eb7Var3;
        eb7 eb7Var4 = new eb7("IMMINENT", 3);
        d = eb7Var4;
        e = new eb7[]{eb7Var, eb7Var2, eb7Var3, eb7Var4};
    }

    public static eb7 valueOf(String str) {
        return (eb7) Enum.valueOf(eb7.class, str);
    }

    public static eb7[] values() {
        return (eb7[]) e.clone();
    }
}
