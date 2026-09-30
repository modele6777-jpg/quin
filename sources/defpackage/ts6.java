package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ts6 {
    public static final ts6 a;
    public static final ts6 b;
    public static final ts6 c;
    public static final ts6 d;
    public static final /* synthetic */ ts6[] e;

    static {
        ts6 ts6Var = new ts6("NONE", 0);
        a = ts6Var;
        ts6 ts6Var2 = new ts6("BASIC", 1);
        b = ts6Var2;
        ts6 ts6Var3 = new ts6("HEADERS", 2);
        c = ts6Var3;
        ts6 ts6Var4 = new ts6("BODY", 3);
        d = ts6Var4;
        e = new ts6[]{ts6Var, ts6Var2, ts6Var3, ts6Var4};
    }

    public static ts6 valueOf(String str) {
        return (ts6) Enum.valueOf(ts6.class, str);
    }

    public static ts6[] values() {
        return (ts6[]) e.clone();
    }
}
