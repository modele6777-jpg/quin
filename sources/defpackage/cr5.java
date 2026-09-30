package defpackage;

import ai.askquin.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cr5 {
    public static final cq5 a;
    public static final cq5 b;
    public static final cq5 c;
    public static final cq5 d;
    public static final cq5 e;
    public static final cq5 f;
    public static final ace g;
    public static final cq5 h;

    static {
        List listAsList = Arrays.asList(urg.f(R.font.smileysans_oblique, null, 14));
        listAsList.getClass();
        a = new cq5(listAsList);
        ar5 ar5Var = ar5.z;
        zxb zxbVarF = urg.f(R.font.droidserif_bold, ar5Var, 12);
        zxb zxbVarF2 = urg.f(R.font.droidserif_bolditalic, ar5Var, 8);
        ar5 ar5Var2 = ar5.w;
        List listAsList2 = Arrays.asList(zxbVarF, zxbVarF2, urg.f(R.font.droidserif_italic, ar5Var2, 8), urg.f(R.font.droidserif_regular, ar5Var2, 12));
        listAsList2.getClass();
        b = new cq5(listAsList2);
        ar5 ar5Var3 = ar5.y;
        List listAsList3 = Arrays.asList(urg.f(R.font.sweispringcjksc_semibold, ar5Var3, 12));
        listAsList3.getClass();
        c = new cq5(listAsList3);
        List listAsList4 = Arrays.asList(urg.f(R.font.nothingyoucoulddo_regular, null, 14));
        listAsList4.getClass();
        d = new cq5(listAsList4);
        List listAsList5 = Arrays.asList(urg.f(R.font.anaheim, null, 14));
        listAsList5.getClass();
        e = new cq5(listAsList5);
        ar5 ar5Var4 = ar5.Y;
        zxb zxbVarF3 = urg.f(R.font.notoserif_black, ar5Var4, 12);
        ar5 ar5Var5 = ar5.X;
        zxb zxbVarF4 = urg.f(R.font.notoserif_extrabold, ar5Var5, 12);
        zxb zxbVarF5 = urg.f(R.font.notoserif_bold, ar5Var, 12);
        zxb zxbVarF6 = urg.f(R.font.notoserif_semibold, ar5Var3, 12);
        ar5 ar5Var6 = ar5.x;
        zxb zxbVarF7 = urg.f(R.font.notoserif_medium, ar5Var6, 12);
        zxb zxbVarF8 = urg.f(R.font.notoserif_regular, ar5Var2, 12);
        ar5 ar5Var7 = ar5.v;
        zxb zxbVarF9 = urg.f(R.font.notoserif_light, ar5Var7, 12);
        ar5 ar5Var8 = ar5.g;
        zxb zxbVarF10 = urg.f(R.font.notoserif_extralight, ar5Var8, 12);
        ar5 ar5Var9 = ar5.f;
        List listAsList6 = Arrays.asList(zxbVarF3, zxbVarF4, zxbVarF5, zxbVarF6, zxbVarF7, zxbVarF8, zxbVarF9, zxbVarF10, urg.f(R.font.notoserif_thin, ar5Var9, 12), urg.f(R.font.notoserif_blackitalic, ar5Var4, 8), urg.f(R.font.notoserif_extrabolditalic, ar5Var5, 8), urg.f(R.font.notoserif_bolditalic, ar5Var, 8), urg.f(R.font.notoserif_semibolditalic, ar5Var3, 8), urg.f(R.font.notoserif_mediumitalic, ar5Var6, 8), urg.f(R.font.notoserif_italic, ar5Var2, 8), urg.f(R.font.notoserif_lightitalic, ar5Var7, 8), urg.f(R.font.notoserif_extralightitalic, ar5Var8, 8), urg.f(R.font.notoserif_thinitalic, ar5Var9, 8));
        listAsList6.getClass();
        cq5 cq5Var = new cq5(listAsList6);
        f = cq5Var;
        g = new ace(new mz4(20));
        h = cq5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (defpackage.pa7.t(r1, defpackage.vd8.c(r0)) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.cq5 a(defpackage.l46 r1) {
        /*
            pr4 r0 = defpackage.uq.a
            java.lang.Object r1 = r1.k(r0)
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            android.os.LocaleList r1 = r1.getLocales()
            r0 = 0
            java.util.Locale r1 = r1.get(r0)
            java.util.Locale[] r0 = defpackage.vd8.a
            r1.getClass()
            java.lang.String r1 = defpackage.vd8.c(r1)
            java.util.Locale r0 = java.util.Locale.SIMPLIFIED_CHINESE
            r0.getClass()
            java.lang.String r0 = defpackage.vd8.c(r0)
            boolean r0 = defpackage.pa7.t(r1, r0)
            if (r0 == 0) goto L2a
            goto L49
        L2a:
            java.util.Locale r0 = java.util.Locale.CHINESE
            r0.getClass()
            java.lang.String r0 = defpackage.vd8.c(r0)
            boolean r0 = defpackage.pa7.t(r1, r0)
            if (r0 != 0) goto L4c
            java.util.Locale r0 = java.util.Locale.TRADITIONAL_CHINESE
            r0.getClass()
            java.lang.String r0 = defpackage.vd8.c(r0)
            boolean r1 = defpackage.pa7.t(r1, r0)
            if (r1 == 0) goto L49
            goto L4c
        L49:
            cq5 r1 = defpackage.cr5.a
            return r1
        L4c:
            cq5 r1 = defpackage.cr5.b
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr5.a(l46):cq5");
    }

    public static cq5 b() {
        if (c5e.C(vd8.a(), "zh", false) || c5e.C(vd8.a(), "ja", false) || c5e.C(vd8.a(), "ko", false)) {
            return c;
        }
        return c5e.C(vd8.a(), "es", false) ? d : b;
    }

    public static yp5 c() {
        return vd8.d().equals("cn") ? (yp5) g.getValue() : h;
    }
}
