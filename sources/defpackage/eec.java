package defpackage;

import ai.askquin.R;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eec {
    public static final void a(j09 j09Var, dd4 dd4Var, String str, String str2, String str3, String str4, String str5, l46 l46Var, int i) {
        j09 j09Var2;
        l46Var.h0(987294225);
        int i2 = i | 6 | (l46Var.g(dd4Var) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(str2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(str3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(str4) ? 131072 : 65536) | (l46Var.g(str5) ? 1048576 : 524288);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            float f = zF ? 0.0f : 20.0f;
            float f2 = zF ? 24.0f : 0.0f;
            j09 j09VarD0 = mh3.d0(ynb.b0(f, 0.0f, b.c, 2), mh3.T(l46Var), false, 14);
            c92 c92VarA = a92.a(new uc0(zF ? 0.0f : 12.0f, true, new qc0(i3)), ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            o5c.f(l46Var, b.d(g09Var, 24.0f));
            float f3 = f2;
            jgb.C(null, false, ynb.q(f3, 0.0f, 2), af1.b0(-1703370566, new n50(str, str2, str3, str4, str5), l46Var), l46Var, 3072, 3);
            if (dd4Var instanceof ad4) {
                l46Var.f0(1940801767);
                jgb.C(null, false, ynb.q(f3, 0.0f, 2), af1.b0(-1478628289, new kld((ad4) dd4Var, 0), l46Var), l46Var, 3072, 3);
                l46Var.r(false);
            } else {
                l46Var.f0(1941478311);
                l46Var.r(false);
            }
            jgb.C(null, false, ynb.q(f3, 0.0f, 2), af1.w, l46Var, 3072, 3);
            tec.u(g09Var, 64.0f, l46Var, true);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ug(j09Var2, dd4Var, str, str2, str3, str4, str5, i);
        }
    }

    public static final void b(cb9 cb9Var, l46 l46Var, int i) {
        l46Var.h0(-347761689);
        int i2 = 2;
        int i3 = (l46Var.i(cb9Var) ? 4 : 2) | i;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            boolean zI = l46Var.i(cb9Var);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new mr2(cb9Var, 7);
                l46Var.p0(objR);
            }
            af1.g(cb9Var, (a26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s14(cb9Var, i, i2);
        }
    }

    public static final hua c(String str) {
        fua fuaVar = fua.k;
        if (v4e.Q(str)) {
            qc0.j("Blank serial names are prohibited");
            return null;
        }
        Object it = ((il8) kua.a.values()).iterator();
        while (((el8) it).hasNext()) {
            xn7 xn7Var = (xn7) ((cl8) it).next();
            if (str.equals(xn7Var.e().a())) {
                StringBuilder sbP = tec.p("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbP.append(job.a.b(xn7Var.getClass()).r());
                sbP.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                qc0.j(w4e.p(sbP.toString()));
                return null;
            }
        }
        return new hua(str, fuaVar);
    }

    public static final void d(j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-521882968);
        int i2 = i | 6;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            l46Var.f0(981648937);
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            if (zF) {
                l46Var.f0(-1737151800);
            } else {
                l46Var.f0(-1737116956);
                j09VarC = db6.w(tm7.o(j09VarC, y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f), eze.a(l46Var).a.j), 0.5f, ((e8b) l46Var.k(pr4Var)).d, eze.a(l46Var).a.j);
            }
            l46Var.r(false);
            l46Var.r(false);
            j09 j09VarA0 = ynb.a0(j09VarC, zF ? 0.0f : 20.0f, 16.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 54);
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
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            ks0.q(54, dd2Var, e92.a, l46Var, true);
            j09Var = g09Var;
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eu8(j09Var, dd2Var, i, 3);
        }
    }

    public static final void e(j09 j09Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1688762300);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            s21.a(o8c.q(j09Var, 4.0f, l46Var, (i2 & 14) | 48), l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb(j09Var, i, 8, b);
        }
    }

    public static final a80 f(wg7 wg7Var, String str) {
        wg7Var.getClass();
        str.getClass();
        return new a80(str, wg7Var.a);
    }

    public static final void g(int i, int i2, t2f t2fVar, wy6 wy6Var, j09 j09Var, a26 a26Var, l46 l46Var, int i3) {
        int i4;
        int i5;
        l46Var.h0(-1937073252);
        if ((i3 & 6) == 0) {
            i4 = (l46Var.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var.i(t2fVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var.e(wy6Var.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= l46Var.i(a26Var) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && l46Var.F()) {
            l46Var.Z();
        } else {
            int iOrdinal = wy6Var.ordinal();
            if (iOrdinal == 0) {
                l46Var.f0(-168337169);
                dec.c(((i4 >> 3) & 57344) | ((i4 >> 12) & 14), a26Var, l46Var, j09Var, false);
                l46Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw tec.d(-1806546617, l46Var, false);
                }
                l46Var.f0(-168184029);
                l46Var.d0(-1806539482, l46Var.k(uq.a));
                int rotation = ((View) l46Var.k(uq.f)).getDisplay().getRotation();
                if (rotation == 0) {
                    i5 = 0;
                } else if (rotation == 1) {
                    i5 = 90;
                } else if (rotation == 2) {
                    i5 = 180;
                } else {
                    if (rotation != 3) {
                        s8f.i(tec.e(rotation, "Unsupported surface rotation: "));
                        return;
                    }
                    i5 = 270;
                }
                l46Var.r(false);
                Object objR = l46Var.R();
                if (objR == sf2.a) {
                    zm8 zm8Var = new zm8(zm8.a());
                    l46Var.p0(zm8Var);
                    objR = zm8Var;
                }
                float[] fArr = ((zm8) objR).a;
                RectF rectF = new RectF(0.0f, 0.0f, i, i2);
                Matrix matrix = new Matrix();
                RectF rectF2 = u2f.a;
                Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
                matrix.postRotate(-i5);
                Matrix matrix2 = new Matrix();
                matrix2.setRectToRect(rectF2, rectF, scaleToFit);
                matrix.postConcat(matrix2);
                hkg.M0(matrix, fArr);
                xdc.d(j09Var, false, fArr, a26Var, l46Var, ((i4 >> 3) & 57344) | ((i4 >> 12) & 14));
                l46Var.r(false);
            }
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new wr5(i, i2, t2fVar, wy6Var, j09Var, a26Var, i3);
        }
    }

    public static final void h(int i, String str, String str2, j09 j09Var, l46 l46Var, int i2, int i3) {
        j09 j09Var2;
        int i4;
        j09 j09Var3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(693493472);
        int i5 = i2 | (l46Var2.e(i) ? 4 : 2) | (l46Var2.g(str) ? 32 : 16) | (l46Var2.g(str2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            j09Var2 = j09Var;
        } else {
            j09Var2 = j09Var;
            i4 = i5 | (l46Var2.g(j09Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        int i7 = 0;
        if (l46Var2.W(i4 & 1, (i4 & 1171) != 1170)) {
            g09 g09Var = g09.a;
            j09 j09Var4 = i6 != 0 ? g09Var : j09Var2;
            j09 j09VarC = b.c(j09Var4, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(16.0f, true, new qc0(i7)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
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
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09Var5 = j09Var4;
            feg.j(od4.A(i, i4 & 14, l46Var2), null, b.l(g09Var, 32.0f), null, null, 0.0f, null, l46Var2, 440, 120);
            jw7 jw7Var = new jw7(1.0f, true);
            c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, jw7Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            mue mueVar = pue.a;
            mue mueVarD = pue.d(l46Var2);
            pr4 pr4Var = l8b.a;
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD, l46Var, (i4 >> 3) & 14, 0, 131066);
            nte.b(str2, null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, (i4 >> 6) & 14, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
            j09Var3 = j09Var5;
        } else {
            l46Var2.Z();
            j09Var3 = j09Var2;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(i, str, str2, j09Var3, i2, i3);
        }
    }

    public static final void i(final int i, final boolean z, final boolean z2, l46 l46Var, final int i2) {
        l46Var.h0(1775230274);
        int i3 = (l46Var.e(i) ? 4 : 2) | i2 | (l46Var.h(z) ? 32 : 16) | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(b.c(b.q(0.0f, 720.0f, g09Var, 1), 1.0f), 36.0f, 20.0f);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i4)), ndb.Y, l46Var, 6);
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
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            h(z2 ? R.drawable.ic_upgrade_paywall_magic_ball_neo : R.drawable.ic_upgrade_paywall_magic_ball, afc.q(R.string.upgrade_paywall_benefit_readings_title, l46Var), afc.q(R.string.upgrade_paywall_benefit_readings_description, l46Var), null, l46Var, 0, 8);
            h(z2 ? R.drawable.ic_upgrade_paywall_pick_neo : R.drawable.ic_upgrade_paywall_pick, afc.q(R.string.upgrade_paywall_benefit_follow_up_title, l46Var), afc.q(R.string.upgrade_paywall_benefit_follow_up_description, l46Var), null, l46Var, 0, 8);
            h(z2 ? R.drawable.ic_paywall_lock_neo : R.drawable.ic_paywall_lock, afc.q(R.string.upgrade_paywall_benefit_decks_title, l46Var), afc.r(R.string.upgrade_paywall_yearly_description, new Object[]{Integer.valueOf(i)}, l46Var), androidx.compose.ui.platform.b.a(pa7.p(g09Var, z ? 1.0f : 0.3f), "upgrade-paywall-yearly-benefit"), l46Var, 0, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(i, i2, z, z2) { // from class: vgf
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;

                {
                    this.b = z;
                    this.c = z2;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    eec.i(this.a, this.b, this.c, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void j(final List list, final bwa bwaVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i, final int i2, final a26 a26Var, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final x16 x16Var5, final x16 x16Var6, final x16 x16Var7, l46 l46Var, final int i3, final int i4) {
        int i5;
        Object next;
        Object next2;
        list.getClass();
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        x16Var5.getClass();
        x16Var6.getClass();
        x16Var7.getClass();
        l46Var.h0(-979260320);
        int i6 = (i3 & 6) == 0 ? ((i3 & 8) == 0 ? l46Var.g(list) : l46Var.i(list) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i6 |= (i3 & 64) == 0 ? l46Var.g(bwaVar) : l46Var.i(bwaVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i7 = i3 & 3072;
        int i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i7 == 0) {
            i6 |= l46Var.h(z2) ? 2048 : 1024;
        }
        int i9 = i3 & 24576;
        int i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i9 == 0) {
            i6 |= l46Var.h(z3) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= l46Var.h(z4) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= l46Var.e(i) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 = i2;
            i6 |= l46Var.e(i5) ? 8388608 : 4194304;
        } else {
            i5 = i2;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= l46Var.i(a26Var) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= l46Var.i(x16Var) ? 536870912 : 268435456;
        }
        int i11 = (i4 & 6) == 0 ? i4 | (l46Var.i(x16Var2) ? 4 : 2) : i4;
        if ((i4 & 48) == 0) {
            i11 |= l46Var.i(x16Var3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i11 |= l46Var.i(x16Var4) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i4 & 3072) == 0) {
            if (l46Var.i(x16Var5)) {
                i8 = 2048;
            }
            i11 |= i8;
        }
        if ((i4 & 24576) == 0) {
            if (l46Var.i(x16Var6)) {
                i10 = 16384;
            }
            i11 |= i10;
        }
        if ((i4 & 196608) == 0) {
            i11 |= l46Var.i(x16Var7) ? 131072 : 65536;
        }
        int i12 = i11;
        if (l46Var.W(i6 & 1, ((i6 & 306783379) == 306783378 && (i12 & 74899) == 74898) ? false : true)) {
            final boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new mie(25);
                l46Var.p0(objR);
            }
            final e89 e89Var = (e89) vfh.I(objArr, (x16) objR, l46Var, 48);
            Object[] objArr2 = new Object[0];
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new mie(26);
                l46Var.p0(objR2);
            }
            final e89 e89Var2 = (e89) vfh.I(objArr2, (x16) objR2, l46Var, 48);
            Object[] objArr3 = new Object[0];
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = new mie(27);
                l46Var.p0(objR3);
            }
            final e89 e89Var3 = (e89) vfh.I(objArr3, (x16) objR3, l46Var, 48);
            Object[] objArr4 = new Object[0];
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = new mie(28);
                l46Var.p0(objR4);
            }
            e89 e89Var4 = (e89) vfh.I(objArr4, (x16) objR4, l46Var, 48);
            cwa type = bwaVar != null ? bwaVar.getType() : null;
            boolean zG = ((i6 & 112) == 32 || ((i6 & 64) != 0 && l46Var.i(bwaVar))) | l46Var.g(e89Var4);
            Object objR5 = l46Var.R();
            if (zG || objR5 == obj) {
                objR5 = new zgf(bwaVar, e89Var4, null);
                l46Var.p0(objR5);
            }
            af1.o((l26) objR5, l46Var, type);
            final boolean z5 = z2 || z3;
            final boolean z6 = (z || z5 || !s72.o0(list, bwaVar)) ? false : true;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof z6e) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((z6e) next).h() != u7e.b);
            final z6e z6eVar = (z6e) next;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof z6e) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((z6e) next2).h() != u7e.c);
            final z6e z6eVar2 = (z6e) next2;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list) {
                e89 e89Var5 = e89Var4;
                if (obj4 instanceof n07) {
                    arrayList3.add(obj4);
                }
                e89Var4 = e89Var5;
            }
            final e89 e89Var6 = e89Var4;
            final n07 n07Var = (n07) s72.x0(arrayList3);
            final int i13 = i5;
            boolean z7 = z6;
            rs0.f(androidx.compose.ui.platform.b.a(b.c, "upgrade-paywall-content"), false, af1.b0(-516358243, new n26() { // from class: wgf
                @Override // defpackage.n26
                public final Object m(Object obj5, Object obj6, Object obj7) {
                    l46 l46Var2 = (l46) obj6;
                    int iIntValue = ((Integer) obj7).intValue();
                    ((c31) obj5).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        long j = y72.j;
                        dd2 dd2VarB0 = af1.b0(1903956057, new fkc(8, x16Var5), l46Var2);
                        final bwa bwaVar2 = bwaVar;
                        final boolean z8 = z6;
                        final boolean z9 = zF;
                        final x16 x16Var8 = x16Var;
                        final e89 e89Var7 = e89Var2;
                        final x16 x16Var9 = x16Var2;
                        final e89 e89Var8 = e89Var3;
                        final boolean z10 = z5;
                        final boolean z11 = z3;
                        final boolean z12 = z2;
                        final x16 x16Var10 = x16Var3;
                        final boolean z13 = z4;
                        final int i14 = i;
                        final x16 x16Var11 = x16Var4;
                        final x16 x16Var12 = x16Var6;
                        dd2 dd2VarB1 = af1.b0(-1677813320, new l26() { // from class: ygf
                            @Override // defpackage.l26
                            public final Object z(Object obj8, Object obj9) {
                                l46 l46Var3 = (l46) obj8;
                                int iIntValue2 = ((Integer) obj9).intValue();
                                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    final bwa bwaVar3 = bwaVar2;
                                    final boolean z14 = z8;
                                    final boolean z15 = z9;
                                    final x16 x16Var13 = x16Var8;
                                    final e89 e89Var9 = e89Var7;
                                    final x16 x16Var14 = x16Var9;
                                    final e89 e89Var10 = e89Var8;
                                    final boolean z16 = z10;
                                    final boolean z17 = z11;
                                    final boolean z18 = z12;
                                    final x16 x16Var15 = x16Var10;
                                    final boolean z19 = z13;
                                    final int i15 = i14;
                                    final x16 x16Var16 = x16Var11;
                                    final x16 x16Var17 = x16Var12;
                                    oa7.b(null, 0L, 16.0f, af1.b0(-1725181580, new n26() { // from class: sgf
                                        @Override // defpackage.n26
                                        public final Object m(Object obj10, Object obj11, Object obj12) {
                                            e89 e89Var11;
                                            i8c i8cVar;
                                            boolean z20;
                                            int i16;
                                            cwa type2;
                                            c31 c31Var = (c31) obj10;
                                            l46 l46Var4 = (l46) obj11;
                                            int iIntValue3 = ((Integer) obj12).intValue();
                                            c31Var.getClass();
                                            if ((iIntValue3 & 6) == 0) {
                                                iIntValue3 |= l46Var4.g(c31Var) ? 4 : 2;
                                            }
                                            if (l46Var4.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                lx0 lx0Var = ndb.f;
                                                g09 g09Var = g09.a;
                                                j09 j09VarD0 = ynb.d0(24.0f, 0.0f, 24.0f, 8.0f, 2, mh3.N(b.c(b.q(0.0f, 720.0f, c31Var.a(g09Var, lx0Var), 1), 1.0f)));
                                                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var4, 54);
                                                int iHashCode = Long.hashCode(l46Var4.T);
                                                u8a u8aVarM = l46Var4.m();
                                                j09 j09VarJ = m93.J(l46Var4, j09VarD0);
                                                lf2.q.getClass();
                                                l46Var4.j0();
                                                if (l46Var4.S) {
                                                    l46Var4.l(LayoutNode.h1);
                                                } else {
                                                    l46Var4.s0();
                                                }
                                                dec.l(hj6.z, l46Var4, c92VarA);
                                                dec.l(hj6.y, l46Var4, u8aVarM);
                                                dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode));
                                                dec.k(l46Var4);
                                                dec.l(hj6.x, l46Var4, j09VarJ);
                                                bwa bwaVar4 = bwaVar3;
                                                String strQ = afc.q(bwaVar4 instanceof n07 ? R.string.upgrade_paywall_cta_buy_five_readings : R.string.upgrade_paywall_cta_upgrade, l46Var4);
                                                j09 j09VarA = androidx.compose.ui.platform.b.a(b.c(g09Var, 1.0f), "upgrade-paywall-purchase");
                                                x16 x16Var18 = x16Var13;
                                                boolean zG2 = l46Var4.g(x16Var18);
                                                e89 e89Var12 = e89Var9;
                                                boolean zG3 = zG2 | l46Var4.g(e89Var12);
                                                x16 x16Var19 = x16Var14;
                                                boolean zG4 = zG3 | l46Var4.g(x16Var19);
                                                e89 e89Var13 = e89Var10;
                                                boolean zG5 = zG4 | l46Var4.g(e89Var13);
                                                Object objR6 = l46Var4.R();
                                                i8c i8cVar2 = sf2.a;
                                                if (zG5 || objR6 == i8cVar2) {
                                                    objR6 = new zlb(x16Var18, x16Var19, e89Var12, e89Var13);
                                                    l46Var4.p0(objR6);
                                                }
                                                e6a.a(strQ, z14, z15, j09VarA, (x16) objR6, l46Var4, 3072);
                                                if (z16) {
                                                    l46Var4.f0(-789698887);
                                                    e89Var11 = e89Var12;
                                                    i8cVar = i8cVar2;
                                                    axa.a(0.0f, 0.0f, 0, 6, 62, 0L, 0L, l46Var4, b.l(g09Var, 24.0f));
                                                    l46Var4 = l46Var4;
                                                } else {
                                                    e89Var11 = e89Var12;
                                                    i8cVar = i8cVar2;
                                                    l46Var4.f0(1289183448);
                                                }
                                                l46Var4.r(false);
                                                if (z17) {
                                                    l46Var4.f0(1289240333);
                                                    String strQ2 = afc.q(R.string.upgrade_paywall_purchase_confirming, l46Var4);
                                                    mue mueVar = pue.a;
                                                    l46 l46Var5 = l46Var4;
                                                    z20 = true;
                                                    nte.b(strQ2, null, ((e8b) l46Var4.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.g(l46Var4), l46Var5, 0, 0, 130042);
                                                    cgg.m(x16Var15, androidx.compose.ui.platform.b.a(g09Var, "upgrade-paywall-check-purchase"), !z18, null, null, null, if9.g, l46Var5, 805306416, 504);
                                                    l46Var4 = l46Var5;
                                                    i16 = 0;
                                                    l46Var4.r(false);
                                                } else {
                                                    z20 = true;
                                                    i16 = 0;
                                                    l46Var4.f0(1289804440);
                                                    l46Var4.r(false);
                                                }
                                                eec.l(bwaVar4, z19, i15, l46Var4, i16);
                                                ca2.a.getClass();
                                                if (ca2.c) {
                                                    l46Var4.f0(1290140728);
                                                    l46Var4.r(false);
                                                } else {
                                                    l46Var4.f0(1289939879);
                                                    boolean zBooleanValue = ((Boolean) e89Var11.getValue()).booleanValue();
                                                    e89 e89Var14 = e89Var11;
                                                    boolean zG6 = l46Var4.g(e89Var14);
                                                    Object objR7 = l46Var4.R();
                                                    if (zG6 || objR7 == i8cVar) {
                                                        objR7 = new w77(e89Var14, 21);
                                                        l46Var4.p0(objR7);
                                                    }
                                                    l46 l46Var6 = l46Var4;
                                                    ynb.s(null, zBooleanValue, (a26) objR7, null, null, true, l46Var6, 196608, 25);
                                                    l46Var4 = l46Var6;
                                                    l46Var4.r(false);
                                                }
                                                if (bwaVar4 == null || (type2 = bwaVar4.getType()) == null) {
                                                    type2 = u7e.c;
                                                }
                                                ynb.g(type2, false, x16Var16, ca2.c, x16Var17, l46Var4, 390, 8);
                                                l46Var4.r(z20);
                                            } else {
                                                l46Var4.Z();
                                            }
                                            return wef.a;
                                        }
                                    }, l46Var3), l46Var3, 3456, 3);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2);
                        final int i15 = i13;
                        final e89 e89Var9 = e89Var6;
                        final boolean z14 = z;
                        final z6e z6eVar3 = z6eVar;
                        final z6e z6eVar4 = z6eVar2;
                        final n07 n07Var2 = n07Var;
                        final e89 e89Var10 = e89Var;
                        final x16 x16Var13 = x16Var7;
                        final a26 a26Var2 = a26Var;
                        xdc.a(null, dd2VarB0, dd2VarB1, null, null, 0, j, 0L, null, af1.b0(1369242286, new n26() { // from class: rgf
                            @Override // defpackage.n26
                            public final Object m(Object obj8, Object obj9, Object obj10) {
                                mue mueVarM;
                                int i16;
                                he2 he2Var;
                                he2 he2Var2;
                                he2 he2Var3;
                                boolean z15;
                                bwa bwaVar3;
                                boolean z16;
                                a26 a26Var3;
                                i8c i8cVar;
                                boolean z17;
                                he2 he2Var4 = hj6.x;
                                he2 he2Var5 = hj6.X;
                                he2 he2Var6 = hj6.y;
                                he2 he2Var7 = hj6.z;
                                xw9 xw9Var = (xw9) obj8;
                                l46 l46Var3 = (l46) obj9;
                                int iIntValue2 = ((Integer) obj10).intValue();
                                jx0 jx0Var = ndb.Z;
                                xw9Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= l46Var3.g(xw9Var) ? 4 : 2;
                                }
                                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    j09 j09VarA = androidx.compose.ui.platform.b.a(ynb.d0(0.0f, 16.0f, 0.0f, 24.0f, 5, mh3.d0(eb3.E(ynb.Y(b.c, xw9Var), xw9Var), mh3.T(l46Var3), false, 14)), "upgrade-paywall-scroll");
                                    c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), jx0Var, l46Var3, 54);
                                    int iHashCode = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM = l46Var3.m();
                                    j09 j09VarJ = m93.J(l46Var3, j09VarA);
                                    lf2.q.getClass();
                                    l46Var3.j0();
                                    boolean z18 = l46Var3.S;
                                    ov7 ov7Var = LayoutNode.h1;
                                    if (z18) {
                                        l46Var3.l(ov7Var);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    dec.l(he2Var7, l46Var3, c92VarA);
                                    dec.l(he2Var6, l46Var3, u8aVarM);
                                    ib8.s(iHashCode, l46Var3, he2Var5, l46Var3);
                                    dec.l(he2Var4, l46Var3, j09VarJ);
                                    String strQ = afc.q(R.string.upgrade_paywall_title, l46Var3);
                                    boolean z19 = z9;
                                    if (z19) {
                                        l46Var3.f0(-1783166074);
                                        mue mueVar = pue.a;
                                        mueVarM = pue.n(l46Var3);
                                    } else {
                                        l46Var3.f0(-1783165466);
                                        mue mueVar2 = pue.a;
                                        mueVarM = pue.m(l46Var3);
                                    }
                                    l46Var3.r(false);
                                    mue mueVar3 = mueVarM;
                                    yp5 yp5VarU = eec.u(l46Var3);
                                    long j2 = ((e8b) l46Var3.k(l8b.a)).q;
                                    g09 g09Var = g09.a;
                                    nte.b(strQ, ynb.b0(32.0f, 0.0f, b.q(0.0f, 720.0f, g09Var, 1), 2), j2, 0L, null, yp5VarU, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar3, l46Var3, 48, 0, 129912);
                                    l46 l46Var4 = l46Var3;
                                    boolean zBooleanValue = ((Boolean) e89Var9.getValue()).booleanValue();
                                    int i17 = i15;
                                    eec.i(i17, zBooleanValue, z19, l46Var4, 0);
                                    j09 j09VarB = vwc.b(ynb.b0(16.0f, 0.0f, b.c(b.q(0.0f, 720.0f, g09Var, 1), 1.0f), 2), false, new fnc(15));
                                    c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var4, 6);
                                    int iHashCode2 = Long.hashCode(l46Var4.T);
                                    u8a u8aVarM2 = l46Var4.m();
                                    j09 j09VarJ2 = m93.J(l46Var4, j09VarB);
                                    l46Var4.j0();
                                    if (l46Var4.S) {
                                        l46Var4.l(ov7Var);
                                    } else {
                                        l46Var4.s0();
                                    }
                                    dec.l(he2Var7, l46Var4, c92VarA2);
                                    dec.l(he2Var6, l46Var4, u8aVarM2);
                                    ib8.s(iHashCode2, l46Var4, he2Var5, l46Var4);
                                    dec.l(he2Var4, l46Var4, j09VarJ2);
                                    if (z14) {
                                        l46Var4.f0(1899488217);
                                        j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 24.0f);
                                        xn8 xn8VarC = s21.c(ndb.f, false);
                                        int iHashCode3 = Long.hashCode(l46Var4.T);
                                        u8a u8aVarM3 = l46Var4.m();
                                        j09 j09VarJ3 = m93.J(l46Var4, j09VarZ);
                                        l46Var4.j0();
                                        if (l46Var4.S) {
                                            l46Var4.l(ov7Var);
                                        } else {
                                            l46Var4.s0();
                                        }
                                        dec.l(he2Var7, l46Var4, xn8VarC);
                                        dec.l(he2Var6, l46Var4, u8aVarM3);
                                        ib8.s(iHashCode3, l46Var4, he2Var5, l46Var4);
                                        dec.l(he2Var4, l46Var4, j09VarJ3);
                                        i16 = i17;
                                        he2Var2 = he2Var4;
                                        he2Var3 = he2Var5;
                                        he2Var = he2Var6;
                                        axa.a(0.0f, 0.0f, 0, 6, 62, 0L, 0L, l46Var4, androidx.compose.ui.platform.b.a(g09Var, "upgrade-paywall-loading"));
                                        l46Var4 = l46Var4;
                                        l46Var4.r(true);
                                        l46Var4.r(false);
                                    } else {
                                        i16 = i17;
                                        he2Var = he2Var6;
                                        he2Var2 = he2Var4;
                                        he2Var3 = he2Var5;
                                        l46Var4.f0(1899687144);
                                        l46Var4.r(false);
                                    }
                                    l46Var4.f0(-354360069);
                                    Iterator it3 = ((ArrayList) qd0.k0(new z6e[]{z6eVar3, z6eVar4})).iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        z15 = z10;
                                        bwaVar3 = bwaVar2;
                                        z16 = z13;
                                        a26Var3 = a26Var2;
                                        i8cVar = sf2.a;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        z6e z6eVar5 = (z6e) it3.next();
                                        boolean zT = pa7.t(z6eVar5, bwaVar3);
                                        boolean z20 = !z15;
                                        boolean zG2 = l46Var4.g(a26Var3) | l46Var4.i(z6eVar5);
                                        Object objR6 = l46Var4.R();
                                        if (zG2 || objR6 == i8cVar) {
                                            objR6 = new ykc(29, a26Var3, z6eVar5);
                                            l46Var4.p0(objR6);
                                        }
                                        eec.k(z6eVar5, zT, z16, i16, z20, (x16) objR6, l46Var4, 8);
                                    }
                                    l46Var4.r(false);
                                    n07 n07Var3 = n07Var2;
                                    if (n07Var3 != null) {
                                        l46Var4.f0(1900181904);
                                        boolean z21 = !z15;
                                        j09 j09VarA2 = androidx.compose.ui.platform.b.a(new mq6(jx0Var), "upgrade-paywall-expand");
                                        e89 e89Var11 = e89Var10;
                                        boolean zG3 = l46Var4.g(e89Var11);
                                        x16 x16Var14 = x16Var13;
                                        boolean zG4 = zG3 | l46Var4.g(x16Var14);
                                        Object objR7 = l46Var4.R();
                                        if (zG4 || objR7 == i8cVar) {
                                            objR7 = new k8(x16Var14, e89Var11, 10);
                                            l46Var4.p0(objR7);
                                        }
                                        dd2 dd2VarB2 = af1.b0(-1212496919, new w35(e89Var11, 2), l46Var4);
                                        l46 l46Var5 = l46Var4;
                                        cgg.m((x16) objR7, j09VarA2, z21, null, null, null, dd2VarB2, l46Var5, 805306368, 504);
                                        l46Var4 = l46Var5;
                                        if (((Boolean) e89Var11.getValue()).booleanValue()) {
                                            l46Var4.f0(1901380860);
                                            Object objR8 = l46Var4.R();
                                            if (objR8 == i8cVar) {
                                                objR8 = new n31();
                                                l46Var4.p0(objR8);
                                            }
                                            k31 k31Var = (k31) objR8;
                                            Object objR9 = l46Var4.R();
                                            if (objR9 == i8cVar) {
                                                objR9 = q1c.f(Boolean.FALSE);
                                                l46Var4.p0(objR9);
                                            }
                                            e89 e89Var12 = (e89) objR9;
                                            Boolean bool = (Boolean) e89Var12.getValue();
                                            bool.getClass();
                                            boolean zI = l46Var4.i(k31Var);
                                            Object objR10 = l46Var4.R();
                                            if (zI || objR10 == i8cVar) {
                                                objR10 = new ahf(k31Var, e89Var12, null);
                                                l46Var4.p0(objR10);
                                            }
                                            af1.o((l26) objR10, l46Var4, bool);
                                            j09 j09VarP = ym8.p(g09Var, k31Var);
                                            Object objR11 = l46Var4.R();
                                            if (objR11 == i8cVar) {
                                                objR11 = new w77(e89Var12, 20);
                                                l46Var4.p0(objR11);
                                            }
                                            j09 j09VarW = nk8.w(j09VarP, (a26) objR11);
                                            xn8 xn8VarC2 = s21.c(ndb.b, false);
                                            int iHashCode4 = Long.hashCode(l46Var4.T);
                                            u8a u8aVarM4 = l46Var4.m();
                                            j09 j09VarJ4 = m93.J(l46Var4, j09VarW);
                                            lf2.q.getClass();
                                            l46Var4.j0();
                                            if (l46Var4.S) {
                                                l46Var4.l(ov7Var);
                                            } else {
                                                l46Var4.s0();
                                            }
                                            dec.l(he2Var7, l46Var4, xn8VarC2);
                                            dec.l(he2Var, l46Var4, u8aVarM4);
                                            ib8.s(iHashCode4, l46Var4, he2Var3, l46Var4);
                                            dec.l(he2Var2, l46Var4, j09VarJ4);
                                            boolean zEquals = n07Var3.equals(bwaVar3);
                                            boolean zG5 = l46Var4.g(a26Var3) | l46Var4.i(n07Var3);
                                            Object objR12 = l46Var4.R();
                                            if (zG5 || objR12 == i8cVar) {
                                                objR12 = new j20(a26Var3, n07Var3);
                                                l46Var4.p0(objR12);
                                            }
                                            eec.k(n07Var3, zEquals, z16, i16, z21, (x16) objR12, l46Var4, 8);
                                            l46Var4.r(true);
                                            z17 = false;
                                            l46Var4.r(false);
                                        } else {
                                            z17 = false;
                                            l46Var4.f0(1902222696);
                                            l46Var4.r(false);
                                        }
                                        l46Var4.r(z17);
                                    } else {
                                        l46Var4.f0(1902234600);
                                        l46Var4.r(false);
                                    }
                                    l46Var4.r(true);
                                    l46Var4.r(true);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2), l46Var2, 806879664, 441);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 390, 2);
            if (((Boolean) e89Var3.getValue()).booleanValue()) {
                l46Var.f0(-1718143273);
                String strQ = afc.q(R.string.confirm_to_purchase, l46Var);
                String strQ2 = afc.q(R.string.disagree, l46Var);
                String strQ3 = afc.q(R.string.continute_to_purchase, l46Var);
                dd2 dd2Var = if9.h;
                boolean zG2 = l46Var.g(e89Var3);
                Object objR6 = l46Var.R();
                if (zG2 || objR6 == obj) {
                    objR6 = new xfc(e89Var3, 12);
                    l46Var.p0(objR6);
                }
                x16 x16Var8 = (x16) objR6;
                boolean zG3 = l46Var.g(e89Var3) | l46Var.g(e89Var2) | l46Var.h(z7) | ((i12 & 14) == 4);
                Object objR7 = l46Var.R();
                if (zG3 || objR7 == obj) {
                    objR7 = new f20(z7, x16Var2, e89Var3, e89Var2, 1);
                    l46Var.p0(objR7);
                }
                kj0.F(strQ, dd2Var, strQ3, strQ2, false, false, null, null, x16Var8, (x16) objR7, l46Var, 48, 240);
                l46Var.r(false);
            } else {
                l46Var.f0(-1717728958);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: xgf
                @Override // defpackage.l26
                public final Object z(Object obj5, Object obj6) {
                    ((Integer) obj6).intValue();
                    int iP = k99.P(i3 | 1);
                    int iP2 = k99.P(i4);
                    eec.j(list, bwaVar, z, z2, z3, z4, i, i2, a26Var, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, x16Var6, x16Var7, (l46) obj5, iP, iP2);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0148  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:75:0x0161  */
    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0171  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    public static final void k(final bwa bwaVar, final boolean z, final boolean z2, final int i, final boolean z3, x16 x16Var, l46 l46Var, final int i2) {
        x16 x16Var2;
        long jA;
        int i3;
        String strI;
        String str;
        z6e z6eVar;
        Double dS;
        Double dValueOf;
        String strR;
        boolean z4;
        boolean z5;
        mue mueVarO;
        j09 j09VarH;
        float f;
        String str2;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        ov7 ov7Var;
        g09 g09Var;
        final long j;
        boolean z6;
        int i4;
        float f2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-2043007654);
        int i5 = i2 | (l46Var2.i(bwaVar) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.e(i) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.h(z3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(x16Var) ? 131072 : 65536);
        if (l46Var2.W(i5 & 1, (i5 & 74899) != 74898)) {
            boolean zF = k8b.f((e8b) l46Var2.k(l8b.a));
            if (zF) {
                l46Var2.f0(-530293272);
                jA = l8b.b(l46Var2);
            } else {
                l46Var2.f0(-530292409);
                jA = l8b.a(l46Var2);
            }
            l46Var2.r(false);
            y6c y6cVarB = a7c.b(zF ? 8.0f : 20.0f);
            boolean z7 = bwaVar.getType() == u7e.b;
            cwa type = bwaVar.getType();
            u7e u7eVar = u7e.c;
            boolean z8 = type == u7eVar;
            if (z7) {
                i3 = R.string.upgrade_paywall_monthly_title;
            } else {
                i3 = z8 ? R.string.upgrade_paywall_yearly_title : R.string.upgrade_paywall_five_readings_title;
            }
            final String strQ = afc.q(i3, l46Var2);
            if (z7) {
                strI = tec.i(l46Var2, -530278570, R.string.upgrade_paywall_monthly_description, l46Var2, false);
            } else if (z8) {
                l46Var2.f0(-530276155);
                strI = afc.r(R.string.upgrade_paywall_yearly_description, new Object[]{Integer.valueOf(i)}, l46Var2);
                l46Var2.r(false);
            } else {
                strI = tec.i(l46Var2, -530273348, R.string.upgrade_paywall_five_readings_description, l46Var2, false);
            }
            final String str3 = strI;
            int i6 = i5 >> 3;
            final String strT = t(bwaVar, z2, l46Var2);
            boolean z9 = bwaVar instanceof z6e;
            if (z9) {
                z6e z6eVar2 = (z6e) bwaVar;
                if (p4a.a(z6eVar2, z2)) {
                    l46Var2.f0(102754046);
                    String strB = p4a.b(z6eVar2);
                    if (strB == null) {
                        l46Var2.f0(102754045);
                        l46Var2.r(false);
                        strR = null;
                    } else {
                        l46Var2.f0(102754046);
                        strR = afc.r(R.string.upgrade_paywall_monthly_renewal_price, new Object[]{strB}, l46Var2);
                        l46Var2.r(false);
                    }
                    l46Var2.r(false);
                } else {
                    if (z9) {
                        z6eVar = (z6e) bwaVar;
                        if (z6eVar.h() == u7eVar) {
                            l46Var2.f0(102953469);
                            dS = b5e.s(z6eVar.g());
                            if (dS != null) {
                                dValueOf = Double.valueOf(dS.doubleValue() / 12.0d);
                            } else {
                                dValueOf = null;
                            }
                            if (dValueOf == null) {
                                l46Var2.f0(102953468);
                                l46Var2.r(false);
                                z4 = false;
                                strR = null;
                            } else {
                                l46Var2.f0(102953469);
                                strR = afc.r(R.string.upgrade_paywall_yearly_monthly_price, new Object[]{tec.l(z6eVar.e(), String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dValueOf.doubleValue())}, 1)))}, l46Var2);
                                z4 = false;
                                l46Var2.r(false);
                            }
                            l46Var2.r(z4);
                        }
                    }
                    l46Var2.f0(103103849);
                    l46Var2.r(false);
                    str = null;
                }
                str = strR;
            } else {
                if (z9) {
                    z6eVar = (z6e) bwaVar;
                    if (z6eVar.h() == u7eVar) {
                        l46Var2.f0(102953469);
                        dS = b5e.s(z6eVar.g());
                        if (dS != null) {
                            dValueOf = Double.valueOf(dS.doubleValue() / 12.0d);
                        } else {
                            dValueOf = null;
                        }
                        if (dValueOf == null) {
                            l46Var2.f0(102953468);
                            l46Var2.r(false);
                            z4 = false;
                            strR = null;
                        } else {
                            l46Var2.f0(102953469);
                            strR = afc.r(R.string.upgrade_paywall_yearly_monthly_price, new Object[]{tec.l(z6eVar.e(), String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dValueOf.doubleValue())}, 1)))}, l46Var2);
                            z4 = false;
                            l46Var2.r(false);
                        }
                        l46Var2.r(z4);
                        str = strR;
                    }
                }
                l46Var2.f0(103103849);
                l46Var2.r(false);
                str = null;
            }
            mue mueVar = pue.a;
            final mue mueVarA = mue.a(pue.o(l46Var2), 0L, 0L, null, u(l46Var2), 0L, null, 0, 0L, null, null, 16777183);
            if (zF) {
                l46Var2.f0(-530263556);
                mueVarO = pue.p(l46Var2);
                z5 = false;
            } else {
                z5 = false;
                l46Var2.f0(-530262948);
                mueVarO = pue.o(l46Var2);
            }
            l46Var2.r(z5);
            final mue mueVarA2 = mue.a(mueVarO, 0L, 0L, null, u(l46Var2), 0L, null, 0, 0L, null, null, 16777183);
            g09 g09Var2 = g09.a;
            j09 j09VarC = b.c(g09Var2, 1.0f);
            if (z) {
                j09VarH = rrb.h(g09Var2, y6cVarB, new n4d(12.0f, zF ? y72.b(jA, 0.25f) : abg.c(1081371895), 0.0f, 0L, 60));
            } else {
                j09VarH = g09Var2;
            }
            j09 j09VarE = oa7.E(j09VarC.D(j09VarH), y6cVarB);
            y72 y72Var = new y72(l8b.h(l46Var2));
            if (z) {
                f = zF ? 0.05f : 0.1f;
            } else {
                f = 0.0f;
            }
            j09 j09VarW = n16.W(db6.w(tm7.n(j09VarE, gec.N(0.0f, 14, t72.I(y72Var, new y72(abg.r(y72.b(jA, f), l8b.h(l46Var2))))), null, 6), 1.0f, z ? jA : y72.j, y6cVarB), z, z3, new i5c(3), x16Var, 8);
            if (z7) {
                str2 = "month";
            } else {
                str2 = z8 ? "year" : "five";
            }
            j09 j09VarA = androidx.compose.ui.platform.b.a(j09VarW, "upgrade-paywall-plan-".concat(str2));
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z10 = l46Var2.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z10) {
                l46Var2.l(ov7Var2);
            } else {
                l46Var2.s0();
            }
            he2 he2Var4 = hj6.z;
            dec.l(he2Var4, l46Var2, c92VarA);
            he2 he2Var5 = hj6.y;
            dec.l(he2Var5, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var6 = hj6.X;
            dec.l(he2Var6, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var7 = hj6.x;
            dec.l(he2Var7, l46Var2, j09VarJ);
            if (z8) {
                l46Var2.f0(1911070143);
                j09 j09VarF = b.f(20.0f, 0.0f, b.c(g09Var2, 1.0f), 2);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var2);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, xn8VarC);
                dec.l(he2Var5, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var6, l46Var2);
                dec.l(he2Var7, l46Var2, j09VarJ2);
                long j2 = jA;
                f2 = 0.0f;
                ov7Var = ov7Var2;
                he2Var2 = he2Var6;
                he2Var = he2Var7;
                g09Var = g09Var2;
                he2Var3 = he2Var4;
                i4 = 0;
                z6 = true;
                nte.b(afc.q(R.string.upgrade_paywall_recommended, l46Var2), ynb.a0(tm7.o(d31.a.a(g09Var2, ndb.d), y72.b(jA, 0.16f), a7c.d(0.0f, 0.0f, 20.0f, 7)), 16.0f, 2.0f), j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.j(l46Var2), l46Var, 0, 0, 131064);
                l46Var2 = l46Var;
                j = j2;
                l46Var2.r(true);
                l46Var2.r(false);
            } else {
                he2Var = he2Var7;
                he2Var2 = he2Var6;
                he2Var3 = he2Var4;
                ov7Var = ov7Var2;
                g09Var = g09Var2;
                j = jA;
                z6 = true;
                i4 = 0;
                f2 = 0.0f;
                l46Var2.f0(1911499710);
                l46Var2.r(false);
            }
            g09 g09Var3 = g09Var;
            j09 j09VarC0 = ynb.c0(g09Var3, 20.0f, z8 ? f2 : 20.0f, 20.0f, 20.0f);
            t7c t7cVarA = s7c.a(new uc0(12.0f, z6, new qc0(i4)), ndb.z, l46Var2, 54);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarC0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var3, l46Var2, t7cVarA);
            dec.l(he2Var5, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var2, l46Var2);
            dec.l(he2Var, l46Var2, j09VarJ3);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new k8f(11);
                l46Var2.p0(objR);
            }
            j09 j09VarA2 = vwc.a(g09Var3, (a26) objR);
            ?? r12 = (i5 & 458752) == 131072 ? z6 : i4;
            Object objR2 = l46Var2.R();
            if (r12 != 0 || objR2 == i8cVar) {
                x16Var2 = x16Var;
                objR2 = new lnc(9, x16Var2);
                l46Var2.p0(objR2);
            } else {
                x16Var2 = x16Var;
            }
            qk2.i(z, j09VarA2, z3, 20.0f, null, (a26) objR2, l46Var2, (i6 & 14) | 3072 | ((i5 >> 6) & 896), 16);
            final String str4 = str;
            nk8.d(new jw7(1.0f, z6), null, af1.b0(1827207594, new n26() { // from class: tgf
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    e31 e31Var = (e31) obj;
                    l46 l46Var3 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var3.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = e31Var.d() * 0.45f;
                        g09 g09Var4 = g09.a;
                        j09 j09VarC2 = b.c(g09Var4, 1.0f);
                        t7c t7cVarA2 = s7c.a(new uc0(12.0f, true, new qc0(0)), ndb.z, l46Var3, 54);
                        int iHashCode4 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM4 = l46Var3.m();
                        j09 j09VarJ4 = m93.J(l46Var3, j09VarC2);
                        lf2.q.getClass();
                        l46Var3.j0();
                        boolean z11 = l46Var3.S;
                        ov7 ov7Var3 = LayoutNode.h1;
                        if (z11) {
                            l46Var3.l(ov7Var3);
                        } else {
                            l46Var3.s0();
                        }
                        he2 he2Var8 = hj6.z;
                        dec.l(he2Var8, l46Var3, t7cVarA2);
                        he2 he2Var9 = hj6.y;
                        dec.l(he2Var9, l46Var3, u8aVarM4);
                        Integer numValueOf2 = Integer.valueOf(iHashCode4);
                        he2 he2Var10 = hj6.X;
                        dec.l(he2Var10, l46Var3, numValueOf2);
                        dec.k(l46Var3);
                        he2 he2Var11 = hj6.x;
                        dec.l(he2Var11, l46Var3, j09VarJ4);
                        jw7 jw7Var = new jw7(1.0f, true);
                        c92 c92VarA2 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Y, l46Var3, 6);
                        int iHashCode5 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM5 = l46Var3.m();
                        j09 j09VarJ5 = m93.J(l46Var3, jw7Var);
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(ov7Var3);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(he2Var8, l46Var3, c92VarA2);
                        dec.l(he2Var9, l46Var3, u8aVarM5);
                        ib8.s(iHashCode5, l46Var3, he2Var10, l46Var3);
                        dec.l(he2Var11, l46Var3, j09VarJ5);
                        pr4 pr4Var = l8b.a;
                        nte.b(strQ, null, ((e8b) l46Var3.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var3, 0, 0, 131066);
                        mue mueVar2 = pue.a;
                        nte.b(str3, null, ((e8b) l46Var3.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var3), l46Var3, 0, 0, 131066);
                        l46Var3.r(true);
                        j09 j09VarQ = b.q(0.0f, fD, g09Var4, 1);
                        c92 c92VarA3 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.E0, l46Var3, 54);
                        int iHashCode6 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM6 = l46Var3.m();
                        j09 j09VarJ6 = m93.J(l46Var3, j09VarQ);
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(ov7Var3);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(he2Var8, l46Var3, c92VarA3);
                        dec.l(he2Var9, l46Var3, u8aVarM6);
                        ib8.s(iHashCode6, l46Var3, he2Var10, l46Var3);
                        dec.l(he2Var11, l46Var3, j09VarJ6);
                        nte.b(strT, null, j, 0L, null, null, 0L, null, new jme(6), 0L, 0, false, 0, 0, null, mueVarA2, l46Var3, 0, 0, 130042);
                        l46 l46Var4 = l46Var3;
                        String str5 = str4;
                        if (str5 == null) {
                            l46Var4.f0(32359969);
                            l46Var4.r(false);
                        } else {
                            l46Var4.f0(32359970);
                            nte.b(str5, null, ((e8b) l46Var4.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(6), 0L, 0, false, 0, 0, null, pue.g(l46Var4), l46Var4, 0, 0, 130042);
                            l46Var4 = l46Var4;
                            l46Var4.r(false);
                        }
                        l46Var4.r(true);
                        l46Var4.r(true);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var2), l46Var2, 3072, 6);
            l46Var2.r(z6);
            l46Var2.r(z6);
        } else {
            x16Var2 = x16Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final x16 x16Var3 = x16Var2;
            ojbVarV.d = new l26(z, z2, i, z3, x16Var3, i2) { // from class: ugf
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ int d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ x16 f;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(9);
                    eec.k(this.a, this.b, this.c, this.d, this.e, this.f, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void l(bwa bwaVar, boolean z, int i, l46 l46Var, int i2) {
        String strI;
        boolean z2;
        boolean z3;
        String strR;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1678239336);
        int i3 = i2 | (l46Var2.g(bwaVar) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.e(i) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            boolean z4 = bwaVar instanceof z6e;
            String strI2 = null;
            if (z4) {
                l46Var2.f0(2119706692);
                strI = afc.q(i == 1 ? R.string.upgrade_paywall_subscription_remaining_one : R.string.upgrade_paywall_subscription_remaining_zero, l46Var2);
                l46Var2.r(false);
            } else if ((bwaVar instanceof n07) && i == 1) {
                strI = tec.i(l46Var2, 2119713980, R.string.upgrade_paywall_five_readings_remaining_one, l46Var2, false);
            } else {
                l46Var2.f0(1286702309);
                l46Var2.r(false);
                strI = null;
            }
            if (strI == null) {
                l46Var2.f0(1286727667);
                l46Var2.r(false);
                z2 = z4;
                z3 = false;
            } else {
                l46Var2.f0(1286727668);
                mue mueVar = pue.a;
                z2 = z4;
                z3 = false;
                nte.b(strI, null, ((e8b) l46Var2.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.f(l46Var2), l46Var, 0, 0, 130042);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            if (z2) {
                l46Var2.f0(1286909018);
                z6e z6eVar = (z6e) bwaVar;
                z6e z6eVar2 = (z6e) (p4a.a(z6eVar, z) ? bwaVar : null);
                String strB = z6eVar2 != null ? p4a.b(z6eVar2) : null;
                if (strB != null) {
                    l46Var2.f0(2119727609);
                    strR = afc.r(R.string.paywall_cta_first_month_auto_renew, new Object[]{z6eVar.y(), strB}, l46Var2);
                    l46Var2.r(z3);
                } else {
                    l46Var2.f0(2119731106);
                    strR = t(bwaVar, z, l46Var2) + " " + afc.q(R.string.upgrade_paywall_renewal_description, l46Var2);
                    l46Var2.r(z3);
                }
                strI2 = strR;
                l46Var2.r(z3);
            } else if (bwaVar instanceof n07) {
                strI2 = tec.i(l46Var2, 2119735447, R.string.upgrade_paywall_five_readings_validity, l46Var2, z3);
            } else {
                l46Var2.f0(1287362981);
                l46Var2.r(z3);
            }
            if (strI2 == null) {
                l46Var2.f0(1287386355);
                l46Var2.r(z3);
            } else {
                l46Var2.f0(1287386356);
                mue mueVar2 = pue.a;
                l46 l46Var3 = l46Var2;
                nte.b(strI2, null, ((e8b) l46Var2.k(l8b.a)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var3, 0, 0, 130042);
                l46Var2 = l46Var3;
                l46Var2.r(z3);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iv1(bwaVar, z, i, i2);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void m(pxf pxfVar, j09 j09Var, t2f t2fVar, yi yiVar, bn2 bn2Var, a26 a26Var, l46 l46Var, int i) {
        int i2;
        u21 u21Var;
        e89 e89Var;
        int i3;
        l46 l46Var2;
        l46Var.h0(2052669900);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(pxfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(t2fVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? l46Var.g(null) : l46Var.i(null) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.g(yiVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.g(bn2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.i(a26Var) ? 1048576 : 524288;
        }
        int i4 = i2;
        if ((599187 & i4) == 599186 && l46Var.F()) {
            l46Var.Z();
            l46Var2 = l46Var;
        } else {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            j09 j09VarD = oa7.F(j09Var).D(b.c);
            l46Var.g0(733328855);
            lx0 lx0Var = ndb.b;
            w79 w79Var = s21.a;
            boolean zEquals = lx0Var.equals(lx0Var);
            Object obj = sf2.a;
            if (zEquals) {
                l46Var.f0(244332343);
                l46Var.r(false);
                u21Var = s21.c;
            } else {
                l46Var.f0(244380021);
                boolean zG = l46Var.g(lx0Var) | l46Var.h(false);
                Object objR = l46Var.R();
                if (zG || objR == obj) {
                    objR = new u21(lx0Var, false);
                    l46Var.p0(objR);
                }
                u21Var = (u21) objR;
                l46Var.r(false);
            }
            l46Var.g0(-1323940314);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            lf2.q.getClass();
            dd2 dd2Var = new dd2(new kt3(1, j09VarD), true, -511438721);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, u21Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dd2Var.m(new nod(l46Var), l46Var, 0);
            l46Var.g0(2058660585);
            l46Var.d0(-782850610, pxfVar);
            int layoutDirection = ((Configuration) l46Var.k(uq.a)).getLayoutDirection();
            int i5 = pxfVar.a;
            wy6 wy6VarB = pxfVar.c;
            int i6 = pxfVar.b;
            boolean zE = l46Var.e(wy6VarB == null ? -1 : wy6VarB.ordinal());
            Object objR2 = l46Var.R();
            if (zE || objR2 == obj) {
                if (wy6VarB == null) {
                    wy6VarB = ndc.b();
                }
                l46Var.p0(wy6VarB);
                objR2 = wy6VarB;
            }
            wy6 wy6Var = (wy6) objR2;
            boolean zE2 = l46Var.e(wy6Var.ordinal());
            Object objR3 = l46Var.R();
            if (zE2 || objR3 == obj) {
                objR3 = q1c.f(Boolean.valueOf(wy6Var == wy6.EMBEDDED));
                l46Var.p0(objR3);
            }
            e89 e89Var2 = (e89) objR3;
            boolean zE3 = ((i4 & 458752) == 131072) | l46Var.e(i5) | l46Var.e(i6) | l46Var.g(e89Var2) | l46Var.i(t2fVar) | l46Var.e(layoutDirection) | ((57344 & i4) == 16384) | ((i4 & 7168) == 2048 || ((i4 & 4096) != 0 && l46Var.i(null)));
            Object objR4 = l46Var.R();
            if (zE3 || objR4 == obj) {
                e89Var = e89Var2;
                i3 = i5;
                Object kxfVar = new kxf(i3, i6, t2fVar, layoutDirection, bn2Var, yiVar, e89Var);
                l46Var.p0(kxfVar);
                objR4 = kxfVar;
            } else {
                e89Var = e89Var2;
                i3 = i5;
            }
            j09 j09VarZ = jgb.Z(g09.a, (n26) objR4);
            boolean zI = l46Var.i(pxfVar) | ((3670016 & i4) == 1048576 ? true : 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x025d: ARITH (r2v32 'zI' boolean) = (wrap boolean:0x0258: ARITH (wrap boolean:0x024a: INVOKE (r26v0 'l46Var' l46), (r20v0 'pxfVar' pxf) VIRTUAL call: l46.i(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:587)) | (wrap boolean:?: TERNARY null = ((wrap int:0x0250: ARITH (3670016 int) & (r13v2 'i4' int) A[WRAPPED] (LINE:593)) == (1048576 int)) ? true : (r18v1 boolean)) A[DONT_WRAP, WRAPPED] (LINE:601)) | (wrap boolean:0x0259: INVOKE (r26v0 'l46Var' l46), (r9v5 'e89Var' e89) VIRTUAL call: l46.g(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:602)) A[DECLARE_VAR] (LINE:606) in method: eec.m(pxf, j09, t2f, yi, bn2, a26, l46, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v1 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 679
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eec.m(pxf, j09, t2f, yi, bn2, a26, l46, int):void");
        }

        public static String n(File file) {
            if (!file.getName().endsWith(".apk")) {
                qc0.j("Non-apk found in splits directory.");
                return null;
            }
            String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
            if (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) {
                return "";
            }
            return strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
        }

        public static final pyc o(String str, nyc[] nycVarArr, a26 a26Var) {
            if (v4e.Q(str)) {
                qc0.j("Blank serial names are prohibited");
                return null;
            }
            q22 q22Var = new q22(str);
            a26Var.d(q22Var);
            return new pyc(str, g5e.c, q22Var.c.size(), qd0.G0(nycVarArr), q22Var);
        }

        public static final pyc p(String str, iec iecVar, nyc[] nycVarArr, a26 a26Var) {
            if (v4e.Q(str)) {
                qc0.j("Blank serial names are prohibited");
                return null;
            }
            if (iecVar.equals(g5e.c)) {
                qc0.j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                return null;
            }
            q22 q22Var = new q22(str);
            a26Var.d(q22Var);
            return new pyc(str, iecVar, q22Var.c.size(), qd0.G0(nycVarArr), q22Var);
        }

        public static pyc q(String str, iec iecVar, nyc[] nycVarArr) {
            if (v4e.Q(str)) {
                qc0.j("Blank serial names are prohibited");
                return null;
            }
            if (iecVar.equals(g5e.c)) {
                qc0.j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                return null;
            }
            q22 q22Var = new q22(str);
            return new pyc(str, iecVar, q22Var.c.size(), qd0.G0(nycVarArr), q22Var);
        }

        public static final boolean r(int i, KeyEvent keyEvent) {
            return ((int) (nk8.q(keyEvent) >> 32)) == i;
        }

        public static final j09 s(j09 j09Var, float f, float f2) {
            return (f == 1.0f && f2 == 1.0f) ? j09Var : bzd.y(j09Var, f, f2, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1048572);
        }

        public static final String t(bwa bwaVar, boolean z, l46 l46Var) {
            bwaVar.getClass();
            if (bwaVar instanceof z6e) {
                z6e z6eVar = (z6e) bwaVar;
                if (p4a.a(z6eVar, z)) {
                    l46Var.f0(-1802110356);
                    String strR = afc.r(R.string.upgrade_paywall_first_month_price, new Object[]{z6eVar.y()}, l46Var);
                    l46Var.r(false);
                    return strR;
                }
            }
            if (bwaVar.getType() == u7e.b) {
                l46Var.f0(-1802106232);
                String strR2 = afc.r(R.string.upgrade_paywall_monthly_price, new Object[]{bwaVar.y()}, l46Var);
                l46Var.r(false);
                return strR2;
            }
            if (bwaVar.getType() != u7e.c) {
                l46Var.f0(-1802099256);
                l46Var.r(false);
                return bwaVar.y();
            }
            l46Var.f0(-1802102265);
            String strR3 = afc.r(R.string.upgrade_paywall_yearly_price, new Object[]{bwaVar.y()}, l46Var);
            l46Var.r(false);
            return strR3;
        }

        public static final yp5 u(l46 l46Var) {
            boolean zContains;
            if (k8b.f((e8b) l46Var.k(l8b.a))) {
                l46Var.f0(-1191478463);
                l46Var.r(false);
                zContains = false;
            } else {
                l46Var.f0(1069943828);
                zContains = qd0.I0(new String[]{"zh", "ja", "ko"}).contains(((Configuration) l46Var.k(uq.a)).getLocales().get(0).getLanguage());
                l46Var.r(false);
            }
            if (zContains) {
                l46Var.f0(-1191406600);
                l46Var.r(false);
                return cr5.c;
            }
            l46Var.f0(-1191369400);
            yp5 yp5Var = ((y8b) l46Var.k(x8b.a)).c;
            l46Var.r(false);
            return yp5Var;
        }

        public static String v(byte[] bArr) {
            StringBuilder sb = new StringBuilder(bArr.length);
            for (byte b : bArr) {
                if (b == 34) {
                    sb.append("\\\"");
                } else if (b == 39) {
                    sb.append("\\'");
                } else if (b != 92) {
                    switch (b) {
                        case 7:
                            sb.append("\\a");
                            break;
                        case 8:
                            sb.append("\\b");
                            break;
                        case 9:
                            sb.append("\\t");
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            sb.append("\\n");
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            sb.append("\\v");
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            sb.append("\\f");
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            sb.append("\\r");
                            break;
                        default:
                            if (b < 32 || b > 126) {
                                sb.append('\\');
                                sb.append((char) (((b >>> 6) & 3) + 48));
                                sb.append((char) (((b >>> 3) & 7) + 48));
                                sb.append((char) ((b & 7) + 48));
                            } else {
                                sb.append((char) b);
                            }
                            break;
                    }
                } else {
                    sb.append("\\\\");
                }
            }
            return sb.toString();
        }
    }
