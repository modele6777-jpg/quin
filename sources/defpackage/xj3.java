package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.res.Configuration;
import android.graphics.Color;
import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xj3 {
    public static final long a = abg.d(4279768633L);
    public static final long b;
    public static final long c;
    public static final long d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;

    static {
        int i2 = y72.l;
        b = gec.F(237.0f, 0.5f, 1.0f, 0.0f, 24);
        c = abg.d(4283585106L);
        d = abg.d(4293651435L);
        e = 96.0f;
        f = 28.0f;
        g = 32.0f;
        h = 32.0f;
        i = 6.0f;
        j = 4.0f;
        k = 3.0f;
    }

    public static final void a(int i2, x16 x16Var, l46 l46Var, j09 j09Var, boolean z) {
        l46 l46Var2;
        j09 j09VarA;
        x16Var.getClass();
        l46Var.h0(-1576706430);
        int i3 = (l46Var.h(z) ? 4 : 2) | i2 | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = ib8.e(l46Var);
            }
            j09 j09VarB = b.b(androidx.compose.foundation.layout.b.l(j09Var, 44.0f), (t69) objR, null, z, null, x16Var, 24);
            g09 g09Var = g09.a;
            if (z) {
                l46Var.f0(908593962);
                l46Var.r(false);
                j09VarA = g09Var;
            } else {
                l46Var.f0(908594713);
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new i73(18);
                    l46Var.p0(objR2);
                }
                j09VarA = vwc.a(g09Var, (a26) objR2);
                l46Var.r(false);
            }
            j09 j09VarD = j09VarB.D(j09VarA);
            lx0 lx0Var = ndb.f;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            boolean z2 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            j09 j09VarL = androidx.compose.foundation.layout.b.l(g09Var, 24.0f);
            y6c y6cVar = a7c.a;
            j09 j09VarE = oa7.E(j09VarL, y6cVar);
            pr4 pr4Var = l8b.a;
            j09 j09VarW = db6.w(tm7.o(j09VarE, ((e8b) l46Var.k(pr4Var)).m, g21.f), 0.5f, ((e8b) l46Var.k(pr4Var)).A, y6cVar);
            xn8 xn8VarC2 = s21.c(lx0Var, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarW);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            l46Var2 = l46Var;
            gu6.b(od4.A(R.drawable.ic_deck_box_expand, 0, l46Var), afc.q(R.string.skin_examine_deck_box, l46Var), androidx.compose.foundation.layout.b.l(g09Var, 24.0f), ((e8b) l46Var.k(pr4Var)).r, l46Var2, 392, 0);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ii3(z, x16Var, j09Var, i2);
        }
    }

    public static final void b(int i2, long j2, l46 l46Var, j09 j09Var) {
        l46Var.h0(-1990172384);
        int i3 = 4;
        int i4 = (l46Var.f(j2) ? 4 : 2) | i2 | (l46Var.g(j09Var) ? 32 : 16);
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            boolean z = (i4 & 14) == 4;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new ac(j2, i3);
                l46Var.p0(objR);
            }
            nk8.e((i4 >> 3) & 14, (a26) objR, l46Var, j09Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cr(j2, j09Var, i2, 1);
        }
    }

    public static final void c(final pl3 pl3Var, final hmd hmdVar, final y72 y72Var, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final j09 j09Var, l46 l46Var, final int i2) {
        ojb ojbVarV;
        l26 l26Var;
        l46Var.h0(619306577);
        int i3 = i2 | (l46Var.e(pl3Var.ordinal()) ? 4 : 2) | (l46Var.g(hmdVar) ? 32 : 16) | (l46Var.g(y72Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var3) ? 131072 : 65536) | (l46Var.i(x16Var4) ? 1048576 : 524288) | (l46Var.g(j09Var) ? 8388608 : 4194304);
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            if (pl3Var == pl3.b) {
                l46Var.f0(-1416944939);
                j09 j09VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(j09Var, 1.0f), 56.0f);
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarD);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                int i4 = (i3 >> 3) & 126;
                int i5 = i3 >> 9;
                n(hmdVar, y72Var, x16Var3, x16Var4, l46Var, (i5 & 7168) | i4 | (i5 & 896));
                l46Var.r(true);
                l46Var.r(false);
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i6 = 0;
                l26Var = new l26(pl3Var, hmdVar, y72Var, x16Var, x16Var2, x16Var3, x16Var4, j09Var, i2, i6) { // from class: hj3
                    public final /* synthetic */ int a;
                    public final /* synthetic */ pl3 b;
                    public final /* synthetic */ hmd c;
                    public final /* synthetic */ y72 d;
                    public final /* synthetic */ x16 e;
                    public final /* synthetic */ x16 f;
                    public final /* synthetic */ x16 g;
                    public final /* synthetic */ x16 v;
                    public final /* synthetic */ j09 w;

                    {
                        this.a = i6;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i7 = this.a;
                        wef wefVar = wef.a;
                        switch (i7) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(1);
                                xj3.c(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(1);
                                xj3.c(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP2);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                l46Var.f0(-1416395247);
                l46Var.r(false);
                pl3 pl3Var2 = pl3.c;
                x16 x16Var5 = pl3Var == pl3Var2 ? x16Var2 : x16Var;
                int i7 = pl3Var == pl3Var2 ? R.string.explore_unlock_in_mall : R.string.explore_play_this_deck;
                u51 u51VarQ = q(y72Var, l46Var);
                j09 j09VarF = androidx.compose.foundation.layout.b.f(56.0f, 0.0f, androidx.compose.foundation.layout.b.c(j09Var, 1.0f), 2);
                String strQ = afc.q(i7, l46Var);
                x4d x4dVar = eze.a(l46Var).a.a;
                x4dVar.getClass();
                if (we6.e(l46Var)) {
                    x4dVar = g21.f;
                }
                c8b.i(j09VarF, strQ, null, null, 0L, 0.0f, false, x4dVar, u51VarQ, false, null, pl3Var == pl3Var2 ? x57.i : null, x16Var5, l46Var, 0, 0, 1660);
            }
            ojbVarV.d = l26Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i8 = 1;
            l26Var = new l26(pl3Var, hmdVar, y72Var, x16Var, x16Var2, x16Var3, x16Var4, j09Var, i2, i8) { // from class: hj3
                public final /* synthetic */ int a;
                public final /* synthetic */ pl3 b;
                public final /* synthetic */ hmd c;
                public final /* synthetic */ y72 d;
                public final /* synthetic */ x16 e;
                public final /* synthetic */ x16 f;
                public final /* synthetic */ x16 g;
                public final /* synthetic */ x16 v;
                public final /* synthetic */ j09 w;

                {
                    this.a = i8;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i9 = this.a;
                    wef wefVar = wef.a;
                    switch (i9) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(1);
                            xj3.c(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(1);
                            xj3.c(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void d(TarotSkinIdentify tarotSkinIdentify, pl3 pl3Var, hmd hmdVar, y72 y72Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, j09 j09Var, l46 l46Var, int i2) {
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        l46Var.h0(-840700170);
        int i3 = i2 | (l46Var.e(tarotSkinIdentify.ordinal()) ? 4 : 2) | (l46Var.e(pl3Var.ordinal()) ? 32 : 16) | (l46Var.g(hmdVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(y72Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var2) ? 131072 : 65536) | (l46Var.i(x16Var3) ? 1048576 : 524288) | (l46Var.i(x16Var4) ? 8388608 : 4194304) | (l46Var.g(j09Var) ? 67108864 : 33554432);
        if (l46Var.W(i3 & 1, (38347923 & i3) != 38347922)) {
            mld mldVarQ = hfc.q(tarotSkinIdentify);
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = q1c.f(new yi4(0.0f));
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            j09 j09VarF = androidx.compose.foundation.layout.b.f(0.0f, ((Configuration) l46Var.k(uq.a)).screenHeightDp * 0.55f, androidx.compose.foundation.layout.b.c(j09Var, 1.0f), 1);
            y72 y72Var2 = new y72(y72.j);
            b1b b1bVar = l8b.a;
            j09 j09VarN = tm7.n(j09VarF, gec.N(0.0f, 14, t72.I(y72Var2, new y72(((e8b) l46Var.k(b1bVar)).b))), null, 6);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarN);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            x16 x16Var5 = LayoutNode.h1;
            if (z) {
                l46Var.l(x16Var5);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 16.0f, 0.0f, ((yi4) e89Var.getValue()).a, 5, ynb.b0(32.0f, 0.0f, mh3.d0(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), mh3.T(l46Var), false, 14), 2));
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(x16Var5);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            String strQ = afc.q(mldVarQ.m(), l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var.k(b1bVar)).q, 0L, null, cr5.b(), 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var), l46Var, 0, 0, 129914);
            nte.b(afc.q(mldVarQ.b(), l46Var), null, ((e8b) l46Var.k(b1bVar)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            l46Var.r(true);
            j09 j09VarA = d31.a.a(g09Var, ndb.w);
            boolean zG = l46Var.g(sw3Var);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new si3(sw3Var, e89Var, 0);
                l46Var.p0(objR2);
            }
            oa7.b(ym8.D(j09VarA, (a26) objR2), ((e8b) l46Var.k(b1bVar)).b, 20.0f, af1.b0(948857408, new aq1(pl3Var, hmdVar, y72Var, x16Var, x16Var2, x16Var3, x16Var4, 1), l46Var), l46Var, 3456, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ti3(tarotSkinIdentify, pl3Var, hmdVar, y72Var, x16Var, x16Var2, x16Var3, x16Var4, j09Var, i2);
        }
    }

    public static final void e(final TarotSkinIdentify tarotSkinIdentify, final yge ygeVar, final boolean z, final float f2, final float f3, final j09 j09Var, l46 l46Var, final int i2) {
        l46Var.h0(-2125994000);
        int i3 = i2 | (l46Var.i(ygeVar) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.d(f3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(j09Var) ? 131072 : 65536);
        if (l46Var.W(i3 & 1, (74897 & i3) != 74896)) {
            j09 j09VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(j09Var, f2), f3);
            lx0 lx0Var = ndb.f;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            long jC = a;
            int i4 = 3;
            if (ygeVar != null) {
                float[] fArr = new float[3];
                Color.colorToHSV(abg.Z(ygeVar.b), fArr);
                if (fArr[1] >= 0.12f) {
                    jC = abg.c(Color.HSVToColor(new float[]{fArr[0], 0.35f, 0.2f}));
                }
            }
            b(0, jC, l46Var, androidx.compose.foundation.layout.b.m(tm7.N(0.0f, 0.46f * f3, d31.a.a(g09.a, lx0Var), 1), 0.95f * f2, 0.11f * f2));
            cn1.f(ygeVar, null, b21.T(280, 0, null, 6), "deckThumbnail", af1.b0(1808949144, new g8(z, i4), l46Var), l46Var, 28040 | ((i3 >> 3) & 14), 2);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(ygeVar, z, f2, f3, j09Var, i2) { // from class: ji3
                public final /* synthetic */ yge b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ j09 f;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(65);
                    xj3.e(this.a, this.b, this.c, this.d, this.e, this.f, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 30451. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void f(java.util.List r70, java.util.List r71, java.util.Map r72, ai.askquin.model.TarotSkinIdentify r73, ai.askquin.model.TarotSkinIdentify r74, int r75, defpackage.a26 r76, defpackage.a26 r77, defpackage.a26 r78, defpackage.o26 r79, defpackage.a26 r80, defpackage.a26 r81, defpackage.a26 r82, defpackage.a26 r83, defpackage.x16 r84, defpackage.l46 r85, int r86, int r87) {
        /*
            Method dump skipped, instruction units count: 3045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj3.f(java.util.List, java.util.List, java.util.Map, ai.askquin.model.TarotSkinIdentify, ai.askquin.model.TarotSkinIdentify, int, a26, a26, a26, o26, a26, a26, a26, a26, x16, l46, int, int):void");
    }

    public static final float g(h0e h0eVar) {
        return ((Number) h0eVar.getValue()).floatValue();
    }

    public static final void h(pl3 pl3Var, y72 y72Var, x16 x16Var, x16 x16Var2, j09 j09Var, l46 l46Var, int i2) {
        l46 l46Var2;
        l46Var.h0(-1746602218);
        int i3 = i2 | (l46Var.e(pl3Var.ordinal()) ? 4 : 2) | (l46Var.g(y72Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = pl3Var != pl3.b;
            int[] iArr = wj3.a;
            x16 x16Var3 = iArr[pl3Var.ordinal()] == 3 ? x16Var2 : x16Var;
            int i4 = iArr[pl3Var.ordinal()] == 3 ? R.string.explore_unlock_in_mall : R.string.explore_play_this_deck;
            u51 u51VarQ = q(y72Var, l46Var);
            j09 j09VarB0 = ynb.b0(0.0f, 24.0f, ynb.b0(32.0f, 0.0f, mh3.N(androidx.compose.foundation.layout.b.c(j09Var, 1.0f)), 2), 1);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            j09 j09VarF = androidx.compose.foundation.layout.b.f(56.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 2);
            String strQ = afc.q(i4, l46Var);
            x4d x4dVar = eze.a(l46Var).a.a;
            x4dVar.getClass();
            if (we6.e(l46Var)) {
                x4dVar = g21.f;
            }
            c8b.i(j09VarF, strQ, null, null, 0L, 0.0f, z, x4dVar, u51VarQ, false, null, pl3Var == pl3.c ? x57.h : null, x16Var3, l46Var, 6, 0, 1596);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(pl3Var, y72Var, x16Var, x16Var2, j09Var, i2);
        }
    }

    public static final void i(k75 k75Var, o26 o26Var, a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        Object wVar;
        int i3;
        Object obj;
        k75Var.getClass();
        o26Var.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-1886625603);
        int i4 = i2 | (l46Var.i(k75Var) ? 4 : 2) | (l46Var.i(o26Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            e89 e89VarT = tm7.t(k75Var.w, l46Var);
            mfc mfcVar = ((e8b) l46Var.k(l8b.a)).C;
            boolean zE = l46Var.e(mfcVar.ordinal());
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (zE || objR == obj2) {
                objR = r8c.c(mfcVar);
                l46Var.p0(objR);
            }
            List list = (List) objR;
            boolean zG = l46Var.g(((t65) e89VarT.getValue()).d) | l46Var.g(list) | l46Var.g(((t65) e89VarT.getValue()).e);
            Object objR2 = l46Var.R();
            int i5 = 3;
            if (zG || objR2 == obj2) {
                objR2 = s72.b1(list, new zd0(i5, ((t65) e89VarT.getValue()).d, ((t65) e89VarT.getValue()).e));
                l46Var.p0(objR2);
            }
            List list2 = (List) objR2;
            List list3 = ((t65) e89VarT.getValue()).d;
            Map map = ((t65) e89VarT.getValue()).e;
            TarotSkinIdentify tarotSkinIdentify = ((t65) e89VarT.getValue()).a;
            TarotSkinIdentify tarotSkinIdentify2 = ((t65) e89VarT.getValue()).f;
            int iT = nk8.t(((t65) e89VarT.getValue()).b) + ((t65) e89VarT.getValue()).c;
            int i6 = i4 & 14;
            boolean z = i6 == 4 || l46Var.i(k75Var);
            Object objR3 = l46Var.R();
            if (z || objR3 == obj2) {
                i3 = i6;
                obj = obj2;
                wVar = new w(1, k75Var, k75.class, "changeSkin", "changeSkin(Lai/askquin/model/TarotSkinIdentify;)V", 0, 27);
                l46Var.p0(wVar);
            } else {
                i3 = i6;
                wVar = objR3;
                obj = obj2;
            }
            a26 a26Var2 = (a26) ((ym7) wVar);
            boolean z2 = i3 == 4 || l46Var.i(k75Var);
            Object objR4 = l46Var.R();
            if (z2 || objR4 == obj) {
                objR4 = new ot1(13, k75Var);
                l46Var.p0(objR4);
            }
            a26 a26Var3 = (a26) objR4;
            boolean z3 = i3 == 4 || l46Var.i(k75Var);
            Object objR5 = l46Var.R();
            if (z3 || objR5 == obj) {
                Object wVar2 = new w(1, k75Var, k75.class, "setVinylCardIndex", "setVinylCardIndex(I)V", 0, 28);
                l46Var.p0(wVar2);
                objR5 = wVar2;
            }
            a26 a26Var4 = (a26) ((ym7) objR5);
            boolean z4 = i3 == 4 || l46Var.i(k75Var);
            Object objR6 = l46Var.R();
            if (z4 || objR6 == obj) {
                Object wVar3 = new w(1, k75Var, k75.class, "startDownload", "startDownload(Lai/askquin/model/TarotSkinIdentify;)V", 0, 29);
                l46Var.p0(wVar3);
                objR6 = wVar3;
            }
            a26 a26Var5 = (a26) ((ym7) objR6);
            boolean z5 = i3 == 4 || l46Var.i(k75Var);
            Object objR7 = l46Var.R();
            if (z5 || objR7 == obj) {
                Object uj3Var = new uj3(1, k75Var, k75.class, "retryDownload", "retryDownload(Lai/askquin/model/TarotSkinIdentify;)V", 0, 0);
                l46Var.p0(uj3Var);
                objR7 = uj3Var;
            }
            a26 a26Var6 = (a26) ((ym7) objR7);
            boolean z6 = i3 == 4 || l46Var.i(k75Var);
            Object objR8 = l46Var.R();
            if (z6 || objR8 == obj) {
                objR8 = new uj3(1, k75Var, k75.class, "commitSkinChange", "commitSkinChange(Lai/askquin/model/TarotSkinIdentify;)V", 0, 1);
                l46Var.p0(objR8);
            }
            f(list2, list3, map, tarotSkinIdentify, tarotSkinIdentify2, iT, a26Var2, a26Var3, a26Var4, o26Var, a26Var, a26Var5, a26Var6, (a26) ((ym7) objR8), x16Var, l46Var, (i4 << 24) & 1879048192, ((i4 >> 6) & 14) | (57344 & (i4 << 3)));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(i2, 10, k75Var, o26Var, a26Var, x16Var);
        }
    }

    public static final void j(boolean z, boolean z2, y72 y72Var, x16 x16Var, j09 j09Var, l46 l46Var, int i2) {
        long j2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(806212307);
        int i3 = i2 | (l46Var2.h(z) ? 4 : 2) | (l46Var2.h(z2) ? 32 : 16) | (l46Var2.g(y72Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var2.W(i3 & 1, (i3 & 9363) != 9362)) {
            if (y72Var == null) {
                l46Var2.f0(1675926784);
                j2 = ((e8b) l46Var2.k(l8b.a)).u;
                l46Var2.r(false);
            } else {
                l46Var2.f0(1675926102);
                l46Var2.r(false);
                j2 = y72Var.a;
            }
            x4d x4dVarF = we6.f(a7c.b(24.0f), l46Var2);
            pr4 pr4Var = l8b.a;
            long jC = we6.c(((e8b) l46Var2.k(pr4Var)).q, j2, l46Var2);
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.f(l46Var2), 0L, 0L, we6.b(l46Var2), null, 0L, null, 0, 0L, null, null, 16777211);
            if (z) {
                l46Var2.f0(414389602);
                j09 j09VarA0 = ynb.a0(tm7.o(oa7.E(j09Var, x4dVarF), we6.c(((e8b) l46Var2.k(pr4Var)).m, y72.b(j2, 0.15f), l46Var2), g21.f), 12.0f, 5.0f);
                t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarA0);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(LayoutNode.h1);
                } else {
                    l46Var2.s0();
                }
                dec.l(hj6.z, l46Var2, t7cVarA);
                dec.l(hj6.y, l46Var2, u8aVarM);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ);
                gu6.b(od4.A(R.drawable.ic_reading_deck_check, 0, l46Var2), null, androidx.compose.foundation.layout.b.l(g09.a, 11.0f), jC, l46Var2, 440, 0);
                nte.b(afc.q(R.string.explore_deck_carousel_current_reading_deck, l46Var2), null, jC, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 131066);
                l46Var.r(true);
                l46Var.r(false);
                l46Var2 = l46Var;
            } else {
                l46Var2.f0(415072625);
                Object objR = l46Var2.R();
                if (objR == sf2.a) {
                    objR = ib8.e(l46Var2);
                }
                nte.b(afc.q(R.string.explore_deck_carousel_set_as_reading_deck, l46Var2), ynb.a0(db6.w(b.b(oa7.E(j09Var, x4dVarF), (t69) objR, null, z2, new i5c(0), x16Var, 8), 1.0f, we6.c(((e8b) l46Var2.k(pr4Var)).s, j2, l46Var2), x4dVarF), 12.0f, 5.0f), jC, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 131064);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z50(z, z2, y72Var, x16Var, j09Var, i2);
        }
    }

    public static final void k(TarotSkinIdentify tarotSkinIdentify, j09 j09Var, l46 l46Var, int i2) {
        l46Var.h0(1160437051);
        int i3 = (l46Var.e(tarotSkinIdentify.ordinal()) ? 4 : 2) | i2 | (l46Var.g(j09Var) ? 32 : 16);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            mld mldVarQ = hfc.q(tarotSkinIdentify);
            mue mueVar = pue.a;
            mue mueVarE = pue.e(l46Var);
            mue mueVarI = pue.i(l46Var);
            aue aueVarA = uyb.A(0, 1, l46Var);
            List<TarotSkinIdentify> listC = r8c.c(((e8b) l46Var.k(l8b.a)).C);
            l46Var.f0(-1511479955);
            ArrayList arrayList = new ArrayList(t72.u(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(afc.q(hfc.q((TarotSkinIdentify) it.next()).l(), l46Var));
            }
            l46Var.r(false);
            l46Var.f0(-1511474992);
            ArrayList arrayList2 = new ArrayList();
            for (TarotSkinIdentify tarotSkinIdentify2 : listC) {
                Integer numI = hfc.q(tarotSkinIdentify2).i();
                if (!tarotSkinIdentify2.getIsModianCollab()) {
                    numI = null;
                }
                if (numI != null) {
                    arrayList2.add(numI);
                }
            }
            ArrayList arrayList3 = new ArrayList(t72.u(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(afc.r(R.string.explore_deck_artist_credit, new Object[]{afc.q(((Number) it2.next()).intValue(), l46Var)}, l46Var));
            }
            l46Var.r(false);
            nk8.d(j09Var, null, af1.b0(1350312741, new aq1(arrayList, mueVarE, aueVarA, arrayList3, mueVarI, mldVarQ, tarotSkinIdentify), l46Var), l46Var, ((i3 >> 3) & 14) | 3072, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ej3(tarotSkinIdentify, j09Var, i2, i4);
        }
    }

    public static final void l(List list, cs3 cs3Var, bhe bheVar, boolean z, x16 x16Var, x16 x16Var2, j09 j09Var, l46 l46Var, int i2) {
        l46Var.h0(-620949055);
        int i3 = i2 | (l46Var.g(list) ? 4 : 2) | (l46Var.g(cs3Var) ? 32 : 16) | (l46Var.g(bheVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var2) ? 131072 : 65536) | (l46Var.g(j09Var) ? 1048576 : 524288);
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = lmg.h0(2, 1.0f);
                l46Var.p0(objR2);
            }
            ph3 ph3Var = (ph3) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new sx9(8);
                l46Var.p0(objR3);
            }
            nk8.d(j09Var, ndb.f, af1.b0(952012567, new cj3(cs3Var, (sx9) objR3, ph3Var, z, list, x16Var2, bheVar, x16Var, aw2Var), l46Var), l46Var, ((i3 >> 18) & 14) | 3120, 4);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dj3(list, cs3Var, bheVar, z, x16Var, x16Var2, j09Var, i2);
        }
    }

    public static final void m(String str, x16 x16Var, x16 x16Var2, j09 j09Var, l46 l46Var, int i2) {
        l46Var.h0(1350095119);
        int i3 = 2;
        int i4 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            j09 j09VarC = androidx.compose.foundation.layout.b.c(j09Var, 1.0f);
            y72 y72Var = new y72(y72.j);
            pr4 pr4Var = l8b.a;
            j09 j09VarD0 = ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, mh3.N(tm7.n(j09VarC, gec.N(0.0f, 14, t72.I(y72Var, new y72(((e8b) l46Var.k(pr4Var)).b))), null, 6)));
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD0);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            float fP0 = ((sw3) l46Var.k(zg2.h)).p0(g);
            boolean zD = l46Var.d(fP0);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zD || objR == i8cVar) {
                objR = new uc2(i3, fP0);
                l46Var.p0(objR);
            }
            g09 g09Var = g09.a;
            j09 j09VarX = bzd.x(g09Var, (a26) objR);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new i73(22);
                l46Var.p0(objR2);
            }
            kn2.c(str, j09VarX, (a26) objR2, null, "vinylCardName", null, x57.e, l46Var, (i4 & 14) | 1597824, 40);
            j09 j09VarA0 = ynb.a0(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 20.0f, 12.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarA0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            bx9 bx9Var = v51.a;
            cgg.m(x16Var, null, false, null, v51.h(((e8b) l46Var.k(pr4Var)).q, l46Var), null, x57.f, l46Var, ((i4 >> 3) & 14) | 805306368, 494);
            o5c.f(l46Var, new jw7(1.0f, true));
            cgg.m(x16Var2, null, false, null, v51.h(((e8b) l46Var.k(pr4Var)).q, l46Var), null, x57.g, l46Var, ((i4 >> 6) & 14) | 805306368, 494);
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8((Object) str, x16Var, x16Var2, j09Var, i2, 11);
        }
    }

    public static final void n(hmd hmdVar, y72 y72Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        int i3;
        long j2;
        l46Var.h0(59012110);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(hmdVar) : l46Var.i(hmdVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(y72Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        boolean z = true;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            gmd gmdVar = hmdVar != null ? hmdVar.a : null;
            int i4 = gmdVar == null ? -1 : wj3.b[gmdVar.ordinal()];
            if (i4 == 1) {
                l46Var.f0(876070010);
                if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !l46Var.i(hmdVar))) {
                    z = false;
                }
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (z || objR == i8cVar) {
                    objR = new uo2(9, hmdVar);
                    l46Var.p0(objR);
                }
                x16 x16Var3 = (x16) objR;
                j09 j09VarP = androidx.compose.foundation.layout.b.p(g09.a, 120.0f);
                if (y72Var == null) {
                    l46Var.f0(876075093);
                    j2 = ((m82) l46Var.k(o82.a)).a;
                    l46Var.r(false);
                } else {
                    l46Var.f0(876073822);
                    l46Var.r(false);
                    j2 = y72Var.a;
                }
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new i73(23);
                    l46Var.p0(objR2);
                }
                axa.c(x16Var3, j09VarP, j2, 0L, 1, 0.0f, (a26) objR2, l46Var, 1769520, 8);
                l46Var.r(false);
            } else if (i4 != 2) {
                l46Var.f0(876084051);
                o(R.string.skin_download_button, y72Var, x16Var, l46Var, i3 & 1008);
                l46Var.r(false);
            } else {
                l46Var.f0(876079503);
                o(R.string.skin_download_retry, y72Var, x16Var2, l46Var, ((i3 >> 3) & 896) | (i3 & 112));
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(hmdVar, y72Var, x16Var, x16Var2, i2, 10);
        }
    }

    public static final void o(int i2, y72 y72Var, x16 x16Var, l46 l46Var, int i3) {
        int i4;
        long j2;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(542182405);
        if ((i3 & 6) == 0) {
            i4 = (l46Var2.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.g(y72Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var2.W(i4 & 1, (i4 & 147) != 146)) {
            j09 j09VarE = oa7.E(g09.a, a7c.a);
            if (y72Var == null) {
                l46Var2.f0(1346254796);
                j2 = ((m82) l46Var2.k(o82.a)).a;
                l46Var2.r(false);
            } else {
                l46Var2.f0(1346253525);
                l46Var2.r(false);
                j2 = y72Var.a;
            }
            j09 j09VarB = androidx.compose.foundation.layout.b.b(0.0f, 24.0f, ynb.a0(b.c(tm7.o(j09VarE, j2, g21.f), false, null, null, x16Var, 15), 16.0f, 6.0f), 1);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strQ = afc.q(i2, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((m82) l46Var2.k(o82.a)).b, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var2), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(i2, y72Var, x16Var, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    public static final void p(int i2, int i3, y72 y72Var, j09 j09Var, l46 l46Var, int i4) {
        long jB;
        l46Var.h0(-836959441);
        int i5 = (l46Var.e(i2) ? 4 : 2) | i4 | (l46Var.e(i3) ? 32 : 16) | (l46Var.g(y72Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if ((i4 & 3072) == 0) {
            i5 |= l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i5 & 1, (i5 & 1171) != 1170)) {
            int iO = i2 <= 10 ? 0 : mh3.o(i3 - 5, 0, i2 - 10);
            int iMin = Math.min(iO + 10, i2);
            boolean z = iO > 0;
            boolean z2 = iMin < i2;
            t7c t7cVarA = s7c.a(new uc0(6.0f, true, new jv2(3, ndb.Z)), ndb.z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            l46Var.f0(-666081373);
            int i6 = iO;
            while (i6 < iMin) {
                boolean z3 = i6 == i3;
                float f2 = k;
                if (!z || i6 - iO != 0) {
                    float f3 = j;
                    if (z && i6 - iO == 1) {
                        f2 = f3;
                    } else if (!z2 || (iMin - 1) - i6 != 0) {
                        if (z2 && (iMin - 1) - i6 == 1) {
                            f2 = f3;
                        } else {
                            f2 = i;
                        }
                    }
                }
                int i7 = i6;
                j09 j09VarL = androidx.compose.foundation.layout.b.l(g09.a, ((yi4) vx.a(f2, null, "pagerDotSize", l46Var, 384, 10).getValue()).a);
                if (z3) {
                    l46Var.f0(826925735);
                    if (y72Var == null) {
                        l46Var.f0(-666060366);
                        jB = ((m82) l46Var.k(o82.a)).a;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-666061637);
                        l46Var.r(false);
                        jB = y72Var.a;
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(826994338);
                    jB = y72.b(((m82) l46Var.k(o82.a)).q, 0.24f);
                    l46Var.r(false);
                }
                s21.a(tm7.o(j09VarL, jB, a7c.a), l46Var, 0);
                i6 = i7 + 1;
            }
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vb(i2, i3, y72Var, j09Var, i4, 2);
        }
    }

    public static final u51 q(y72 y72Var, l46 l46Var) {
        l46 l46Var2;
        u51 u51VarA;
        if (y72Var == null) {
            l46Var.f0(1452737212);
            l46Var.r(false);
            u51VarA = null;
            l46Var2 = l46Var;
        } else {
            l46Var.f0(1452737213);
            long j2 = y72Var.a;
            bx9 bx9Var = v51.a;
            l46Var2 = l46Var;
            u51VarA = v51.a(j2, eze.a(l46Var).b.A(l46Var), y72.b(j2, 0.38f), y72.b(eze.a(l46Var).b.A(l46Var), 0.38f), l46Var2, 0);
            l46Var2.r(false);
        }
        if (u51VarA == null) {
            l46Var2.f0(-1754244682);
            u51VarA = c8b.m(l46Var2);
        } else {
            l46Var2.f0(-1754253207);
        }
        l46Var2.r(false);
        return u51VarA;
    }

    public static final long r(long j2) {
        float[] fArr = new float[3];
        Color.colorToHSV(abg.Z(j2), fArr);
        if (fArr[1] < 0.12f) {
            return c;
        }
        int iHSVToColor = Color.HSVToColor(new float[]{fArr[0], 1.0f, 1.0f});
        return abg.c(Color.HSVToColor(new float[]{fArr[0], 0.55f, Math.max(0.5f, 0.95f - ((((Color.blue(iHSVToColor) * 0.114f) / 255.0f) + (((Color.green(iHSVToColor) * 0.587f) / 255.0f) + ((Color.red(iHSVToColor) * 0.299f) / 255.0f))) * 0.5f))}));
    }

    public static final pl3 s(TarotSkinIdentify tarotSkinIdentify, List list, Map map) {
        if (!list.contains(tarotSkinIdentify) && !r8c.k(tarotSkinIdentify)) {
            return pl3.c;
        }
        boolean requiresDownload = tarotSkinIdentify.getRequiresDownload();
        pl3 pl3Var = pl3.a;
        if (!requiresDownload) {
            return pl3Var;
        }
        hmd hmdVar = (hmd) map.get(tarotSkinIdentify);
        gmd gmdVar = hmdVar != null ? hmdVar.a : null;
        return (gmdVar == gmd.e || gmdVar == gmd.a) ? pl3Var : pl3.b;
    }

    public static final boolean t(long j2) {
        float[] fArr = new float[3];
        Color.colorToHSV(abg.Z(j2), fArr);
        return fArr[1] < 0.12f;
    }
}
