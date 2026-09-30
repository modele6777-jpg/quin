package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pu {
    public static final pr4 a = new pr4(0, new q(21));
    public static final pr4 b = new pr4(0, new ead(2));

    /* JADX WARN: Code duplicated, block: B:102:0x0225  */
    /* JADX WARN: Code duplicated, block: B:103:0x022b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0250  */
    /* JADX WARN: Code duplicated, block: B:108:0x025a  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x0156  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x015f  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x019a  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0201  */
    public static final void a(lla llaVar, x16 x16Var, nma nmaVar, dd2 dd2Var, l46 l46Var, int i, int i2) {
        int i3;
        x16 x16Var2;
        nma nmaVar2;
        int i4;
        boolean z;
        x16 x16Var3;
        ojb ojbVarV;
        x16 x16Var4;
        View view;
        sw3 sw3Var;
        String str;
        cv7 cv7Var;
        j46 j46VarL;
        e89 e89VarI;
        Object objR;
        Object obj;
        Object obj2;
        UUID uuid;
        boolean zBooleanValue;
        Object objR2;
        String str2;
        int i5;
        ila ilaVar;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        Object objR3;
        ila ilaVar2;
        int i10;
        int i11;
        boolean z3;
        Object objR4;
        int i12;
        int i13;
        Object obj3;
        boolean zI;
        Object obj4;
        boolean zI2;
        Object obj5;
        boolean zI3;
        Object obj6;
        int i14;
        int i15;
        lla llaVar2 = llaVar;
        l46Var.h0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(llaVar2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 48) == 0) {
                x16Var2 = x16Var;
                i3 |= l46Var.i(x16Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                nmaVar2 = nmaVar;
                if (l46Var.g(nmaVar2)) {
                    i15 = 256;
                } else {
                    i15 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i15;
            } else {
                nmaVar2 = nmaVar;
            }
            if ((i & 3072) == 0) {
                if (l46Var.i(dd2Var)) {
                    i14 = 2048;
                } else {
                    i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i14;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i16 != 0) {
                    x16Var4 = null;
                } else {
                    x16Var4 = x16Var2;
                }
                view = (View) l46Var.k(uq.f);
                sw3Var = (sw3) l46Var.k(zg2.h);
                str = (String) l46Var.k(a);
                cv7Var = (cv7) l46Var.k(zg2.n);
                j46VarL = an1.L(l46Var);
                e89VarI = q1c.i(dd2Var, l46Var);
                Object[] objArr = new Object[0];
                objR = l46Var.R();
                obj = sf2.a;
                obj2 = objR;
                if (objR == obj) {
                    Object qVar = new q(20);
                    l46Var.p0(qVar);
                    obj2 = qVar;
                }
                uuid = (UUID) vfh.I(objArr, (x16) obj2, l46Var, 48);
                zBooleanValue = ((Boolean) l46Var.k(b)).booleanValue();
                objR2 = l46Var.R();
                if (objR2 == obj) {
                    str2 = str;
                    i5 = 0;
                    ila ilaVar3 = new ila(x16Var4, nmaVar2, str2, view, sw3Var, llaVar2, uuid, zBooleanValue);
                    llaVar2 = llaVar2;
                    ilaVar3.n(j46VarL, new dd2(new ku(ilaVar3, e89VarI, i5), true, -297523940));
                    l46Var.p0(ilaVar3);
                    objR2 = ilaVar3;
                } else {
                    str2 = str;
                    i5 = 0;
                }
                ilaVar = (ila) objR2;
                boolean zI4 = l46Var.i(ilaVar);
                i6 = i4 & 112;
                if (i6 == 32) {
                    i7 = 1;
                } else {
                    i7 = i5;
                }
                int i17 = (zI4 ? 1 : 0) | i7;
                i8 = i4 & 896;
                if (i8 == 256) {
                    i9 = 1;
                } else {
                    i9 = i5;
                }
                z2 = (((i17 | i9) | (l46Var.g(str2) ? 1 : 0)) == true ? 1 : 0) | (l46Var.e(cv7Var.ordinal()) ? 1 : 0);
                objR3 = l46Var.R();
                if (z2 == 0 || objR3 == obj) {
                    ilaVar2 = ilaVar;
                    Object kfVar = new kf(ilaVar2, x16Var4, nmaVar, str2, cv7Var);
                    l46Var.p0(kfVar);
                    objR3 = kfVar;
                } else {
                    ilaVar2 = ilaVar;
                }
                af1.g(ilaVar2, (a26) objR3, l46Var);
                boolean zI5 = l46Var.i(ilaVar2);
                if (i6 == 32) {
                    i10 = 1;
                } else {
                    i10 = i5;
                }
                int i18 = (zI5 ? 1 : 0) | i10;
                if (i8 == 256) {
                    i11 = 1;
                } else {
                    i11 = i5;
                }
                z3 = (((i18 | i11) | (l46Var.g(str2) ? 1 : 0)) == true ? 1 : 0) | (l46Var.e(cv7Var.ordinal()) ? 1 : 0);
                objR4 = l46Var.R();
                if (z3 == 0 || objR4 == obj) {
                    Object m8Var = new m8(ilaVar2, x16Var4, nmaVar, str2, cv7Var, 1);
                    l46Var.p0(m8Var);
                    objR4 = m8Var;
                }
                af1.u((x16) objR4, l46Var);
                boolean zI6 = l46Var.i(ilaVar2);
                if ((i4 & 14) == 4) {
                    i12 = 1;
                } else {
                    i12 = i5;
                }
                i13 = (zI6 ? 1 : 0) | i12;
                Object objR5 = l46Var.R();
                obj3 = objR5;
                if (i13 == 0 || objR5 == obj) {
                    Object l0Var = new l0(8, ilaVar2, llaVar2);
                    l46Var.p0(l0Var);
                    obj3 = l0Var;
                }
                af1.g(llaVar2, (a26) obj3, l46Var);
                zI = l46Var.i(ilaVar2);
                Object objR6 = l46Var.R();
                obj4 = objR6;
                if (zI || objR6 == obj) {
                    Object muVar = new mu(ilaVar2, null);
                    l46Var.p0(muVar);
                    obj4 = muVar;
                }
                af1.o((l26) obj4, l46Var, ilaVar2);
                zI2 = l46Var.i(ilaVar2);
                Object objR7 = l46Var.R();
                obj5 = objR7;
                if (zI2 || objR7 == obj) {
                    Object luVar = new lu(ilaVar2, i5);
                    l46Var.p0(luVar);
                    obj5 = luVar;
                }
                j09 j09VarW = nk8.w(g09.a, (a26) obj5);
                zI3 = l46Var.i(ilaVar2) | l46Var.e(cv7Var.ordinal());
                Object objR8 = l46Var.R();
                obj6 = objR8;
                if (zI3 || objR8 == obj) {
                    Object nuVar = new nu(i5, ilaVar2, cv7Var);
                    l46Var.p0(nuVar);
                    obj6 = nuVar;
                }
                xn8 xn8Var = (xn8) obj6;
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarW);
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
                l46Var.r(true);
                x16Var3 = x16Var4;
            } else {
                l46Var.Z();
                x16Var3 = x16Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new vi(llaVar2, x16Var3, nmaVar, dd2Var, i, i2, 1, false);
            }
        }
        i3 |= 48;
        x16Var2 = x16Var;
        if ((i & 384) == 0) {
            nmaVar2 = nmaVar;
            if (l46Var.g(nmaVar2)) {
                i15 = 256;
            } else {
                i15 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i3 |= i15;
        } else {
            nmaVar2 = nmaVar;
        }
        if ((i & 3072) == 0) {
            if (l46Var.i(dd2Var)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i14;
        }
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i4 & 1, z)) {
            if (i16 != 0) {
                x16Var4 = null;
            } else {
                x16Var4 = x16Var2;
            }
            view = (View) l46Var.k(uq.f);
            sw3Var = (sw3) l46Var.k(zg2.h);
            str = (String) l46Var.k(a);
            cv7Var = (cv7) l46Var.k(zg2.n);
            j46VarL = an1.L(l46Var);
            e89VarI = q1c.i(dd2Var, l46Var);
            Object[] objArr2 = new Object[0];
            objR = l46Var.R();
            obj = sf2.a;
            obj2 = objR;
            if (objR == obj) {
                Object qVar2 = new q(20);
                l46Var.p0(qVar2);
                obj2 = qVar2;
            }
            uuid = (UUID) vfh.I(objArr2, (x16) obj2, l46Var, 48);
            zBooleanValue = ((Boolean) l46Var.k(b)).booleanValue();
            objR2 = l46Var.R();
            if (objR2 == obj) {
                str2 = str;
                i5 = 0;
                ila ilaVar4 = new ila(x16Var4, nmaVar2, str2, view, sw3Var, llaVar2, uuid, zBooleanValue);
                llaVar2 = llaVar2;
                ilaVar4.n(j46VarL, new dd2(new ku(ilaVar4, e89VarI, i5), true, -297523940));
                l46Var.p0(ilaVar4);
                objR2 = ilaVar4;
            } else {
                str2 = str;
                i5 = 0;
            }
            ilaVar = (ila) objR2;
            boolean zI7 = l46Var.i(ilaVar);
            i6 = i4 & 112;
            if (i6 == 32) {
                i7 = 1;
            } else {
                i7 = i5;
            }
            int i19 = (zI7 ? 1 : 0) | i7;
            i8 = i4 & 896;
            if (i8 == 256) {
                i9 = 1;
            } else {
                i9 = i5;
            }
            z2 = (((i19 | i9) | (l46Var.g(str2) ? 1 : 0)) == true ? 1 : 0) | (l46Var.e(cv7Var.ordinal()) ? 1 : 0);
            objR3 = l46Var.R();
            if (z2 == 0) {
                ilaVar2 = ilaVar;
                Object kfVar2 = new kf(ilaVar2, x16Var4, nmaVar, str2, cv7Var);
                l46Var.p0(kfVar2);
                objR3 = kfVar2;
            } else {
                ilaVar2 = ilaVar;
                Object kfVar3 = new kf(ilaVar2, x16Var4, nmaVar, str2, cv7Var);
                l46Var.p0(kfVar3);
                objR3 = kfVar3;
            }
            af1.g(ilaVar2, (a26) objR3, l46Var);
            boolean zI8 = l46Var.i(ilaVar2);
            if (i6 == 32) {
                i10 = 1;
            } else {
                i10 = i5;
            }
            int i110 = (zI8 ? 1 : 0) | i10;
            if (i8 == 256) {
                i11 = 1;
            } else {
                i11 = i5;
            }
            z3 = (((i110 | i11) | (l46Var.g(str2) ? 1 : 0)) == true ? 1 : 0) | (l46Var.e(cv7Var.ordinal()) ? 1 : 0);
            objR4 = l46Var.R();
            if (z3 == 0) {
                Object m8Var2 = new m8(ilaVar2, x16Var4, nmaVar, str2, cv7Var, 1);
                l46Var.p0(m8Var2);
                objR4 = m8Var2;
            } else {
                Object m8Var3 = new m8(ilaVar2, x16Var4, nmaVar, str2, cv7Var, 1);
                l46Var.p0(m8Var3);
                objR4 = m8Var3;
            }
            af1.u((x16) objR4, l46Var);
            boolean zI9 = l46Var.i(ilaVar2);
            if ((i4 & 14) == 4) {
                i12 = 1;
            } else {
                i12 = i5;
            }
            i13 = (zI9 ? 1 : 0) | i12;
            Object objR9 = l46Var.R();
            obj3 = objR9;
            if (i13 == 0) {
                Object l0Var2 = new l0(8, ilaVar2, llaVar2);
                l46Var.p0(l0Var2);
                obj3 = l0Var2;
            } else {
                Object l0Var3 = new l0(8, ilaVar2, llaVar2);
                l46Var.p0(l0Var3);
                obj3 = l0Var3;
            }
            af1.g(llaVar2, (a26) obj3, l46Var);
            zI = l46Var.i(ilaVar2);
            Object objR10 = l46Var.R();
            obj4 = objR10;
            if (zI) {
                Object muVar2 = new mu(ilaVar2, null);
                l46Var.p0(muVar2);
                obj4 = muVar2;
            } else {
                Object muVar3 = new mu(ilaVar2, null);
                l46Var.p0(muVar3);
                obj4 = muVar3;
            }
            af1.o((l26) obj4, l46Var, ilaVar2);
            zI2 = l46Var.i(ilaVar2);
            Object objR11 = l46Var.R();
            obj5 = objR11;
            if (zI2) {
                Object luVar2 = new lu(ilaVar2, i5);
                l46Var.p0(luVar2);
                obj5 = luVar2;
            } else {
                Object luVar3 = new lu(ilaVar2, i5);
                l46Var.p0(luVar3);
                obj5 = luVar3;
            }
            j09 j09VarW2 = nk8.w(g09.a, (a26) obj5);
            zI3 = l46Var.i(ilaVar2) | l46Var.e(cv7Var.ordinal());
            Object objR12 = l46Var.R();
            obj6 = objR12;
            if (zI3) {
                Object nuVar2 = new nu(i5, ilaVar2, cv7Var);
                l46Var.p0(nuVar2);
                obj6 = nuVar2;
            } else {
                Object nuVar3 = new nu(i5, ilaVar2, cv7Var);
                l46Var.p0(nuVar3);
                obj6 = nuVar3;
            }
            xn8 xn8Var2 = (xn8) obj6;
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarW2);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var2);
            dec.l(hj6.y, l46Var, u8aVarM2);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ2);
            l46Var.r(true);
            x16Var3 = x16Var4;
        } else {
            l46Var.Z();
            x16Var3 = x16Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vi(llaVar2, x16Var3, nmaVar, dd2Var, i, i2, 1, false);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) ? false : true;
    }
}
