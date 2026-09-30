package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g5d {
    public static final g5d a;
    public static final g5d b;
    public static final g5d c;
    public static final g5d d;
    public static final g5d e;
    public static final g5d f;
    public static final g5d g;
    public static final /* synthetic */ g5d[] v;

    /* JADX INFO: Fake field, exist only in values array */
    g5d EF0;

    static {
        g5d g5dVar = new g5d("CornerExtraExtraLarge", 0);
        g5d g5dVar2 = new g5d("CornerExtraLarge", 1);
        g5d g5dVar3 = new g5d("CornerExtraLargeIncreased", 2);
        g5d g5dVar4 = new g5d("CornerExtraLargeTop", 3);
        a = g5dVar4;
        g5d g5dVar5 = new g5d("CornerExtraSmall", 4);
        b = g5dVar5;
        g5d g5dVar6 = new g5d("CornerExtraSmallTop", 5);
        c = g5dVar6;
        g5d g5dVar7 = new g5d("CornerFull", 6);
        d = g5dVar7;
        g5d g5dVar8 = new g5d("CornerLarge", 7);
        g5d g5dVar9 = new g5d("CornerLargeEnd", 8);
        g5d g5dVar10 = new g5d("CornerLargeIncreased", 9);
        g5d g5dVar11 = new g5d("CornerLargeStart", 10);
        g5d g5dVar12 = new g5d("CornerLargeTop", 11);
        g5d g5dVar13 = new g5d("CornerMedium", 12);
        e = g5dVar13;
        g5d g5dVar14 = new g5d("CornerNone", 13);
        f = g5dVar14;
        g5d g5dVar15 = new g5d("CornerSmall", 14);
        g = g5dVar15;
        v = new g5d[]{g5dVar, g5dVar2, g5dVar3, g5dVar4, g5dVar5, g5dVar6, g5dVar7, g5dVar8, g5dVar9, g5dVar10, g5dVar11, g5dVar12, g5dVar13, g5dVar14, g5dVar15};
    }

    public static g5d valueOf(String str) {
        return (g5d) Enum.valueOf(g5d.class, str);
    }

    public static g5d[] values() {
        return (g5d[]) v.clone();
    }
}
