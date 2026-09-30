package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g7e {
    public static final g7e a;
    public static final g7e b;
    public static final g7e c;
    public static final g7e d;
    public static final /* synthetic */ g7e[] e;

    static {
        g7e g7eVar = new g7e("Week", 0);
        a = g7eVar;
        g7e g7eVar2 = new g7e("Month", 1);
        b = g7eVar2;
        g7e g7eVar3 = new g7e("Quarter", 2);
        c = g7eVar3;
        g7e g7eVar4 = new g7e("Year", 3);
        d = g7eVar4;
        e = new g7e[]{g7eVar, g7eVar2, g7eVar3, g7eVar4};
    }

    public static g7e valueOf(String str) {
        return (g7e) Enum.valueOf(g7e.class, str);
    }

    public static g7e[] values() {
        return (g7e[]) e.clone();
    }
}
