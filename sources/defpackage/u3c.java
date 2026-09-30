package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u3c {
    public static gx6 a;

    public static final void a(final List list, final yx9 yx9Var, j09 j09Var, float f, boolean z, l46 l46Var, int i) {
        float f2;
        boolean z2;
        yx9Var.getClass();
        l46Var.h0(1179912849);
        int i2 = i | (l46Var.g(list) ? 4 : 2) | (l46Var.g(yx9Var) ? 32 : 16) | 27648;
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            float aspectRatio = ((die) l46Var.k(snd.a)).a.getAspectRatio();
            Float fValueOf = Float.valueOf(aspectRatio);
            if (aspectRatio <= 0.0f) {
                fValueOf = null;
            }
            final float f3 = 88.0f;
            final float fFloatValue = 88.0f / (fValueOf != null ? fValueOf.floatValue() : 0.5714286f);
            final sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            final float fP0 = sw3Var.p0(88.0f) * 0.1f;
            nk8.d(b21.u(bzd.x(j09Var, new fnc(7)), new fnc(8)), null, af1.b0(1769695739, new n26() { // from class: foc
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    e31 e31Var = (e31) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = e31Var.d();
                        final float f4 = f3;
                        float f5 = ((yi4) mh3.l(new yi4((fD - f4) / 2.0f), new yi4(0.0f))).a;
                        final sw3 sw3Var2 = sw3Var;
                        final float fP1 = sw3Var2.p0(f4);
                        bx9 bx9VarQ = ynb.q(f5, 0.0f, 2);
                        final List list2 = list;
                        int size = list2.size();
                        final yx9 yx9Var2 = yx9Var;
                        final float f6 = fP0;
                        final float f7 = fFloatValue;
                        cn1.h(0.0f, size, 0, 16362, null, af1.b0(-511109350, new o26() { // from class: hoc
                            @Override // defpackage.o26
                            public final Object t(Object obj4, Object obj5, Object obj6, Object obj7) {
                                float f8;
                                float fA;
                                float fA2;
                                float fA3;
                                int i3;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                l46 l46Var3 = (l46) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                ((rx9) obj4).getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= l46Var3.e(iIntValue2) ? 32 : 16;
                                }
                                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                    List list3 = list2;
                                    djc djcVar = (djc) list3.get(iIntValue2);
                                    yx9 yx9Var3 = yx9Var2;
                                    float fJ = (iIntValue2 - ((sz9) yx9Var3.d.c).j()) - ((qz9) yx9Var3.d.d).j();
                                    int size2 = list3.size();
                                    if (size2 <= 0) {
                                        f8 = fJ;
                                    } else {
                                        float f9 = size2;
                                        f8 = ((fJ % f9) + f9) % f9;
                                        if (f8 > f9 / 2.0f) {
                                            f8 -= f9;
                                        }
                                    }
                                    float fAbs = Math.abs(f8);
                                    float fSignum = Math.signum(f8);
                                    if (fAbs <= 1.0f) {
                                        fA = ((-28.0f) * fAbs) + 154.0f;
                                    } else {
                                        fA = fAbs <= 2.0f ? ks0.a(fAbs, 1.0f, -20.0f, 126.0f) : 106.0f;
                                    }
                                    float f10 = fA / 154.0f;
                                    if (fAbs <= 1.0f) {
                                        fA2 = ((-24.0f) * fAbs) + 88.0f;
                                    } else {
                                        fA2 = fAbs <= 2.0f ? ks0.a(fAbs, 1.0f, -10.0f, 64.0f) : 54.0f;
                                    }
                                    float fAcos = ((float) Math.acos(mh3.n(fA2 / (88.0f * f10), -1.0f, 1.0f))) * 57.295776f;
                                    if (fAbs <= 1.0f) {
                                        fA3 = 74.0f * fAbs;
                                    } else {
                                        fA3 = fAbs <= 2.0f ? ks0.a(fAbs, 1.0f, 46.0f, 74.0f) : ks0.a(fAbs, 2.0f, 46.0f, 120.0f);
                                    }
                                    float fP2 = sw3Var2.p0(fA3 * fSignum) - (fJ * fP1);
                                    float f11 = (-fSignum) * fAcos;
                                    float f12 = fAbs - 1.0f;
                                    if (f12 < 0.0f) {
                                        f12 = 0.0f;
                                    }
                                    float fN = mh3.n(1.0f - (f12 * 0.3f), 0.0f, 1.0f);
                                    float size3 = list3.size() / 2.0f;
                                    float fN2 = fN * (size3 > 2.0f ? mh3.n((size3 - fAbs) / (size3 - 2.0f), 0.0f, 1.0f) : 1.0f);
                                    float fMin = Math.min(1.0f, fAbs) * 2.0f;
                                    j09 j09VarW = fdc.w(b.b, -fAbs);
                                    boolean zD = l46Var3.d(fP2);
                                    Object objR = l46Var3.R();
                                    i8c i8cVar = sf2.a;
                                    if (zD || objR == i8cVar) {
                                        objR = new uc2(11, fP2);
                                        l46Var3.p0(objR);
                                    }
                                    j09 j09VarX = bzd.x(j09VarW, (a26) objR);
                                    lx0 lx0Var = ndb.f;
                                    xn8 xn8VarC = s21.c(lx0Var, false);
                                    int iHashCode = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM = l46Var3.m();
                                    j09 j09VarJ = m93.J(l46Var3, j09VarX);
                                    lf2.q.getClass();
                                    l46Var3.j0();
                                    boolean z3 = l46Var3.S;
                                    ov7 ov7Var = LayoutNode.h1;
                                    if (z3) {
                                        l46Var3.l(ov7Var);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    he2 he2Var = hj6.z;
                                    dec.l(he2Var, l46Var3, xn8VarC);
                                    he2 he2Var2 = hj6.y;
                                    dec.l(he2Var2, l46Var3, u8aVarM);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    he2 he2Var3 = hj6.X;
                                    dec.l(he2Var3, l46Var3, numValueOf);
                                    dec.k(l46Var3);
                                    he2 he2Var4 = hj6.x;
                                    dec.l(he2Var4, l46Var3, j09VarJ);
                                    g09 g09Var = g09.a;
                                    float f13 = f4;
                                    j09 j09VarD = b.p(g09Var, f13).D(od4.i(g09Var, fMin));
                                    boolean zD2 = l46Var3.d(f10) | l46Var3.d(f11);
                                    float f14 = f6;
                                    boolean zD3 = zD2 | l46Var3.d(f14) | l46Var3.d(fN2);
                                    Object objR2 = l46Var3.R();
                                    if (zD3 || objR2 == i8cVar) {
                                        objR2 = new tl3(f10, f11, f14, fN2, 1);
                                        l46Var3.p0(objR2);
                                    }
                                    j09 j09VarX2 = bzd.x(j09VarD, (a26) objR2);
                                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var3, 54);
                                    int iHashCode2 = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM2 = l46Var3.m();
                                    j09 j09VarJ2 = m93.J(l46Var3, j09VarX2);
                                    l46Var3.j0();
                                    if (l46Var3.S) {
                                        l46Var3.l(ov7Var);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    dec.l(he2Var, l46Var3, c92VarA);
                                    dec.l(he2Var2, l46Var3, u8aVarM2);
                                    ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
                                    dec.l(he2Var4, l46Var3, j09VarJ2);
                                    o7c.d(b.d(b.p(g09Var, f13), f7), djcVar.b, null, false, null, 8.0f, null, false, l46Var3, 196608, 220);
                                    t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var3, 54);
                                    int iHashCode3 = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM3 = l46Var3.m();
                                    j09 j09VarJ3 = m93.J(l46Var3, g09Var);
                                    l46Var3.j0();
                                    if (l46Var3.S) {
                                        l46Var3.l(ov7Var);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    dec.l(he2Var, l46Var3, t7cVarA);
                                    dec.l(he2Var2, l46Var3, u8aVarM3);
                                    ib8.s(iHashCode3, l46Var3, he2Var3, l46Var3);
                                    dec.l(he2Var4, l46Var3, j09VarJ3);
                                    if (djcVar.b.b == 0) {
                                        l46Var3.f0(-155214830);
                                        j09 j09VarS = b.s(g09Var, lx0Var, 2);
                                        pr4 pr4Var = l8b.a;
                                        j09 j09VarA0 = ynb.a0(tm7.o(j09VarS, ((e8b) l46Var3.k(pr4Var)).m, a7c.b(2.0f)), 4.0f, 1.0f);
                                        String strQ = afc.q(R.string.seasonal_reading_reversed, l46Var3);
                                        mue mueVar = pue.a;
                                        i3 = 3;
                                        nte.b(strQ, j09VarA0, ((e8b) l46Var3.k(pr4Var)).r, w6c.l(8), null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.h(l46Var3), l46Var3, 24576, 0, 130024);
                                        l46Var3 = l46Var3;
                                        l46Var3.r(false);
                                    } else {
                                        i3 = 3;
                                        l46Var3.f0(-154718520);
                                        l46Var3.r(false);
                                    }
                                    String str = djcVar.c;
                                    mue mueVar2 = pue.a;
                                    l46 l46Var4 = l46Var3;
                                    nte.b(str, null, ((e8b) l46Var3.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(i3), 0L, 2, false, 1, 0, null, pue.g(l46Var3), l46Var4, 0, 24960, 109562);
                                    tec.s(l46Var4, true, true, true);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2), l46Var2, null, null, null, bx9VarQ, null, yx9Var2, null, null, false);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3072, 6);
            f2 = 88.0f;
            z2 = true;
        } else {
            l46Var.Z();
            f2 = f;
            z2 = z;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new goc(list, yx9Var, j09Var, f2, z2, i);
        }
    }

    public static final long b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            j37.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = eue.c;
        return j;
    }

    public static float c(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static final long d(int i, long j) {
        int i2 = eue.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : b(i4, i);
    }

    public static dr8 e(String str, Collection collection) {
        dr8 sv1Var;
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(t72.u(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((tt7) it.next()).F());
        }
        cqd cqdVarL = sfc.l(arrayList);
        int i = cqdVarL.a;
        if (i != 0) {
            sv1Var = i != 1 ? new sv1(str, (dr8[]) cqdVarL.toArray(new dr8[0])) : (dr8) cqdVarL.get(0);
        } else {
            sv1Var = cr8.b;
        }
        return cqdVarL.a <= 1 ? sv1Var : new p18(sv1Var);
    }

    public static String f(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static final gx6 g() {
        gx6 gx6Var = a;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Share", 28.0f, 28.0f, 28.0f, 28.0f, 0L, 0, false, 224);
        dtd dtdVar = new dtd(abg.d(4285100242L));
        s71 s71Var = new s71(1);
        s71Var.p(8.9287f, 23.0234f);
        s71Var.i(7.956f, 23.0234f, 7.2148f, 22.7715f, 6.7051f, 22.2676f);
        s71Var.i(6.2012f, 21.7695f, 5.9492f, 21.0371f, 5.9492f, 20.0703f);
        s71Var.s(11.5098f);
        s71Var.i(5.9492f, 10.543f, 6.2012f, 9.8105f, 6.7051f, 9.3125f);
        s71Var.i(7.2148f, 8.8086f, 7.956f, 8.5566f, 8.9287f, 8.5566f);
        s71Var.l(11.4072f);
        s71Var.s(10.5166f);
        s71Var.l(9.0869f);
        s71Var.i(8.7002f, 10.5166f, 8.4043f, 10.6162f, 8.1992f, 10.8154f);
        s71Var.i(8.0f, 11.0088f, 7.9004f, 11.3076f, 7.9004f, 11.7119f);
        s71Var.s(19.8682f);
        s71Var.i(7.9004f, 20.2725f, 8.0f, 20.5742f, 8.1992f, 20.7734f);
        s71Var.i(8.4043f, 20.9727f, 8.7002f, 21.0723f, 9.0869f, 21.0723f);
        s71Var.l(18.9043f);
        s71Var.i(19.2852f, 21.0723f, 19.5781f, 20.9727f, 19.7832f, 20.7734f);
        s71Var.i(19.9883f, 20.5742f, 20.0908f, 20.2725f, 20.0908f, 19.8682f);
        s71Var.s(11.7119f);
        s71Var.i(20.0908f, 11.3076f, 19.9883f, 11.0088f, 19.7832f, 10.8154f);
        s71Var.i(19.5781f, 10.6162f, 19.2852f, 10.5166f, 18.9043f, 10.5166f);
        s71Var.l(16.5928f);
        s71Var.s(8.5566f);
        s71Var.l(19.0713f);
        s71Var.i(20.0439f, 8.5566f, 20.7822f, 8.8086f, 21.2861f, 9.3125f);
        s71Var.i(21.7959f, 9.8164f, 22.0508f, 10.5488f, 22.0508f, 11.5098f);
        s71Var.s(20.0703f);
        s71Var.i(22.0508f, 21.0312f, 21.7959f, 21.7637f, 21.2861f, 22.2676f);
        s71Var.i(20.7822f, 22.7715f, 20.0439f, 23.0234f, 19.0713f, 23.0234f);
        s71Var.l(8.9287f);
        s71Var.h();
        s71Var.p(13.9912f, 15.9307f);
        s71Var.i(13.7451f, 15.9307f, 13.5342f, 15.8428f, 13.3584f, 15.667f);
        s71Var.i(13.1826f, 15.4912f, 13.0947f, 15.2832f, 13.0947f, 15.043f);
        s71Var.s(6.3066f);
        s71Var.n(13.1738f, 5.0146f);
        s71Var.n(12.6641f, 5.6738f);
        s71Var.n(11.5039f, 6.9131f);
        s71Var.i(11.3457f, 7.083f, 11.1465f, 7.168f, 10.9062f, 7.168f);
        s71Var.i(10.6895f, 7.168f, 10.502f, 7.0977f, 10.3438f, 6.957f);
        s71Var.i(10.1914f, 6.8106f, 10.1152f, 6.626f, 10.1152f, 6.4033f);
        s71Var.i(10.1152f, 6.1982f, 10.1973f, 6.0107f, 10.3613f, 5.8408f);
        s71Var.n(13.2969f, 3.0195f);
        s71Var.i(13.4199f, 2.9023f, 13.5371f, 2.8232f, 13.6484f, 2.7822f);
        s71Var.i(13.7598f, 2.7353f, 13.874f, 2.7119f, 13.9912f, 2.7119f);
        s71Var.i(14.1143f, 2.7119f, 14.2314f, 2.7353f, 14.3428f, 2.7822f);
        s71Var.i(14.46f, 2.8232f, 14.5771f, 2.9023f, 14.6943f, 3.0195f);
        s71Var.n(17.6299f, 5.8408f);
        s71Var.i(17.7939f, 6.0107f, 17.876f, 6.1982f, 17.876f, 6.4033f);
        s71Var.i(17.876f, 6.626f, 17.7969f, 6.8106f, 17.6387f, 6.957f);
        s71Var.i(17.4805f, 7.0977f, 17.2959f, 7.168f, 17.085f, 7.168f);
        s71Var.i(16.8506f, 7.168f, 16.6543f, 7.083f, 16.4961f, 6.9131f);
        s71Var.n(15.3271f, 5.6738f);
        s71Var.n(14.8262f, 5.0146f);
        s71Var.n(14.8965f, 6.3066f);
        s71Var.s(15.043f);
        s71Var.i(14.8965f, 15.2832f, 14.8086f, 15.4912f, 14.6328f, 15.667f);
        s71Var.i(14.4629f, 15.8428f, 14.249f, 15.9307f, 13.9912f, 15.9307f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 0.0f, 0, 4.0f);
        gx6 gx6VarB = fx6Var.b();
        a = gx6VarB;
        return gx6VarB;
    }

    public static v4g h(Context context, r4g r4gVar) {
        boolean zB;
        hs3 hs3Var;
        context.getClass();
        int iOrdinal = r4gVar.ordinal();
        if (iOrdinal == 0) {
            List list = g6g.a;
            zB = g6g.b(context);
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return null;
            }
            List list2 = g6g.a;
            zB = g6g.a(context, "ai.askquin.widget.QuickDecisionWidgetReceiver");
        }
        int iOrdinal2 = r4gVar.ordinal();
        if (iOrdinal2 == 0) {
            hs3Var = xqa.E0;
        } else {
            if (iOrdinal2 != 1) {
                ap.c();
                return null;
            }
            hs3Var = xqa.G0;
        }
        o5g o5gVar = new o5g(hs3Var.a, hs3Var.b, null);
        nu4 nu4Var = nu4.a;
        boolean zBooleanValue = ((Boolean) z5c.I(nu4Var, o5gVar)).booleanValue();
        hs3 hs3Var2 = xqa.H0;
        return new v4g((String) z5c.I(nu4Var, new p5g(hs3Var2.a, hs3Var2.b, null)), zB, zBooleanValue);
    }

    public static final String i(long j, CharSequence charSequence) {
        return charSequence.subSequence(eue.g(j), eue.f(j)).toString();
    }

    public static String j() {
        th5 th5Var = cye.b;
        return gcc.E(z57.a.a(), fbc.d()).a().toString();
    }

    public static String k(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(l(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(l(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String l(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strJ = ib8.j(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strJ), (Throwable) e);
            return tec.m("<", strJ, " threw ", e.getClass().getName(), ">");
        }
    }
}
