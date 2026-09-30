package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t6d {
    public static final long a = y72.b(abg.d(4280644095L), 0.5f);
    public static final long b = y72.b(abg.d(4291982590L), 0.5f);
    public static final long c = abg.d(4294967295L);
    public static final long d = abg.d(4294967295L);

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x01df  */
    /* JADX WARN: Code duplicated, block: B:40:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public static final void a(dsb dsbVar, a26 a26Var, l46 l46Var, int i, int i2) {
        int i3;
        a26 a26Var2;
        boolean z;
        a26 a26Var3;
        ojb ojbVarV;
        a26 a26Var4;
        Object objR;
        dsb dsbVar2 = dsbVar;
        dsbVar2.getClass();
        TarotCardChoice tarotCardChoice = dsbVar2.a;
        l46Var.h0(688942021);
        if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? l46Var.g(dsbVar2) : l46Var.i(dsbVar2) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                a26Var2 = a26Var;
                i3 |= l46Var.i(a26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i3 & 145) != 144) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i3 & 1, z)) {
                if (i4 != 0) {
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = new e2d(10);
                        l46Var.p0(objR);
                    }
                    a26Var4 = (a26) objR;
                } else {
                    a26Var4 = a26Var2;
                }
                g09 g09Var = g09.a;
                j09 j09VarB0 = ynb.b0(40.0f, 0.0f, g09Var, 2);
                mue mueVar = pue.a;
                mue mueVarM = pue.m(l46Var);
                pr4 pr4Var = x8b.a;
                yp5 yp5Var = ((y8b) l46Var.k(pr4Var)).a;
                ar5 ar5Var = ar5.d;
                a26 a26Var5 = a26Var4;
                nte.b(afc.q(R.string.personality_result_title, l46Var), j09VarB0, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(mueVarM, 0L, 0L, ar5Var, yp5Var, 0L, null, 0, 0L, null, null, 16777179), l46Var, 48, 0, 130044);
                o5c.f(l46Var, b.d(g09Var, 12.0f));
                nte.b(afc.q(tarotCardChoice.getCard().getTitleRes(), l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.k(l46Var), ((m82) l46Var.k(o82.a)).a, 0L, ar5Var, ((y8b) l46Var.k(pr4Var)).a, 0L, null, 0, 0L, null, null, 16777178), l46Var, 0, 0, 131070);
                o5c.f(l46Var, b.d(g09Var, 26.0f));
                b(b.p(g09Var, 200.0f), q7c.r(tarotCardChoice), a26Var5, l46Var, (i3 & 896) | 6);
                o5c.f(l46Var, b.d(g09Var, 26.0f));
                dsbVar2 = dsbVar;
                nte.b(dsbVar2.b.getSummary(), ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, g09Var, 2)), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.p(l46Var), 0L, 0L, ar5.e, ((y8b) l46Var.k(pr4Var)).a, 0L, null, 3, 0L, null, null, 16744411), l46Var, 48, 0, 131068);
                a26Var3 = a26Var5;
            } else {
                l46Var.Z();
                a26Var3 = a26Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new or1(dsbVar2, a26Var3, i, i2, 9);
            }
        }
        i3 |= 384;
        a26Var2 = a26Var;
        if ((i3 & 145) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i3 & 1, z)) {
            if (i4 != 0) {
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = new e2d(10);
                    l46Var.p0(objR);
                }
                a26Var4 = (a26) objR;
            } else {
                a26Var4 = a26Var2;
            }
            g09 g09Var2 = g09.a;
            j09 j09VarB1 = ynb.b0(40.0f, 0.0f, g09Var2, 2);
            mue mueVar2 = pue.a;
            mue mueVarM2 = pue.m(l46Var);
            pr4 pr4Var2 = x8b.a;
            yp5 yp5Var2 = ((y8b) l46Var.k(pr4Var2)).a;
            ar5 ar5Var2 = ar5.d;
            a26 a26Var6 = a26Var4;
            nte.b(afc.q(R.string.personality_result_title, l46Var), j09VarB1, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(mueVarM2, 0L, 0L, ar5Var2, yp5Var2, 0L, null, 0, 0L, null, null, 16777179), l46Var, 48, 0, 130044);
            o5c.f(l46Var, b.d(g09Var2, 12.0f));
            nte.b(afc.q(tarotCardChoice.getCard().getTitleRes(), l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.k(l46Var), ((m82) l46Var.k(o82.a)).a, 0L, ar5Var2, ((y8b) l46Var.k(pr4Var2)).a, 0L, null, 0, 0L, null, null, 16777178), l46Var, 0, 0, 131070);
            o5c.f(l46Var, b.d(g09Var2, 26.0f));
            b(b.p(g09Var2, 200.0f), q7c.r(tarotCardChoice), a26Var6, l46Var, (i3 & 896) | 6);
            o5c.f(l46Var, b.d(g09Var2, 26.0f));
            dsbVar2 = dsbVar;
            nte.b(dsbVar2.b.getSummary(), ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, g09Var2, 2)), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.p(l46Var), 0L, 0L, ar5.e, ((y8b) l46Var.k(pr4Var2)).a, 0L, null, 3, 0L, null, null, 16744411), l46Var, 48, 0, 131068);
            a26Var3 = a26Var6;
        } else {
            l46Var.Z();
            a26Var3 = a26Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(dsbVar2, a26Var3, i, i2, 9);
        }
    }

    public static final void b(j09 j09Var, qhe qheVar, a26 a26Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-306151130);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(qheVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            y6c y6cVarB = a7c.b(24.0f);
            j09 j09VarG = dj6.G(dj6.G(dj6.G(j09Var, b, -10.0f, 32.0f, y6cVarB, 4), a, 10.0f, 32.0f, y6cVarB, 4), c, 0.0f, 10.0f, y6cVarB, 6);
            q11 q11VarB = x57.b(d, 6.0f);
            j09 j09VarE = oa7.E(db6.x(j09VarG, q11VarB.a, q11VarB.b, y6cVarB), y6cVarB);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarE);
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
            o7c.d(oa7.E(b.c, y6cVarB), qheVar, null, true, null, 0.0f, a26Var, false, l46Var, ((i2 << 12) & 3670016) | (i2 & 112) | 3072, 180);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, j09Var, qheVar, a26Var, 14);
        }
    }
}
