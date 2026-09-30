package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r2a {
    public static final r2a a;
    public static final r2a b;
    public static final r2a c;
    public static final r2a d;
    public static final r2a e;
    public static final r2a f;
    public static final r2a g;
    public static final /* synthetic */ r2a[] v;

    static {
        r2a r2aVar = new r2a("Invalid", 0);
        a = r2aVar;
        r2a r2aVar2 = new r2a("Cancelled", 1);
        b = r2aVar2;
        r2a r2aVar3 = new r2a("InitialPending", 2);
        c = r2aVar3;
        r2a r2aVar4 = new r2a("RecomposePending", 3);
        d = r2aVar4;
        r2a r2aVar5 = new r2a("Recomposing", 4);
        e = r2aVar5;
        r2a r2aVar6 = new r2a("ApplyPending", 5);
        f = r2aVar6;
        r2a r2aVar7 = new r2a("Applied", 6);
        g = r2aVar7;
        v = new r2a[]{r2aVar, r2aVar2, r2aVar3, r2aVar4, r2aVar5, r2aVar6, r2aVar7};
    }

    public static r2a valueOf(String str) {
        return (r2a) Enum.valueOf(r2a.class, str);
    }

    public static r2a[] values() {
        return (r2a[]) v.clone();
    }
}
