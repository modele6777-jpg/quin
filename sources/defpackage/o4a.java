package defpackage;

import ai.askquin.R;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o4a {
    public static final List a = t72.I(Integer.valueOf(R.string.paywall_carousel_social_proof), Integer.valueOf(R.string.paywall_carousel_real_draw), Integer.valueOf(R.string.paywall_carousel_deep_reading), Integer.valueOf(R.string.paywall_carousel_follow_up), Integer.valueOf(R.string.paywall_carousel_spreads), Integer.valueOf(R.string.paywall_carousel_decks));

    public static final void a(j09 j09Var, bx9 bx9Var, l46 l46Var, int i) {
        j09 j09Var2;
        Object obj;
        Object objI;
        long j;
        y02 y02Var = g21.f;
        l46Var.h0(-568586054);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Integer numValueOf = Integer.valueOf(R.drawable.img_paywall_slide6);
            Locale locale = ((Configuration) l46Var.k(uq.a)).getLocales().get(0);
            String language = locale.getLanguage();
            String country = locale.getCountry();
            b1b b1bVar = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(b1bVar));
            boolean zB = if9.B(l46Var);
            boolean zG = l46Var.g(language) | l46Var.g(country) | l46Var.h(zF) | l46Var.h(zB);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (zG || objR == obj2) {
                if (zF) {
                    objR = t72.I(Integer.valueOf(b(language, country, R.drawable.img_paywall_slide1_en_neo, R.drawable.img_paywall_slide1_zh_neo, R.drawable.img_paywall_slide1_zhtw_neo, R.drawable.img_paywall_slide1_ja_neo, R.drawable.img_paywall_slide1_ko_neo, R.drawable.img_paywall_slide1_es_neo)), Integer.valueOf(R.drawable.img_paywall_slide2_neo), Integer.valueOf(b(language, country, R.drawable.img_paywall_slide3_en_neo, R.drawable.img_paywall_slide3_zh_neo, R.drawable.img_paywall_slide3_zhtw_neo, R.drawable.img_paywall_slide3_ja_neo, R.drawable.img_paywall_slide3_ko_neo, R.drawable.img_paywall_slide3_es_neo)), Integer.valueOf(b(language, country, R.drawable.img_paywall_slide4_en_neo, R.drawable.img_paywall_slide4_zh_neo, R.drawable.img_paywall_slide4_zhtw_neo, R.drawable.img_paywall_slide4_ja_neo, R.drawable.img_paywall_slide4_ko_neo, R.drawable.img_paywall_slide4_es_neo)), Integer.valueOf(b(language, country, R.drawable.img_paywall_slide5_en_neo, R.drawable.img_paywall_slide5_zh_neo, R.drawable.img_paywall_slide5_zhtw_neo, R.drawable.img_paywall_slide5_ja_neo, R.drawable.img_paywall_slide5_ko_neo, R.drawable.img_paywall_slide5_es_neo)), Integer.valueOf(R.drawable.img_paywall_slide6_neo));
                    obj = obj2;
                } else {
                    if (zB) {
                        obj = obj2;
                        objI = t72.I(Integer.valueOf(b(language, country, R.drawable.img_paywall_slide1_en_dark, R.drawable.img_paywall_slide1_zh_dark, R.drawable.img_paywall_slide1_zhtw_dark, R.drawable.img_paywall_slide1_ja_dark, R.drawable.img_paywall_slide1_ko_dark, R.drawable.img_paywall_slide1_es_dark)), Integer.valueOf(R.drawable.img_paywall_slide2_dark), Integer.valueOf(b(language, country, R.drawable.img_paywall_slide3_en_dark, R.drawable.img_paywall_slide3_zh_dark, R.drawable.img_paywall_slide3_zhtw_dark, R.drawable.img_paywall_slide3_ja_dark, R.drawable.img_paywall_slide3_ko_dark, R.drawable.img_paywall_slide3_es_dark)), Integer.valueOf(b(language, country, R.drawable.img_paywall_slide4_en_dark, R.drawable.img_paywall_slide4_zh_dark, R.drawable.img_paywall_slide4_zhtw_dark, R.drawable.img_paywall_slide4_ja_dark, R.drawable.img_paywall_slide4_ko_dark, R.drawable.img_paywall_slide4_es_dark)), Integer.valueOf(b(language, country, R.drawable.img_paywall_slide5_en_dark, R.drawable.img_paywall_slide5_zh_dark, R.drawable.img_paywall_slide5_zhtw_dark, R.drawable.img_paywall_slide5_ja_dark, R.drawable.img_paywall_slide5_ko_dark, R.drawable.img_paywall_slide5_es_dark)), numValueOf);
                    } else {
                        obj = obj2;
                        objI = t72.I(Integer.valueOf(b(language, country, R.drawable.img_paywall_slide1_en, R.drawable.img_paywall_slide1_zh, R.drawable.img_paywall_slide1_zhtw, R.drawable.img_paywall_slide1_ja, R.drawable.img_paywall_slide1_ko, R.drawable.img_paywall_slide1_es)), Integer.valueOf(R.drawable.img_paywall_slide2), Integer.valueOf(b(language, country, R.drawable.img_paywall_slide3_en, R.drawable.img_paywall_slide3_zh, R.drawable.img_paywall_slide3_zhtw, R.drawable.img_paywall_slide3_ja, R.drawable.img_paywall_slide3_ko, R.drawable.img_paywall_slide3_es)), Integer.valueOf(b(language, country, R.drawable.img_paywall_slide4_en, R.drawable.img_paywall_slide4_zh, R.drawable.img_paywall_slide4_zhtw, R.drawable.img_paywall_slide4_ja, R.drawable.img_paywall_slide4_ko, R.drawable.img_paywall_slide4_es)), Integer.valueOf(b(language, country, R.drawable.img_paywall_slide5_en, R.drawable.img_paywall_slide5_zh, R.drawable.img_paywall_slide5_zhtw, R.drawable.img_paywall_slide5_ja, R.drawable.img_paywall_slide5_ko, R.drawable.img_paywall_slide5_es)), numValueOf);
                    }
                    objR = objI;
                }
                l46Var.p0(objR);
            } else {
                obj = obj2;
            }
            List list = (List) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new vy9(10);
                l46Var.p0(objR2);
            }
            cs3 cs3VarB = ay9.b(0, 384, 3, (x16) objR2, l46Var);
            boolean zG2 = l46Var.g(cs3VarB);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                objR3 = new n4a(cs3VarB, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, cs3VarB);
            g09 g09Var = g09.a;
            j09 j09VarD = b.d(b.c(g09Var, 1.0f), 472.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            x16 x16Var = LayoutNode.h1;
            if (z) {
                l46Var.l(x16Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf2);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            cn1.h(0.0f, 0, 48, 16380, null, af1.b0(-239488813, new m4a(list, 0), l46Var), l46Var, b.c, null, null, null, null, cs3VarB, null, null, false);
            long j2 = ((e8b) l46Var.k(b1bVar)).e;
            lx0 lx0Var = ndb.w;
            d31 d31Var = d31.a;
            j09Var2 = g09Var;
            s21.a(tm7.n(b.d(b.c(d31Var.a(j09Var2, lx0Var), 1.0f), 40.0f), gec.N(0.0f, 14, t72.I(new y72(y72.j), new y72(j2))), null, 6), l46Var, 0);
            j09 j09VarA0 = ynb.a0(tm7.o(oa7.E(ynb.d0(0.0f, 0.0f, 0.0f, 8.0f, 7, d31Var.a(j09Var2, lx0Var)), a7c.a), ((e8b) l46Var.k(b1bVar)).h, y02Var), 8.0f, 4.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var, 6);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarA0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(x16Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            l46Var.f0(-242441243);
            int i3 = 0;
            while (i3 < 6) {
                boolean z2 = ((sz9) cs3VarB.d.c).j() == i3;
                j09 j09VarE = oa7.E(b.l(j09Var2, 8.0f), a7c.a);
                if (z2) {
                    l46Var.f0(1384517229);
                    j = ((e8b) l46Var.k(l8b.a)).u;
                    l46Var.r(false);
                } else {
                    l46Var.f0(1384518518);
                    j = ((e8b) l46Var.k(l8b.a)).A;
                    l46Var.r(false);
                }
                s21.a(tm7.o(j09VarE, j, y02Var), l46Var, 0);
                i3++;
            }
            tec.s(l46Var, false, true, true);
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(j09Var2, bx9Var, i, 19);
        }
    }

    public static final int b(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        if (pa7.t(str, "zh") && (pa7.t(str2, "TW") || pa7.t(str2, "HK"))) {
            return i3;
        }
        if (pa7.t(str, "zh")) {
            return i2;
        }
        if (pa7.t(str, "ja")) {
            return i4;
        }
        if (pa7.t(str, "ko")) {
            return i5;
        }
        return pa7.t(str, "es") ? i6 : i;
    }
}
