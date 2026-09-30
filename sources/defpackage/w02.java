package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w02 {
    public static final w02 a;
    public static final w02 b;
    public static final /* synthetic */ w02[] c;

    static {
        w02 w02Var = new w02("SCALE_IN", 0);
        a = w02Var;
        w02 w02Var2 = new w02("SCALE_OUT", 1);
        b = w02Var2;
        c = new w02[]{w02Var, w02Var2};
    }

    public static w02 valueOf(String str) {
        return (w02) Enum.valueOf(w02.class, str);
    }

    public static w02[] values() {
        return (w02[]) c.clone();
    }
}
