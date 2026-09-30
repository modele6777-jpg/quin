package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zrc {
    public static final List a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;
    public static final List l;
    public static final float m;
    public static final float n;
    public static final float o;
    public static final float p;

    static {
        Float fValueOf = Float.valueOf(-1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        iy9 iy9Var = new iy9(fValueOf, fValueOf2);
        Float fValueOf3 = Float.valueOf(1.0f);
        a = t72.I(iy9Var, new iy9(fValueOf2, fValueOf3), new iy9(fValueOf3, fValueOf2), new iy9(fValueOf2, fValueOf), new iy9(fValueOf2, fValueOf2));
        b = 98.0f;
        c = 152.0f;
        d = 12.0f;
        e = 18.0f;
        f = 72.0f;
        g = 126.0f;
        h = 40.0f;
        i = 8.0f;
        j = 6.0f;
        k = 32.0f;
        l = t72.I(new iy9(new yi4(2.0f), new yi4(0.0f)), new iy9(new yi4(2.0f), new yi4(4.0f)), new iy9(new yi4(2.0f), new yi4(6.0f)), new iy9(new yi4(3.0f), new yi4(7.0f)), new iy9(new yi4(3.0f), new yi4(9.0f)), new iy9(new yi4(1.0f), new yi4(10.0f)), new iy9(new yi4(3.0f), new yi4(11.0f)), new iy9(new yi4(2.0f), new yi4(13.0f)), new iy9(new yi4(4.0f), new yi4(14.0f)));
        m = 4.0f;
        n = 14.0f;
        o = 0.25f;
        p = 2.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public static final void a(boolean z, y6c y6cVar, j09 j09Var, l46 l46Var, int i2) {
        int i3;
        sp1 sp1Var;
        g09 g09Var;
        d31 d31Var;
        boolean z2;
        ?? r0;
        y6c y6cVar2 = y6cVar;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        lx0 lx0Var = ndb.b;
        l46Var.h0(-1615831308);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(y6cVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            float f2 = m;
            float f3 = f;
            float f4 = f2 + f3;
            float f5 = g + n;
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                l46Var.f0(1964297337);
                l46Var.r(false);
                sp1Var = sp1.Light;
            } else {
                l46Var.f0(1964298429);
                sp1Var = ((die) l46Var.k(snd.a)).b;
                l46Var.r(false);
            }
            fy9 fy9VarA = od4.A(sp1Var.a(), 0, l46Var);
            long j2 = ((e8b) l46Var.k(l8b.a)).z;
            j09 j09VarM = b.m(j09Var, f4, f5);
            xn8 xn8VarC = s21.c(lx0Var, false);
            long j3 = j2;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarM);
            lf2.q.getClass();
            l46Var.j0();
            boolean z3 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, xn8VarC);
            dec.l(he2Var3, l46Var, u8aVarM);
            dec.l(he2Var2, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            he2 he2Var5 = he2Var;
            dec.l(he2Var5, l46Var, j09VarJ);
            l46Var.f0(-70911173);
            List list = l;
            int size = list.size() - 1;
            g09 g09Var2 = g09.a;
            d31 d31Var2 = d31.a;
            if (size >= 0) {
                while (true) {
                    int i4 = size - 1;
                    iy9 iy9Var = (iy9) list.get(size);
                    float f6 = ((yi4) iy9Var.a()).a;
                    float f7 = ((yi4) iy9Var.b()).a;
                    float size2 = ((size / (list.size() - 1)) * 0.44f) + 0.06f;
                    j09 j09VarP = b.p(tm7.M(g09Var2, f6, f7), f3);
                    List list2 = list;
                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarP);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, xn8VarC2);
                    dec.l(he2Var3, l46Var, u8aVarM2);
                    dec.l(he2Var2, l46Var, Integer.valueOf(iHashCode2));
                    dec.k(l46Var);
                    dec.l(he2Var5, l46Var, j09VarJ2);
                    y6cVar2 = y6cVar;
                    he2 he2Var6 = he2Var4;
                    float f8 = f3;
                    int i5 = size;
                    ov7 ov7Var2 = ov7Var;
                    he2 he2Var7 = he2Var3;
                    fy9 fy9Var = fy9VarA;
                    long j4 = j3;
                    lx0 lx0Var2 = lx0Var;
                    he2 he2Var8 = he2Var5;
                    he2 he2Var9 = he2Var2;
                    d31Var = d31Var2;
                    g09Var = g09Var2;
                    r0 = 0;
                    feg.j(fy9Var, null, oa7.E(dj6.w(b.p(g09Var2, f3), 0.5714286f), y6cVar2), null, an2.d, 0.0f, null, l46Var, 24632, 104);
                    if (i5 != 0) {
                        l46Var.f0(849441247);
                        s21.a(tm7.o(oa7.E(d31Var.b(g09Var), y6cVar2), y72.b(y72.b, size2), g21.f), l46Var, 0);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(849622876);
                        l46Var.r(false);
                    }
                    s21.a(db6.w(d31Var.b(g09Var), o, j4, y6cVar2), l46Var, 0);
                    z2 = true;
                    l46Var.r(true);
                    if (i4 < 0) {
                        break;
                    }
                    g09Var2 = g09Var;
                    d31Var2 = d31Var;
                    size = i4;
                    he2Var5 = he2Var8;
                    he2Var2 = he2Var9;
                    list = list2;
                    f3 = f8;
                    ov7Var = ov7Var2;
                    j3 = j4;
                    lx0Var = lx0Var2;
                    he2Var4 = he2Var6;
                    fy9VarA = fy9Var;
                    he2Var3 = he2Var7;
                }
            } else {
                g09Var = g09Var2;
                d31Var = d31Var2;
                z2 = true;
                r0 = 0;
            }
            l46Var.r(r0);
            if (z) {
                l46Var.f0(2097952844);
                long j5 = bx5.b(l46Var).d;
                long j6 = bx5.b(l46Var).a;
                j09 j09VarB = d31Var.b(g09Var);
                Object objR = l46Var.R();
                Object obj = sf2.a;
                if (objR == obj) {
                    objR = new fnc(13);
                    l46Var.p0(objR);
                }
                j09 j09VarU = b21.u(j09VarB, (a26) objR);
                boolean zF = l46Var.f(j5);
                Object objR2 = l46Var.R();
                if (zF || objR2 == obj) {
                    objR2 = new ac(j5, 18);
                    l46Var.p0(objR2);
                }
                s21.a(j09VarU.D(new zz0(y6cVar2, (a26) objR2)), l46Var, r0);
                s21.a(db6.w(d31Var.b(g09Var), p, j6, y6cVar2), l46Var, r0);
                l46Var.r(r0);
            } else {
                l46Var.f0(2098575572);
                l46Var.r(r0);
            }
            l46Var.r(z2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(z, y6cVar2, j09Var, i2, 9);
        }
    }

    public static final void b(int i2, int i3, l46 l46Var, j09 j09Var, boolean z) {
        int i4;
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-2040841050);
        if ((i3 & 6) == 0) {
            i4 = (l46Var2.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.h(z) ? 32 : 16;
        }
        int i5 = i4 | 384;
        if (l46Var2.W(i5 & 1, (i5 & 147) != 146)) {
            float f2 = (-n) / 2.0f;
            g09 g09Var = g09.a;
            j09 j09VarL = b.l(tm7.N(0.0f, f2, g09Var, 1), h);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarL);
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
            j09 j09VarP = pa7.p(d31.a.b(g09Var), z ? 0.3f : 1.0f);
            y6c y6cVar = a7c.a;
            j09 j09VarE = oa7.E(j09VarP, y6cVar);
            pr4 pr4Var = l8b.a;
            s21.a(db6.w(tm7.o(j09VarE, ((e8b) l46Var2.k(pr4Var)).f, g21.f), 1.0f, bx5.f(l46Var2), y6cVar), l46Var2, 0);
            String strValueOf = String.valueOf(i2);
            mue mueVar = pue.a;
            nte.b(strValueOf, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, cr5.f, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 0, 0, 130938);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xx1(i2, i3, j09Var2, z);
        }
    }

    public static final void c(sdd sddVar, ly lyVar, List list, boolean z, x16 x16Var, j09 j09Var, xw9 xw9Var, l26 l26Var, l46 l46Var, int i2) {
        int i3;
        x16 x16Var2;
        l26 l26Var2;
        xw9 xw9Var2;
        boolean z2;
        List list2 = list;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        list2.getClass();
        x16Var.getClass();
        l46Var.h0(-1839781416);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(sddVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? l46Var.g(lyVar) : l46Var.i(lyVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? l46Var.g(list2) : l46Var.i(list2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            x16Var2 = x16Var;
            i3 |= l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            x16Var2 = x16Var;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.g(j09Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i4 |= l46Var.i(l26Var) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (l46Var.W(i5 & 1, (i5 & 4793491) != 4793490)) {
            bx9 bx9VarQ = ynb.q(0.0f, 0.0f, 3);
            int size = list2.size();
            int i6 = size - 1;
            List list3 = a;
            int size2 = list3.size();
            j09 j09VarY = ynb.Y(b.c(j09Var, 1.0f), bx9VarQ);
            boolean zE = l46Var.e(size2);
            Object objR = l46Var.R();
            if (zE || objR == sf2.a) {
                objR = new nnc(size2, 1);
                l46Var.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            bx9 bx9Var = bx9VarQ;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarY);
            lf2.q.getClass();
            l46Var.j0();
            boolean z3 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, xn8Var);
            dec.l(he2Var3, l46Var, u8aVarM);
            dec.l(he2Var2, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(he2Var, l46Var, j09VarJ);
            l46Var.f0(1570967300);
            Iterator it = t72.B(list3).iterator();
            while (((y67) it).c) {
                int iNextInt = ((q67) it).nextInt();
                he2 he2Var5 = he2Var3;
                d(sddVar, iNextInt + 1, (TarotCardChoice) s72.y0(iNextInt, list2), !z && iNextInt == size, iNextInt == i6, lyVar, (z || iNextInt != size) ? null : x16Var2, null, l46Var, (i5 & 14) | ((i5 << 12) & 458752));
                x16Var2 = x16Var;
                he2Var2 = he2Var2;
                he2Var3 = he2Var5;
                he2Var4 = he2Var4;
                i6 = i6;
                it = it;
                bx9Var = bx9Var;
                size = size;
                list2 = list;
            }
            he2 he2Var6 = he2Var2;
            he2 he2Var7 = he2Var3;
            he2 he2Var8 = he2Var4;
            bx9 bx9Var2 = bx9Var;
            l46Var.r(false);
            if (l26Var != null) {
                l46Var.f0(1455751216);
                j09 j09VarC = b.c(g09.a, 1.0f);
                xn8 xn8VarC = s21.c(ndb.c, false);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarC);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var8, l46Var, xn8VarC);
                dec.l(he2Var7, l46Var, u8aVarM2);
                dec.l(he2Var6, l46Var, Integer.valueOf(iHashCode2));
                dec.k(l46Var);
                dec.l(he2Var, l46Var, j09VarJ2);
                l26Var2 = l26Var;
                l26Var2.z(l46Var, Integer.valueOf((i5 >> 21) & 14));
                z2 = true;
                l46Var.r(true);
                l46Var.r(false);
            } else {
                l26Var2 = l26Var;
                z2 = true;
                l46Var.f0(1455952065);
                l46Var.r(false);
            }
            l46Var.r(z2);
            xw9Var2 = bx9Var2;
        } else {
            l26Var2 = l26Var;
            l46Var.Z();
            xw9Var2 = xw9Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cc(sddVar, lyVar, list, z, x16Var, j09Var, xw9Var2, l26Var2, i2);
        }
    }

    public static final void d(sdd sddVar, int i2, TarotCardChoice tarotCardChoice, boolean z, boolean z2, ly lyVar, x16 x16Var, j09 j09Var, l46 l46Var, int i3) {
        int i4;
        j09 j09Var2;
        y6c y6cVar;
        boolean z3;
        boolean z4;
        j09 j09VarC;
        g09 g09Var;
        boolean z5;
        j09 j09VarD;
        l46Var.h0(1745443404);
        if ((i3 & 6) == 0) {
            i4 = (l46Var.g(sddVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var.g(tarotCardChoice) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= (262144 & i3) == 0 ? l46Var.g(lyVar) : l46Var.i(lyVar) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= l46Var.i(x16Var) ? 1048576 : 524288;
        }
        int i5 = i4 | 12582912;
        if (l46Var.W(i5 & 1, (4793491 & i5) != 4793490)) {
            float f2 = i;
            y6c y6cVarB = a7c.b(f2);
            boolean z6 = tarotCardChoice == null && !z;
            g09 g09Var2 = g09.a;
            if (x16Var != null) {
                y6cVar = y6cVarB;
                z3 = z6;
                z4 = false;
                j09VarC = androidx.compose.foundation.b.c(g09Var2, false, null, null, x16Var, 15);
            } else {
                y6cVar = y6cVarB;
                z3 = z6;
                z4 = false;
                j09VarC = g09Var2;
            }
            xn8 xn8VarC = s21.c(ndb.f, z4);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
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
            if (tarotCardChoice != null) {
                l46Var.f0(1621785398);
                float f3 = f;
                j09 j09VarP = b.p(g09Var2, f3);
                if (z2) {
                    l46Var.f0(-2025890312);
                    rdd rddVarB = sdd.b("selected_card_key", l46Var);
                    Object objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = new fv1(5);
                        l46Var.p0(objR);
                    }
                    j09VarD = sdd.d(sddVar, g09Var2, rddVarB, lyVar, (p21) objR);
                    l46Var.r(z4);
                } else {
                    l46Var.f0(-2025881990);
                    l46Var.r(z4);
                    j09VarD = g09Var2;
                }
                j09 j09VarD2 = j09VarP.D(j09VarD);
                pr4 pr4Var = l8b.a;
                g09Var = g09Var2;
                z5 = true;
                o7c.d(db6.w(j09VarD2, 0.5f, ((e8b) l46Var.k(pr4Var)).A, y6cVar), q7c.r(tarotCardChoice), null, false, an2.d, f2, null, false, l46Var, 221184, 204);
                String strQ = afc.q(tarotCardChoice.getCard().getTitleRes(), l46Var);
                boolean zIsReversed = tarotCardChoice.isReversed();
                mue mueVar = pue.a;
                jrb.b(strQ, zIsReversed, mue.a(pue.j(l46Var), ((e8b) l46Var.k(pr4Var)).t, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), tm7.N(0.0f, g + j, b.p(d31.a.a(g09Var, ndb.c), f3), 1), null, l46Var, 0, 16);
                l46Var.r(false);
            } else {
                g09Var = g09Var2;
                boolean z7 = z4;
                z5 = true;
                l46Var.f0(1622961290);
                a(z, y6cVar, pa7.p(g09Var, z3 ? 0.3f : 1.0f), l46Var, (i5 >> 9) & 14);
                b(i2, (i5 >> 3) & 14, l46Var, null, z3);
                l46Var.r(z7);
            }
            l46Var.r(z5);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h91(sddVar, i2, tarotCardChoice, z, z2, lyVar, x16Var, j09Var2, i3);
        }
    }
}
