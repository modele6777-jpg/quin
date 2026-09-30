package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.account.component.AuthOption;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.config.a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o8c {
    public static final void a(int i, int i2, l46 l46Var) {
        l46Var.h0(-1715668883);
        int i3 = (l46Var.e(i) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            String strR = afc.r(R.string.card_meaning_title, new Object[]{Integer.valueOf(i)}, l46Var);
            String strValueOf = String.valueOf(i);
            b1b b1bVar = l8b.a;
            long j = ((e8b) l46Var.k(b1bVar)).i;
            long j2 = ((e8b) l46Var.k(b1bVar)).q;
            boolean zG = l46Var.g(strR) | l46Var.g(strValueOf) | l46Var.f(j);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                i00 i00Var = new i00();
                int iO = v4e.O(strR, strValueOf, 0, false, 6);
                if (iO >= 0) {
                    i00Var.f(v4e.m0(iO, strR));
                    int iK = i00Var.k(new xtd(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        i00Var.f(strValueOf);
                        i00Var.h(iK);
                        i00Var.f(strR.substring(strValueOf.length() + iO));
                    } catch (Throwable th) {
                        i00Var.h(iK);
                        throw th;
                    }
                } else {
                    i00Var.f(strR);
                }
                objR = i00Var.l();
                l46Var.p0(objR);
            }
            jgb.r(null, (k00) objR, l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new os1(i, i2, 9);
        }
    }

    public static final void b(final String str, final AuthOption authOption, final long j, final boolean z, final x16 x16Var, final a26 a26Var, final x16 x16Var2, final x16 x16Var3, l46 l46Var, final int i) {
        l46Var.h0(1472662118);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.e(authOption.ordinal()) ? 32 : 16) | (l46Var.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(a26Var) ? 131072 : 65536) | (l46Var.i(x16Var2) ? 1048576 : 524288) | (l46Var.i(x16Var3) ? 8388608 : 4194304);
        if (l46Var.W(i2 & 1, (4793491 & i2) != 4793490)) {
            ym8.j(g21.J(g09.a), afc.q(R.string.auth_login_code_hint, l46Var), 0, false, x16Var3, af1.b0(-1838322445, new n26() { // from class: ktf
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((d92) obj).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        FillElement fillElement = b.c;
                        j09 j09VarN = mh3.N(fillElement);
                        c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarN);
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
                        bm8.c(str, authOption, z, j, x16Var, x16Var2, a26Var, fillElement, l46Var2, 12582912);
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i2 >> 3) & 3670016) | 12585984, 52);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(str, authOption, j, z, x16Var, a26Var, x16Var2, x16Var3, i) { // from class: ltf
                public final /* synthetic */ String a;
                public final /* synthetic */ AuthOption b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ x16 e;
                public final /* synthetic */ a26 f;
                public final /* synthetic */ x16 g;
                public final /* synthetic */ x16 v;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    o8c.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void c(use useVar, fo5 fo5Var, int i, x16 x16Var, j09 j09Var, l46 l46Var, int i2) {
        j09 j09Var2;
        l46Var.h0(262467236);
        int i3 = i2 | (l46Var.g(useVar) ? 4 : 2) | (l46Var.e(i) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | 24576;
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            aue aueVarA = uyb.A(0, 1, l46Var);
            String strQ = afc.q(R.string.card_meaning_hint, l46Var);
            String string = useVar.d().c.toString();
            pr4 pr4Var = x8b.a;
            mue mueVar = new mue(0L, w6c.l(19), ar5.z, null, ((y8b) l46Var.k(pr4Var)).b, w6c.i(0.006d), 0L, 3, 0, w6c.k(30.4d), null, null, 16613209);
            pr4 pr4Var2 = l8b.a;
            mue mueVarA = mue.a(mueVar, ((e8b) l46Var.k(pr4Var2)).q, 0L, null, ((y8b) l46Var.k(pr4Var)).a, 0L, null, 0, 0L, null, null, 16777182);
            long j = aue.a(aueVarA, string.length() == 0 ? strQ : string, mueVarA, 0L, 1020).c;
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            float fZ = sw3Var.Z((int) (j >> 32)) + 2.0f;
            float fZ2 = sw3Var.Z((int) (j & 4294967295L)) + 8.0f;
            g09 g09Var = g09.a;
            j09 j09VarF = b.f(56.0f, 0.0f, b.c(g09Var, 1.0f), 2);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarF);
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
            j09 j09VarU = ok8.u(b.b(0.0f, fZ2, b.p(g09Var, fZ), 1), fo5Var);
            mue mueVarA2 = mue.a(mueVarA, 0L, 0L, null, null, 0L, null, 5, 0L, null, null, 16744447);
            wo7 wo7Var = new wo7(0, i, 119);
            boolean z = (i3 & 7168) == 2048;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new dwd(x16Var);
                l46Var.p0(objR);
            }
            tv0.b(useVar, j09VarU, false, null, mueVarA2, wo7Var, (dwd) objR, null, null, null, new dtd(((e8b) l46Var.k(pr4Var2)).q), new psd(useVar, strQ, mueVarA, 1), null, l46Var, i3 & 14, 0, 22300);
            l46Var.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(useVar, fo5Var, i, x16Var, j09Var2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(ArrayList arrayList, ArrayList arrayList2, j09 j09Var, l46 l46Var, int i) {
        ArrayList arrayList3;
        j09 j09Var2;
        l46 l46Var2;
        x16 x16Var;
        x16 x16Var2;
        l46 l46Var3 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        kx0 kx0Var = ndb.y;
        l46Var3.h0(801979456);
        int i2 = i | (l46Var3.g(arrayList) ? 4 : 2) | (l46Var3.g(arrayList2) ? 32 : 16) | 384;
        int i3 = 0;
        if (l46Var3.W(i2 & 1, (i2 & 147) != 146)) {
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i3)), ndb.Y, l46Var3, 6);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var3, g09Var);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z = l46Var3.S;
            x16 x16Var3 = LayoutNode.h1;
            if (z) {
                l46Var3.l(x16Var3);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, c92VarA);
            dec.l(he2Var3, l46Var3, u8aVarM);
            ib8.s(iHashCode, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ);
            he2 he2Var5 = he2Var3;
            he2 he2Var6 = he2Var4;
            x16 x16Var4 = x16Var3;
            kx0 kx0Var2 = kx0Var;
            he2 he2Var7 = he2Var;
            he2 he2Var8 = he2Var2;
            int i4 = 0;
            int i5 = 6;
            nte.b(afc.q(R.string.annual_monthly_draw_details, l46Var3), ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, g09Var), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 48, 0, 262140);
            l46Var.f0(-2022620328);
            for (List list : s72.p1(arrayList2, 6, 6, false)) {
                j09 j09VarR = b.r(b.c(g09Var, 1.0f));
                kx0 kx0Var3 = kx0Var2;
                t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(i4)), kx0Var3, l46Var, i5);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarR);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    x16Var2 = x16Var4;
                    l46Var.l(x16Var2);
                } else {
                    x16Var2 = x16Var4;
                    l46Var.s0();
                }
                he2 he2Var9 = he2Var6;
                dec.l(he2Var9, l46Var, t7cVarA);
                he2 he2Var10 = he2Var5;
                dec.l(he2Var10, l46Var, u8aVarM2);
                he2 he2Var11 = he2Var8;
                ib8.s(iHashCode2, l46Var, he2Var11, l46Var);
                int i6 = i5;
                he2 he2Var12 = he2Var7;
                Iterator itS = kv2.s(l46Var, j09VarJ2, he2Var12, 36915159, list);
                while (itS.hasNext()) {
                    j95 j95Var = (j95) itS.next();
                    kx0 kx0Var4 = kx0Var3;
                    jw7 jw7Var = new jw7(1.0f, true);
                    qhe qheVar = j95Var.a;
                    String str = j95Var.b;
                    mue mueVar = pue.a;
                    t72.p(qheVar, jw7Var, 0.0f, str, mue.a(pue.j(l46Var), 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213), mue.a(pue.j(l46Var), 0L, w6c.l(i6), null, null, 0L, null, 0, 0L, null, null, 16777213), l46Var, 0, 4);
                    he2Var11 = he2Var11;
                    he2Var10 = he2Var10;
                    he2Var9 = he2Var9;
                    kx0Var3 = kx0Var4;
                    x16Var2 = x16Var2;
                }
                l46Var.r(false);
                l46Var.r(true);
                he2Var7 = he2Var12;
                he2Var8 = he2Var11;
                he2Var5 = he2Var10;
                he2Var6 = he2Var9;
                kx0Var2 = kx0Var3;
                x16Var4 = x16Var2;
                i5 = i6;
            }
            int i7 = i5;
            he2 he2Var13 = he2Var7;
            he2 he2Var14 = he2Var8;
            he2 he2Var15 = he2Var5;
            he2 he2Var16 = he2Var6;
            x16 x16Var5 = x16Var4;
            kx0 kx0Var5 = kx0Var2;
            l46Var.r(false);
            float f = 1.0f;
            g09 g09Var2 = g09Var;
            nte.b(afc.q(R.string.annual_domain_draw_details, l46Var), ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, g09Var), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 48, 0, 262140);
            l46 l46Var4 = l46Var;
            l46Var4.f0(-2022598056);
            arrayList3 = arrayList;
            for (List list2 : s72.p1(arrayList3, i7, i7, false)) {
                g09 g09Var3 = g09Var2;
                j09 j09VarR2 = b.r(b.c(g09Var3, f));
                boolean z2 = true;
                kx0 kx0Var6 = kx0Var5;
                t7c t7cVarA2 = s7c.a(new uc0(4.0f, true, new qc0(i4)), kx0Var6, l46Var4, 6);
                int iHashCode3 = Long.hashCode(l46Var4.T);
                u8a u8aVarM3 = l46Var4.m();
                j09 j09VarJ3 = m93.J(l46Var4, j09VarR2);
                lf2.q.getClass();
                l46Var4.j0();
                if (l46Var4.S) {
                    x16Var = x16Var5;
                    l46Var4.l(x16Var);
                } else {
                    x16Var = x16Var5;
                    l46Var4.s0();
                }
                he2 he2Var17 = he2Var16;
                dec.l(he2Var17, l46Var4, t7cVarA2);
                he2 he2Var18 = he2Var15;
                dec.l(he2Var18, l46Var4, u8aVarM3);
                he2 he2Var19 = he2Var14;
                ib8.s(iHashCode3, l46Var4, he2Var19, l46Var4);
                Iterator itS2 = kv2.s(l46Var4, j09VarJ3, he2Var13, -1433842802, list2);
                while (itS2.hasNext()) {
                    j95 j95Var2 = (j95) itS2.next();
                    jw7 jw7Var2 = new jw7(f, z2);
                    qhe qheVar2 = j95Var2.a;
                    String str2 = j95Var2.b;
                    mue mueVar2 = pue.a;
                    t72.p(qheVar2, jw7Var2, 0.0f, str2, mue.a(pue.j(l46Var4), 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213), mue.a(pue.j(l46Var4), 0L, w6c.l(6), null, null, 0L, null, 0, 0L, null, null, 16777213), l46Var4, 0, 4);
                    z2 = z2;
                    kx0Var6 = kx0Var6;
                    he2Var18 = he2Var18;
                    x16Var = x16Var;
                    he2Var19 = he2Var19;
                    f = 1.0f;
                }
                he2Var14 = he2Var19;
                l46Var4.r(false);
                l46Var4.r(z2);
                he2Var16 = he2Var17;
                i4 = 0;
                g09Var2 = g09Var3;
                kx0Var5 = kx0Var6;
                he2Var15 = he2Var18;
                x16Var5 = x16Var;
                f = 1.0f;
            }
            l46Var4.r(i4);
            l46Var4.r(true);
            j09Var2 = g09Var2;
            l46Var2 = l46Var4;
        } else {
            arrayList3 = arrayList;
            l46Var3.Z();
            j09Var2 = j09Var;
            l46Var2 = l46Var3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, arrayList3, arrayList2, j09Var2, 7);
        }
    }

    public static final void e(boolean z, boolean z2, boolean z3, boolean z4, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        l46 l46Var2;
        i8c i8cVar;
        int i2;
        boolean z5;
        x16 x16Var4 = x16Var2;
        kx0 kx0Var = ndb.y;
        l46Var.h0(578226312);
        int i3 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.h(z2) ? 32 : 16) | (l46Var.h(z3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var4) ? 131072 : 65536) | (l46Var.i(x16Var3) ? 1048576 : 524288);
        if (l46Var.W(i3 & 1, (i3 & 599187) != 599186)) {
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(20.0f, 0.0f, mh3.L(b.c(g09Var, 1.0f)), 2));
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD0);
            lf2.q.getClass();
            l46Var.j0();
            boolean z6 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z6) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            i8c i8cVar2 = sf2.a;
            if (z) {
                l46Var.f0(-7923802);
                j09 j09VarC = b.c(g09Var, 1.0f);
                t7c t7cVarA = s7c.a(xc0.b, kx0Var, l46Var, 6);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarC);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, t7cVarA);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                String strQ = afc.q(R.string.confirm_edit, l46Var);
                boolean z7 = (i3 & 3670016) == 1048576;
                Object objR = l46Var.R();
                if (z7 || objR == i8cVar2) {
                    objR = new yca(13, x16Var3);
                    l46Var.p0(objR);
                }
                z5 = true;
                c8b.i(null, strQ, null, null, 0L, 0.0f, z4, null, null, false, null, null, (x16) objR, l46Var, (i3 << 9) & 3670016, 0, 4029);
                l46Var.r(true);
                l46Var.r(false);
                l46Var2 = l46Var;
            } else {
                l46Var.f0(-7358548);
                j09 j09VarC2 = b.c(g09Var, 1.0f);
                t7c t7cVarA2 = s7c.a(xc0.g, kx0Var, l46Var, 6);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09VarC2);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, t7cVarA2);
                dec.l(he2Var2, l46Var, u8aVarM3);
                ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ3);
                if (z2) {
                    l46Var2 = l46Var;
                    i8cVar = i8cVar2;
                    i2 = 131072;
                    l46Var2.f0(-557026058);
                    o5c.f(l46Var2, g09Var);
                    l46Var2.r(false);
                } else {
                    l46Var.f0(-557541557);
                    bx9 bx9Var = v51.a;
                    i8cVar = i8cVar2;
                    i2 = 131072;
                    u51 u51VarA = v51.a(y72.j, ((e8b) l46Var.k(l8b.a)).q, 0L, 0L, l46Var, 12);
                    l46Var2 = l46Var;
                    boolean z8 = (i3 & 57344) == 16384;
                    Object objR2 = l46Var2.R();
                    if (z8 || objR2 == i8cVar) {
                        objR2 = new yca(14, x16Var);
                        l46Var2.p0(objR2);
                    }
                    c8b.k(null, false, null, u51VarA, null, null, false, (x16) objR2, m93.f, l46Var2, 100663296, 119);
                    l46Var2.r(false);
                }
                String strI = z3 ? tec.i(l46Var2, -556932965, R.string.preview_spread, l46Var2, false) : tec.i(l46Var2, -556862688, R.string.next_card, l46Var2, false);
                boolean z9 = (i3 & 458752) == i2;
                Object objR3 = l46Var2.R();
                if (z9 || objR3 == i8cVar) {
                    x16Var4 = x16Var2;
                    objR3 = new yca(15, x16Var4);
                    l46Var2.p0(objR3);
                } else {
                    x16Var4 = x16Var2;
                }
                c8b.i(null, strI, null, null, 0L, 0.0f, z4, null, null, false, null, null, (x16) objR3, l46Var2, (i3 << 9) & 3670016, 0, 4029);
                z5 = true;
                l46Var2.r(true);
                l46Var2.r(false);
            }
            l46Var2.r(z5);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ls1(z, z2, z3, z4, x16Var, x16Var4, x16Var3, i);
        }
    }

    public static final void f(List list, List list2, int i, a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        list.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(787806662);
        int i3 = i2 | (l46Var.g(list) ? 4 : 2) | (l46Var.g(list2) ? 32 : 16) | (l46Var.e(i) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z || objR == obj) {
                objR = new lv1(list, list2, i);
                l46Var.p0(objR);
            }
            x16 x16Var2 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            iwd iwdVar = (iwd) z5c.G(job.a.b(iwd.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
            sz9 sz9Var = iwdVar.d;
            Context context = (Context) l46Var.k(uq.b);
            String strQ = afc.q(R.string.reading_feedback_text_too_long, l46Var);
            use useVarO = n3d.o(iwdVar.f(), l46Var, 2);
            ghc ghcVarT = mh3.T(l46Var);
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new fo5();
                l46Var.p0(objR2);
            }
            fo5 fo5Var = (fo5) objR2;
            vsd vsdVar = (vsd) l46Var.k(zg2.q);
            Integer numValueOf = Integer.valueOf(sz9Var.j());
            boolean zG = l46Var.g(vsdVar);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj) {
                objR3 = new ewd(fo5Var, vsdVar, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, numValueOf);
            Integer numValueOf2 = Integer.valueOf(sz9Var.j());
            boolean zG2 = l46Var.g(useVarO) | l46Var.i(iwdVar);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == obj) {
                objR4 = new fwd(useVarO, iwdVar, null);
                l46Var.p0(objR4);
            }
            af1.o((l26) objR4, l46Var, numValueOf2);
            boolean zG3 = l46Var.g(useVarO) | l46Var.i(iwdVar) | l46Var.i(context) | l46Var.g(strQ);
            Object objR5 = l46Var.R();
            if (zG3 || objR5 == obj) {
                Object hwdVar = new hwd(useVarO, iwdVar, context, strQ, null);
                l46Var.p0(hwdVar);
                objR5 = hwdVar;
            }
            af1.o((l26) objR5, l46Var, useVarO);
            xdc.a(b.c, af1.b0(236142210, new p4c(11, iwdVar, x16Var), l46Var), af1.b0(103818465, new p4c(12, iwdVar, a26Var), l46Var), null, null, 0, ((e8b) l46Var.k(l8b.a)).a, 0L, null, af1.b0(-1433409577, new qi3(ghcVarT, iwdVar, list, useVarO, fo5Var, a26Var), l46Var), l46Var, 805306806, 440);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(list, list2, i, a26Var, x16Var, i2);
        }
    }

    public static final void g(TarotSkinIdentify tarotSkinIdentify, j09 j09Var, l46 l46Var, int i) {
        TarotSkinIdentify tarotSkinIdentify2;
        l46 l46Var2 = l46Var;
        tarotSkinIdentify.getClass();
        l46Var2.h0(2037679038);
        int i2 = i | (l46Var2.e(tarotSkinIdentify.ordinal()) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= l46Var2.g(j09Var) ? 32 : 16;
        }
        int i3 = 12;
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            boolean zF = k8b.f((e8b) l46Var2.k(l8b.a));
            tarotSkinIdentify2 = tarotSkinIdentify;
            bhe bheVarO = m7c.o(t72.H(tarotSkinIdentify), tarotSkinIdentify2, zF ? cge.i : cge.h, null, l46Var2, (i2 << 3) & 112, 8);
            yge ygeVarF = bheVarO.f(tarotSkinIdentify2);
            int i4 = we6.e(l46Var2) ? R.drawable.card_stand_back_neo : R.drawable.card_stand_back;
            int i5 = we6.e(l46Var2) ? R.drawable.card_stand_front_neo : R.drawable.card_stand_front;
            float fD = we6.d(122.0f, 78.0f, l46Var2);
            float fD2 = we6.d(122.0f, 136.0f, l46Var2);
            float fD3 = we6.d(3.0f, 6.0f, l46Var2);
            float fD4 = we6.d(-28.0f, -15.0f, l46Var2);
            float f = zF ? 0.9f : 1.0f;
            boolean zD = l46Var2.d(f);
            Object objR = l46Var2.R();
            if (zD || objR == sf2.a) {
                objR = new uc2(i3, f);
                l46Var2.p0(objR);
            }
            j09 j09VarN = tm7.N(0.0f, 3.0f, bzd.x(j09Var, (a26) objR), 1);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarN);
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
            fy9 fy9VarA = od4.A(i4, 0, l46Var2);
            FillElement fillElement = b.c;
            j09 j09VarG = k8b.g(fillElement, new agb(9), l46Var2, 6);
            m8c m8cVar = an2.b;
            int i6 = i5;
            feg.j(fy9VarA, null, j09VarG, null, m8cVar, 0.0f, null, l46Var2, 24632, 104);
            g09 g09Var = g09.a;
            if (ygeVarF != null) {
                l46Var2.f0(36442323);
                feg.k(ygeVarF.a, null, tm7.M(b.i(g09Var, fD, fD2), fD3, fD4), m8cVar, 0, l46Var, 24624, 232);
                m8cVar = m8cVar;
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else if (bheVarO.a(tarotSkinIdentify2)) {
                l46Var2.f0(36756508);
                feg.j(od4.A(hfc.q(tarotSkinIdentify2).e(), 0, l46Var2), null, tm7.M(b.i(g09Var, fD, fD2), fD3, fD4), null, m8cVar, 0.0f, null, l46Var2, 24632, 104);
                l46Var2.r(false);
            } else {
                l46Var2.f0(37046730);
                l46Var2.r(false);
            }
            feg.j(od4.A(i6, 0, l46Var2), null, k8b.g(fillElement, new agb(10), l46Var2, 6), null, m8cVar, 0.0f, null, l46Var2, 24632, 104);
            l46Var2.r(true);
        } else {
            tarotSkinIdentify2 = tarotSkinIdentify;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(tarotSkinIdentify2, j09Var, i, 12);
        }
    }

    public static final void h(qmf qmfVar, x16 x16Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(1666598917);
        int i2 = (l46Var.i(qmfVar) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            bzd.l(b.c, ((Boolean) qmfVar.w.getValue()).booleanValue(), 0L, null, null, af1.b0(-596353599, new ied(qmfVar, qmfVar.X.j(), x16Var), l46Var), l46Var, 1572870, 60);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(qmfVar, x16Var, i, 23);
        }
    }

    public static float i(int i) {
        Set set = i9g.b;
        if (i == 2) {
            return 840.0f;
        }
        return i == 1 ? 600.0f : 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean j(InputStream inputStream, File file) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStreamD = null;
        try {
            try {
                fileOutputStreamD = a.d(file, new FileOutputStream(file, false), false);
                byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStreamD.write(bArr, 0, i);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                    if (fileOutputStreamD != null) {
                        try {
                            fileOutputStreamD.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
                fileOutputStreamD.close();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                return true;
            } catch (IOException e) {
                b1.d("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                if (fileOutputStreamD != null) {
                    try {
                        fileOutputStreamD.close();
                    } catch (IOException unused3) {
                    }
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                return false;
            }
        } catch (Throwable th) {
            if (fileOutputStreamD != null) {
                fileOutputStreamD.close();
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static final long k() {
        return Thread.currentThread().getId();
    }

    public static final String l(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        return qd0.t0(parameterTypes, "", "<init>(", ")V", d5a.R0, 24);
    }

    public static final String m(Field field) {
        String name = field.getName();
        name.getClass();
        StringBuilder sb = new StringBuilder(oj7.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(smb.b(type));
        return sb.toString();
    }

    public static final String n(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(qd0.t0(parameterTypes, "", "(", ")", d5a.S0, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(smb.b(returnType));
        return sb.toString();
    }

    public static File o(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, tec.e(i, str));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static MappedByteBuffer p(Uri uri, Context context) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                FileInputStream fileInputStreamC = a.c(new FileInputStream(fileDescriptor), fileDescriptor);
                try {
                    FileChannel channel = fileInputStreamC.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStreamC.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStreamC.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final j09 q(j09 j09Var, float f, l46 l46Var, int i) {
        j09Var.getClass();
        long j = y72.d;
        List listI = t72.I(new y72(y72.b(j, 0.3f)), new y72(y72.b(y72.e, 0.6f)), new y72(y72.b(j, 0.3f)));
        m27 m27VarW = af1.w(af1.c0("Shimmer", l46Var, 0), -400.0f, 1200.0f, b21.D(b21.T(1600, 0, hs4.a, 2), null, 6), "Translate", l46Var, 29064, 0);
        boolean zG = l46Var.g(m27VarW) | ((((i & 112) ^ 48) > 32 && l46Var.d(f)) || (i & 48) == 32);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new er(listI, f, m27VarW, 5);
            l46Var.p0(objR);
        }
        return b21.t(j09Var, (a26) objR);
    }

    public static final j09 r(int i, l46 l46Var, j09 j09Var, boolean z) {
        j09Var.getClass();
        if (!z) {
            l46Var.f0(1492685530);
            l46Var.r(false);
            return j09Var;
        }
        l46Var.f0(1492684218);
        j09 j09VarQ = q(j09Var, 0.0f, l46Var, i & 126);
        l46Var.r(false);
        return j09VarQ;
    }

    public static boolean s(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = qug.b;
            }
        } else {
            if (!(collection instanceof dug)) {
                return false;
            }
            objComparator = ((dug) collection).f;
        }
        return comparator.equals(objComparator);
    }
}
