package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lt3 {
    public static final nma a;

    static {
        a = new nma((30 & 1) == 0, usc.a, true, 0);
    }

    public static final void a(hne hneVar, tme tmeVar, l46 l46Var, int i) {
        l46 l46Var2;
        Context context;
        l46Var.h0(1904307118);
        int i2 = (l46Var.g(hneVar) ? 4 : 2) | i | (l46Var.i(tmeVar) ? 32 : 16);
        int i3 = 0;
        int i4 = 28;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                l46Var.f0(-1009482584);
                context = (Context) l46Var.k(uq.b);
                l46Var.r(false);
            } else {
                l46Var.f0(-1009433480);
                l46Var.r(false);
                context = null;
            }
            boolean zI = l46Var.i(tmeVar) | ((i2 & 14) == 4) | l46Var.i(context);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new it3(tmeVar, context, hneVar, i3);
                l46Var.p0(objR);
            }
            l46Var2 = l46Var;
            pn2.b(null, null, (a26) objR, l46Var2, 0, 3);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(hneVar, tmeVar, i, i4);
        }
    }

    public static final void b(final int i, final int i2, final long j, l46 l46Var) {
        final int i3;
        int i4;
        ojb ojbVarV;
        l26 l26Var;
        l46Var.h0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (l46Var.e(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.f(j) ? 32 : 16;
        }
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) l46Var.k(uq.b);
            boolean zG = ((i4 & 14) == 4) | l46Var.g(context);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                l46Var.p0(objR);
            }
            int iIntValue = ((Number) objR).intValue();
            if (iIntValue == -1) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i5 = 1;
                l26Var = new l26() { // from class: ht3
                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        int i6 = i5;
                        wef wefVar = wef.a;
                        int i7 = i2;
                        long j2 = j;
                        int i8 = i3;
                        l46 l46Var2 = (l46) obj2;
                        ((Integer) obj3).intValue();
                        switch (i6) {
                            case 0:
                                lt3.b(i8, k99.P(i7 | 1), j2, l46Var2);
                                break;
                            default:
                                lt3.b(i8, k99.P(i7 | 1), j2, l46Var2);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                fy9 fy9VarA = od4.A(iIntValue, 0, l46Var);
                boolean z = (i4 & 112) == 32;
                Object objR2 = l46Var.R();
                if (z || objR2 == obj) {
                    objR2 = j == 16 ? null : new xz0(j, 5);
                    l46Var.p0(objR2);
                }
                s21.a(a.a(b.l(g09.a, nn2.e), fy9VarA, null, an2.b, 0.0f, (c82) objR2, 22), l46Var, 0);
            }
            ojbVarV.d = l26Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i6 = 0;
            l26Var = new l26() { // from class: ht3
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    int i7 = i6;
                    wef wefVar = wef.a;
                    int i8 = i2;
                    long j2 = j;
                    int i9 = i;
                    l46 l46Var2 = (l46) obj2;
                    ((Integer) obj3).intValue();
                    switch (i7) {
                        case 0:
                            lt3.b(i9, k99.P(i8 | 1), j2, l46Var2);
                            break;
                        default:
                            lt3.b(i9, k99.P(i8 | 1), j2, l46Var2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void c(hne hneVar, ume umeVar, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(hneVar) : l46Var.i(hneVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(umeVar) : l46Var.i(umeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        boolean z = false;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && l46Var.g(umeVar));
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z2 || objR == i8cVar) {
                objR = new xk8(new ssg(10, new ad1(29, umeVar, x16Var)));
                l46Var.p0(objR);
            }
            xk8 xk8Var = (xk8) objR;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && l46Var.i(hneVar))) {
                z = true;
            }
            Object objR2 = l46Var.R();
            if (z || objR2 == i8cVar) {
                objR2 = new uo2(12, hneVar);
                l46Var.p0(objR2);
            }
            pu.a(xk8Var, (x16) objR2, a, af1.b0(1315155414, new h8(27, umeVar, hneVar), l46Var), l46Var, 3456, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, hneVar, umeVar, x16Var, 16);
        }
    }

    public static final void d(j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            jgb.x(j09Var, fne.a, dd2Var, l46Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sv(j09Var, dd2Var, i, i3);
        }
    }
}
