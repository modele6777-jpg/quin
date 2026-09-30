package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dle {
    public static final /* synthetic */ dle[] X;
    public static final dle a;
    public static final dle b;
    public static final dle c;
    public static final dle d;
    public static final dle e;
    public static final dle f;
    public static final dle g;
    public static final dle v;
    public static final dle w;
    public static final dle x;
    public static final dle y;
    public static final dle z;

    static {
        dle dleVar = new dle("Aries", 0);
        a = dleVar;
        dle dleVar2 = new dle("Taurus", 1);
        b = dleVar2;
        dle dleVar3 = new dle("Gemini", 2);
        c = dleVar3;
        dle dleVar4 = new dle("Cancer", 3);
        d = dleVar4;
        dle dleVar5 = new dle("Leo", 4);
        e = dleVar5;
        dle dleVar6 = new dle("Virgo", 5);
        f = dleVar6;
        dle dleVar7 = new dle("Libra", 6);
        g = dleVar7;
        dle dleVar8 = new dle("Scorpio", 7);
        v = dleVar8;
        dle dleVar9 = new dle("Sagittarius", 8);
        w = dleVar9;
        dle dleVar10 = new dle("Capricorn", 9);
        x = dleVar10;
        dle dleVar11 = new dle("Aquarius", 10);
        y = dleVar11;
        dle dleVar12 = new dle("Pisces", 11);
        z = dleVar12;
        X = new dle[]{dleVar, dleVar2, dleVar3, dleVar4, dleVar5, dleVar6, dleVar7, dleVar8, dleVar9, dleVar10, dleVar11, dleVar12};
    }

    public static dle valueOf(String str) {
        return (dle) Enum.valueOf(dle.class, str);
    }

    public static dle[] values() {
        return (dle[]) X.clone();
    }
}
