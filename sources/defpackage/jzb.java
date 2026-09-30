package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jzb {
    public static Boolean a;

    public static final void a(boolean z, boolean z2, x16 x16Var, x16 x16Var2, x16 x16Var3, j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2;
        boolean z3;
        boolean z4;
        l46Var.h0(-637981456);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.h(z2) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(j09Var) ? 131072 : 65536);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            j09 j09VarC = b.c(j09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i3)), ndb.Z, l46Var, 54);
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
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            if (z) {
                l46Var.f0(-1531013601);
                d((i2 >> 9) & 112, x16Var3, l46Var, null, afc.q(R.string.seasonal_physical_view_reading, l46Var));
                l46Var.r(false);
                l46Var2 = l46Var;
                z4 = true;
            } else {
                l46Var.f0(-1530839567);
                d((i2 >> 3) & 112, x16Var, l46Var, null, afc.q(R.string.seasonal_physical_scan, l46Var));
                e((i2 >> 6) & 112, x16Var2, l46Var, null, afc.q(R.string.seasonal_physical_pick_deck, l46Var));
                if (z2) {
                    l46Var.f0(-1530525754);
                    String strQ = afc.q(R.string.seasonal_physical_validation, l46Var);
                    mue mueVar = pue.a;
                    z3 = false;
                    nte.b(strQ, null, ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    l46Var2 = l46Var;
                    z3 = false;
                    l46Var2.f0(-1530312164);
                    l46Var2.r(false);
                }
                l46Var2.r(z3);
                z4 = true;
            }
            l46Var2.r(z4);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p91(z, z2, x16Var, x16Var2, x16Var3, j09Var, i);
        }
    }

    public static final void b(mic micVar, boolean z, List list, x16 x16Var, x16 x16Var2, a26 a26Var, x16 x16Var3, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        micVar.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        a26Var.getClass();
        x16Var3.getClass();
        l46Var2.h0(852736634);
        int i2 = i | (l46Var2.e(micVar.ordinal()) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.g(list) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(a26Var) ? 131072 : 65536) | (l46Var2.i(x16Var3) ? 1048576 : 524288);
        int i3 = 1;
        if (l46Var2.W(i2 & 1, (599187 & i2) != 599186)) {
            boolean z2 = (i2 & 14) == 4;
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (z2 || objR == i8cVar) {
                objR = new dkc(micVar, i3);
                l46Var2.p0(objR);
            }
            x16 x16Var4 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var2);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            jnc jncVar = (jnc) z5c.G(job.a.b(jnc.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), x16Var4);
            Context context = (Context) l46Var2.k(uq.b);
            if (z) {
                l46Var2.f0(-854079176);
                Object objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    objR2 = new pdc(29);
                    l46Var2.p0(objR2);
                }
                dec.b("page_view", (a26) objR2, l46Var2, 390);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-853940792);
                l46Var2.r(false);
            }
            boolean zI = ((i2 & 896) == 256) | l46Var2.i(jncVar) | ((i2 & 7168) == 2048);
            Object objR3 = l46Var2.R();
            if (zI || objR3 == i8cVar) {
                objR3 = new gnc(list, jncVar, x16Var, null);
                l46Var2.p0(objR3);
            }
            af1.o((l26) objR3, l46Var2, list);
            af afVar = new af(3);
            boolean zI2 = ((i2 & 57344) == 16384) | l46Var2.i(context);
            Object objR4 = l46Var2.R();
            int i4 = 14;
            if (zI2 || objR4 == i8cVar) {
                objR4 = new h6b(i4, x16Var2, context);
                l46Var2.p0(objR4);
            }
            yk8 yk8VarP = qn4.P(afVar, (a26) objR4, l46Var2);
            Object objR5 = l46Var2.R();
            if (objR5 == i8cVar) {
                objR5 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR5);
            }
            e89 e89Var = (e89) objR5;
            Object objR6 = l46Var2.R();
            if (objR6 == i8cVar) {
                objR6 = kv2.f(-1, l46Var2);
            }
            s69 s69Var = (s69) objR6;
            ted tedVarF = zz8.f(6, 2, null, l46Var2);
            Object objR7 = l46Var2.R();
            if (objR7 == i8cVar) {
                objR7 = af1.E(l46Var2);
                l46Var2.p0(objR7);
            }
            aw2 aw2Var = (aw2) objR7;
            g21.o(null, af1.b0(1316982942, new g30(x16Var3, jncVar, z, yk8VarP, a26Var, s69Var, e89Var), l46Var2), l46Var2, 48, 1);
            if (((Boolean) e89Var.getValue()).booleanValue()) {
                l46Var2.f0(-848881344);
                sz9 sz9Var = (sz9) s69Var;
                boolean z3 = sz9Var.j() >= 0;
                ArrayList arrayListT0 = s72.t0(jncVar.e);
                int i5 = 10;
                ArrayList arrayList = new ArrayList(t72.u(arrayListT0, 10));
                Iterator it = arrayListT0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TarotCardChoice) it.next()).getCard());
                }
                Set setO1 = s72.o1(arrayList);
                ArcanaGroup arcanaGroup = z3 ? (ArcanaGroup) jncVar.d.get(sz9Var.j()) : null;
                Object objR8 = l46Var2.R();
                if (objR8 == i8cVar) {
                    objR8 = new bjc();
                    l46Var2.p0(objR8);
                }
                bjc bjcVar = (bjc) objR8;
                boolean zI3 = l46Var2.i(bjcVar);
                Object objR9 = l46Var2.R();
                if (zI3 || objR9 == i8cVar) {
                    objR9 = new ckb(i4, bjcVar);
                    l46Var2.p0(objR9);
                }
                af1.g(wef.a, (a26) objR9, l46Var2);
                j09 j09VarW = mh3.W(g09.a);
                long j = ((e8b) l46Var2.k(l8b.a)).a;
                y6c y6cVarD = a7c.d(16.0f, 16.0f, 0.0f, 12);
                Object objR10 = l46Var2.R();
                if (objR10 == i8cVar) {
                    objR10 = new xfc(e89Var, 4);
                    l46Var2.p0(objR10);
                }
                zz8.a((x16) objR10, j09VarW, tedVarF, 0.0f, false, y6cVarD, j, 0L, 0L, null, new qdc(i5), null, af1.b0(-2090128214, new bda(bjcVar, z3, jncVar, setO1, arcanaGroup, aw2Var, tedVarF, e89Var), l46Var2), l46Var, 6, 3072, 6040);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-846228984);
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dj3(micVar, z, list, x16Var, x16Var2, a26Var, x16Var3, i);
        }
    }

    public static final void c(int i, l46 l46Var, boolean z) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-925541794);
        int i2 = i | (l46Var.h(z) ? 4 : 2);
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strQ = afc.q(R.string.seasonal_physical_title, l46Var2);
            mue mueVar = pue.a;
            mue mueVarN = pue.n(l46Var2);
            pr4 pr4Var = l8b.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, cr5.c, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarN, l46Var, 0, 0, 129914);
            o5c.f(l46Var, b.d(g09Var, 8.0f));
            nte.b(afc.q(z ? R.string.seasonal_physical_confirm_subtitle : R.string.seasonal_physical_subtitle, l46Var), null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ci1(z, i, 9);
        }
    }

    public static final void d(int i, x16 x16Var, l46 l46Var, j09 j09Var, String str) {
        int i2;
        j09 j09Var2;
        l46Var.h0(-1116876929);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            g09 g09Var = g09.a;
            cgg.a(x16Var, b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1), false, eze.a(l46Var).a.a, bx5.c(l46Var), null, null, null, af1.b0(-1544148593, new ob0(str, 24), l46Var), l46Var, ((i3 >> 3) & 14) | 805306368, 484);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ysa(str, x16Var, j09Var2, i, 1);
        }
    }

    public static final void e(int i, x16 x16Var, l46 l46Var, j09 j09Var, String str) {
        int i2;
        j09 j09Var2;
        l46Var.h0(2028213389);
        if ((i & 6) == 0) {
            i2 = i | (l46Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
            x4d x4dVar = eze.a(l46Var).a.a;
            q11 q11VarB = x57.b(bx5.b(l46Var).a, 1.0f);
            bx9 bx9Var = v51.a;
            cgg.a(x16Var, j09VarB, false, x4dVar, v51.a(((e8b) l46Var.k(l8b.a)).g, bx5.b(l46Var).a, 0L, 0L, l46Var, 12), null, q11VarB, null, af1.b0(-557962595, new ob0(str, 25), l46Var), l46Var, ((i3 >> 3) & 14) | 805306368, 420);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ysa(str, x16Var, j09Var2, i, 2);
        }
    }

    public static final void f(final int i, final j09 j09Var, final long j, long j2, final dd2 dd2Var, final dd2 dd2Var2, final dd2 dd2Var3, l46 l46Var, final int i2) {
        int i3;
        final long j3;
        long jD;
        int i4;
        l46Var.h0(1445190381);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(dd2Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.i(dd2Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var.i(dd2Var3) ? 1048576 : 524288;
        }
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                jD = o82.d(bua.c, l46Var);
                i4 = i3 & (-7169);
            } else {
                l46Var.Z();
                i4 = i3 & (-7169);
                jD = j2;
            }
            l46Var.s();
            g(j09Var, j, jD, dd2Var, dd2Var2, dd2Var3, l46Var, 524286 & (i4 >> 3));
            j3 = jD;
        } else {
            l46Var.Z();
            j3 = j2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: ade
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jzb.f(i, j09Var, j, j3, dd2Var, dd2Var2, dd2Var3, (l46) obj, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void g(final j09 j09Var, final long j, final long j2, final dd2 dd2Var, final dd2 dd2Var2, final dd2 dd2Var3, l46 l46Var, final int i) {
        int i2;
        l46Var.h0(148841506);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.f(j2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(dd2Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(dd2Var3) ? 131072 : 65536;
        }
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            nae.a(vwc.b(j09Var, false, new fnc(15)), null, j, j2, 0.0f, 0.0f, null, af1.b0(-1815327065, new bs8(dd2Var3, dd2Var2, dd2Var), l46Var), l46Var, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: zce
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jzb.g(j09Var, j, j2, dd2Var, dd2Var2, dd2Var3, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final int h(BitmapFactory.Options options) {
        iy9 iy9Var = new iy9(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        int iIntValue = ((Number) iy9Var.a()).intValue();
        int iIntValue2 = ((Number) iy9Var.b()).intValue();
        int i = 1;
        if (iIntValue <= 400 && iIntValue2 <= 400) {
            return 1;
        }
        int iMax = Math.max(iIntValue, iIntValue2);
        while (true) {
            int i2 = i * 2;
            if (iMax / i2 < 400) {
                return i;
            }
            i = i2;
        }
    }

    public static final e89 i(wj5 wj5Var, Object obj, l46 l46Var, int i, int i2) {
        nu4 nu4Var = nu4.a;
        boolean zI = l46Var.i(nu4Var) | l46Var.i(wj5Var);
        Object objR = l46Var.R();
        if (zI || objR == sf2.a) {
            objR = new gsd(nu4Var, wj5Var, null);
            l46Var.p0(objR);
        }
        return uyb.y(obj, wj5Var, nu4Var, (l26) objR, l46Var, ((i >> 3) & 14) | (i & 896));
    }

    public static final e89 j(q0e q0eVar, l46 l46Var) {
        return i(q0eVar, q0eVar.getValue(), l46Var, 0, 0);
    }

    public static final dzb k(Throwable th) {
        th.getClass();
        return new dzb(th);
    }

    public static boolean l(Context context) {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            ct.d().a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static final void m(Bitmap bitmap) {
        bitmap.getClass();
        if (bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public static final e7f n(e7f e7fVar, h10 h10Var) {
        e7f e7fVarE;
        e7fVar.getClass();
        if (l10.a(e7fVar) == h10Var) {
            return e7fVar;
        }
        k10 k10Var = (k10) l10.b.k(l10.a[0], e7fVar);
        if (k10Var != null) {
            if (e7fVar.isEmpty()) {
                e7fVarE = e7fVar;
            } else {
                jd0 jd0Var = e7fVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : jd0Var) {
                    if (!pa7.t((k10) obj, k10Var)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == e7fVar.a.c()) {
                    e7fVarE = e7fVar;
                } else {
                    e7f.b.getClass();
                    e7fVarE = lqb.e(arrayList);
                }
            }
            if (e7fVarE != null) {
                e7fVar = e7fVarE;
            }
        }
        if (h10Var.iterator().hasNext() || !h10Var.isEmpty()) {
            k10 k10Var2 = new k10(h10Var);
            lqb lqbVar = e7f.b;
            em7 em7VarB = job.a.b(k10.class);
            lqbVar.getClass();
            String strG = em7VarB.g();
            strG.getClass();
            if (e7fVar.a.get(lqbVar.j(strG)) == null) {
                return e7fVar.isEmpty() ? new e7f(t72.H(k10Var2)) : lqb.e(s72.R0(s72.j1(e7fVar), k10Var2));
            }
        }
        return e7fVar;
    }

    public static int o(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final ybc p(x16 x16Var) {
        return new ybc(new hsd(null, x16Var, null));
    }

    public static final void q(Object obj) {
        if (obj instanceof dzb) {
            throw ((dzb) obj).exception;
        }
    }

    public static final e7f r(h10 h10Var) {
        h10Var.getClass();
        if (h10Var.isEmpty()) {
            e7f.b.getClass();
            return e7f.c;
        }
        lqb lqbVar = e7f.b;
        List listH = t72.H(new k10(h10Var));
        lqbVar.getClass();
        return lqb.e(listH);
    }

    public static String s(int i) {
        if (i == 1) {
            return "Clip";
        }
        if (i == 2) {
            return "Ellipsis";
        }
        if (i == 5) {
            return "MiddleEllipsis";
        }
        if (i == 3) {
            return "Visible";
        }
        return i == 4 ? "StartEllipsis" : "Invalid";
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
