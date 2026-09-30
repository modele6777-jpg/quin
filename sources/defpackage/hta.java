package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hta {
    public static final hta a;
    public static final hta b;
    public static final hta c;
    public static final hta d;
    public static final hta e;
    public static final hta f;
    public static final hta g;
    public static final hta v;
    public static final hta w;
    public static final hta x;
    public static final /* synthetic */ hta[] y;

    static {
        hta htaVar = new hta("none", 0);
        a = htaVar;
        hta htaVar2 = new hta("xMinYMin", 1);
        b = htaVar2;
        hta htaVar3 = new hta("xMidYMin", 2);
        c = htaVar3;
        hta htaVar4 = new hta("xMaxYMin", 3);
        d = htaVar4;
        hta htaVar5 = new hta("xMinYMid", 4);
        e = htaVar5;
        hta htaVar6 = new hta("xMidYMid", 5);
        f = htaVar6;
        hta htaVar7 = new hta("xMaxYMid", 6);
        g = htaVar7;
        hta htaVar8 = new hta("xMinYMax", 7);
        v = htaVar8;
        hta htaVar9 = new hta("xMidYMax", 8);
        w = htaVar9;
        hta htaVar10 = new hta("xMaxYMax", 9);
        x = htaVar10;
        y = new hta[]{htaVar, htaVar2, htaVar3, htaVar4, htaVar5, htaVar6, htaVar7, htaVar8, htaVar9, htaVar10};
    }

    public static hta valueOf(String str) {
        return (hta) Enum.valueOf(hta.class, str);
    }

    public static hta[] values() {
        return (hta[]) y.clone();
    }
}
