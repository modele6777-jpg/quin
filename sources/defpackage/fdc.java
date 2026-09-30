package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fdc {
    public static final float a = 64.0f;

    /* JADX WARN: Code duplicated, block: B:35:0x0064 A[LOOP:0: B:4:0x000d->B:35:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0067 A[EDGE_INSN: B:43:0x0067->B:36:0x0067 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0064], SYNTHETIC] */
    public static final ywc a(LayoutNode layoutNode, boolean z) {
        i09 i09Var = (i09) layoutNode.V0.g;
        Object obj = null;
        if ((i09Var.d & 8) != 0) {
            loop0: while (i09Var != null) {
                if ((i09Var.c & 8) == 0) {
                    if ((i09Var.d & 8) != 0) {
                        break;
                        break;
                    }
                    i09Var = i09Var.f;
                } else {
                    i09 i09VarM0 = i09Var;
                    p89 p89Var = null;
                    while (i09VarM0 != null) {
                        if (i09VarM0 instanceof wwc) {
                            obj = i09VarM0;
                            break loop0;
                        }
                        if ((i09VarM0.c & 8) != 0 && (i09VarM0 instanceof sv3)) {
                            int i = 0;
                            for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                if ((i09Var2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        i09VarM0 = i09Var2;
                                    } else {
                                        if (p89Var == null) {
                                            p89Var = new p89(0, new i09[16]);
                                        }
                                        if (i09VarM0 != null) {
                                            p89Var.b(i09VarM0);
                                            i09VarM0 = null;
                                        }
                                        p89Var.b(i09Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        i09VarM0 = vd0.m0(p89Var);
                    }
                    if ((i09Var.d & 8) != 0) {
                        break;
                    }
                    i09Var = i09Var.f;
                }
            }
        }
        obj.getClass();
        i09 i09Var3 = ((i09) ((wwc) obj)).a;
        twc twcVarH = layoutNode.H();
        if (twcVarH == null) {
            twcVarH = new twc();
        }
        return new ywc(i09Var3, z, layoutNode, twcVarH);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0137  */
    /* JADX WARN: Code duplicated, block: B:90:0x0145  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void b(final TarotCardType tarotCardType, final TarotSkinIdentify tarotSkinIdentify, final float f, j09 j09Var, float f2, dr1 dr1Var, yi4 yi4Var, boolean z, n26 n26Var, l46 l46Var, int i, int i2) {
        float f3;
        int i3;
        dr1 dr1Var2;
        int i4;
        yi4 yi4Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        n26 n26Var2;
        float f4;
        yi4 yi4Var3;
        boolean z4;
        ojb ojbVarV;
        final float f5;
        final dr1 dr1Var3;
        int i8;
        final yi4 yi4Var4;
        final n26 n26Var3;
        tarotCardType.getClass();
        tarotSkinIdentify.getClass();
        l46Var.h0(-1618783400);
        int i9 = (l46Var.e(tarotCardType.ordinal()) ? 4 : 2) | i | (l46Var.e(tarotSkinIdentify.ordinal()) ? 32 : 16) | (l46Var.d(f) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if ((i & 3072) == 0) {
            i9 |= l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 = i9 | 24576;
            f3 = f2;
        } else {
            f3 = f2;
            i3 = i9 | (l46Var.d(f3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i4 = i3 | 196608;
            dr1Var2 = dr1Var;
        } else {
            dr1Var2 = dr1Var;
            i4 = i3 | (l46Var.g(dr1Var2) ? 131072 : 65536);
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i5 = i4 | 1572864;
            yi4Var2 = yi4Var;
        } else {
            yi4Var2 = yi4Var;
            i5 = i4 | (l46Var.g(yi4Var2) ? 1048576 : 524288);
        }
        int i13 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i13 != 0) {
            i6 = i5 | 12582912;
            z2 = z;
        } else {
            z2 = z;
            i6 = i5 | (l46Var.h(z2) ? 8388608 : 4194304);
        }
        int i14 = i2 & 256;
        if (i14 == 0) {
            if ((100663296 & i) == 0) {
                i6 |= l46Var.i(n26Var) ? 67108864 : 33554432;
            }
            i7 = i6;
            if ((i7 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i7 & 1, z3)) {
                if (i10 != 0) {
                    f5 = 1.0f;
                } else {
                    f5 = f3;
                }
                if (i11 != 0) {
                    dr1Var3 = null;
                } else {
                    dr1Var3 = dr1Var2;
                }
                if (i12 != 0) {
                    yi4Var4 = null;
                    i8 = i14;
                } else {
                    i8 = i14;
                    yi4Var4 = yi4Var2;
                }
                final boolean z5 = i13 == 0 ? z2 : false;
                if (i8 != 0) {
                    n26Var3 = y41.e;
                } else {
                    n26Var3 = n26Var;
                }
                nk8.d(j09Var, null, af1.b0(-403128510, new n26() { // from class: yjd
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        d31 d31Var;
                        y6c y6cVar;
                        FillElement fillElement;
                        e31 e31Var = (e31) obj;
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        e31Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                        }
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                            yi4 yi4Var5 = yi4Var4;
                            float fD = yi4Var5 != null ? yi4Var5.a : e31Var.d() * 0.055555556f;
                            boolean zD = l46Var2.d(fD);
                            Object objR = l46Var2.R();
                            i8c i8cVar = sf2.a;
                            if (zD || objR == i8cVar) {
                                objR = a7c.b(fD);
                                l46Var2.p0(objR);
                            }
                            y6c y6cVar2 = (y6c) objR;
                            float f6 = f % 360.0f;
                            if (f6 != 0.0f && Math.signum(f6) != Math.signum(360.0f)) {
                                f6 += 360.0f;
                            }
                            boolean z6 = f6 > 90.0f && f6 < 270.0f;
                            FillElement fillElement2 = b.c;
                            j09 j09VarQ = rrb.q(fillElement2, am3.d * f5, y6cVar2, 0L, 0L, 28);
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarQ);
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
                            TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                            boolean z7 = z5;
                            d31 d31Var2 = d31.a;
                            if (z6) {
                                l46Var2.f0(2141437662);
                                fy9 fy9VarA = od4.A(hfc.q(tarotSkinIdentify2).c(), 0, l46Var2);
                                Object objR2 = l46Var2.R();
                                if (objR2 == i8cVar) {
                                    objR2 = new e2d(24);
                                    l46Var2.p0(objR2);
                                }
                                d31Var = d31Var2;
                                feg.j(fy9VarA, null, oa7.E(bzd.x(fillElement2, (a26) objR2), y6cVar2), null, z7 ? an2.g : an2.a, 0.0f, null, l46Var2, 56, 104);
                                l46Var2.r(false);
                                y6cVar = y6cVar2;
                                fillElement = fillElement2;
                            } else {
                                d31Var = d31Var2;
                                l46Var2.f0(2141827301);
                                y6cVar = y6cVar2;
                                fillElement = fillElement2;
                                o7c.d(fillElement, new qhe(tarotCardType.getCardKey(), 1), tarotSkinIdentify2, false, null, fD, null, z7, l46Var2, 6, 88);
                                dr1 dr1Var4 = dr1Var3;
                                if (dr1Var4 == null || dr1Var4.b <= 0.0f) {
                                    l46Var2 = l46Var2;
                                    l46Var2 = l46Var2;
                                    l46Var2.f0(2142988902);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(2142296021);
                                    j09 j09VarE = oa7.E(d31Var.b(g09.a), y6cVar);
                                    boolean zG = l46Var2.g(dr1Var4);
                                    Object objR3 = l46Var2.R();
                                    if (zG || objR3 == i8cVar) {
                                        l46Var2 = l46Var2;
                                        objR3 = new ckb(25, dr1Var4);
                                        l46Var2.p0(objR3);
                                    }
                                    s21.a(b21.s(j09VarE, (a26) objR3), l46Var2, 0);
                                    l46Var2.r(false);
                                }
                                l46Var2.r(false);
                            }
                            n26Var3.m(d31Var, l46Var2, 6);
                            s21.a(db6.w(fillElement, am3.e, am3.f, y6cVar), l46Var2, 0);
                            l46Var2.r(true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, ((i7 >> 9) & 14) | 3072, 6);
                yi4Var3 = yi4Var4;
                f4 = f5;
                z4 = z5;
                dr1Var2 = dr1Var3;
                n26Var2 = n26Var3;
            } else {
                l46Var.Z();
                n26Var2 = n26Var;
                f4 = f3;
                yi4Var3 = yi4Var2;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zjd(tarotCardType, tarotSkinIdentify, f, j09Var, f4, dr1Var2, yi4Var3, z4, n26Var2, i, i2);
            }
        }
        i6 |= 100663296;
        i7 = i6;
        if ((i7 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i7 & 1, z3)) {
            if (i10 != 0) {
                f5 = 1.0f;
            } else {
                f5 = f3;
            }
            if (i11 != 0) {
                dr1Var3 = null;
            } else {
                dr1Var3 = dr1Var2;
            }
            if (i12 != 0) {
                yi4Var4 = null;
                i8 = i14;
            } else {
                i8 = i14;
                yi4Var4 = yi4Var2;
            }
            if (i13 == 0) {
            }
            if (i8 != 0) {
                n26Var3 = y41.e;
            } else {
                n26Var3 = n26Var;
            }
            nk8.d(j09Var, null, af1.b0(-403128510, new n26() { // from class: yjd
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    d31 d31Var;
                    y6c y6cVar;
                    FillElement fillElement;
                    e31 e31Var = (e31) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        yi4 yi4Var5 = yi4Var4;
                        float fD = yi4Var5 != null ? yi4Var5.a : e31Var.d() * 0.055555556f;
                        boolean zD = l46Var2.d(fD);
                        Object objR = l46Var2.R();
                        i8c i8cVar = sf2.a;
                        if (zD || objR == i8cVar) {
                            objR = a7c.b(fD);
                            l46Var2.p0(objR);
                        }
                        y6c y6cVar2 = (y6c) objR;
                        float f6 = f % 360.0f;
                        if (f6 != 0.0f && Math.signum(f6) != Math.signum(360.0f)) {
                            f6 += 360.0f;
                        }
                        boolean z6 = f6 > 90.0f && f6 < 270.0f;
                        FillElement fillElement2 = b.c;
                        j09 j09VarQ = rrb.q(fillElement2, am3.d * f5, y6cVar2, 0L, 0L, 28);
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarQ);
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
                        TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                        boolean z7 = z5;
                        d31 d31Var2 = d31.a;
                        if (z6) {
                            l46Var2.f0(2141437662);
                            fy9 fy9VarA = od4.A(hfc.q(tarotSkinIdentify2).c(), 0, l46Var2);
                            Object objR2 = l46Var2.R();
                            if (objR2 == i8cVar) {
                                objR2 = new e2d(24);
                                l46Var2.p0(objR2);
                            }
                            d31Var = d31Var2;
                            feg.j(fy9VarA, null, oa7.E(bzd.x(fillElement2, (a26) objR2), y6cVar2), null, z7 ? an2.g : an2.a, 0.0f, null, l46Var2, 56, 104);
                            l46Var2.r(false);
                            y6cVar = y6cVar2;
                            fillElement = fillElement2;
                        } else {
                            d31Var = d31Var2;
                            l46Var2.f0(2141827301);
                            y6cVar = y6cVar2;
                            fillElement = fillElement2;
                            o7c.d(fillElement, new qhe(tarotCardType.getCardKey(), 1), tarotSkinIdentify2, false, null, fD, null, z7, l46Var2, 6, 88);
                            dr1 dr1Var4 = dr1Var3;
                            if (dr1Var4 == null || dr1Var4.b <= 0.0f) {
                                l46Var2 = l46Var2;
                                l46Var2 = l46Var2;
                                l46Var2.f0(2142988902);
                                l46Var2.r(false);
                            } else {
                                l46Var2.f0(2142296021);
                                j09 j09VarE = oa7.E(d31Var.b(g09.a), y6cVar);
                                boolean zG = l46Var2.g(dr1Var4);
                                Object objR3 = l46Var2.R();
                                if (zG || objR3 == i8cVar) {
                                    l46Var2 = l46Var2;
                                    objR3 = new ckb(25, dr1Var4);
                                    l46Var2.p0(objR3);
                                }
                                s21.a(b21.s(j09VarE, (a26) objR3), l46Var2, 0);
                                l46Var2.r(false);
                            }
                            l46Var2.r(false);
                        }
                        n26Var3.m(d31Var, l46Var2, 6);
                        s21.a(db6.w(fillElement, am3.e, am3.f, y6cVar), l46Var2, 0);
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i7 >> 9) & 14) | 3072, 6);
            yi4Var3 = yi4Var4;
            f4 = f5;
            z4 = z5;
            dr1Var2 = dr1Var3;
            n26Var2 = n26Var3;
        } else {
            l46Var.Z();
            n26Var2 = n26Var;
            f4 = f3;
            yi4Var3 = yi4Var2;
            z4 = z2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zjd(tarotCardType, tarotSkinIdentify, f, j09Var, f4, dr1Var2, yi4Var3, z4, n26Var2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    public static final void c(p7d p7dVar, boolean z, int i, Integer num, a26 a26Var, j09 j09Var, l46 l46Var, int i2) {
        j09 j09Var2;
        ?? r11;
        a26Var.getClass();
        l46Var.h0(1585123900);
        int i3 = i2 | (l46Var.g(p7dVar) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.e(i) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(num) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | 196608;
        if (l46Var.W(i3 & 1, (74899 & i3) != 74898)) {
            aue aueVarA = uyb.A(6, 0, l46Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = kv2.f(0, l46Var);
            }
            s69 s69Var = (s69) objR;
            sz9 sz9Var = (sz9) s69Var;
            int i4 = i3 & 14;
            int i5 = i3 & 896;
            boolean zG = (i4 == 4) | l46Var.g(num) | (i5 == 256) | l46Var.e(sz9Var.j());
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new s7d();
                l46Var.p0(objR2);
            }
            final s7d s7dVar = (s7d) objR2;
            a26 a26Var2 = (a26) l46Var.k(sad.d);
            RuntimeException runtimeExceptionA = s7dVar.a();
            boolean zI = l46Var.i(s7dVar) | l46Var.g(a26Var2);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new j2e(s7dVar, a26Var2, s69Var, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, runtimeExceptionA);
            xn8 xn8VarC = s21.c(ndb.c, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
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
            l46Var.d0(1839689222, Integer.valueOf(sz9Var.j()));
            boolean zI2 = l46Var.i(s7dVar);
            Object objR4 = l46Var.R();
            if (zI2 || objR4 == obj) {
                final int i6 = 0;
                objR4 = new a26() { // from class: g2e
                    @Override // defpackage.a26
                    public final Object d(Object obj2) {
                        int i7 = i6;
                        wef wefVar = wef.a;
                        s7d s7dVar2 = s7dVar;
                        switch (i7) {
                            case 0:
                                vz9 vz9Var = s7dVar2.b;
                                im2 im2Var = (im2) obj2;
                                im2Var.getClass();
                                try {
                                    ((vv7) im2Var).a();
                                    break;
                                } catch (IllegalArgumentException e) {
                                    vz9Var.setValue(e);
                                } catch (IllegalStateException e2) {
                                    if (e2 instanceof CancellationException) {
                                        throw e2;
                                    }
                                    vz9Var.setValue(e2);
                                }
                                return wefVar;
                            default:
                                im2 im2Var2 = (im2) obj2;
                                im2Var2.getClass();
                                q7d q7dVar = s7dVar2.a;
                                if (q7dVar != null) {
                                    bo8 bo8Var = q7dVar.a;
                                    float f = q7dVar.c;
                                    float f2 = q7dVar.b;
                                    vv7 vv7Var = (vv7) im2Var2;
                                    xl1 xl1Var = vv7Var.a;
                                    ta0 ta0Var = xl1Var.b;
                                    long jZ = ta0Var.z();
                                    ta0Var.p().g();
                                    try {
                                        ((vd9) ta0Var.c).G(f2, f, 0L);
                                        bo8Var.a(im2Var2);
                                        ta0Var.p().o();
                                        ta0Var.R(jZ);
                                        vv7Var.a();
                                        ta0 ta0Var2 = xl1Var.b;
                                        long jZ2 = ta0Var2.z();
                                        ta0Var2.p().g();
                                        try {
                                            ((vd9) ta0Var2.c).G(f2, f, 0L);
                                            bo8Var.c(im2Var2);
                                        } finally {
                                            ks0.t(ta0Var2, jZ2);
                                        }
                                    } catch (Throwable th) {
                                        ks0.t(ta0Var, jZ);
                                        throw th;
                                    }
                                }
                                return wefVar;
                        }
                    }
                };
                l46Var.p0(objR4);
            }
            j09 j09VarU = b21.u(g09Var, (a26) objR4);
            iy9 iy9Var = new iy9(p7dVar, num);
            boolean z2 = z && s7dVar.a() == null;
            boolean zI3 = l46Var.i(s7dVar);
            Object objR5 = l46Var.R();
            if (zI3 || objR5 == obj) {
                objR5 = new h2e(0, s7dVar);
                l46Var.p0(objR5);
            }
            x16 x16Var = (x16) objR5;
            boolean zI4 = l46Var.i(s7dVar) | ((i3 & 57344) == 16384);
            Object objR6 = l46Var.R();
            if (zI4 || objR6 == obj) {
                objR6 = new p4c(14, s7dVar, a26Var);
                l46Var.p0(objR6);
            }
            l26 l26Var = (l26) objR6;
            pr4 pr4Var = d8d.a;
            j09VarU.getClass();
            l26Var.getClass();
            final int i7 = 1;
            j09 j09VarU2 = m93.u(j09VarU, new z7d("stitched-long-share", iy9Var, true, z2, i, true, l26Var, x16Var));
            boolean zI5 = l46Var.i(s7dVar);
            Object objR7 = l46Var.R();
            if (zI5 || objR7 == obj) {
                objR7 = new a26() { // from class: g2e
                    @Override // defpackage.a26
                    public final Object d(Object obj2) {
                        int i8 = i7;
                        wef wefVar = wef.a;
                        s7d s7dVar2 = s7dVar;
                        switch (i8) {
                            case 0:
                                vz9 vz9Var = s7dVar2.b;
                                im2 im2Var = (im2) obj2;
                                im2Var.getClass();
                                try {
                                    ((vv7) im2Var).a();
                                    break;
                                } catch (IllegalArgumentException e) {
                                    vz9Var.setValue(e);
                                } catch (IllegalStateException e2) {
                                    if (e2 instanceof CancellationException) {
                                        throw e2;
                                    }
                                    vz9Var.setValue(e2);
                                }
                                return wefVar;
                            default:
                                im2 im2Var2 = (im2) obj2;
                                im2Var2.getClass();
                                q7d q7dVar = s7dVar2.a;
                                if (q7dVar != null) {
                                    bo8 bo8Var = q7dVar.a;
                                    float f = q7dVar.c;
                                    float f2 = q7dVar.b;
                                    vv7 vv7Var = (vv7) im2Var2;
                                    xl1 xl1Var = vv7Var.a;
                                    ta0 ta0Var = xl1Var.b;
                                    long jZ = ta0Var.z();
                                    ta0Var.p().g();
                                    try {
                                        ((vd9) ta0Var.c).G(f2, f, 0L);
                                        bo8Var.a(im2Var2);
                                        ta0Var.p().o();
                                        ta0Var.R(jZ);
                                        vv7Var.a();
                                        ta0 ta0Var2 = xl1Var.b;
                                        long jZ2 = ta0Var2.z();
                                        ta0Var2.p().g();
                                        try {
                                            ((vd9) ta0Var2.c).G(f2, f, 0L);
                                            bo8Var.c(im2Var2);
                                        } finally {
                                            ks0.t(ta0Var2, jZ2);
                                        }
                                    } catch (Throwable th) {
                                        ks0.t(ta0Var, jZ);
                                        throw th;
                                    }
                                }
                                return wefVar;
                        }
                    }
                };
                l46Var.p0(objR7);
            }
            j09 j09VarU3 = b21.u(j09VarU2, (a26) objR7);
            boolean zI6 = l46Var.i(s7dVar) | l46Var.g(aueVarA) | (i4 == 4) | (i5 == 256);
            Object objR8 = l46Var.R();
            if (zI6 || objR8 == obj) {
                r11 = 0;
                s48 s48Var = new s48(i, s7dVar, aueVarA, p7dVar, 18);
                l46Var.p0(s48Var);
                objR8 = s48Var;
            } else {
                r11 = 0;
            }
            m6e.a(j09VarU3, (l26) objR8, l46Var, r11, r11);
            l46Var.r(r11);
            l46Var.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dk(p7dVar, z, i, num, a26Var, j09Var2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x014b  */
    /* JADX WARN: Code duplicated, block: B:86:0x016d  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void d(final cv6 cv6Var, final float f, final boolean z, final boolean z2, final x4d x4dVar, final x16 x16Var, j09 j09Var, j18 j18Var, l46 l46Var, final int i, final int i2) {
        j18 j18VarA;
        int i3;
        boolean z3;
        final j09 j09Var2;
        final j18 j18Var2;
        ojb ojbVarV;
        int i4;
        j09 j09VarA;
        int i5;
        j09 j09Var3;
        e89 e89VarI;
        e89 e89VarI2;
        int i6;
        boolean z4;
        Object objR;
        s69 s69Var;
        boolean z5;
        Object objR2;
        s69 s69Var2;
        s69 s69Var3;
        j18 j18Var3;
        final s69 s69Var4;
        boolean zG;
        Object objR3;
        cv6Var.getClass();
        x16Var.getClass();
        l46Var.h0(-55477491);
        int i7 = i | (l46Var.g(cv6Var) ? 4 : 2) | (l46Var.d(f) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(x4dVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536) | 1572864;
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            j18VarA = j18Var;
            int i8 = l46Var.g(j18VarA) ? 8388608 : 4194304;
            i3 = i7 | i8;
            if ((4793491 & i3) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                l46Var.b0();
                i4 = i & 1;
                j09VarA = g09.a;
                if (i4 != 0 || l46Var.C()) {
                    if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        j18VarA = k18.a(0, 3, l46Var);
                        i3 &= -29360129;
                    }
                    i5 = i3;
                    j09Var3 = j09VarA;
                } else {
                    l46Var.Z();
                    if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        i3 &= -29360129;
                    }
                    i5 = i3;
                    j09Var3 = j09Var;
                }
                l46Var.s();
                e89VarI = q1c.i(Boolean.valueOf(z), l46Var);
                e89VarI2 = q1c.i(x16Var, l46Var);
                i6 = i5 & 14;
                if (i6 != 4) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                objR = l46Var.R();
                Object obj = sf2.a;
                if (z4 || objR == obj) {
                    objR = kv2.f(0, l46Var);
                }
                s69Var = (s69) objR;
                if (i6 != 4) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                objR2 = l46Var.R();
                if (z5 || objR2 == obj) {
                    objR2 = kv2.f(0, l46Var);
                }
                s69Var2 = (s69) objR2;
                if (z2) {
                    l46Var.f0(833065503);
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    zG = l46Var.g(e89VarI) | l46Var.g(s69Var) | ((((i5 & 29360128) ^ 12582912) <= 8388608 && l46Var.g(j18VarA)) || (i5 & 12582912) == 8388608) | l46Var.g(s69Var2) | l46Var.g(e89VarI2);
                    objR3 = l46Var.R();
                    if (!zG || objR3 == obj) {
                        s69Var3 = s69Var;
                        j18Var3 = j18VarA;
                        objR3 = new n02(j18Var3, e89VarI, s69Var3, s69Var2, e89VarI2);
                        s69Var4 = s69Var2;
                        l46Var.p0(objR3);
                    } else {
                        s69Var3 = s69Var;
                        j18Var3 = j18VarA;
                        s69Var4 = s69Var2;
                    }
                    j09VarA = ibe.a(j09VarA, boolValueOf, (PointerInputEventHandler) objR3);
                    l46Var.r(false);
                } else {
                    s69Var3 = s69Var;
                    j18Var3 = j18VarA;
                    s69Var4 = s69Var2;
                    l46Var.f0(833400675);
                    l46Var.r(false);
                }
                final j09 j09Var4 = j09VarA;
                final j18 j18Var4 = j18Var3;
                final s69 s69Var5 = s69Var3;
                nk8.d(j09Var3.D(b.c), null, af1.b0(-1494510601, new n26() { // from class: wdf
                    @Override // defpackage.n26
                    public final Object m(Object obj2, Object obj3, Object obj4) {
                        boolean z6;
                        int i9;
                        int i10;
                        j18 j18Var5;
                        e31 e31Var = (e31) obj2;
                        l46 l46Var2 = (l46) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        e31Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                        }
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                            sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
                            cv7 cv7Var = (cv7) l46Var2.k(zg2.n);
                            int iD0 = sw3Var.D0(e31Var.d());
                            int iD1 = sw3Var.D0(f);
                            int iD2 = sw3Var.D0(144.0f);
                            int iD3 = sw3Var.D0(12.0f);
                            cv6 cv6Var2 = cv6Var;
                            boolean zG2 = l46Var2.g(cv6Var2) | l46Var2.e(iD0) | l46Var2.e(iD1) | l46Var2.e(iD2) | l46Var2.e(iD3);
                            boolean z7 = z;
                            boolean zH = zG2 | l46Var2.h(z7);
                            Object objR4 = l46Var2.R();
                            i8c i8cVar = sf2.a;
                            if (zH || objR4 == i8cVar) {
                                cv6Var2.getClass();
                                Bitmap bitmap = ((ks) cv6Var2).a;
                                if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                                    qc0.j("Failed requirement.");
                                    return null;
                                }
                                if (iD0 < 0) {
                                    iD0 = 0;
                                }
                                int iU = fdc.u(bitmap.getWidth(), bitmap.getHeight(), iD0);
                                qad qadVarG = fdc.g(iD0, iD0, iU, iD1, iD2, iD3, z7);
                                z6 = z7;
                                int i11 = qadVarG.c;
                                int height = bitmap.getHeight();
                                if (iU > 4096) {
                                    height = mh3.o((int) ((((long) height) * 4095) / ((long) iU)), 1, height);
                                }
                                c78 c78VarF = fdc.f(bitmap.getHeight(), height, i11);
                                int i12 = qadVarG.g;
                                if (i11 > qadVarG.d) {
                                    i9 = i12;
                                    i10 = iD3 < 0 ? 0 : iD3;
                                } else {
                                    i9 = i12;
                                    i10 = i9;
                                }
                                objR4 = new c6d(cv6Var2, qadVarG, height, i9, i10, c78VarF);
                                l46Var2.p0(objR4);
                            } else {
                                z6 = z7;
                            }
                            c6d c6dVar = (c6d) objR4;
                            qad qadVar = c6dVar.b;
                            int i13 = qadVar.b;
                            int i14 = qadVar.c;
                            float f2 = qadVar.a;
                            x4d x4dVar2 = x4dVar;
                            boolean zD = l46Var2.d(f2) | l46Var2.e(i13) | l46Var2.g(x4dVar2) | l46Var2.e(i14) | l46Var2.g(sw3Var) | l46Var2.e(cv7Var.ordinal());
                            Object objR5 = l46Var2.R();
                            if (zD || objR5 == i8cVar) {
                                qad qadVar2 = c6dVar.b;
                                vs9 vs9VarH = fdc.h(x4dVar2, qadVar2.b, qadVar2.c, cv7Var, sw3Var, qadVar2.a);
                                sw3Var = sw3Var;
                                if (vs9VarH instanceof ts9) {
                                    objR5 = null;
                                } else if (vs9VarH instanceof us9) {
                                    zt ztVarA = cu.a();
                                    zt.c(ztVarA, ((us9) vs9VarH).a);
                                    objR5 = ztVarA;
                                } else {
                                    if (!(vs9VarH instanceof ss9)) {
                                        ap.c();
                                        return null;
                                    }
                                    objR5 = ((ss9) vs9VarH).a;
                                }
                                l46Var2.p0(objR5);
                            }
                            zt ztVar = (zt) objR5;
                            Boolean boolValueOf2 = Boolean.valueOf(z6);
                            Integer numValueOf = Integer.valueOf(c6dVar.c);
                            Integer numValueOf2 = Integer.valueOf(c6dVar.f.size());
                            boolean zI = l46Var2.i(c6dVar) | l46Var2.h(z6);
                            j18 j18Var6 = j18Var4;
                            boolean zG3 = zI | l46Var2.g(j18Var6);
                            s69 s69Var6 = s69Var5;
                            boolean zG4 = zG3 | l46Var2.g(s69Var6);
                            s69 s69Var7 = s69Var4;
                            boolean zG5 = zG4 | l46Var2.g(s69Var7);
                            Object objR6 = l46Var2.R();
                            if (zG5 || objR6 == i8cVar) {
                                j18Var5 = j18Var6;
                                objR6 = new ydf(c6dVar, z6, j18Var5, s69Var6, s69Var7, null);
                                l46Var2.p0(objR6);
                            } else {
                                j18Var5 = j18Var6;
                            }
                            af1.q(boolValueOf2, numValueOf, numValueOf2, (l26) objR6, l46Var2);
                            FillElement fillElement = b.c;
                            bx9 bx9VarR = ynb.r(0.0f, sw3Var.Z(c6dVar.d), 0.0f, sw3Var.Z(c6dVar.e), 5);
                            jx0 jx0Var = ndb.Z;
                            boolean zI2 = l46Var2.i(c6dVar) | l46Var2.g(sw3Var);
                            j09 j09Var5 = j09Var4;
                            boolean zG6 = zI2 | l46Var2.g(j09Var5) | l46Var2.i(ztVar);
                            Object objR7 = l46Var2.R();
                            if (zG6 || objR7 == i8cVar) {
                                wca wcaVar = new wca(c6dVar, sw3Var, j09Var5, ztVar, 6);
                                l46Var2.p0(wcaVar);
                                objR7 = wcaVar;
                            }
                            af1.s(fillElement, j18Var5, bx9VarR, null, jx0Var, null, z2, null, (a26) objR7, l46Var2, 196614, 344);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 3072, 6);
                j09Var2 = j09Var3;
                j18Var2 = j18Var3;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                j18Var2 = j18VarA;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26(f, z, z2, x4dVar, x16Var, j09Var2, j18Var2, i, i2) { // from class: xdf
                    public final /* synthetic */ float b;
                    public final /* synthetic */ boolean c;
                    public final /* synthetic */ boolean d;
                    public final /* synthetic */ x4d e;
                    public final /* synthetic */ x16 f;
                    public final /* synthetic */ j09 g;
                    public final /* synthetic */ j18 v;
                    public final /* synthetic */ int w;

                    {
                        this.w = i2;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = k99.P(1);
                        fdc.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj2, iP, this.w);
                        return wef.a;
                    }
                };
            }
        }
        j18VarA = j18Var;
        i3 = i7 | i8;
        if ((4793491 & i3) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i3 & 1, z3)) {
            l46Var.b0();
            i4 = i & 1;
            j09VarA = g09.a;
            if (i4 != 0) {
                if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    j18VarA = k18.a(0, 3, l46Var);
                    i3 &= -29360129;
                }
                i5 = i3;
                j09Var3 = j09VarA;
            } else {
                if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    j18VarA = k18.a(0, 3, l46Var);
                    i3 &= -29360129;
                }
                i5 = i3;
                j09Var3 = j09VarA;
            }
            l46Var.s();
            e89VarI = q1c.i(Boolean.valueOf(z), l46Var);
            e89VarI2 = q1c.i(x16Var, l46Var);
            i6 = i5 & 14;
            if (i6 != 4) {
                z4 = false;
            } else {
                z4 = true;
            }
            objR = l46Var.R();
            Object obj2 = sf2.a;
            if (z4) {
                objR = kv2.f(0, l46Var);
            } else {
                objR = kv2.f(0, l46Var);
            }
            s69Var = (s69) objR;
            if (i6 != 4) {
                z5 = false;
            } else {
                z5 = true;
            }
            objR2 = l46Var.R();
            if (z5) {
                objR2 = kv2.f(0, l46Var);
            } else {
                objR2 = kv2.f(0, l46Var);
            }
            s69Var2 = (s69) objR2;
            if (z2) {
                l46Var.f0(833065503);
                Boolean boolValueOf2 = Boolean.valueOf(z2);
                zG = l46Var.g(e89VarI) | l46Var.g(s69Var) | ((((i5 & 29360128) ^ 12582912) <= 8388608 && l46Var.g(j18VarA)) || (i5 & 12582912) == 8388608) | l46Var.g(s69Var2) | l46Var.g(e89VarI2);
                objR3 = l46Var.R();
                if (zG) {
                    s69Var3 = s69Var;
                    j18Var3 = j18VarA;
                    objR3 = new n02(j18Var3, e89VarI, s69Var3, s69Var2, e89VarI2);
                    s69Var4 = s69Var2;
                    l46Var.p0(objR3);
                } else {
                    s69Var3 = s69Var;
                    j18Var3 = j18VarA;
                    objR3 = new n02(j18Var3, e89VarI, s69Var3, s69Var2, e89VarI2);
                    s69Var4 = s69Var2;
                    l46Var.p0(objR3);
                }
                j09VarA = ibe.a(j09VarA, boolValueOf2, (PointerInputEventHandler) objR3);
                l46Var.r(false);
            } else {
                s69Var3 = s69Var;
                j18Var3 = j18VarA;
                s69Var4 = s69Var2;
                l46Var.f0(833400675);
                l46Var.r(false);
            }
            final j09 j09Var5 = j09VarA;
            final j18 j18Var5 = j18Var3;
            final s69 s69Var6 = s69Var3;
            nk8.d(j09Var3.D(b.c), null, af1.b0(-1494510601, new n26() { // from class: wdf
                @Override // defpackage.n26
                public final Object m(Object obj3, Object obj4, Object obj5) {
                    boolean z6;
                    int i9;
                    int i10;
                    j18 j18Var6;
                    e31 e31Var = (e31) obj3;
                    l46 l46Var2 = (l46) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
                        cv7 cv7Var = (cv7) l46Var2.k(zg2.n);
                        int iD0 = sw3Var.D0(e31Var.d());
                        int iD1 = sw3Var.D0(f);
                        int iD2 = sw3Var.D0(144.0f);
                        int iD3 = sw3Var.D0(12.0f);
                        cv6 cv6Var2 = cv6Var;
                        boolean zG2 = l46Var2.g(cv6Var2) | l46Var2.e(iD0) | l46Var2.e(iD1) | l46Var2.e(iD2) | l46Var2.e(iD3);
                        boolean z7 = z;
                        boolean zH = zG2 | l46Var2.h(z7);
                        Object objR4 = l46Var2.R();
                        i8c i8cVar = sf2.a;
                        if (zH || objR4 == i8cVar) {
                            cv6Var2.getClass();
                            Bitmap bitmap = ((ks) cv6Var2).a;
                            if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                                qc0.j("Failed requirement.");
                                return null;
                            }
                            if (iD0 < 0) {
                                iD0 = 0;
                            }
                            int iU = fdc.u(bitmap.getWidth(), bitmap.getHeight(), iD0);
                            qad qadVarG = fdc.g(iD0, iD0, iU, iD1, iD2, iD3, z7);
                            z6 = z7;
                            int i11 = qadVarG.c;
                            int height = bitmap.getHeight();
                            if (iU > 4096) {
                                height = mh3.o((int) ((((long) height) * 4095) / ((long) iU)), 1, height);
                            }
                            c78 c78VarF = fdc.f(bitmap.getHeight(), height, i11);
                            int i12 = qadVarG.g;
                            if (i11 > qadVarG.d) {
                                i9 = i12;
                                i10 = iD3 < 0 ? 0 : iD3;
                            } else {
                                i9 = i12;
                                i10 = i9;
                            }
                            objR4 = new c6d(cv6Var2, qadVarG, height, i9, i10, c78VarF);
                            l46Var2.p0(objR4);
                        } else {
                            z6 = z7;
                        }
                        c6d c6dVar = (c6d) objR4;
                        qad qadVar = c6dVar.b;
                        int i13 = qadVar.b;
                        int i14 = qadVar.c;
                        float f2 = qadVar.a;
                        x4d x4dVar2 = x4dVar;
                        boolean zD = l46Var2.d(f2) | l46Var2.e(i13) | l46Var2.g(x4dVar2) | l46Var2.e(i14) | l46Var2.g(sw3Var) | l46Var2.e(cv7Var.ordinal());
                        Object objR5 = l46Var2.R();
                        if (zD || objR5 == i8cVar) {
                            qad qadVar2 = c6dVar.b;
                            vs9 vs9VarH = fdc.h(x4dVar2, qadVar2.b, qadVar2.c, cv7Var, sw3Var, qadVar2.a);
                            sw3Var = sw3Var;
                            if (vs9VarH instanceof ts9) {
                                objR5 = null;
                            } else if (vs9VarH instanceof us9) {
                                zt ztVarA = cu.a();
                                zt.c(ztVarA, ((us9) vs9VarH).a);
                                objR5 = ztVarA;
                            } else {
                                if (!(vs9VarH instanceof ss9)) {
                                    ap.c();
                                    return null;
                                }
                                objR5 = ((ss9) vs9VarH).a;
                            }
                            l46Var2.p0(objR5);
                        }
                        zt ztVar = (zt) objR5;
                        Boolean boolValueOf3 = Boolean.valueOf(z6);
                        Integer numValueOf = Integer.valueOf(c6dVar.c);
                        Integer numValueOf2 = Integer.valueOf(c6dVar.f.size());
                        boolean zI = l46Var2.i(c6dVar) | l46Var2.h(z6);
                        j18 j18Var7 = j18Var5;
                        boolean zG3 = zI | l46Var2.g(j18Var7);
                        s69 s69Var7 = s69Var6;
                        boolean zG4 = zG3 | l46Var2.g(s69Var7);
                        s69 s69Var8 = s69Var4;
                        boolean zG5 = zG4 | l46Var2.g(s69Var8);
                        Object objR6 = l46Var2.R();
                        if (zG5 || objR6 == i8cVar) {
                            j18Var6 = j18Var7;
                            objR6 = new ydf(c6dVar, z6, j18Var6, s69Var7, s69Var8, null);
                            l46Var2.p0(objR6);
                        } else {
                            j18Var6 = j18Var7;
                        }
                        af1.q(boolValueOf3, numValueOf, numValueOf2, (l26) objR6, l46Var2);
                        FillElement fillElement = b.c;
                        bx9 bx9VarR = ynb.r(0.0f, sw3Var.Z(c6dVar.d), 0.0f, sw3Var.Z(c6dVar.e), 5);
                        jx0 jx0Var = ndb.Z;
                        boolean zI2 = l46Var2.i(c6dVar) | l46Var2.g(sw3Var);
                        j09 j09Var6 = j09Var5;
                        boolean zG6 = zI2 | l46Var2.g(j09Var6) | l46Var2.i(ztVar);
                        Object objR7 = l46Var2.R();
                        if (zG6 || objR7 == i8cVar) {
                            wca wcaVar = new wca(c6dVar, sw3Var, j09Var6, ztVar, 6);
                            l46Var2.p0(wcaVar);
                            objR7 = wcaVar;
                        }
                        af1.s(fillElement, j18Var6, bx9VarR, null, jx0Var, null, z2, null, (a26) objR7, l46Var2, 196614, 344);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3072, 6);
            j09Var2 = j09Var3;
            j18Var2 = j18Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            j18Var2 = j18VarA;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(f, z, z2, x4dVar, x16Var, j09Var2, j18Var2, i, i2) { // from class: xdf
                public final /* synthetic */ float b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ x4d e;
                public final /* synthetic */ x16 f;
                public final /* synthetic */ j09 g;
                public final /* synthetic */ j18 v;
                public final /* synthetic */ int w;

                {
                    this.w = i2;
                }

                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iP = k99.P(1);
                    fdc.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj3, iP, this.w);
                    return wef.a;
                }
            };
        }
    }

    public static final void e(final float f, final boolean z, final boolean z2, final x16 x16Var, j09 j09Var, ghc ghcVar, dd2 dd2Var, l46 l46Var, final int i, final int i2) {
        j09 j09Var2;
        int i3;
        dd2 dd2Var2;
        final ghc ghcVar2;
        ghc ghcVarT;
        int i4;
        boolean z3;
        j09 j09VarA;
        x16Var.getClass();
        l46Var.h0(-2098447884);
        int i5 = (l46Var.d(f) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i5 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
            j09Var2 = j09Var;
        } else {
            j09Var2 = j09Var;
            i3 = i5 | (l46Var.g(j09Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        int i7 = i3 | 65536;
        if (l46Var.W(i7 & 1, (599187 & i7) != 599186)) {
            l46Var.b0();
            int i8 = i & 1;
            g09 g09Var = g09.a;
            if (i8 == 0 || l46Var.C()) {
                if (i6 != 0) {
                    j09Var2 = g09Var;
                }
                ghcVarT = mh3.T(l46Var);
                i4 = i7 & (-458753);
            } else {
                l46Var.Z();
                i4 = i7 & (-458753);
                ghcVarT = ghcVar;
            }
            l46Var.s();
            e89 e89VarI = q1c.i(Boolean.valueOf(z), l46Var);
            e89 e89VarI2 = q1c.i(x16Var, l46Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = kv2.f(0, l46Var);
            }
            s69 s69Var = (s69) objR;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i9 = i4 & 112;
            boolean zG = (i9 == 32) | l46Var.g(ghcVarT);
            Object objR2 = l46Var.R();
            if (zG || objR2 == i8cVar) {
                objR2 = new bef(z, ghcVarT, s69Var, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, boolValueOf);
            if (z2) {
                l46Var.f0(-1611108529);
                Boolean boolValueOf2 = Boolean.valueOf(z2);
                boolean zG2 = l46Var.g(e89VarI) | l46Var.g(ghcVarT) | l46Var.g(e89VarI2);
                Object objR3 = l46Var.R();
                if (zG2 || objR3 == i8cVar) {
                    pl4 pl4Var = new pl4(ghcVarT, e89VarI, s69Var, e89VarI2, 3);
                    l46Var.p0(pl4Var);
                    objR3 = pl4Var;
                }
                j09VarA = ibe.a(g09Var, boolValueOf2, (PointerInputEventHandler) objR3);
                z3 = false;
                l46Var.r(false);
            } else {
                z3 = false;
                l46Var.f0(-1610856964);
                l46Var.r(false);
                j09VarA = g09Var;
            }
            j09 j09VarD0 = mh3.d0(j09Var2.D(b.c), ghcVarT, z2, 12);
            xn8 xn8VarC = s21.c(ndb.b, z3);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD0);
            lf2.q.getClass();
            l46Var.j0();
            boolean z4 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
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
            j09 j09VarD = b.c(g09Var, 1.0f).D(j09VarA);
            boolean z5 = ((i4 & 14) == 4) | (i9 == 32);
            Object objR4 = l46Var.R();
            if (z5 || objR4 == i8cVar) {
                objR4 = new r53(f, 1, z);
                l46Var.p0(objR4);
            }
            xn8 xn8Var = (xn8) objR4;
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8Var);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            dd2Var2 = dd2Var;
            dd2Var2.z(l46Var, 6);
            l46Var.r(true);
            l46Var.r(true);
            ghcVar2 = ghcVarT;
        } else {
            dd2Var2 = dd2Var;
            l46Var.Z();
            ghcVar2 = ghcVar;
        }
        final j09 j09Var3 = j09Var2;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final dd2 dd2Var3 = dd2Var2;
            ojbVarV.d = new l26() { // from class: vdf
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fdc.e(f, z, z2, x16Var, j09Var3, ghcVar2, dd2Var3, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static final c78 f(int i, int i2, int i3) {
        c78 c78VarW = t72.w();
        int i4 = 0;
        while (i4 < i) {
            int i5 = i4 + i2;
            if (i5 > i) {
                i5 = i;
            }
            int iT = t(i4, i, i3);
            int iT2 = t(i5, i, i3);
            while (iT2 == iT && i5 < i) {
                i5 += i2;
                if (i5 > i) {
                    i5 = i;
                }
                iT2 = t(i5, i, i3);
            }
            if (iT2 > iT) {
                c78VarW.add(new d6d(i4, i5 - i4, iT, iT2 - iT));
            }
            i4 = i5;
        }
        return c78VarW.n();
    }

    public static final qad g(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int i7 = i4 < 0 ? 0 : i4;
        float f = 1.0f;
        if (z && i2 > 0 && i3 > 0) {
            float f2 = i7 / i3;
            if (i5 > i2) {
                i5 = i2;
            }
            float fMax = Math.max(f2, i5 / i2);
            if (fMax <= 1.0f) {
                f = fMax;
            }
        }
        float f3 = f;
        int iL = ym8.L(i2 * f3);
        int iL2 = ym8.L(i3 * f3);
        boolean z2 = iL2 > i7;
        int iMax = Math.max(i7, iL2);
        if (!z2 || i6 < 0) {
            i6 = 0;
        }
        int i8 = iMax + i6;
        int i9 = (i - iL) / 2;
        int i10 = i9 < 0 ? 0 : i9;
        int i11 = (i7 - iL2) / 2;
        return new qad(f3, iL, iL2, i7, i8, i10, i11 < 0 ? 0 : i11);
    }

    public static final vs9 h(x4d x4dVar, int i, int i2, cv7 cv7Var, sw3 sw3Var, float f) {
        cv7Var.getClass();
        return x4dVar.a((((long) Float.floatToRawIntBits(i2)) & 4294967295L) | (Float.floatToRawIntBits(i) << 32), cv7Var, new vw3(sw3Var.getDensity() * f, sw3Var.h0()));
    }

    public static final kdc i(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            kdc kdcVar = tag instanceof kdc ? (kdc) tag : null;
            if (kdcVar != null) {
                return kdcVar;
            }
            Object objG = jcc.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }

    public static i0f j(m82 m82Var) {
        i0f i0fVar = m82Var.c0;
        if (i0fVar != null) {
            return i0fVar;
        }
        i0f i0fVar2 = new i0f(o82.c(m82Var, od4.a), o82.c(m82Var, od4.c), o82.c(m82Var, od4.b), o82.c(m82Var, od4.e), o82.c(m82Var, od4.f), o82.c(m82Var, od4.d));
        m82Var.c0 = i0fVar2;
        return i0fVar2;
    }

    public static final int k(String str, Bundle bundle) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        gdc.h(str);
        throw null;
    }

    public static final Bundle l(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        gdc.h(str);
        throw null;
    }

    public static final ArrayList m(String str, Bundle bundle) {
        ArrayList arrayListS = Build.VERSION.SDK_INT >= 34 ? q6.s(bundle, str, af1.R(job.a.b(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (arrayListS != null) {
            return arrayListS;
        }
        gdc.h(str);
        throw null;
    }

    public static final String n(String str, Bundle bundle) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        gdc.h(str);
        throw null;
    }

    public static final String[] o(String str, Bundle bundle) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        gdc.h(str);
        throw null;
    }

    public static m58 p(l46 l46Var) {
        WeakHashMap weakHashMap = m8g.w;
        return new m58(new tef(q7c.k(l46Var).g, q7c.k(l46Var).b), z7c.e | 16);
    }

    public static final boolean q(k00 k00Var) {
        int length = k00Var.b.length();
        List list = k00Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                j00 j00Var = (j00) list.get(i);
                if ((j00Var.a instanceof l68) && l00.b(0, length, j00Var.b, j00Var.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean r(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final void s(bea beaVar, bo8 bo8Var, float f, float f2, double d, double d2) {
        cea ceaVar = bo8Var.e;
        if (ceaVar != null) {
            bea.q(beaVar, ceaVar, 0, 0, new at4(d, f, d2, f2, 1), 4);
        }
        for (vna vnaVar : bo8Var.c) {
            s(beaVar, vnaVar.a, f, f2, d + vnaVar.b, d2 + vnaVar.c);
        }
    }

    public static final int t(int i, int i2, int i3) {
        long j = ((((long) i) * ((long) i3)) + ((long) (i2 / 2))) / ((long) i2);
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (int) j;
    }

    public static final int u(int i, int i2, int i3) {
        if (i3 <= 0) {
            return 0;
        }
        long j = ((((long) i2) * ((long) i3)) + ((long) (i / 2))) / ((long) i);
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (int) j;
    }

    public static i0f v(long j, long j2, long j3, long j4, l46 l46Var, int i) {
        long j5 = (i & 2) != 0 ? y72.k : j2;
        long j6 = (i & 4) != 0 ? y72.k : j3;
        long j7 = y72.k;
        return j((m82) l46Var.k(o82.a)).a(j, j5, j6, j7, (i & 16) != 0 ? j7 : j4, j7);
    }

    public static final j09 w(j09 j09Var, float f) {
        return j09Var.D(new mdg(f));
    }

    public static final k2h x(Object obj, Object obj2) {
        k2h k2hVarB = (k2h) obj;
        k2h k2hVar = (k2h) obj2;
        if (!k2hVar.isEmpty()) {
            if (!k2hVarB.d()) {
                k2hVarB = k2hVarB.b();
            }
            k2hVarB.g();
            if (!k2hVar.isEmpty()) {
                k2hVarB.putAll(k2hVar);
            }
        }
        return k2hVarB;
    }
}
