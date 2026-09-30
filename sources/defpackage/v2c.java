package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v2c {
    public static void B(int i, int i2) {
        String strS;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strS = q3c.s("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    qc0.j(tec.e(i2, "negative size: "));
                    return;
                }
                strS = q3c.s("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strS);
        }
    }

    public static void C(int i, int i2, int i3) {
        String strD;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strD = D(i, i3, "start index");
            } else {
                strD = (i2 < 0 || i2 > i3) ? D(i2, i3, "end index") : q3c.s("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static String D(int i, int i2, String str) {
        if (i < 0) {
            return q3c.s("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return q3c.s("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        qc0.j(tec.e(i2, "negative size: "));
        return null;
    }

    public static final void a(s4g s4gVar, l46 l46Var, int i) {
        l46Var.h0(-1253903744);
        int i2 = (l46Var.g(s4gVar) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            h4g.i(s4gVar.a, dj6.w(b.c(g09.a, 1.0f), 2.1392405f), l46Var, 48);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z8d(s4gVar, i, 17);
        }
    }

    public static final void b(int i, x16 x16Var, l46 l46Var, j09 j09Var, boolean z) {
        int i2;
        l46 l46Var2;
        l46Var.h0(-922692779);
        if ((i & 6) == 0) {
            i2 = (l46Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            j09 j09VarC = androidx.compose.foundation.b.c(b.l(j09Var, 48.0f), false, null, new i5c(0), x16Var, 11);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
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
            lx0 lx0Var = ndb.d;
            d31 d31Var = d31.a;
            g09 g09Var = g09.a;
            j09 j09VarL = b.l(tm7.M(d31Var.a(g09Var, lx0Var), 4.0f, -4.0f), 16.0f);
            long jD = z ? abg.d(4280427044L) : y72.e;
            y6c y6cVar = a7c.a;
            j09 j09VarW = db6.w(tm7.o(j09VarL, jD, y6cVar), 0.5f, z ? y72.b(y72.e, 0.32f) : y72.b(abg.d(4279440148L), 0.32f), y6cVar);
            xn8 xn8VarC2 = s21.c(ndb.f, false);
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
            gu6.b(od4.A(R.drawable.ic_close, 0, l46Var), afc.q(R.string.button_close, l46Var), b.l(g09Var, 11.0f), z ? y72.b(y72.e, 0.48f) : y72.b(abg.d(4279440148L), 0.48f), l46Var2, 392, 0);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cv(z, x16Var, j09Var, i);
        }
    }

    public static final void c(x16 x16Var, x16 x16Var2, j09 j09Var, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09Var2;
        int i4;
        l46 l46Var2;
        j09 j09Var3;
        long jD;
        x4d x4dVar;
        long jD2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-260208986);
        if ((i & 6) == 0) {
            i3 = i | (l46Var.i(x16Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(x16Var2) ? 32 : 16;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3072;
            j09Var2 = j09Var;
        } else {
            j09Var2 = j09Var;
            i4 = i3 | (l46Var.g(j09Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            g09 g09Var = g09.a;
            j09 j09Var4 = i5 != 0 ? g09Var : j09Var2;
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            boolean zB = if9.B(l46Var);
            float f = zF ? 344.0f : 274.0f;
            x4d x4dVarB = zF ? g21.f : a7c.b(12.0f);
            if (zF) {
                jD = abg.d(4280427044L);
            } else {
                jD = zB ? abg.d(4279502146L) : abg.d(4292994045L);
            }
            if (zF) {
                x4dVar = x4dVarB;
                jD2 = y72.b(y72.e, 0.95f);
            } else {
                x4dVar = x4dVarB;
                jD2 = zB ? abg.d(4291415801L) : abg.d(4280879749L);
            }
            long jB = (zB || zF) ? y72.b(y72.e, 0.12f) : y72.e;
            float f2 = f;
            long jB2 = y72.b(y72.b, (!zB || zF) ? 0.25f : 0.5f);
            j09Var3 = j09Var4;
            j09 j09VarD = b.d(b.p(j09Var3, f2), 56.0f);
            int i6 = i4;
            xn8 xn8VarC = s21.c(ndb.b, false);
            long j = jB;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
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
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            d31 d31Var = d31.a;
            j09 j09VarH = iqf.h(d31Var.b(g09Var), jB2, 2.0f, 16.0f, new s4d(zF ? 0.0f : 12.0f, zF ? 0.0f : 12.0f), 2);
            x4d x4dVar2 = x4dVar;
            s21.a(db6.w(tm7.o(j09VarH, jD, x4dVar2), 0.5f, j, x4dVar2), l46Var, 0);
            b(i6 & 112, x16Var2, l46Var, d31Var.a(g09Var, ndb.d), zB || zF);
            j09 j09VarB0 = ynb.b0(16.0f, 0.0f, d31Var.b(g09Var), 2);
            t7c t7cVarA = s7c.a(new uc0(24.0f, true, new qc0(0)), ndb.z, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarB0);
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
            String strQ = afc.q(R.string.review_reward_snackbar_message, l46Var);
            jw7 jw7Var = new jw7(1.0f, true);
            mue mueVar = oue.a;
            nte.b(strQ, jw7Var, jD2, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, pue.f(l46Var), l46Var, 0, 24960, 110584);
            l46Var2 = l46Var;
            d(((i6 << 9) & 7168) | 48, x16Var, l46Var2, afc.q(R.string.review_reward_snackbar_upload, l46Var2), zF);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            j09Var3 = j09Var2;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr((Object) x16Var, (Object) x16Var2, (Object) j09Var3, i, i2, 10);
        }
    }

    public static final void d(int i, x16 x16Var, l46 l46Var, String str, boolean z) {
        int i2;
        yp5 yp5Var;
        l46Var.h0(1014650434);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            x4d x4dVar = z ? g21.f : a7c.a;
            g09 g09Var = g09.a;
            j09 j09VarW = z ? db6.w(tm7.n(g09Var, gec.N(0.0f, 14, t72.I(new y72(abg.d(4293322470L)), new y72(abg.d(4291611852L)), new y72(abg.d(4293322470L)))), x4dVar, 4), 0.5f, y72.b(y72.e, 0.6f), x4dVar) : tm7.o(g09Var, abg.d(4285820151L), x4dVar);
            j09 j09VarQ = b.q(z ? 63.0f : 61.0f, 0.0f, b.d(g09Var, 24.0f), 2);
            boolean z2 = (i2 & 112) == 32;
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new z8b(25);
                l46Var.p0(objR);
            }
            j09 j09VarA0 = ynb.a0(androidx.compose.foundation.b.c(oa7.E(bzd.x(j09VarQ, (a26) objR).D(j09VarW), x4dVar), true, null, new i5c(0), x16Var, 10), 12.0f, 2.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA0);
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
            long jD = z ? abg.d(4279440148L) : y72.e;
            if (z) {
                l46Var.f0(-40042427);
                yp5Var = ((y8b) l46Var.k(x8b.a)).b;
                l46Var.r(false);
            } else {
                l46Var.f0(-39972646);
                l46Var.r(false);
                yp5Var = yp5.a;
            }
            yp5 yp5Var2 = yp5Var;
            nte.b(str, null, jD, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, new mue(0L, w6c.l(z ? 13 : 12), z ? ar5.y : ar5.x, null, yp5Var2, w6c.k(z ? 0.078d : 0.072d), 0L, 0, 0, w6c.l(z ? 18 : 17), null, null, 16645977), l46Var, i2 & 14, 24576, 114682);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(str, z, x16Var, i, 8);
        }
    }

    public static final void e(t4g t4gVar, l46 l46Var, int i) {
        l46 l46Var2;
        l46Var.h0(843550888);
        int i2 = (l46Var.i(t4gVar) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            qhe qheVar = t4gVar.a;
            TarotSkinIdentify tarotSkinIdentify = t4gVar.b;
            String str = t4gVar.c;
            String str2 = t4gVar.d;
            if (str2.length() == 0) {
                str2 = t4gVar.c;
            }
            l46Var2 = l46Var;
            h4g.m(qheVar, tarotSkinIdentify, str, dj6.w(b.c(g09.a, 1.0f), 2.1392405f), str2, l46Var2, 3072);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z8d(t4gVar, i, 18);
        }
    }

    public static final void f(c31 c31Var, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(122849167);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, c31Var.a(g09.a, ndb.d)), false, 0L, 0L, null, x16Var, l46Var, (i2 << 12) & 458752, 30);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(c31Var, x16Var, i, 15);
        }
    }

    public static final void g(u4g u4gVar, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(-39859621);
        int i2 = (l46Var.g(u4gVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i3 = i2;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(eg6.a);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new xfc(e89Var, 19);
                l46Var.p0(objR2);
            }
            j(u4gVar, x16Var, x16Var2, (x16) objR2, l46Var, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            if (((eg6) e89Var.getValue()) == eg6.b) {
                l46Var.f0(-2046630488);
                h(u4gVar, x16Var, x16Var3, l46Var, (i3 & 126) | ((i3 >> 3) & 896));
                l46Var.r(false);
            } else {
                l46Var.f0(-2046508441);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k4g(u4gVar, x16Var, x16Var2, x16Var3, i, 0);
        }
    }

    public static final void h(u4g u4gVar, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        x16 x16Var3;
        String str;
        Object xi3Var;
        String str2;
        l46Var.h0(248972489);
        int i2 = (l46Var.g(u4gVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            iy9 iy9VarY = y(l46Var);
            ted tedVar = (ted) iy9VarY.a();
            Object obj = (x16) iy9VarY.b();
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (objR == obj2) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            r4g r4gVarG = u4gVar.g();
            int i3 = i2;
            String strA = r4gVarG.a();
            if (u4gVar instanceof s4g) {
                str = ((s4g) u4gVar).b;
            } else {
                if (!(u4gVar instanceof t4g)) {
                    ap.c();
                    return;
                }
                str = null;
            }
            int i4 = i3 & 112;
            boolean zG = l46Var.g(strA) | l46Var.g(obj) | l46Var.g(str) | l46Var.i(aw2Var) | l46Var.g(tedVar) | (i4 == 32);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj2) {
                str2 = str;
                x16Var3 = x16Var;
                xi3Var = new xi3(strA, obj, str2, aw2Var, tedVar, x16Var3, 8);
                l46Var.p0(xi3Var);
            } else {
                String str3 = str;
                x16Var3 = x16Var;
                xi3Var = objR2;
                str2 = str3;
            }
            x16 x16Var4 = (x16) xi3Var;
            boolean zG2 = l46Var.g(strA) | l46Var.i(aw2Var) | l46Var.g(tedVar) | (i4 == 32);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj2) {
                objR3 = new zlb(strA, aw2Var, tedVar, x16Var3);
                l46Var.p0(objR3);
            }
            n(tedVar, x16Var4, af1.b0(-1769714925, new aq1((x16) objR3, strA, str2, r4gVarG, aw2Var, tedVar, x16Var2), l46Var), l46Var, 384);
        } else {
            x16Var3 = x16Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, u4gVar, x16Var3, x16Var2, 22);
        }
    }

    public static final void i(u4g u4gVar, boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        x16 x16Var3;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1531742132);
        int i4 = i | (l46Var2.g(u4gVar) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i5 = 0;
        if (l46Var2.W(i4 & 1, (i4 & 1171) != 1170)) {
            g09 g09Var = g09.a;
            j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
            jx0 jx0Var = ndb.Y;
            c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarZ);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z4 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(i5)), jx0Var, l46Var2, 6);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            int iOrdinal = u4gVar.g().ordinal();
            if (iOrdinal != 0) {
                z3 = true;
                if (iOrdinal != 1) {
                    ap.c();
                    return;
                }
                i2 = R.string.widget_guide_qd_title;
            } else {
                z3 = true;
                i2 = R.string.widget_guide_today_title;
            }
            String strQ = afc.q(i2, l46Var2);
            mue mueVar = pue.a;
            mue mueVarN = pue.n(l46Var2);
            pr4 pr4Var = l8b.a;
            boolean z5 = z3;
            nte.b(strQ, b.c(g09Var, 1.0f), ((e8b) l46Var2.k(pr4Var)).q, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarN, l46Var, 48, 0, 129912);
            int iOrdinal2 = u4gVar.g().ordinal();
            if (iOrdinal2 == 0) {
                i3 = R.string.widget_guide_today_subtitle;
            } else {
                if (iOrdinal2 != z5) {
                    ap.c();
                    return;
                }
                i3 = R.string.widget_guide_qd_subtitle;
            }
            nte.b(afc.q(i3, l46Var), b.c(g09Var, 1.0f), ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 48, 0, 130040);
            l46Var2 = l46Var;
            ib8.t(l46Var2, z5, g09Var, 16.0f, l46Var2);
            l(u4gVar, l46Var2, i4 & 14);
            t4c.g(ks0.h(24.0f, R.string.widget_guide_cta_add, l46Var2, l46Var2, g09Var), x16Var2, null, l46Var2, (i4 >> 6) & 112, 4);
            o5c.f(l46Var2, b.d(g09Var, 12.0f));
            z2 = z;
            x16Var3 = x16Var;
            m(z2, x16Var3, l46Var2, (i4 >> 3) & 126);
            l46Var2.r(z5);
        } else {
            x16Var3 = x16Var;
            z2 = z;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(u4gVar, z2, x16Var3, x16Var2, i, 28, false);
        }
    }

    public static final void j(u4g u4gVar, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        String str;
        Object qs2Var;
        String str2;
        String str3;
        e89 e89Var;
        l46Var.h0(1379995734);
        int i2 = (l46Var.g(u4gVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            iy9 iy9VarY = y(l46Var);
            ted tedVar = (ted) iy9VarY.a();
            x16 x16Var4 = (x16) iy9VarY.b();
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            String strA = u4gVar.g().a();
            if (u4gVar instanceof s4g) {
                str = ((s4g) u4gVar).b;
            } else {
                if (!(u4gVar instanceof t4g)) {
                    ap.c();
                    return;
                }
                str = null;
            }
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89 e89Var2 = (e89) objR2;
            boolean zG = l46Var.g(strA) | ((i2 & 14) == 4);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj) {
                objR3 = new o4g(strA, u4gVar, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, wef.a);
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean zG2 = l46Var.g(x16Var4) | l46Var.g(strA) | l46Var.g(str) | l46Var.i(aw2Var) | l46Var.g(tedVar) | (i3 == 256) | (i4 == 32);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == obj) {
                String str4 = str;
                qs2Var = new qs2(x16Var4, strA, str4, aw2Var, e89Var2, tedVar, x16Var2, x16Var);
                str2 = strA;
                str3 = str4;
                aw2Var = aw2Var;
                e89Var = e89Var2;
                tedVar = tedVar;
                l46Var.p0(qs2Var);
            } else {
                str2 = strA;
                str3 = str;
                qs2Var = objR4;
                e89Var = e89Var2;
            }
            x16 x16Var5 = (x16) qs2Var;
            boolean zG3 = l46Var.g(str2) | l46Var.i(aw2Var) | l46Var.g(tedVar) | (i3 == 256) | (i4 == 32);
            Object objR5 = l46Var.R();
            if (zG3 || objR5 == obj) {
                Object xi3Var = new xi3(str2, aw2Var, e89Var, tedVar, x16Var2, x16Var, 7);
                l46Var.p0(xi3Var);
                objR5 = xi3Var;
            }
            n(tedVar, x16Var5, af1.b0(2024440352, new qi3(u4gVar, str2, str3, x16Var3, (x16) objR5, e89Var), l46Var), l46Var, 384);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k4g(u4gVar, x16Var, x16Var2, x16Var3, i, 1);
        }
    }

    public static final boolean k(e89 e89Var) {
        return ((Boolean) e89Var.getValue()).booleanValue();
    }

    public static final void l(u4g u4gVar, l46 l46Var, int i) {
        l46Var.h0(1388858598);
        int i2 = (l46Var.g(u4gVar) ? 4 : 2) | i;
        if (!l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var.Z();
        } else if (u4gVar instanceof t4g) {
            l46Var.f0(-1041712539);
            e((t4g) u4gVar, l46Var, i2 & 14);
            l46Var.r(false);
        } else {
            if (!(u4gVar instanceof s4g)) {
                throw tec.d(-1041714255, l46Var, false);
            }
            l46Var.f0(-1041710074);
            a((s4g) u4gVar, l46Var, i2 & 14);
            l46Var.r(false);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z8d(u4gVar, i, 16);
        }
    }

    public static final void m(boolean z, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2;
        l46Var.h0(-454346857);
        if ((i & 6) == 0) {
            i2 = i | (l46Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i3 = i2;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarB = b.b(0.0f, 40.0f, b.c(g09Var, 1.0f), 1);
            int i4 = i3 & 112;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = ib8.e(l46Var);
            }
            j09 j09VarZ = ynb.Z(j09VarB.D(androidx.compose.foundation.b.b(g09Var, (t69) objR, null, false, null, x16Var, 28)), 8.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new jv2(3, ndb.Z)), ndb.z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarZ);
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
            boolean z2 = i4 == 32;
            Object objR2 = l46Var.R();
            if (z2 || objR2 == i8cVar) {
                objR2 = new lnc(10, x16Var);
                l46Var.p0(objR2);
            }
            qk2.i(z, null, false, 20.0f, null, (a26) objR2, l46Var, (i3 & 14) | 3072, 22);
            nte.b(afc.q(R.string.widget_guide_opt_out, l46Var), null, ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a, l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fs0(z, x16Var, i, 2);
        }
    }

    public static final void n(ted tedVar, x16 x16Var, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(563451152);
        int i2 = i | (l46Var.g(tedVar) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            zz8.a(x16Var, null, tedVar, 0.0f, false, null, y72.j, 0L, ((e8b) l46Var.k(l8b.a)).m, null, null, null, af1.b0(-912987662, new ec(dd2Var, 11), l46Var), l46Var, ((i2 >> 3) & 14) | 1572864 | ((i2 << 6) & 896), 3078, 6586);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new j4g(tedVar, x16Var, dd2Var, i, 0);
        }
    }

    public static final void o(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        if (comparable2.compareTo(comparable) >= 0) {
            return;
        }
        ho7.u("start: ", comparable, " is greater than end: ", comparable2);
    }

    public static SeasonalQaFixtureState p() {
        Object dzbVar;
        if (!t72.I("https://quin.love", "https://quinlove.cn", "https://askquin.ai", "https://askquin.cn").contains("https://quin.love")) {
            hs3 hs3Var = xqa.y;
            String str = (String) z5c.I(nu4.a, new snc(hs3Var.a, hs3Var.b, null));
            if (!v4e.Q(str)) {
                try {
                    dzbVar = (SeasonalQaFixtureState) fzc.a.b(SeasonalQaFixtureState.Companion.serializer(), str);
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                SeasonalQaFixtureState seasonalQaFixtureState = (SeasonalQaFixtureState) dzbVar;
                if (seasonalQaFixtureState == null) {
                    return null;
                }
                String fixture = seasonalQaFixtureState.getFixture();
                qnc.a.getClass();
                if (y25.q(fixture) == null) {
                    return null;
                }
                String status = seasonalQaFixtureState.getStatus();
                wnc.a.getClass();
                if (eu4.f(status) == null) {
                    return null;
                }
                String resultScenario = seasonalQaFixtureState.getResultScenario();
                znc.a.getClass();
                if (yx4.k(resultScenario) == null) {
                    return null;
                }
                return seasonalQaFixtureState;
            }
        }
        return null;
    }

    public static final boolean q(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return pa7.t(v4e.o0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static void r(sn4 sn4Var, ste steVar, long j, int i) {
        long j2 = y72.k;
        long j3 = (i & 4) != 0 ? 0L : j;
        xtd xtdVar = steVar.a.b.a;
        o4d o4dVar = xtdVar.n;
        mne mneVar = xtdVar.m;
        un4 un4Var = xtdVar.p;
        ta0 ta0VarV0 = sn4Var.v0();
        long jZ = ta0VarV0.z();
        ta0VarV0.p().g();
        try {
            vd9 vd9Var = (vd9) ta0VarV0.c;
            vd9Var.I(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            boolean zF = steVar.f();
            b59 b59Var = steVar.b;
            rte rteVar = steVar.a;
            if (zF && rteVar.f != 3) {
                long j4 = steVar.c;
                vd9.m(vd9Var, (int) (j4 >> 32), (int) (j4 & 4294967295L), 16);
            }
            mue mueVar = rteVar.b;
            b41 b41VarB = mueVar.b();
            if (b41VarB == null || j2 != 16) {
                b59Var.i(sn4Var.v0().p(), ndc.h(j2 != 16 ? j2 : mueVar.c(), Float.NaN), o4dVar, mneVar, un4Var);
            } else {
                lmg.b0(b59Var, sn4Var.v0().p(), b41VarB, Float.isNaN(Float.NaN) ? mueVar.a.a.a() : Float.NaN, o4dVar, mneVar, un4Var);
            }
        } finally {
            ks0.t(ta0VarV0, jZ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public static x6d s(xad xadVar, String str) {
        List listI;
        xadVar.getClass();
        str.getClass();
        int iOrdinal = xadVar.ordinal();
        e8d e8dVar = e8d.Long;
        e8d e8dVar2 = e8d.Card;
        if (iOrdinal == 0) {
            listI = t72.I(e8dVar2, e8dVar);
        } else if (iOrdinal == 1) {
            listI = t72.I(e8d.Screenshot, e8dVar2, e8dVar);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            listI = t72.I(e8dVar2, e8dVar);
        } else {
            if (iOrdinal != 4) {
                ap.c();
                return null;
            }
            listI = t72.H(e8dVar2);
        }
        return new x6d(xadVar, str, listI);
    }

    public static final String t(Collection collection) {
        return !collection.isEmpty() ? w4e.o(s72.D0(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static boolean u(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = ba9.a;
            }
        } else {
            if (!(collection instanceof vy6)) {
                return false;
            }
            objComparator = ((vy6) collection).d;
        }
        return comparator.equals(objComparator);
    }

    public static final String v(Collection collection) {
        return w4e.o(s72.D0(collection, ",", null, null, null, 62)).concat(w4e.o(" }"));
    }

    public static final String w(Collection collection) {
        return w4e.o(s72.D0(collection, ",", null, null, null, 62)).concat(w4e.o("},"));
    }

    public static boolean x(SeasonalQaFixtureState seasonalQaFixtureState, int i, String str) {
        String fixture = seasonalQaFixtureState.getFixture();
        qnc.a.getClass();
        qnc qncVarQ = y25.q(fixture);
        return qncVarQ != null && qncVarQ.c() == i && pa7.t(qncVarQ.a(), str);
    }

    public static final iy9 y(l46 l46Var) {
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = q1c.f(Boolean.FALSE);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        Object objR2 = l46Var.R();
        if (objR2 == i8cVar) {
            objR2 = new w77(e89Var, 25);
            l46Var.p0(objR2);
        }
        ted tedVarF = zz8.f(54, 0, (a26) objR2, l46Var);
        Object objR3 = l46Var.R();
        if (objR3 == i8cVar) {
            objR3 = new xfc(e89Var, 21);
            l46Var.p0(objR3);
        }
        return new iy9(tedVarF, (x16) objR3);
    }

    public static znc z(int i, String str) {
        str.getClass();
        SeasonalQaFixtureState seasonalQaFixtureStateP = p();
        if (seasonalQaFixtureStateP != null) {
            if (!x(seasonalQaFixtureStateP, i, str)) {
                seasonalQaFixtureStateP = null;
            }
            if (seasonalQaFixtureStateP != null) {
                String resultScenario = seasonalQaFixtureStateP.getResultScenario();
                znc.a.getClass();
                return yx4.k(resultScenario);
            }
        }
        return null;
    }

    public abstract w4c A(h7f h7fVar, xt7 xt7Var);
}
