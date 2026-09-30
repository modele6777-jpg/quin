package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d83 {
    public static final d83 a;
    public static final d83 b;
    public static final d83 c;
    public static final /* synthetic */ d83[] d;

    static {
        d83 d83Var = new d83("TodayOnly", 0);
        a = d83Var;
        d83 d83Var2 = new d83("TodayAndTomorrow", 1);
        b = d83Var2;
        d83 d83Var3 = new d83("TomorrowOnly", 2);
        c = d83Var3;
        d = new d83[]{d83Var, d83Var2, d83Var3};
    }

    public static d83 valueOf(String str) {
        return (d83) Enum.valueOf(d83.class, str);
    }

    public static d83[] values() {
        return (d83[]) d.clone();
    }
}
