package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hc9 {
    public static final hc9 a;
    public static final hc9 b;
    public static final hc9 c;
    public static final /* synthetic */ hc9[] d;

    static {
        hc9 hc9Var = new hc9("Popup", 0);
        a = hc9Var;
        hc9 hc9Var2 = new hc9("Event", 1);
        b = hc9Var2;
        hc9 hc9Var3 = new hc9("Notification", 2);
        c = hc9Var3;
        d = new hc9[]{hc9Var, hc9Var2, hc9Var3};
    }

    public static hc9 valueOf(String str) {
        return (hc9) Enum.valueOf(hc9.class, str);
    }

    public static hc9[] values() {
        return (hc9[]) d.clone();
    }
}
