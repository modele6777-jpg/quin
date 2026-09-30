package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s82 {
    public static final float[] a;
    public static final float[] b;
    public static final m2f c;
    public static final m2f d;
    public static final x3c e;
    public static final x3c f;
    public static final x3c g;
    public static final x3c h;
    public static final x3c i;
    public static final x3c j;
    public static final x3c k;
    public static final x3c l;
    public static final x3c m;
    public static final x3c n;
    public static final x3c o;
    public static final x3c p;
    public static final x3c q;
    public static final x3c r;
    public static final eu7 s;
    public static final eu7 t;
    public static final x3c u;
    public static final x3c v;
    public static final x3c w;
    public static final km9 x;
    public static final p82[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        m2f m2fVar = new m2f(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        m2f m2fVar2 = new m2f(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        m2f m2fVar3 = new m2f(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = m2fVar3;
        m2f m2fVar4 = new m2f(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = m2fVar4;
        y3g y3gVar = cgg.m;
        x3c x3cVar = new x3c("sRGB IEC61966-2.1", fArr, y3gVar, m2fVar, 0);
        e = x3cVar;
        x3c x3cVar2 = new x3c("sRGB IEC61966-2.1 (Linear)", fArr, y3gVar, 1.0d, 0.0f, 1.0f, 1);
        f = x3cVar2;
        x3c x3cVar3 = new x3c("scRGB-nl IEC 61966-2-2:2003", fArr, y3gVar, null, new r82(3), new r82(4), -0.799f, 2.399f, m2fVar, 2);
        g = x3cVar3;
        x3c x3cVar4 = new x3c("scRGB IEC 61966-2-2:2003", fArr, y3gVar, 1.0d, -0.5f, 7.499f, 3);
        h = x3cVar4;
        x3c x3cVar5 = new x3c("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, y3gVar, new m2f(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = x3cVar5;
        x3c x3cVar6 = new x3c("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, y3gVar, new m2f(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = x3cVar6;
        x3c x3cVar7 = new x3c("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new y3g(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = x3cVar7;
        x3c x3cVar8 = new x3c("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, y3gVar, m2fVar, 7);
        l = x3cVar8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        x3c x3cVar9 = new x3c("NTSC (1953)", fArr2, cgg.j, new m2f(d4, d5, d6, d2, d3), 8);
        m = x3cVar9;
        x3c x3cVar10 = new x3c("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, y3gVar, new m2f(d4, d5, d6, d2, d3), 9);
        n = x3cVar10;
        x3c x3cVar11 = new x3c("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, y3gVar, 2.2d, 0.0f, 1.0f, 10);
        o = x3cVar11;
        x3c x3cVar12 = new x3c("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, cgg.k, new m2f(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = x3cVar12;
        y3g y3gVar2 = cgg.l;
        x3c x3cVar13 = new x3c("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, y3gVar2, 1.0d, -65504.0f, 65504.0f, 12);
        q = x3cVar13;
        x3c x3cVar14 = new x3c("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, y3gVar2, 1.0d, -65504.0f, 65504.0f, 13);
        r = x3cVar14;
        eu7 eu7Var = new eu7(14, 1, 12884901889L, "Generic XYZ");
        s = eu7Var;
        eu7 eu7Var2 = new eu7(15, 0, 12884901890L, "Generic L*a*b*");
        t = eu7Var2;
        x3c x3cVar15 = new x3c("None", fArr, y3gVar, m2fVar2, 16);
        u = x3cVar15;
        x3c x3cVar16 = new x3c("Hybrid Log Gamma encoding", fArr3, y3gVar, null, new r82(5), new r82(6), 0.0f, 1.0f, m2fVar3, 17);
        v = x3cVar16;
        x3c x3cVar17 = new x3c("Perceptual Quantizer encoding", fArr3, y3gVar, null, new r82(7), new r82(8), 0.0f, 1.0f, m2fVar4, 18);
        w = x3cVar17;
        km9 km9Var = new km9(19, 12884901890L, "Oklab");
        x = km9Var;
        y = new p82[]{x3cVar, x3cVar2, x3cVar3, x3cVar4, x3cVar5, x3cVar6, x3cVar7, x3cVar8, x3cVar9, x3cVar10, x3cVar11, x3cVar12, x3cVar13, x3cVar14, eu7Var, eu7Var2, x3cVar15, x3cVar16, x3cVar17, km9Var};
    }

    public static double a(m2f m2fVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = m2fVar.b;
        double d6 = m2fVar.c;
        double d7 = m2fVar.d;
        double d8 = m2fVar.e;
        double d9 = m2fVar.f;
        double d10 = d5 * d4;
        return (m2fVar.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(m2f m2fVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / m2fVar.b;
        double d5 = 1.0d / m2fVar.c;
        double d6 = 1.0d / m2fVar.d;
        double d7 = m2fVar.e;
        double d8 = m2fVar.f;
        double d9 = (d2 * d3) / (m2fVar.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(m2f m2fVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = m2fVar.b;
        double d6 = m2fVar.d;
        double dPow = (Math.pow(d4, d6) * m2fVar.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * m2fVar.f) + m2fVar.e), m2fVar.g) * d3;
    }

    public static double d(m2f m2fVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -m2fVar.b;
        double d6 = m2fVar.e;
        double d7 = 1.0d / m2fVar.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-m2fVar.f)) + m2fVar.c), 1.0d / m2fVar.d) * d3;
    }
}
