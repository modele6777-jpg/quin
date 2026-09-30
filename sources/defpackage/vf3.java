package defpackage;

import ai.askquin.R;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vf3 {
    public static final bx9 a = ynb.r(0.0f, 0.0f, 12.0f, 12.0f, 3);
    public static final float b;

    static {
        ynb.r(24.0f, 16.0f, 12.0f, 0.0f, 8);
        ynb.r(24.0f, 0.0f, 12.0f, 12.0f, 2);
        b = 16.0f;
    }

    public static final void a(final j09 j09Var, final l26 l26Var, final l26 l26Var2, final l26 l26Var3, final ke3 ke3Var, final mue mueVar, final float f, final dd2 dd2Var, l46 l46Var, final int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1539132883);
        if ((i & 6) == 0) {
            i2 = (l46Var2.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.i(l26Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = l26Var2;
            i2 |= l46Var2.i(obj) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            obj = l26Var2;
        }
        if ((i & 3072) == 0) {
            obj2 = l26Var3;
            i2 |= l46Var2.i(obj2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            obj2 = l26Var3;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var2.g(ke3Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            obj3 = mueVar;
            i2 |= l46Var2.g(obj3) ? 131072 : 65536;
        } else {
            obj3 = mueVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var2.d(f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= l46Var2.i(dd2Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (l46Var2.W(i3 & 1, (4793491 & i3) != 4793490)) {
            j09 j09VarO = b.o(j09Var, i7h.g, 0.0f, 0.0f, 14);
            Object objR = l46Var2.R();
            if (objR == sf2.a) {
                objR = new i73(10);
                l46Var2.p0(objR);
            }
            j09 j09VarO2 = tm7.o(vwc.b(j09VarO, false, (a26) objR), ke3Var.a, g21.f);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iW = an1.w(l46Var2);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO2);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var2, iW, he2Var);
            }
            dec.l(hj6.x, l46Var2, j09VarJ);
            l46Var2 = l46Var;
            d(l26Var, ke3Var.b, ke3Var.c, f, af1.b0(-1658370654, new bf3(obj, obj2, l26Var, ke3Var, obj3, 0), l46Var2), l46Var2, (i3 & 112) | 196614 | (57344 & (i3 >> 6)));
            tec.q((i3 >> 21) & 14, dd2Var, l46Var2, true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: xe3
                @Override // defpackage.l26
                public final Object z(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    vf3.a(j09Var, l26Var, l26Var2, l26Var3, ke3Var, mueVar, f, dd2Var, (l46) obj4, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void b(wf3 wf3Var, j09 j09Var, ne3 ne3Var, ke3 ke3Var, l26 l26Var, l26 l26Var2, boolean z, fo5 fo5Var, l46 l46Var, int i) {
        ne3 ne3Var2;
        fo5 fo5Var2;
        ne3 ne3Var3;
        int i2;
        fo5 fo5Var3;
        dd2 dd2VarB0;
        l46Var.h0(1105472031);
        int i3 = i | (l46Var.g(wf3Var) ? 4 : 2) | (l46Var.g(j09Var) ? 32 : 16) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS | (l46Var.g(ke3Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | 12582912;
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            l46Var.b0();
            int i4 = i & 1;
            i8c i8cVar = sf2.a;
            if (i4 == 0 || l46Var.C()) {
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    z67 z67Var = me3.a;
                    objR = new ne3();
                    l46Var.p0(objR);
                }
                ne3Var3 = (ne3) objR;
                i2 = i3 & (-897);
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new fo5();
                    l46Var.p0(objR2);
                }
                fo5Var3 = (fo5) objR2;
            } else {
                l46Var.Z();
                i2 = i3 & (-897);
                ne3Var3 = ne3Var;
                fo5Var3 = fo5Var;
            }
            int i5 = i2;
            l46Var.s();
            boolean zG = l46Var.g(((xf3) wf3Var).b);
            Object objR3 = l46Var.R();
            if (zG || objR3 == i8cVar) {
                objR3 = wf3Var instanceof xf3 ? ((xf3) wf3Var).c : new l91(((xf3) wf3Var).b);
                l46Var.p0(objR3);
            }
            j91 j91Var = (j91) objR3;
            int i6 = 3;
            if (z) {
                l46Var.f0(-690551113);
                dd2VarB0 = af1.b0(-1483431603, new fw0(i6, wf3Var, ke3Var), l46Var);
                l46Var.r(false);
            } else {
                l46Var.f0(-690163489);
                l46Var.r(false);
                dd2VarB0 = null;
            }
            fo5 fo5Var4 = fo5Var3;
            ne3 ne3Var4 = ne3Var3;
            a(j09Var, l26Var, l26Var2, dd2VarB0, ke3Var, r9f.a(i7h.t, l46Var), i7h.r, af1.b0(-1346903698, new bf3(wf3Var, j91Var, ne3Var4, ke3Var, fo5Var4, 1), l46Var), l46Var, ((i5 >> 3) & 14) | 14156208 | (57344 & (i5 << 3)));
            ne3Var2 = ne3Var4;
            fo5Var2 = fo5Var4;
        } else {
            l46Var.Z();
            ne3Var2 = ne3Var;
            fo5Var2 = fo5Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p20(wf3Var, j09Var, ne3Var2, ke3Var, l26Var, l26Var2, z, fo5Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x023d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0241  */
    /* JADX WARN: Code duplicated, block: B:95:0x025c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0284  */
    /* JADX WARN: Code duplicated, block: B:99:0x0288  */
    public static final void c(Long l, long j, a26 a26Var, a26 a26Var2, j91 j91Var, z67 z67Var, ne3 ne3Var, euc eucVar, ke3 ke3Var, l46 l46Var, int i) {
        he2 he2Var;
        String strZ;
        boolean zI;
        Object objR;
        boolean zI2;
        Object objR2;
        boolean zG;
        Object objR3;
        int iW;
        int iW2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-434467002);
        int i2 = i | (l46Var2.g(l) ? 4 : 2) | (l46Var2.f(j) ? 32 : 16) | (l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(a26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(j91Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(z67Var) ? 131072 : 65536) | (l46Var2.g(ne3Var) ? 1048576 : 524288) | (l46Var2.g(eucVar) ? 8388608 : 4194304) | (l46Var2.g(ke3Var) ? 67108864 : 33554432);
        final int i3 = 1;
        if (l46Var2.W(i2 & 1, (38347923 & i2) != 38347922)) {
            n91 n91VarA = j91Var.a(j);
            int i4 = (((n91VarA.a - z67Var.a) * 12) + n91VarA.b) - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            final j18 j18VarA = k18.a(i4, 2, l46Var2);
            Integer numValueOf = Integer.valueOf(i4);
            boolean zG2 = l46Var2.g(j18VarA) | l46Var2.e(i4);
            Object objR4 = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (zG2 || objR4 == i8cVar) {
                objR4 = new df3(j18VarA, i4, null);
                l46Var2.p0(objR4);
            }
            af1.o((l26) objR4, l46Var2, numValueOf);
            Object objR5 = l46Var2.R();
            if (objR5 == i8cVar) {
                objR5 = af1.E(l46Var2);
                l46Var2.p0(objR5);
            }
            final aw2 aw2Var = (aw2) objR5;
            Object[] objArr = new Object[0];
            Object objR6 = l46Var2.R();
            if (objR6 == i8cVar) {
                objR6 = new os2(27);
                l46Var2.p0(objR6);
            }
            e89 e89Var = (e89) vfh.I(objArr, (x16) objR6, l46Var2, 48);
            jx0 jx0Var = ndb.Y;
            sc0 sc0Var = xc0.c;
            c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var2, 0);
            int iW3 = an1.w(l46Var2);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var2 = hj6.z;
            dec.l(he2Var2, l46Var2, c92VarA);
            he2 he2Var3 = hj6.y;
            dec.l(he2Var3, l46Var2, u8aVarM);
            he2 he2Var4 = hj6.X;
            if (l46Var2.S) {
                he2Var = he2Var2;
            } else {
                he2Var = he2Var2;
                if (!pa7.t(l46Var2.R(), Integer.valueOf(iW3))) {
                }
                he2 he2Var5 = hj6.x;
                dec.l(he2Var5, l46Var2, j09VarJ);
                j09 j09VarB0 = ynb.b0(12.0f, 0.0f, g09Var, 2);
                boolean zD = j18VarA.d();
                boolean zC = j18VarA.c();
                boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                Locale locale = j91Var.a;
                ne3Var.getClass();
                strZ = rs0.z(j, "yMMMM", locale, ne3Var.a);
                if (strZ == null) {
                    strZ = "-";
                }
                String str = strZ;
                zI = l46Var2.i(aw2Var) | l46Var2.g(j18VarA);
                objR = l46Var2.R();
                if (zI || objR == i8cVar) {
                    final int i5 = 0;
                    objR = new x16() { // from class: oe3
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i6 = i5;
                            wef wefVar = wef.a;
                            j18 j18Var = j18VarA;
                            aw2 aw2Var2 = aw2Var;
                            switch (i6) {
                                case 0:
                                    ynb.V(aw2Var2, null, null, new ef3(j18Var, null), 3);
                                    break;
                                default:
                                    ynb.V(aw2Var2, null, null, new ff3(j18Var, null), 3);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var2.p0(objR);
                }
                x16 x16Var = (x16) objR;
                zI2 = l46Var2.i(aw2Var) | l46Var2.g(j18VarA);
                objR2 = l46Var2.R();
                if (zI2 || objR2 == i8cVar) {
                    objR2 = new x16() { // from class: oe3
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i6 = i3;
                            wef wefVar = wef.a;
                            j18 j18Var = j18VarA;
                            aw2 aw2Var2 = aw2Var;
                            switch (i6) {
                                case 0:
                                    ynb.V(aw2Var2, null, null, new ef3(j18Var, null), 3);
                                    break;
                                default:
                                    ynb.V(aw2Var2, null, null, new ff3(j18Var, null), 3);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var2.p0(objR2);
                }
                x16 x16Var2 = (x16) objR2;
                zG = l46Var2.g(e89Var);
                objR3 = l46Var2.R();
                if (zG || objR3 == i8cVar) {
                    objR3 = new i8(e89Var, 25);
                    l46Var2.p0(objR3);
                }
                int i6 = i2 & 234881024;
                he2 he2Var6 = he2Var;
                j(j09VarB0, zD, zC, zBooleanValue, str, x16Var, x16Var2, (x16) objR3, ke3Var, l46Var2, i6 | 6);
                l46Var2 = l46Var2;
                xn8 xn8VarC = s21.c(ndb.b, false);
                iW = an1.w(l46Var2);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, g09Var);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var6, l46Var2, xn8VarC);
                dec.l(he2Var3, l46Var2, u8aVarM2);
                if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW))) {
                    tec.r(iW, l46Var2, iW, he2Var4);
                }
                dec.l(he2Var5, l46Var2, j09VarJ2);
                j09 j09VarB1 = ynb.b0(12.0f, 0.0f, g09Var, 2);
                c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var2, 0);
                iW2 = an1.w(l46Var2);
                u8a u8aVarM3 = l46Var2.m();
                j09 j09VarJ3 = m93.J(l46Var2, j09VarB1);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var6, l46Var2, c92VarA2);
                dec.l(he2Var3, l46Var2, u8aVarM3);
                if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW2))) {
                    tec.r(iW2, l46Var2, iW2, he2Var4);
                }
                dec.l(he2Var5, l46Var2, j09VarJ3);
                l(ke3Var, j91Var, l46Var2, ((i2 >> 24) & 14) | ((i2 >> 9) & 112));
                g(j18VarA, l, a26Var, a26Var2, j91Var, z67Var, ne3Var, eucVar, ke3Var, l46Var2, ((i2 << 3) & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128) | i6);
                l46Var2.r(true);
                t39 t39Var = t39.c;
                fxd fxdVarZ = vpf.Z(t39Var, l46Var2);
                fxd fxdVarZ2 = vpf.Z(t39.d, l46Var2);
                fxd fxdVarZ3 = vpf.Z(t39Var, l46Var2);
                m93.d(((Boolean) e89Var.getValue()).booleanValue(), oa7.F(g09Var), rw4.e(fxdVarZ3, null, 14).a(new cx4(new o3f(new x95(0.6f, fxdVarZ), (ood) null, (vv1) null, (aec) null, (LinkedHashMap) null, 126))), rw4.l(fxdVarZ3, null, 14).a(rw4.g(fxdVarZ2, 2)), null, af1.b0(1193716082, new hf3(j, e89Var, aw2Var, j18VarA, z67Var, n91VarA, eucVar, j91Var, ke3Var), l46Var2), l46Var2, 196656, 16);
                l46Var2.r(true);
                l46Var2.r(true);
            }
            tec.r(iW3, l46Var2, iW3, he2Var4);
            he2 he2Var7 = hj6.x;
            dec.l(he2Var7, l46Var2, j09VarJ);
            j09 j09VarB2 = ynb.b0(12.0f, 0.0f, g09Var, 2);
            boolean zD2 = j18VarA.d();
            boolean zC2 = j18VarA.c();
            boolean zBooleanValue2 = ((Boolean) e89Var.getValue()).booleanValue();
            Locale locale2 = j91Var.a;
            ne3Var.getClass();
            strZ = rs0.z(j, "yMMMM", locale2, ne3Var.a);
            if (strZ == null) {
                strZ = "-";
            }
            String str2 = strZ;
            zI = l46Var2.i(aw2Var) | l46Var2.g(j18VarA);
            objR = l46Var2.R();
            if (zI) {
                final int i7 = 0;
                objR = new x16() { // from class: oe3
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i8 = i7;
                        wef wefVar = wef.a;
                        j18 j18Var = j18VarA;
                        aw2 aw2Var2 = aw2Var;
                        switch (i8) {
                            case 0:
                                ynb.V(aw2Var2, null, null, new ef3(j18Var, null), 3);
                                break;
                            default:
                                ynb.V(aw2Var2, null, null, new ff3(j18Var, null), 3);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var2.p0(objR);
            } else {
                final int i8 = 0;
                objR = new x16() { // from class: oe3
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i9 = i8;
                        wef wefVar = wef.a;
                        j18 j18Var = j18VarA;
                        aw2 aw2Var2 = aw2Var;
                        switch (i9) {
                            case 0:
                                ynb.V(aw2Var2, null, null, new ef3(j18Var, null), 3);
                                break;
                            default:
                                ynb.V(aw2Var2, null, null, new ff3(j18Var, null), 3);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var2.p0(objR);
            }
            x16 x16Var3 = (x16) objR;
            zI2 = l46Var2.i(aw2Var) | l46Var2.g(j18VarA);
            objR2 = l46Var2.R();
            if (zI2) {
                objR2 = new x16() { // from class: oe3
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i9 = i3;
                        wef wefVar = wef.a;
                        j18 j18Var = j18VarA;
                        aw2 aw2Var2 = aw2Var;
                        switch (i9) {
                            case 0:
                                ynb.V(aw2Var2, null, null, new ef3(j18Var, null), 3);
                                break;
                            default:
                                ynb.V(aw2Var2, null, null, new ff3(j18Var, null), 3);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var2.p0(objR2);
            } else {
                objR2 = new x16() { // from class: oe3
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i9 = i3;
                        wef wefVar = wef.a;
                        j18 j18Var = j18VarA;
                        aw2 aw2Var2 = aw2Var;
                        switch (i9) {
                            case 0:
                                ynb.V(aw2Var2, null, null, new ef3(j18Var, null), 3);
                                break;
                            default:
                                ynb.V(aw2Var2, null, null, new ff3(j18Var, null), 3);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var2.p0(objR2);
            }
            x16 x16Var4 = (x16) objR2;
            zG = l46Var2.g(e89Var);
            objR3 = l46Var2.R();
            if (zG) {
                objR3 = new i8(e89Var, 25);
                l46Var2.p0(objR3);
            } else {
                objR3 = new i8(e89Var, 25);
                l46Var2.p0(objR3);
            }
            int i9 = i2 & 234881024;
            he2 he2Var8 = he2Var;
            j(j09VarB2, zD2, zC2, zBooleanValue2, str2, x16Var3, x16Var4, (x16) objR3, ke3Var, l46Var2, i9 | 6);
            l46Var2 = l46Var2;
            xn8 xn8VarC2 = s21.c(ndb.b, false);
            iW = an1.w(l46Var2);
            u8a u8aVarM4 = l46Var2.m();
            j09 j09VarJ4 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var8, l46Var2, xn8VarC2);
            dec.l(he2Var3, l46Var2, u8aVarM4);
            if (l46Var2.S) {
                tec.r(iW, l46Var2, iW, he2Var4);
            } else {
                tec.r(iW, l46Var2, iW, he2Var4);
            }
            dec.l(he2Var7, l46Var2, j09VarJ4);
            j09 j09VarB3 = ynb.b0(12.0f, 0.0f, g09Var, 2);
            c92 c92VarA3 = a92.a(sc0Var, jx0Var, l46Var2, 0);
            iW2 = an1.w(l46Var2);
            u8a u8aVarM5 = l46Var2.m();
            j09 j09VarJ5 = m93.J(l46Var2, j09VarB3);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var8, l46Var2, c92VarA3);
            dec.l(he2Var3, l46Var2, u8aVarM5);
            if (l46Var2.S) {
                tec.r(iW2, l46Var2, iW2, he2Var4);
            } else {
                tec.r(iW2, l46Var2, iW2, he2Var4);
            }
            dec.l(he2Var7, l46Var2, j09VarJ5);
            l(ke3Var, j91Var, l46Var2, ((i2 >> 24) & 14) | ((i2 >> 9) & 112));
            g(j18VarA, l, a26Var, a26Var2, j91Var, z67Var, ne3Var, eucVar, ke3Var, l46Var2, ((i2 << 3) & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128) | i9);
            l46Var2.r(true);
            t39 t39Var2 = t39.c;
            fxd fxdVarZ4 = vpf.Z(t39Var2, l46Var2);
            fxd fxdVarZ5 = vpf.Z(t39.d, l46Var2);
            fxd fxdVarZ6 = vpf.Z(t39Var2, l46Var2);
            m93.d(((Boolean) e89Var.getValue()).booleanValue(), oa7.F(g09Var), rw4.e(fxdVarZ6, null, 14).a(new cx4(new o3f(new x95(0.6f, fxdVarZ4), (ood) null, (vv1) null, (aec) null, (LinkedHashMap) null, 126))), rw4.l(fxdVarZ6, null, 14).a(rw4.g(fxdVarZ5, 2)), null, af1.b0(1193716082, new hf3(j, e89Var, aw2Var, j18VarA, z67Var, n91VarA, eucVar, j91Var, ke3Var), l46Var2), l46Var2, 196656, 16);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pe3(l, j, a26Var, a26Var2, j91Var, z67Var, ne3Var, eucVar, ke3Var, i);
        }
    }

    public static final void d(final l26 l26Var, final long j, final long j2, final float f, final dd2 dd2Var, l46 l46Var, final int i) {
        int i2;
        long j3;
        l46Var.h0(2020490761);
        int i3 = i & 6;
        g09 g09Var = g09.a;
        if (i3 == 0) {
            i2 = (l46Var.g(g09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(l26Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i2 |= l46Var.f(j3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.f(j2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.d(f) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(dd2Var) ? 131072 : 65536;
        }
        int i4 = 1;
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            j09 j09VarD = b.c(g09Var, 1.0f).D(l26Var != null ? b.b(0.0f, f, g09Var, 1) : g09Var);
            c92 c92VarA = a92.a(xc0.g, ndb.Y, l46Var, 6);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            if (l26Var != null) {
                l46Var.f0(396894187);
                cgg.l(j3, r9f.a(i7h.v, l46Var), af1.b0(1344395458, new af3(i4, l26Var), l46Var), l46Var, ((i2 >> 6) & 14) | 384);
                l46Var.r(false);
            } else {
                l46Var.f0(397163267);
                l46Var.r(false);
            }
            mh3.a(ib8.f(j2, em2.a), dd2Var, l46Var, ((i2 >> 12) & 112) | 8);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: ye3
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vf3.d(l26Var, j, j2, f, dd2Var, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void e(final String str, final boolean z, final x16 x16Var, final boolean z2, final boolean z3, final boolean z4, final String str2, final ke3 ke3Var, l46 l46Var, final int i) {
        int i2;
        long j;
        h0e h0eVarI;
        q11 q11VarB;
        l46Var.h0(-945355136);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        g09 g09Var = g09.a;
        if (i3 == 0) {
            i2 |= l46Var.g(g09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.h(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= l46Var.h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= l46Var.g(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= l46Var.g(ke3Var) ? 536870912 : 268435456;
        }
        if (l46Var.W(i2 & 1, (306783379 & i2) != 306783378)) {
            boolean z5 = (234881024 & i2) == 67108864;
            Object objR = l46Var.R();
            if (z5 || objR == sf2.a) {
                objR = new ia(str2, 7);
                l46Var.p0(objR);
            }
            j09 j09VarB = vwc.b(g09Var, true, (a26) objR);
            x4d x4dVarB = u5d.b(i7h.i, l46Var);
            int i4 = i2 >> 6;
            if (z) {
                j = z3 ? ke3Var.r : ke3Var.s;
            } else {
                j = y72.j;
            }
            long j2 = j;
            if (z2) {
                l46Var.f0(-1319856736);
                h0eVarI = qkd.a(j2, vpf.Z(t39.c, l46Var), null, l46Var, 0, 12);
                l46Var.r(false);
            } else {
                l46Var.f0(-1319630064);
                h0eVarI = q1c.i(new y72(j2), l46Var);
                l46Var.r(false);
            }
            long j3 = ((y72) h0eVarI.getValue()).a;
            if (!z4 || z) {
                q11VarB = null;
            } else {
                q11VarB = x57.b(ke3Var.u, i7h.o);
            }
            nae.b(z, x16Var, j09VarB, z3, x4dVarB, j3, 0.0f, q11VarB, null, af1.b0(1126347158, new if3(str, ke3Var, z4, z, z3), l46Var), l46Var, i4 & 7294, 1472);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: ve3
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vf3.e(str, z, x16Var, z2, z3, z4, str2, ke3Var, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void f(j09 j09Var, int i, a26 a26Var, ke3 ke3Var, l46 l46Var, int i2) {
        l46Var.h0(-1461252485);
        int i3 = (l46Var.e(i) ? 32 : 16) | i2 | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(ke3Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            mh3.a(ib8.f(ke3Var.c, em2.a), af1.b0(-1734512197, new jf3(i, a26Var, j09Var), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(j09Var, i, a26Var, ke3Var, i2);
        }
    }

    public static final void g(j18 j18Var, Long l, a26 a26Var, a26 a26Var2, j91 j91Var, z67 z67Var, ne3 ne3Var, euc eucVar, ke3 ke3Var, l46 l46Var, int i) {
        Object mf3Var;
        j18 j18Var2 = j18Var;
        l46Var.h0(-1994757941);
        int i2 = i | (l46Var.g(j18Var2) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= l46Var.g(l) ? 32 : 16;
        }
        int i3 = i2 | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(j91Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(z67Var) ? 131072 : 65536) | (l46Var.g(ne3Var) ? 1048576 : 524288) | (l46Var.g(eucVar) ? 8388608 : 4194304) | (l46Var.g(ke3Var) ? 67108864 : 33554432);
        if (l46Var.W(i3 & 1, (38347923 & i3) != 38347922)) {
            c91 c91VarB = j91Var.b();
            boolean zG = l46Var.g(z67Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = ((l91) j91Var).e(LocalDate.of(z67Var.a, 1, 1));
                l46Var.p0(objR);
            }
            nte.a(r9f.a(i7h.k, l46Var), af1.b0(1504086906, new lf3(j18Var2, z67Var, j91Var, (n91) objR, a26Var, c91VarB, l, ne3Var, eucVar, ke3Var), l46Var), l46Var, 48);
            boolean zI = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | l46Var.i(j91Var) | l46Var.i(z67Var);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                j18Var2 = j18Var;
                mf3Var = new mf3(j18Var2, a26Var2, j91Var, z67Var, null);
                l46Var.p0(mf3Var);
            } else {
                mf3Var = objR2;
                j18Var2 = j18Var;
            }
            af1.o((l26) mf3Var, l46Var, j18Var2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new re3(j18Var2, l, a26Var, a26Var2, j91Var, z67Var, ne3Var, eucVar, ke3Var, i);
        }
    }

    public static final void h(x16 x16Var, gx6 gx6Var, String str, j09 j09Var, boolean z, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        boolean z2;
        int i4;
        j09 j09Var3;
        boolean z3;
        l46Var.h0(-368059805);
        int i5 = i | (l46Var.i(x16Var) ? 4 : 2) | (l46Var.g(gx6Var) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            j09Var2 = j09Var;
        } else {
            j09Var2 = j09Var;
            i3 = i5 | (l46Var.g(j09Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        int i8 = 0;
        if (l46Var.W(i4 & 1, (i4 & 9363) != 9362)) {
            j09 j09Var4 = i6 != 0 ? g09.a : j09Var2;
            if (i7 != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            a0f.b(xze.a(l46Var), af1.b0(-456272562, new nf3(str, i8), l46Var), a0f.c(l46Var), null, false, af1.b0(-1124908186, new of3(x16Var, j09Var4, z4, gx6Var, str), l46Var), l46Var, 100663344);
            j09Var3 = j09Var4;
            z3 = z4;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            z3 = z2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dk(x16Var, gx6Var, str, j09Var3, z3, i, i2);
        }
    }

    public static final void i(final n91 n91Var, final a26 a26Var, final long j, final Long l, final ne3 ne3Var, euc eucVar, final ke3 ke3Var, final Locale locale, l46 l46Var, final int i) {
        l46 l46Var2;
        euc eucVar2;
        l46 l46Var3;
        g09 g09Var;
        n91 n91Var2 = n91Var;
        Object obj = a26Var;
        ne3 ne3Var2 = ne3Var;
        Locale locale2 = locale;
        l46 l46Var4 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var4.h0(-333300603);
        int i2 = i | (l46Var4.g(n91Var2) ? 4 : 2) | (l46Var4.i(obj) ? 32 : 16) | (l46Var4.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var4.g(l) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var4.g(ne3Var2) ? 1048576 : 524288) | (l46Var4.g(eucVar) ? 8388608 : 4194304) | (l46Var4.g(ke3Var) ? 67108864 : 33554432) | (l46Var4.i(locale2) ? 536870912 : 268435456);
        if (l46Var4.W(i2 & 1, (i2 & 306783379) != 306783378)) {
            l46Var4.f0(606771165);
            l46Var4.r(false);
            g09 g09Var2 = g09.a;
            j09 j09VarD = b.g(g09Var2, 288.0f).D(g09Var2);
            jx0 jx0Var = ndb.Y;
            gec gecVar = xc0.f;
            c92 c92VarA = a92.a(gecVar, jx0Var, l46Var4, 6);
            int iW = an1.w(l46Var4);
            u8a u8aVarM = l46Var4.m();
            j09 j09VarJ = m93.J(l46Var4, j09VarD);
            lf2.q.getClass();
            l46Var4.j0();
            boolean z = l46Var4.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var4.l(ov7Var);
            } else {
                l46Var4.s0();
            }
            dec.l(he2Var4, l46Var4, c92VarA);
            dec.l(he2Var3, l46Var4, u8aVarM);
            if (l46Var4.S || !pa7.t(l46Var4.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var4, iW, he2Var2);
            }
            dec.l(he2Var, l46Var4, j09VarJ);
            l46Var4.f0(-680088486);
            int i3 = 0;
            int i4 = 0;
            int i5 = 6;
            while (i4 < i5) {
                j09 j09VarC = b.c(g09Var2, 1.0f);
                int i6 = i3;
                t7c t7cVarA = s7c.a(gecVar, ndb.z, l46Var4, 54);
                int iW2 = an1.w(l46Var4);
                gec gecVar2 = gecVar;
                u8a u8aVarM2 = l46Var4.m();
                j09 j09VarJ2 = m93.J(l46Var4, j09VarC);
                lf2.q.getClass();
                l46Var4.j0();
                int i7 = i4;
                if (l46Var4.S) {
                    l46Var4.l(ov7Var);
                } else {
                    l46Var4.s0();
                }
                dec.l(he2Var4, l46Var4, t7cVarA);
                dec.l(he2Var3, l46Var4, u8aVarM2);
                if (l46Var4.S || !pa7.t(l46Var4.R(), Integer.valueOf(iW2))) {
                    tec.r(iW2, l46Var4, iW2, he2Var2);
                }
                dec.l(he2Var, l46Var4, j09VarJ2);
                l46Var4.f0(1542622325);
                int i8 = i6;
                int i9 = 0;
                while (i9 < 7) {
                    int i10 = n91Var2.d;
                    if (i8 < i10 || i8 >= i10 + n91Var2.c) {
                        l46Var3 = l46Var4;
                        ov7Var = ov7Var;
                        g09Var = g09Var2;
                        l46Var3.f0(576825328);
                        j09 j09VarO = b.o(g09Var, i7h.j, i7h.h, 0.0f, 12);
                        pr4 pr4Var = p77.c;
                        o5c.f(l46Var3, b.m(j09VarO, ((yi4) l46Var3.k(pr4Var)).a, ((yi4) l46Var3.k(pr4Var)).a));
                        l46Var3.r(false);
                    } else {
                        l46Var4.f0(577914947);
                        int i11 = i8 - n91Var2.d;
                        long j2 = (((long) i11) * 86400000) + n91Var2.e;
                        boolean z2 = j2 == j;
                        boolean z3 = l != null && j2 == l.longValue();
                        l46Var4.f0(578890300);
                        l46Var4.r(false);
                        StringBuilder sb = new StringBuilder();
                        l46Var4.f0(974838827);
                        l46Var4.r(false);
                        if (z2) {
                            l46Var4.f0(1416920485);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(tgc.h(R.string.m3c_date_picker_today_description, l46Var4));
                            l46Var4.r(false);
                        } else {
                            l46Var4.f0(975029291);
                            l46Var4.r(false);
                        }
                        String string = sb.length() == 0 ? null : sb.toString();
                        String strA = ne3Var2.a(Long.valueOf(j2), locale2, true);
                        if (strA == null) {
                            strA = "";
                        }
                        String strA2 = i91.a(i11 + 1, locale2);
                        boolean zF = ((i2 & 112) == 32) | l46Var4.f(j2);
                        Object objR = l46Var4.R();
                        i8c i8cVar = sf2.a;
                        if (zF || objR == i8cVar) {
                            objR = new dw(obj, j2, 1);
                            l46Var4.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zF2 = ((i2 & 29360128) == 8388608) | l46Var4.f(j2);
                        Object objR2 = l46Var4.R();
                        if (zF2 || objR2 == i8cVar) {
                            eucVar.getClass();
                            objR2 = Boolean.valueOf(eucVar.a(j2));
                            l46Var4.p0(objR2);
                        }
                        boolean zBooleanValue = ((Boolean) objR2).booleanValue();
                        if (string != null) {
                            strA = ib8.j(string, ", ", strA);
                        }
                        g09Var = g09Var2;
                        l46 l46Var5 = l46Var4;
                        e(strA2, z3, x16Var, z3, zBooleanValue, z2, strA, ke3Var, l46Var5, ((i2 << 3) & 1879048192) | 48);
                        l46Var3 = l46Var5;
                        l46Var3.r(false);
                    }
                    obj = a26Var;
                    he2Var3 = he2Var3;
                    he2Var4 = he2Var4;
                    g09Var2 = g09Var;
                    i8++;
                    i9++;
                    ov7Var = ov7Var;
                    he2Var = he2Var;
                    n91Var2 = n91Var;
                    locale2 = locale;
                    he2Var2 = he2Var2;
                    l46Var4 = l46Var3;
                    ne3Var2 = ne3Var;
                }
                l46 l46Var6 = l46Var4;
                l46Var6.r(false);
                l46Var6.r(true);
                obj = a26Var;
                locale2 = locale;
                i4 = i7 + 1;
                i5 = 6;
                gecVar = gecVar2;
                i3 = i8;
                ov7Var = ov7Var;
                he2Var = he2Var;
                n91Var2 = n91Var;
                he2Var2 = he2Var2;
                l46Var4 = l46Var6;
                ne3Var2 = ne3Var;
            }
            eucVar2 = eucVar;
            l46Var2 = l46Var4;
            l46Var2.r(false);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var4;
            eucVar2 = eucVar;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final euc eucVar3 = eucVar2;
            ojbVarV.d = new l26(a26Var, j, l, ne3Var, eucVar3, ke3Var, locale, i) { // from class: ue3
                public final /* synthetic */ a26 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Long d;
                public final /* synthetic */ ne3 e;
                public final /* synthetic */ euc f;
                public final /* synthetic */ ke3 g;
                public final /* synthetic */ Locale v;

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(221185);
                    vf3.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj2, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void j(j09 j09Var, final boolean z, final boolean z2, final boolean z3, final String str, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final ke3 ke3Var, l46 l46Var, final int i) {
        j09 j09Var2;
        l46Var.h0(-773929258);
        int i2 = i | (l46Var.h(z) ? 32 : 16) | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(str) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536) | (l46Var.i(x16Var2) ? 1048576 : 524288) | (l46Var.i(x16Var3) ? 8388608 : 4194304) | (l46Var.g(ke3Var) ? 67108864 : 33554432);
        if (l46Var.W(i2 & 1, (38347923 & i2) != 38347922)) {
            j09Var2 = j09Var;
            j09 j09VarG = b.g(b.c(j09Var2, 1.0f), 56.0f);
            t7c t7cVarA = s7c.a(z3 ? xc0.a : xc0.g, ndb.z, l46Var, 48);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarG);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            o(x16Var3, z3, null, af1.b0(619076006, new fw0(5, str, ke3Var), l46Var), l46Var, ((i2 >> 21) & 14) | 3072 | ((i2 >> 6) & 112));
            if (z3) {
                l46Var.f0(282432080);
                l46Var.r(false);
            } else {
                l46Var.f0(281624840);
                mh3.a(ib8.f(ke3Var.f, em2.a), af1.b0(-128317193, new pf3(x16Var2, x16Var, z2, z), l46Var), l46Var, 56);
                l46Var.r(false);
            }
            l46Var.r(true);
        } else {
            j09Var2 = j09Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final j09 j09Var3 = j09Var2;
            ojbVarV.d = new l26(z, z2, z3, str, x16Var, x16Var2, x16Var3, ke3Var, i) { // from class: qe3
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ x16 f;
                public final /* synthetic */ x16 g;
                public final /* synthetic */ x16 v;
                public final /* synthetic */ ke3 w;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(7);
                    vf3.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void k(final Long l, final long j, final int i, final a26 a26Var, final a26 a26Var2, final j91 j91Var, final z67 z67Var, final ne3 ne3Var, final euc eucVar, final ke3 ke3Var, final fo5 fo5Var, l46 l46Var, final int i2) {
        l46Var.h0(-2053685029);
        int i3 = i2 | (l46Var.g(l) ? 4 : 2) | (l46Var.f(j) ? 32 : 16) | (l46Var.e(i) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(j91Var) ? 131072 : 65536) | (l46Var.i(z67Var) ? 1048576 : 524288) | (l46Var.g(ne3Var) ? 8388608 : 4194304) | (l46Var.g(eucVar) ? 67108864 : 33554432) | (l46Var.g(ke3Var) ? 536870912 : 268435456);
        if (l46Var.W(i3 & 1, ((i3 & 306783379) == 306783378 && ((l46Var.g(fo5Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i4 = -((sw3) l46Var.k(zg2.h)).D0(48.0f);
            fxd fxdVarZ = vpf.Z(t39.c, l46Var);
            fxd fxdVarZ2 = vpf.Z(t39.d, l46Var);
            t39 t39Var = t39.a;
            fxd fxdVarZ3 = vpf.Z(t39Var, l46Var);
            fxd fxdVarZ4 = vpf.Z(t39Var, l46Var);
            ka4 ka4Var = new ka4(i);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new i73(11);
                l46Var.p0(objR);
            }
            j09 j09VarB = vwc.b(g09.a, false, (a26) objR);
            boolean zI = l46Var.i(fxdVarZ3) | l46Var.i(fxdVarZ) | l46Var.i(fxdVarZ2) | l46Var.e(i4) | l46Var.i(fxdVarZ4);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                objR2 = new b92(i4, 1, fxdVarZ3, fxdVarZ, fxdVarZ2, fxdVarZ4);
                l46Var.p0(objR2);
            }
            kn2.c(ka4Var, j09VarB, (a26) objR2, null, "DatePickerDisplayModeAnimation", null, af1.b0(1838500091, new qf3(l, j, a26Var, a26Var2, j91Var, z67Var, ne3Var, eucVar, ke3Var, fo5Var), l46Var), l46Var, ((i3 >> 6) & 14) | 1597440, 40);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(l, j, i, a26Var, a26Var2, j91Var, z67Var, ne3Var, eucVar, ke3Var, fo5Var, i2) { // from class: ze3
                public final /* synthetic */ Long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ int c;
                public final /* synthetic */ a26 d;
                public final /* synthetic */ a26 e;
                public final /* synthetic */ j91 f;
                public final /* synthetic */ z67 g;
                public final /* synthetic */ ne3 v;
                public final /* synthetic */ euc w;
                public final /* synthetic */ ke3 x;
                public final /* synthetic */ fo5 y;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    vf3.k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void l(ke3 ke3Var, j91 j91Var, l46 l46Var, int i) {
        ke3 ke3Var2 = ke3Var;
        l46 l46Var2 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var2.h0(-1849465391);
        int i2 = (i & 6) == 0 ? i | (l46Var2.g(ke3Var2) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= l46Var2.i(j91Var) ? 32 : 16;
        }
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            int i3 = ((l91) j91Var).c;
            ArrayList arrayList = ((l91) j91Var).d;
            ArrayList arrayList2 = new ArrayList();
            int i4 = i3 - 1;
            int size = arrayList.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList2.add(arrayList.get(i5));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList2.add(arrayList.get(i6));
            }
            mue mueVarA = r9f.a(i7h.A, l46Var2);
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(b.b(0.0f, 48.0f, g09Var, 1), 1.0f);
            t7c t7cVarA = s7c.a(xc0.f, ndb.z, l46Var2, 54);
            int iW = an1.w(l46Var2);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var4, l46Var2, t7cVarA);
            dec.l(he2Var3, l46Var2, u8aVarM);
            if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var2, iW, he2Var2);
            }
            dec.l(he2Var, l46Var2, j09VarJ);
            l46Var2.f0(24563235);
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                iy9 iy9Var = (iy9) arrayList2.get(i7);
                boolean zG = l46Var2.g(iy9Var);
                Object objR = l46Var2.R();
                int i8 = 12;
                if (zG || objR == sf2.a) {
                    objR = new ot1(i8, iy9Var);
                    l46Var2.p0(objR);
                }
                int i9 = size2;
                ArrayList arrayList3 = arrayList2;
                j09 j09VarO = b.o(vwc.a(g09Var, (a26) objR), i7h.j, i7h.h, 0.0f, 12);
                pr4 pr4Var = p77.c;
                j09 j09VarM = b.m(j09VarO, ((yi4) l46Var2.k(pr4Var)).a, ((yi4) l46Var2.k(pr4Var)).a);
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iW2 = an1.w(l46Var2);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarM);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, xn8VarC);
                dec.l(he2Var3, l46Var2, u8aVarM2);
                if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW2))) {
                    tec.r(iW2, l46Var2, iW2, he2Var2);
                }
                dec.l(he2Var, l46Var2, j09VarJ2);
                nte.b((String) iy9Var.e(), b.s(g09Var, null, 3), ke3Var2.d, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarA, l46Var, 48, 0, 130040);
                l46Var2 = l46Var;
                l46Var2.r(true);
                i7++;
                ke3Var2 = ke3Var;
                he2Var = he2Var;
                he2Var2 = he2Var2;
                g09Var = g09Var;
                he2Var3 = he2Var3;
                ov7Var = ov7Var;
                size2 = i9;
                arrayList2 = arrayList3;
                he2Var4 = he2Var4;
            }
            l46Var2.r(false);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(ke3Var, j91Var, i, 15);
        }
    }

    public static final void m(String str, j09 j09Var, boolean z, boolean z2, x16 x16Var, String str2, ke3 ke3Var, l46 l46Var, int i) {
        Object objB;
        l46Var.h0(-1153850597);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(true) ? 131072 : 65536) | (l46Var.g(str2) ? 1048576 : 524288) | (l46Var.g(ke3Var) ? 8388608 : 4194304);
        if (l46Var.W(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z3 || objR == i8cVar) {
                if (!z2 || z) {
                    objB = null;
                } else {
                    objB = x57.b(ke3Var.u, i7h.o);
                }
                l46Var.p0(objB);
            } else {
                objB = objR;
            }
            q11 q11Var = (q11) objB;
            boolean z4 = (3670016 & i2) == 1048576;
            Object objR2 = l46Var.R();
            if (z4 || objR2 == i8cVar) {
                objR2 = new ia(str2, 8);
                l46Var.p0(objR2);
            }
            j09 j09VarB = vwc.b(j09Var, true, (a26) objR2);
            int i3 = i2 >> 6;
            nae.b(z, x16Var, j09VarB, true, u5d.b(i7h.G, l46Var), ((y72) qkd.a(z ? ke3Var.l : y72.j, vpf.Z(t39.c, l46Var), null, l46Var, 0, 12).getValue()).a, 0.0f, q11Var, null, af1.b0(-564400443, new pf3(str, ke3Var, z2, z), l46Var), l46Var, (i3 & 14) | ((i2 >> 9) & 112) | (i3 & 7168), 1472);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new we3(str, j09Var, z, z2, x16Var, str2, ke3Var, i);
        }
    }

    public static final void n(j09 j09Var, long j, a26 a26Var, euc eucVar, j91 j91Var, z67 z67Var, ke3 ke3Var, l46 l46Var, int i) {
        l46Var.h0(-1286899812);
        int i2 = i | (l46Var.f(j) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(eucVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(j91Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(z67Var) ? 131072 : 65536) | (l46Var.g(ke3Var) ? 1048576 : 524288);
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            nte.a(r9f.a(i7h.D, l46Var), af1.b0(1301915789, new tf3(j91Var, j, z67Var, j09Var, ke3Var, a26Var, eucVar), l46Var), l46Var, 48);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new se3(j09Var, j, a26Var, eucVar, j91Var, z67Var, ke3Var, i);
        }
    }

    public static final void o(x16 x16Var, boolean z, j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        j09 j09Var2;
        l46Var.h0(-709923073);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            y6c y6cVar = a7c.a;
            bx9 bx9Var = v51.a;
            g09 g09Var = g09.a;
            cgg.m(x16Var, g09Var, false, y6cVar, v51.h(((y72) l46Var.k(em2.a)).a, l46Var), null, af1.b0(1899489890, new uf3(dd2Var, z), l46Var), l46Var, (i3 & 14) | 807075840 | ((i3 >> 3) & 112), 388);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(x16Var, z, j09Var2, dd2Var, i);
        }
    }

    public static final xf3 p(Long l, euc eucVar, l46 l46Var, int i) {
        if ((i & 1) != 0) {
            l = null;
        }
        Object obj = l;
        z67 z67Var = me3.a;
        if ((i & 16) != 0) {
            eucVar = me3.b;
        }
        Object obj2 = eucVar;
        l46Var.f0(2088426481);
        Locale locale = ((Configuration) l46Var.k(uq.a)).getLocales().get(0);
        l46Var.r(false);
        Object[] objArr = new Object[0];
        vea veaVarB = i7h.B(new qv2(9), new ks2(11, obj2, locale));
        boolean zG = l46Var.g(obj) | l46Var.g(obj) | l46Var.i(z67Var) | l46Var.e(0) | l46Var.g(obj2) | l46Var.i(locale);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            m8 m8Var = new m8(obj, obj, z67Var, obj2, locale, 6);
            l46Var.p0(m8Var);
            objR = m8Var;
        }
        xf3 xf3Var = (xf3) vfh.J(objArr, veaVarB, (x16) objR, l46Var, 0);
        xf3Var.d.setValue(obj2);
        return xf3Var;
    }
}
