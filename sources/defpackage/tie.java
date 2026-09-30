package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tie {
    public static final tie a;
    public static final tie b;
    public static final tie c;
    public static final tie d;
    public static final tie e;
    public static final tie f;
    public static final tie g;
    public static final tie v;
    public static final tie w;
    public static final tie x;
    public static final /* synthetic */ tie[] y;

    static {
        tie tieVar = new tie("Sun", 0);
        a = tieVar;
        tie tieVar2 = new tie("Moon", 1);
        b = tieVar2;
        tie tieVar3 = new tie("Mercury", 2);
        c = tieVar3;
        tie tieVar4 = new tie("Venus", 3);
        d = tieVar4;
        tie tieVar5 = new tie("Mars", 4);
        e = tieVar5;
        tie tieVar6 = new tie("Jupiter", 5);
        f = tieVar6;
        tie tieVar7 = new tie("Saturn", 6);
        g = tieVar7;
        tie tieVar8 = new tie("Uranus", 7);
        v = tieVar8;
        tie tieVar9 = new tie("Neptune", 8);
        w = tieVar9;
        tie tieVar10 = new tie("Pluto", 9);
        x = tieVar10;
        y = new tie[]{tieVar, tieVar2, tieVar3, tieVar4, tieVar5, tieVar6, tieVar7, tieVar8, tieVar9, tieVar10};
    }

    public static tie valueOf(String str) {
        return (tie) Enum.valueOf(tie.class, str);
    }

    public static tie[] values() {
        return (tie[]) y.clone();
    }
}
