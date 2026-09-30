package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p0e {
    public static final p0e a;
    public static final p0e b;
    public static final p0e c;
    public static final /* synthetic */ p0e[] d;

    static {
        p0e p0eVar = new p0e("NoRequest", 0);
        a = p0eVar;
        p0e p0eVar2 = new p0e("MatchFound", 1);
        b = p0eVar2;
        p0e p0eVar3 = new p0e("VisibleContentAbsentDuringTransition", 2);
        c = p0eVar3;
        d = new p0e[]{p0eVar, p0eVar2, p0eVar3, new p0e("NoMatchFound", 3)};
    }

    public static p0e valueOf(String str) {
        return (p0e) Enum.valueOf(p0e.class, str);
    }

    public static p0e[] values() {
        return (p0e[]) d.clone();
    }
}
