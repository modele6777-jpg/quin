package defpackage;

import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zr5 {
    public static final long a = w6c.l(8);
    public static final long b = w6c.l(4);
    public static final long c = w6c.l(4);
    public static final hl4 d = new hl4(26);
    public static final hl4 e = new hl4(27);
    public static final pr4 f = new pr4(0, new mz4(21));

    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void a(final c4c c4cVar, final j88 j88Var, List list, int i, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        ojb ojbVarV;
        final int i7;
        int i8;
        l46Var.h0(991783985);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(c4cVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.e(j88Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.i(list) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                i5 = i;
                i4 |= l46Var.e(i5) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i2 & 24576) == 0) {
                if (l46Var.i(dd2Var)) {
                    i8 = 16384;
                } else {
                    i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i8;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i9 != 0) {
                    i7 = 0;
                } else {
                    i7 = i5;
                }
                final h88 h88Var = q4c.c(q4c.b(c4cVar, l46Var)).c;
                h88Var.getClass();
                sw3 sw3Var = (sw3) l46Var.k(zg2.h);
                wue wueVar = h88Var.a;
                wueVar.getClass();
                float F = sw3Var.F(wueVar.a);
                wue wueVar2 = h88Var.b;
                wueVar2.getClass();
                float F2 = sw3Var.F(wueVar2.a);
                wue wueVar3 = h88Var.c;
                wueVar3.getClass();
                float F3 = sw3Var.F(wueVar3.a);
                final int iIntValue = ((Number) l46Var.k(f)).intValue();
                b(list.size(), F3, ynb.r(F, 0.0f, F2, 0.0f, 10), af1.b0(936007618, new n26() { // from class: tr5
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        int iIntValue2 = ((Integer) obj).intValue();
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        if ((iIntValue3 & 6) == 0) {
                            iIntValue3 |= l46Var2.e(iIntValue2) ? 4 : 2;
                        }
                        if (l46Var2.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                            int iOrdinal = j88Var.ordinal();
                            h88 h88Var2 = h88Var;
                            c4c c4cVar2 = c4cVar;
                            int i10 = iIntValue;
                            if (iOrdinal == 0) {
                                l46Var2.f0(1855158734);
                                a26 a26Var = h88Var2.d;
                                a26Var.getClass();
                                es9 es9Var = (es9) a26Var.d(c4cVar2);
                                int i11 = i7 + iIntValue2;
                                es9Var.getClass();
                                l46Var2.f0(1794592430);
                                es9Var.a.t(Integer.valueOf(i10), Integer.valueOf(i11), l46Var2, 0);
                                l46Var2.r(false);
                                l46Var2.r(false);
                            } else {
                                if (iOrdinal != 1) {
                                    throw tec.d(1855156773, l46Var2, false);
                                }
                                l46Var2.f0(1855161818);
                                a26 a26Var2 = h88Var2.e;
                                a26Var2.getClass();
                                lff lffVar = (lff) a26Var2.d(c4cVar2);
                                lffVar.getClass();
                                l46Var2.f0(-1198094772);
                                lffVar.a.m(Integer.valueOf(i10), l46Var2, 0);
                                l46Var2.r(false);
                                l46Var2.r(false);
                            }
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), af1.b0(1128938819, new gj3(c4cVar, h88Var, iIntValue, dd2Var, list), l46Var), l46Var, 27648);
                i6 = i7;
            } else {
                l46Var.Z();
                i6 = i5;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new wr5(c4cVar, j88Var, list, i6, dd2Var, i2, i3);
            }
        }
        i4 |= 3072;
        i5 = i;
        if ((i2 & 24576) == 0) {
            if (l46Var.i(dd2Var)) {
                i8 = 16384;
            } else {
                i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i4 |= i8;
        }
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i4 & 1, z)) {
            if (i9 != 0) {
                i7 = 0;
            } else {
                i7 = i5;
            }
            final h88 h88Var2 = q4c.c(q4c.b(c4cVar, l46Var)).c;
            h88Var2.getClass();
            sw3 sw3Var2 = (sw3) l46Var.k(zg2.h);
            wue wueVar4 = h88Var2.a;
            wueVar4.getClass();
            float F4 = sw3Var2.F(wueVar4.a);
            wue wueVar5 = h88Var2.b;
            wueVar5.getClass();
            float F5 = sw3Var2.F(wueVar5.a);
            wue wueVar6 = h88Var2.c;
            wueVar6.getClass();
            float F6 = sw3Var2.F(wueVar6.a);
            final int iIntValue2 = ((Number) l46Var.k(f)).intValue();
            b(list.size(), F6, ynb.r(F4, 0.0f, F5, 0.0f, 10), af1.b0(936007618, new n26() { // from class: tr5
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    int iIntValue3 = ((Integer) obj).intValue();
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue4 = ((Integer) obj3).intValue();
                    if ((iIntValue4 & 6) == 0) {
                        iIntValue4 |= l46Var2.e(iIntValue3) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                        int iOrdinal = j88Var.ordinal();
                        h88 h88Var3 = h88Var2;
                        c4c c4cVar2 = c4cVar;
                        int i10 = iIntValue2;
                        if (iOrdinal == 0) {
                            l46Var2.f0(1855158734);
                            a26 a26Var = h88Var3.d;
                            a26Var.getClass();
                            es9 es9Var = (es9) a26Var.d(c4cVar2);
                            int i11 = i7 + iIntValue3;
                            es9Var.getClass();
                            l46Var2.f0(1794592430);
                            es9Var.a.t(Integer.valueOf(i10), Integer.valueOf(i11), l46Var2, 0);
                            l46Var2.r(false);
                            l46Var2.r(false);
                        } else {
                            if (iOrdinal != 1) {
                                throw tec.d(1855156773, l46Var2, false);
                            }
                            l46Var2.f0(1855161818);
                            a26 a26Var2 = h88Var3.e;
                            a26Var2.getClass();
                            lff lffVar = (lff) a26Var2.d(c4cVar2);
                            lffVar.getClass();
                            l46Var2.f0(-1198094772);
                            lffVar.a.m(Integer.valueOf(i10), l46Var2, 0);
                            l46Var2.r(false);
                            l46Var2.r(false);
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), af1.b0(1128938819, new gj3(c4cVar, h88Var2, iIntValue2, dd2Var, list), l46Var), l46Var, 27648);
            i6 = i7;
        } else {
            l46Var.Z();
            i6 = i5;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new wr5(c4cVar, j88Var, list, i6, dd2Var, i2, i3);
        }
    }

    public static final void b(int i, float f2, bx9 bx9Var, dd2 dd2Var, dd2 dd2Var2, l46 l46Var, int i2) {
        l46Var.h0(-1888378294);
        int i3 = (l46Var.e(i) ? 4 : 2) | i2 | (l46Var.d(f2) ? 32 : 16) | (l46Var.g(bx9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new yr5(i, f2);
                l46Var.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            fbc.a(af1.b0(-1117232110, new gc(i, bx9Var, dd2Var, 19), l46Var), l46Var, 6);
            l46Var.f0(1702741527);
            for (int i4 = 0; i4 < i; i4++) {
                dd2Var2.m(Integer.valueOf(i4), l46Var, 48);
            }
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vr5(i, f2, bx9Var, dd2Var, dd2Var2, i2);
        }
    }

    public static final void c(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(824663458);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            mh3.a(f.a(0), af1.b0(20615394, new qx1(dd2Var, 4), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i, 5);
        }
    }
}
