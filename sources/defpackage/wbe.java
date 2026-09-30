package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wbe {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final grd f;

    static {
        float f2 = urg.E;
        a = f2;
        b = urg.O;
        c = urg.L;
        float f3 = urg.I;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new grd(0);
    }

    public static final void a(boolean z, a26 a26Var, j09 j09Var, boolean z2, vbe vbeVar, l46 l46Var, int i, int i2) {
        int i3;
        vbe vbeVar2;
        vbe vbeVar3;
        j09 j09Var2;
        vbe vbeVar4;
        int i4;
        j09 j09Var3;
        t69 t69Var;
        int i5;
        l46Var.h0(-263339167);
        if ((i & 6) == 0) {
            i3 = (l46Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(a26Var) ? 32 : 16;
        }
        int i6 = i3 | 3456;
        if ((i & 24576) == 0) {
            i6 |= l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                vbeVar2 = vbeVar;
                int i7 = l46Var.g(vbeVar2) ? 131072 : 65536;
                i6 |= i7;
            } else {
                vbeVar2 = vbeVar;
            }
            i6 |= i7;
        } else {
            vbeVar2 = vbeVar;
        }
        int i8 = i6 | 1572864;
        if (l46Var.W(i8 & 1, (599187 & i8) != 599186)) {
            l46Var.b0();
            int i9 = i & 1;
            j09 j09VarQ = g09.a;
            if (i9 == 0 || l46Var.C()) {
                if ((i2 & 32) != 0) {
                    m82 m82Var = (m82) l46Var.k(o82.a);
                    vbe vbeVar5 = m82Var.l0;
                    long j = m82Var.p;
                    if (vbeVar5 == null) {
                        long jC = o82.c(m82Var, urg.D);
                        long jC2 = o82.c(m82Var, urg.G);
                        long j2 = y72.j;
                        long jC3 = o82.c(m82Var, urg.F);
                        long jC4 = o82.c(m82Var, urg.N);
                        long jC5 = o82.c(m82Var, urg.Q);
                        long jC6 = o82.c(m82Var, urg.M);
                        long jC7 = o82.c(m82Var, urg.P);
                        long jR = abg.r(y72.b(o82.c(m82Var, urg.p), urg.q), j);
                        long jC8 = o82.c(m82Var, urg.t);
                        float f2 = urg.u;
                        vbeVar4 = new vbe(jC, jC2, j2, jC3, jC4, jC5, jC6, jC7, jR, abg.r(y72.b(jC8, f2), j), j2, abg.r(y72.b(o82.c(m82Var, urg.r), urg.s), j), abg.r(y72.b(o82.c(m82Var, urg.v), urg.w), j), abg.r(y72.b(o82.c(m82Var, urg.z), f2), j), abg.r(y72.b(o82.c(m82Var, urg.A), f2), j), abg.r(y72.b(o82.c(m82Var, urg.x), urg.y), j));
                        m82Var.l0 = vbeVar4;
                    } else {
                        vbeVar4 = vbeVar5;
                    }
                    i8 &= -458753;
                } else {
                    vbeVar4 = vbeVar2;
                }
                i4 = i8;
                j09Var3 = j09VarQ;
            } else {
                l46Var.Z();
                if ((i2 & 32) != 0) {
                    i8 &= -458753;
                }
                j09Var3 = j09Var;
                i4 = i8;
                vbeVar4 = vbeVar2;
            }
            l46Var.s();
            l46Var.f0(1768604058);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69 t69Var2 = (t69) objR;
            l46Var.r(false);
            if (a26Var != null) {
                oq6 oq6Var = p77.a;
                i5 = 2;
                t69Var = t69Var2;
                j09VarQ = b21.Q(xv8.a, z, t69Var, null, z2, new i5c(2), a26Var);
            } else {
                t69Var = t69Var2;
                i5 = 2;
            }
            int i10 = i4 << 3;
            int i11 = i4 >> 6;
            vbe vbeVar6 = vbeVar4;
            b(b.i(b.s(j09Var3.D(j09VarQ), ndb.f, i5), c, d), z, z2, vbeVar6, t69Var, u5d.b(urg.B, l46Var), l46Var, (i10 & 57344) | (i10 & 112) | (i11 & 896) | (i11 & 7168));
            vbeVar3 = vbeVar6;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            vbeVar3 = vbeVar2;
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k28(z, a26Var, j09Var2, z2, vbeVar3, i, i2);
        }
    }

    public static final void b(j09 j09Var, boolean z, boolean z2, vbe vbeVar, m77 m77Var, x4d x4dVar, l46 l46Var, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        l46Var.h0(-670917213);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.g(vbeVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(null) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.g(m77Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.g(x4dVar) ? 1048576 : 524288;
        }
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? vbeVar.b : vbeVar.f;
            } else {
                j = z ? vbeVar.j : vbeVar.n;
            }
            if (z2) {
                j2 = z ? vbeVar.a : vbeVar.e;
            } else {
                j2 = z ? vbeVar.i : vbeVar.m;
            }
            x4d x4dVarB = u5d.b(urg.K, l46Var);
            float f2 = urg.J;
            if (z2) {
                j3 = j2;
                j4 = z ? vbeVar.c : vbeVar.g;
            } else {
                j3 = j2;
                j4 = z ? vbeVar.k : vbeVar.o;
            }
            j09 j09VarO = tm7.o(db6.w(j09Var, f2, j4, x4dVarB), j, x4dVarB);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarO);
            lf2.q.getClass();
            l46Var.j0();
            boolean z3 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            he2 he2Var3 = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var3);
            }
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            j09 j09VarO2 = tm7.o(o17.a(d31.a.a(g09.a, ndb.e).D(new vwe(m77Var, z, vpf.Z(t39.b, l46Var))), m77Var, d5c.a(urg.H / 2.0f, 4, 0L, false)), j3, x4dVar);
            xn8 xn8VarC2 = s21.c(ndb.f, false);
            int iW2 = an1.w(l46Var);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarO2);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW2))) {
                tec.r(iW2, l46Var, iW2, he2Var3);
            }
            dec.l(he2Var4, l46Var, j09VarJ2);
            l46Var.f0(1236071411);
            l46Var.r(false);
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new g91(j09Var, z, z2, vbeVar, m77Var, x4dVar, i, 3);
        }
    }
}
