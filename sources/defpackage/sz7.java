package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.dialogue.NewReadingState;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sz7 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sz7(l26 l26Var, mn2 mn2Var, n26 n26Var, x16 x16Var) {
        this.a = 5;
        this.b = l26Var;
        this.c = mn2Var;
        this.d = n26Var;
        this.e = x16Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        bx9 bx9Var = (bx9) this.b;
        OverviewItem.NewReadingItem newReadingItem = (OverviewItem.NewReadingItem) this.c;
        QuotaBlockReason quotaBlockReason = (QuotaBlockReason) this.d;
        a26 a26Var = (a26) this.e;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((mx7) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            j09 j09VarY = ynb.Y(g09.a, bx9Var);
            String question = newReadingItem.getQuestion();
            NewReadingState state = newReadingItem.getState();
            boolean zG = l46Var.g(a26Var) | l46Var.i(newReadingItem);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new ek9(5, a26Var, newReadingItem);
                l46Var.p0(objR);
            }
            abg.h(question, state, quotaBlockReason, (x16) objR, j09VarY, l46Var, 0);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        u6b u6bVar = (u6b) this.b;
        xw9 xw9Var = (xw9) this.c;
        x16 x16Var = (x16) this.d;
        l26 l26Var = (l26) this.e;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        lx0 lx0Var = ndb.f;
        ((c31) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zT = pa7.t(u6bVar, s6b.a);
            ov7 ov7Var = LayoutNode.h1;
            if (zT) {
                l46Var.f0(1665986399);
                j09 j09VarY = ynb.Y(b.c, xw9Var);
                xn8 xn8VarC = s21.c(lx0Var, false);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarY);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, xn8VarC);
                dec.l(he2Var3, l46Var, u8aVarM);
                ib8.s(iHashCode, l46Var, he2Var2, l46Var);
                dec.l(he2Var, l46Var, j09VarJ);
                jgb.w(null, 0L, 0.0f, l46Var, 0);
                l46Var.r(true);
                l46Var.r(false);
            } else if (u6bVar instanceof t6b) {
                l46Var.f0(1666283968);
                tq.l((t6b) u6bVar, xw9Var, x16Var, l26Var, l46Var, 0);
                l46Var.r(false);
            } else {
                if (!pa7.t(u6bVar, r6b.a)) {
                    throw tec.d(-1747374980, l46Var, false);
                }
                l46Var.f0(1666548925);
                j09 j09VarY2 = ynb.Y(b.c, xw9Var);
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarY2);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, xn8VarC2);
                dec.l(he2Var3, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var2, l46Var);
                dec.l(he2Var, l46Var, j09VarJ2);
                nte.b(afc.q(R.string.network_common_error, l46Var), null, ((e8b) l46Var.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262138);
                l46Var.r(true);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        cb9 cb9Var = (cb9) this.b;
        q7b q7bVar = (q7b) this.d;
        j4a j4aVar = (j4a) this.e;
        sdd sddVar = (sdd) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        sddVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(sddVar) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new tt1();
                l46Var.p0(objR);
            }
            tt1 tt1Var = (tt1) objR;
            mh3.b(new e1b[]{ndd.a.a(sddVar), vt1.a.a(tt1Var)}, af1.b0(800303706, new cm(cb9Var, this.c, q7bVar, j4aVar, tt1Var, 19), l46Var), l46Var, 48);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        ghc ghcVar = (ghc) this.b;
        jnc jncVar = (jnc) this.c;
        s69 s69Var = (s69) this.d;
        e89 e89Var = (e89) this.e;
        e31 e31Var = (e31) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        e31Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(e31Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fC = e31Var.c();
            j09 j09VarD0 = mh3.d0(b.c, ghcVar, false, 14);
            xn8 xn8VarC = s21.c(ndb.b, false);
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
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            j09 j09VarF = b.f(fC, 0.0f, g09.a, 2);
            List list = jncVar.d;
            jsd jsdVar = jncVar.e;
            boolean zI = l46Var.i(jncVar);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                vx7 vx7Var = new vx7(1, jncVar, jnc.class, "toggleReversed", "toggleReversed(I)V", 0, 17);
                l46Var.p0(vx7Var);
                objR = vx7Var;
            }
            ym7 ym7Var = (ym7) objR;
            boolean zI2 = l46Var.i(jncVar);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                vx7 vx7Var2 = new vx7(1, jncVar, jnc.class, "removeAt", "removeAt(I)V", 0, 18);
                l46Var.p0(vx7Var2);
                objR2 = vx7Var2;
            }
            ym7 ym7Var2 = (ym7) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new sg4(s69Var, e89Var, 5);
                l46Var.p0(objR3);
            }
            onc.c(list, jsdVar, (a26) objR3, (a26) ym7Var, (a26) ym7Var2, j09VarF, null, af1.b0(-1177070315, new wf8(21, jncVar), l46Var), l46Var, 12583296);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [int] */
    /* JADX WARN: Type inference failed for: r5v28 */
    private final Object h(Object obj, Object obj2, Object obj3) {
        ?? r5;
        boolean z;
        Context context = (Context) this.b;
        dc9 dc9Var = (dc9) this.c;
        zz5 zz5Var = (zz5) this.d;
        t7 t7Var = (t7) this.e;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d92) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            c4d c4dVar = c4d.f;
            boolean zI = l46Var.i(context);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                objR = new u8(context, 29);
                l46Var.p0(objR);
            }
            b4d.f(null, c4dVar, null, null, (x16) objR, l46Var, 48, 29);
            float f = we6.e(l46Var) ? 0.0f : 24.0f;
            g09 g09Var = g09.a;
            jgb.t(0, 0, l46Var, ynb.b0(f, 0.0f, g09Var, 2));
            c4d c4dVar2 = c4d.w;
            boolean zI2 = l46Var.i(dc9Var);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                objR2 = new l8(dc9Var, 6);
                l46Var.p0(objR2);
            }
            b4d.f(null, c4dVar2, null, null, (x16) objR2, l46Var, 48, 29);
            jgb.t(0, 0, l46Var, ynb.b0(we6.e(l46Var) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
            boolean zI3 = l46Var.i(context) | l46Var.i(t7Var) | l46Var.i(dc9Var);
            Object objR3 = l46Var.R();
            if (zI3 || objR3 == i8cVar) {
                objR3 = new smc(context, t7Var, dc9Var, 3);
                l46Var.p0(objR3);
            }
            b4d.c(zz5Var, (x16) objR3, null, l46Var, 0);
            jgb.t(0, 0, l46Var, ynb.b0(we6.e(l46Var) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
            c4d c4dVar3 = c4d.y;
            boolean zI4 = l46Var.i(dc9Var);
            Object objR4 = l46Var.R();
            if (zI4 || objR4 == i8cVar) {
                objR4 = new l8(dc9Var, 7);
                l46Var.p0(objR4);
            }
            b4d.f(null, c4dVar3, null, null, (x16) objR4, l46Var, 48, 29);
            jgb.t(0, 0, l46Var, ynb.b0(we6.e(l46Var) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
            ca2.a.getClass();
            if (ca2.c) {
                l46Var.f0(-64764766);
                c4d c4dVar4 = c4d.v;
                boolean zI5 = l46Var.i(context);
                Object objR5 = l46Var.R();
                if (zI5 || objR5 == i8cVar) {
                    z = false;
                    objR5 = new y3d(context, 0 == true ? 1 : 0);
                    l46Var.p0(objR5);
                } else {
                    z = false;
                }
                b4d.f(null, c4dVar4, null, null, (x16) objR5, l46Var, 48, 29);
                l46Var.r(z);
                r5 = z;
            } else {
                l46Var.f0(-64598048);
                c4d c4dVar5 = c4d.g;
                boolean zI6 = l46Var.i(context);
                Object objR6 = l46Var.R();
                if (zI6 || objR6 == i8cVar) {
                    objR6 = new y3d(context, 1);
                    l46Var.p0(objR6);
                }
                b4d.f(null, c4dVar5, null, null, (x16) objR6, l46Var, 48, 29);
                r5 = 0;
                l46Var.r(false);
            }
            jgb.t(r5, r5, l46Var, ynb.b0(we6.e(l46Var) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
            c4d c4dVar6 = c4d.z;
            boolean zI7 = l46Var.i(dc9Var);
            Object objR7 = l46Var.R();
            if (zI7 || objR7 == i8cVar) {
                objR7 = new l8(dc9Var, 8);
                l46Var.p0(objR7);
            }
            b4d.f(null, c4dVar6, null, null, (x16) objR7, l46Var, 48, 29);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0168  */
    private final Object i(Object obj, Object obj2, Object obj3) {
        j09 j09VarL;
        Context context = (Context) this.b;
        Serializable serializable = (Serializable) this.c;
        aw6 aw6Var = (aw6) this.d;
        lf0 lf0Var = (lf0) this.e;
        e31 e31Var = (e31) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        e31Var.getClass();
        long j = e31Var.b;
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(e31Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            int iH = kl2.h(j);
            int iG = kl2.g(j);
            if (iH < 1) {
                iH = 1;
            }
            long jO = (((long) iH) << 32) | (((long) mh3.o(iG - 1, 1, UserMetadata.MAX_INTERNAL_KEY_SIZE)) & 4294967295L);
            boolean zG = l46Var.g(context) | l46Var.g(serializable) | l46Var.f(jO);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                serializable.getClass();
                context.getClass();
                pw6 pw6Var = new pw6(context);
                pw6Var.c = serializable;
                pw6Var.j = new tib(xdc.c((int) (jO >> 32), (int) (jO & 4294967295L)));
                pw6Var.k = zdc.b;
                pw6Var.l = bpa.b;
                q95 q95Var = yw6.a;
                pw6Var.b().a.put(yw6.f, Boolean.FALSE);
                objR = pw6Var.a();
                l46Var.p0(objR);
            }
            AsyncImagePainter asyncImagePainterY = z7f.Y((sw6) objR, aw6Var, null, l46Var, 0, 60);
            whb whbVar = asyncImagePainterY.J0;
            fy9 painter = ((yg0) jzb.i(whbVar, whbVar.getValue(), l46Var, 0, 0).getValue()).getPainter();
            ald aldVar = painter != null ? new ald(painter.i()) : null;
            g09 g09Var = g09.a;
            if (aldVar != null) {
                long j2 = aldVar.a;
                int i = (int) (j2 >> 32);
                if (Math.abs(Float.intBitsToFloat(i)) <= Float.MAX_VALUE) {
                    int i2 = (int) (j2 & 4294967295L);
                    if (Math.abs(Float.intBitsToFloat(i2)) > Float.MAX_VALUE || Float.intBitsToFloat(i) <= 0.0f || Float.intBitsToFloat(i2) <= 0.0f) {
                        l46Var.f0(-459370285);
                        l46Var.r(false);
                        j09VarL = b.l(g09Var, 64.0f);
                    } else {
                        l46Var.f0(-1355817040);
                        float fMin = Math.min(1.0f, Math.min(kl2.h(j) / Float.intBitsToFloat(i), ((int) (jO & 4294967295L)) / Float.intBitsToFloat(i2)));
                        sw3 sw3Var = (sw3) l46Var.k(zg2.h);
                        j09VarL = b.m(g09Var, sw3Var.c0(Float.intBitsToFloat(i) * fMin), sw3Var.c0(Float.intBitsToFloat(i2) * fMin));
                        l46Var.r(false);
                    }
                } else {
                    l46Var.f0(-459370285);
                    l46Var.r(false);
                    j09VarL = b.l(g09Var, 64.0f);
                }
            } else {
                l46Var.f0(-459370285);
                l46Var.r(false);
                j09VarL = b.l(g09Var, 64.0f);
            }
            feg.j(asyncImagePainterY, lf0Var.l, j09VarL, null, an2.e, 0.0f, null, l46Var, 24576, 104);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        Object objU;
        dtd dtdVar = (dtd) this.b;
        r38 r38Var = (r38) this.c;
        zse zseVar = (zse) this.d;
        sl9 sl9Var = (sl9) this.e;
        j09 j09Var = (j09) obj;
        l46 l46Var = (l46) obj2;
        ((Integer) obj3).getClass();
        l46Var.f0(-84507373);
        boolean zBooleanValue = ((Boolean) l46Var.k(zg2.y)).booleanValue();
        boolean zH = l46Var.h(zBooleanValue);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (zH || objR == i8cVar) {
            objR = new g13(zBooleanValue);
            l46Var.p0(objR);
        }
        g13 g13Var = (g13) objR;
        boolean z = dtdVar.a != 16;
        if (((b28) ((e7g) l46Var.k(zg2.u))).a() && r38Var.b() && eue.d(zseVar.b) && z) {
            l46Var.f0(-707487962);
            k00 k00Var = zseVar.a;
            eue eueVar = new eue(zseVar.b);
            boolean zI = l46Var.i(g13Var);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                objR2 = new foe(g13Var, null);
                l46Var.p0(objR2);
            }
            af1.p(k00Var, eueVar, (l26) objR2, l46Var);
            boolean zI2 = l46Var.i(g13Var) | l46Var.i(sl9Var) | l46Var.g(zseVar) | l46Var.i(r38Var) | l46Var.g(dtdVar);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == i8cVar) {
                kf kfVar = new kf(g13Var, sl9Var, zseVar, r38Var, dtdVar, 24);
                l46Var.p0(kfVar);
                objR3 = kfVar;
            }
            objU = b21.u(j09Var, (a26) objR3);
            l46Var.r(false);
        } else {
            l46Var.f0(-705473241);
            l46Var.r(false);
            objU = g09.a;
        }
        l46Var.r(false);
        return objU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj, Object obj2, Object obj3) {
        Map map = (Map) this.b;
        c4c c4cVar = (c4c) this.c;
        k00 k00Var = (k00) this.d;
        a26 a26Var = (a26) this.e;
        e31 e31Var = (e31) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        e31Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(e31Var) ? 4 : 2;
        }
        int i = 0;
        int i2 = 1;
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            long j = e31Var.b;
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            l46Var.f0(1916224877);
            LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(map.size()));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                final o37 o37Var = (o37) entry.getValue();
                final long jB = ll2.b(i, kl2.h(j), i, kl2.g(j), 5);
                l46Var.f0(-1990137059);
                Object objR = l46Var.R();
                int i3 = i2;
                if (objR == sf2.a) {
                    a26 a26Var2 = o37Var.a;
                    Object vz9Var = new vz9(a26Var2 != null ? (e77) a26Var2.d(sw3Var) : null, i8c.f);
                    l46Var.p0(vz9Var);
                    objR = vz9Var;
                }
                final e89 e89Var = (e89) objR;
                e77 e77Var = (e77) e89Var.getValue();
                Iterator it2 = it;
                long jP = e77Var != null ? sw3Var.P((int) (e77Var.a >> 32)) : w6c.l(i);
                e77 e77Var2 = (e77) e89Var.getValue();
                c4c c4cVar2 = c4cVar;
                k00 k00Var2 = k00Var;
                long jP2 = e77Var2 != null ? sw3Var.P((int) (e77Var2.a & 4294967295L)) : w6c.l(i3);
                o37Var.getClass();
                final sw3 sw3Var2 = sw3Var;
                z37 z37Var = new z37(new fea(jP, jP2), af1.b0(-877544637, new n26() { // from class: p37
                    @Override // defpackage.n26
                    public final Object m(Object obj4, Object obj5, Object obj6) {
                        String str = (String) obj4;
                        l46 l46Var2 = (l46) obj5;
                        int iIntValue2 = ((Integer) obj6).intValue();
                        str.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= l46Var2.g(str) ? 4 : 2;
                        }
                        if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            long j2 = jB;
                            boolean zF = l46Var2.f(j2);
                            Object objR2 = l46Var2.R();
                            if (zF || objR2 == sf2.a) {
                                objR2 = new q37(j2, e89Var);
                                l46Var2.p0(objR2);
                            }
                            xn8 xn8Var = (xn8) objR2;
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, g09.a);
                            lf2.q.getClass();
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(LayoutNode.h1);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(hj6.z, l46Var2, xn8Var);
                            dec.l(hj6.y, l46Var2, u8aVarM);
                            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                            dec.k(l46Var2);
                            dec.l(hj6.x, l46Var2, j09VarJ);
                            o37Var.b.t(sw3Var2, str, l46Var2, Integer.valueOf((iIntValue2 << 3) & 112));
                            l46Var2.r(true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var));
                boolean z = i;
                l46Var.r(z);
                linkedHashMap.put(key, z37Var);
                i2 = i3;
                it = it2;
                i = z ? 1 : 0;
                sw3Var = sw3Var2;
                c4cVar = c4cVar2;
                k00Var = k00Var2;
            }
            l46Var.r(i);
            b4c.a(c4cVar, k00Var, null, a26Var, linkedHashMap, l46Var, 0, 2);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        x16 x16Var = (x16) this.b;
        lve lveVar = (lve) this.c;
        Context context = (Context) this.d;
        h0e h0eVar = (h0e) this.e;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c31) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            jx0 jx0Var = ndb.Y;
            sc0 sc0Var = xc0.c;
            c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
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
            pa7.a(null, y72.j, 0L, null, oa7.d, null, false, false, x16Var, l46Var, 24624, 237);
            j09 j09VarD0 = ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, ynb.b0(24.0f, 0.0f, b.c, 2));
            c92 c92VarA2 = a92.a(sc0Var, ndb.Z, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            String strQ = afc.q(R.string.onboarding_theme_choose_title, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var), l46Var, 0, 0, 131066);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            o5c.f(l46Var, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            mfc mfcVar = (mfc) h0eVar.getValue();
            boolean zI = l46Var.i(lveVar) | l46Var.i(context);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new i2e(12, lveVar, context);
                l46Var.p0(objR);
            }
            q7c.i(null, mfcVar, null, (a26) objR, l46Var, 0, 5);
            if (4.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            o5c.f(l46Var, new jw7(4.0f <= Float.MAX_VALUE ? 4.0f : Float.MAX_VALUE, true));
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0789  */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        e08 e08Var;
        j09 j09VarD;
        Object obj4;
        boolean z;
        l46 l46Var;
        ov7 ov7Var;
        i8c i8cVar;
        Object objR;
        Object obj5;
        Object obj6;
        Object obj7;
        int i = this.a;
        ov7 ov7Var2 = LayoutNode.h1;
        g09 g09Var = g09.a;
        i8c i8cVar2 = sf2.a;
        wef wefVar = wef.a;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        Object obj11 = this.b;
        switch (i) {
            case 0:
                e08 e08Var2 = (e08) obj11;
                j09 j09Var = (j09) obj10;
                tz7 tz7Var = (tz7) obj9;
                e89 e89Var = (e89) obj8;
                qcc qccVar = (qcc) obj;
                l46 l46Var2 = (l46) obj2;
                ((Integer) obj3).getClass();
                Object objR2 = l46Var2.R();
                if (objR2 == i8cVar2) {
                    objR2 = new qz7(qccVar, new ok3(e89Var, 29));
                    l46Var2.p0(objR2);
                }
                qz7 qz7Var = (qz7) objR2;
                Object objR3 = l46Var2.R();
                if (objR3 == i8cVar2) {
                    objR3 = new q6e(new w84(qz7Var));
                    l46Var2.p0(objR3);
                }
                q6e q6eVar = (q6e) objR3;
                if (e08Var2 != null) {
                    l46Var2.f0(1743490539);
                    l46Var2.f0(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        l46Var2.f0(1345729441);
                        View view = (View) l46Var2.k(uq.f);
                        boolean zG = l46Var2.g(view);
                        Object objR4 = l46Var2.R();
                        if (zG || objR4 == i8cVar2) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            wsa ruVar = tag instanceof wsa ? (wsa) tag : null;
                            if (ruVar == null) {
                                ruVar = new ru(view);
                                view.setTag(R.id.compose_prefetch_scheduler, ruVar);
                            }
                            objR4 = ruVar;
                            l46Var2.p0(objR4);
                        }
                        obj4 = (wsa) objR4;
                        z = false;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(1345548711);
                        Object objR5 = l46Var2.R();
                        if (objR5 == i8cVar2) {
                            objR5 = new xsa();
                            l46Var2.p0(objR5);
                        }
                        obj4 = (xsa) objR5;
                        l46Var2.r(false);
                        z = false;
                    }
                    Object obj12 = obj4;
                    l46Var2.r(z);
                    Object[] objArr = {e08Var2, qz7Var, q6eVar, obj12};
                    boolean zG2 = l46Var2.g(e08Var2) | l46Var2.i(qz7Var) | l46Var2.i(q6eVar) | l46Var2.i(obj12);
                    Object objR6 = l46Var2.R();
                    if (zG2 || objR6 == i8cVar2) {
                        e08Var = e08Var2;
                        objR6 = new wg(e08Var, qz7Var, q6eVar, obj12, 19);
                        l46Var2.p0(objR6);
                    } else {
                        e08Var = e08Var2;
                    }
                    af1.j(objArr, (a26) objR6, l46Var2);
                    l46Var2.r(false);
                } else {
                    e08Var = e08Var2;
                    l46Var2.f0(1744076749);
                    l46Var2.r(false);
                }
                int i2 = f08.a;
                if (e08Var != null && (j09VarD = j09Var.D(new j4f(e08Var))) != null) {
                    j09Var = j09VarD;
                }
                boolean zG3 = l46Var2.g(qz7Var) | l46Var2.g(tz7Var);
                Object objR7 = l46Var2.R();
                if (zG3 || objR7 == i8cVar2) {
                    objR7 = new rk6(8, qz7Var, tz7Var);
                    l46Var2.p0(objR7);
                }
                m6e.b(q6eVar, j09Var, (l26) objR7, l46Var2, 8);
                return wefVar;
            case 1:
                lb lbVar = (lb) obj11;
                UserSubscriptionInformation userSubscriptionInformation = (UserSubscriptionInformation) obj10;
                fb fbVar = (fb) obj9;
                x16 x16Var = (x16) obj8;
                l46 l46Var3 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var3.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lc.f(null, lbVar, userSubscriptionInformation, fbVar, x16Var, l46Var3, UserSubscriptionInformation.$stable << 6, 1);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 2:
                ik ikVar = (ik) obj11;
                xw9 xw9Var = (xw9) obj10;
                a26 a26Var = (a26) obj9;
                a26 a26Var2 = (a26) obj8;
                l46 l46Var4 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var4.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var4.Z();
                } else if (pa7.t(ikVar, gk.a)) {
                    l46Var4.f0(-48122419);
                    j09 j09VarY = ynb.Y(b.c, xw9Var);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var4.T);
                    u8a u8aVarM = l46Var4.m();
                    j09 j09VarJ = m93.J(l46Var4, j09VarY);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var2);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, xn8VarC);
                    dec.l(hj6.y, l46Var4, u8aVarM);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ);
                    bzd.k(null, true, 0L, null, l46Var4, 24624, 13);
                    l46Var4.r(true);
                    l46Var4.r(false);
                } else {
                    if (!(ikVar instanceof hk)) {
                        throw tec.d(1245372938, l46Var4, false);
                    }
                    l46Var4.f0(-47827702);
                    FillElement fillElement = b.c;
                    bx9 bx9VarW = g21.W(xw9Var, ynb.q(16.0f, 0.0f, 2), l46Var4);
                    uc0 uc0Var = new uc0(12.0f, true, new qc0(0));
                    boolean zI = l46Var4.i(ikVar) | l46Var4.g(a26Var) | l46Var4.g(a26Var2);
                    Object objR8 = l46Var4.R();
                    if (zI || objR8 == i8cVar2) {
                        objR8 = new w6(ikVar, a26Var, a26Var2, 5);
                        l46Var4.p0(objR8);
                    }
                    af1.s(fillElement, null, bx9VarW, uc0Var, null, null, false, null, (a26) objR8, l46Var4, 24582, 490);
                    l46Var4.r(false);
                }
                return wefVar;
            case 3:
                TarotCardType tarotCardType = (TarotCardType) obj11;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj10;
                x16 x16Var2 = (x16) obj9;
                String str2 = (String) obj8;
                l46 l46Var5 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var5.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    if (tarotCardType != null) {
                        l46Var5.f0(1041462943);
                        float f = we6.e(l46Var5) ? 8.0f : 12.0f;
                        y6c y6cVarB = a7c.b(f);
                        j09 j09VarW = dj6.w(b.p(g09Var, 216.0f), tarotSkinIdentify.getAspectRatio());
                        long j = y72.b;
                        j09 j09VarW2 = db6.w(rrb.q(rrb.q(j09VarW, 32.0f, y6cVarB, y72.b(j, 0.16f), y72.b(j, 0.16f), 4), 12.0f, y6cVarB, y72.b(j, 0.08f), y72.b(j, 0.08f), 4), 0.5f, ((e8b) l46Var5.k(l8b.a)).A, y6cVarB);
                        Object objR9 = l46Var5.R();
                        if (objR9 == i8cVar2) {
                            objR9 = ib8.e(l46Var5);
                        }
                        o7c.d(vt1.a(androidx.compose.foundation.b.b(j09VarW2, (t69) objR9, null, false, null, x16Var2, 28), tarotCardType.getCardKey(), null, l46Var5, 3072, 10), new qhe(tarotCardType.getCardKey(), 1), tarotSkinIdentify, false, null, f, null, false, l46Var5, 0, 216);
                        l46Var = l46Var5;
                        tec.u(g09Var, 16.0f, l46Var, false);
                    } else {
                        l46Var = l46Var5;
                        l46Var.f0(1042918858);
                        l46Var.r(false);
                    }
                    mue mueVar = pue.a;
                    nte.b(str2, null, ((m82) l46Var.k(o82.a)).q, 0L, null, cr5.b(), 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var), l46Var, 0, 0, 129914);
                    o5c.f(l46Var, b.d(g09Var, 8.0f));
                    uq1.a(tarotCardType, l46Var, 0);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 4:
                List list = (List) obj11;
                l26 l26Var = (l26) obj10;
                l26 l26Var2 = (l26) obj9;
                String str3 = (String) obj8;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var6 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var6.g(xw9Var2) ? 4 : 2;
                }
                if (l46Var6.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ded.a(b.c, af1.b0(1604380070, new n50(xw9Var2, list, l26Var, l26Var2, str3), l46Var6), l46Var6, 54, 0);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 5:
                l26 l26Var3 = (l26) obj11;
                mn2 mn2Var = (mn2) obj10;
                n26 n26Var = (n26) obj9;
                x16 x16Var3 = (x16) obj8;
                ln2 ln2Var = (ln2) obj;
                l46 l46Var7 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var7.g(ln2Var) ? 4 : 2;
                }
                if (l46Var7.W(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    String str4 = (String) l26Var3.z(l46Var7, 0);
                    if (v4e.Q(str4)) {
                        l37.c("Label must not be blank");
                    }
                    mn2Var.getClass();
                    eb3.a.u(str4, Boolean.TRUE, ln2Var, n26Var, x16Var3, l46Var7, Integer.valueOf((iIntValue5 << 9) & 7168));
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 6:
                cs3 cs3Var = (cs3) obj11;
                List list2 = (List) obj10;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj9;
                aw2 aw2Var = (aw2) obj8;
                e31 e31Var = (e31) obj;
                l46 l46Var8 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= l46Var8.g(e31Var) ? 4 : 2;
                }
                if (l46Var8.W(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    float fD = e31Var.d() / 2.0f;
                    cn1.h(0.0f, 1, 1597488, 16288, ndb.z, af1.b0(-60469383, new o91(list2, cs3Var, tarotCardChoice, aw2Var, 2), l46Var8), l46Var8, b.c, null, null, ynb.q((e31Var.d() - fD) / 2.0f, 0.0f, 2), new ex9(fD), cs3Var, null, null, false);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 7:
                String str5 = (String) obj11;
                String str6 = (String) obj10;
                String str7 = (String) obj9;
                h0e h0eVar = (h0e) obj8;
                xw9 xw9Var3 = (xw9) obj;
                l46 l46Var9 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                xw9Var3.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= l46Var9.g(xw9Var3) ? 4 : 2;
                }
                if (l46Var9.W(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    j09 j09VarY2 = ynb.Y(b.c, xw9Var3);
                    jx0 jx0Var = ndb.Z;
                    sc0 sc0Var = xc0.c;
                    c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var9, 48);
                    int iHashCode2 = Long.hashCode(l46Var9.T);
                    u8a u8aVarM2 = l46Var9.m();
                    j09 j09VarJ2 = m93.J(l46Var9, j09VarY2);
                    lf2.q.getClass();
                    l46Var9.j0();
                    if (l46Var9.S) {
                        l46Var9.l(ov7Var2);
                    } else {
                        l46Var9.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var9, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var9, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var9, numValueOf);
                    dec.k(l46Var9);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var9, j09VarJ2);
                    mue mueVar2 = pue.a;
                    nte.b(str5, null, l8b.b(l46Var9), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.m(l46Var9), l46Var9, 0, 0, 131066);
                    o5c.f(l46Var9, b.d(g09Var, 8.0f));
                    nte.b(str6, null, l8b.d(l46Var9), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var9), l46Var9, 0, 0, 131066);
                    fi8 fi8VarC = od4.C(str7, l46Var9);
                    jw7 jw7Var = new jw7(1.0f, true);
                    lx0 lx0Var = ndb.f;
                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                    int iHashCode3 = Long.hashCode(l46Var9.T);
                    u8a u8aVarM3 = l46Var9.m();
                    j09 j09VarJ3 = m93.J(l46Var9, jw7Var);
                    l46Var9.j0();
                    if (l46Var9.S) {
                        ov7Var = ov7Var2;
                        l46Var9.l(ov7Var);
                    } else {
                        ov7Var = ov7Var2;
                        l46Var9.s0();
                    }
                    dec.l(he2Var, l46Var9, xn8VarC2);
                    dec.l(he2Var2, l46Var9, u8aVarM3);
                    ib8.s(iHashCode3, l46Var9, he2Var3, l46Var9);
                    dec.l(he2Var4, l46Var9, j09VarJ3);
                    mh3.f((uh8) fi8VarC.getValue(), dj6.w(g09Var, 1.0f), false, false, 0.0f, Integer.MAX_VALUE, false, false, false, false, null, false, false, lx0Var, an2.d, false, false, null, false, null, l46Var9, 1572912, 1769472, 0, 4095932);
                    l46Var9.r(true);
                    j09 j09VarB0 = ynb.b0(56.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    c92 c92VarA2 = a92.a(sc0Var, ndb.Y, l46Var9, 0);
                    int iHashCode4 = Long.hashCode(l46Var9.T);
                    u8a u8aVarM4 = l46Var9.m();
                    j09 j09VarJ4 = m93.J(l46Var9, j09VarB0);
                    l46Var9.j0();
                    if (l46Var9.S) {
                        l46Var9.l(ov7Var);
                    } else {
                        l46Var9.s0();
                    }
                    dec.l(he2Var, l46Var9, c92VarA2);
                    dec.l(he2Var2, l46Var9, u8aVarM4);
                    ib8.s(iHashCode4, l46Var9, he2Var3, l46Var9);
                    dec.l(he2Var4, l46Var9, j09VarJ4);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    lx0 lx0Var2 = ndb.b;
                    xn8 xn8VarC3 = s21.c(lx0Var2, false);
                    int iHashCode5 = Long.hashCode(l46Var9.T);
                    u8a u8aVarM5 = l46Var9.m();
                    j09 j09VarJ5 = m93.J(l46Var9, j09VarC);
                    l46Var9.j0();
                    if (l46Var9.S) {
                        l46Var9.l(ov7Var);
                    } else {
                        l46Var9.s0();
                    }
                    dec.l(he2Var, l46Var9, xn8VarC3);
                    dec.l(he2Var2, l46Var9, u8aVarM5);
                    ib8.s(iHashCode5, l46Var9, he2Var3, l46Var9);
                    dec.l(he2Var4, l46Var9, j09VarJ5);
                    j09 j09VarA = d31.a.a(ynb.b0(4.0f, 0.0f, tm7.o(oa7.E(g09Var, a7c.a()), l8b.j(l46Var9), g21.f), 2), new lx0((((Number) h0eVar.getValue()).floatValue() - 0.5f) * 2.0f, 0.0f));
                    xn8 xn8VarC4 = s21.c(lx0Var2, false);
                    int iHashCode6 = Long.hashCode(l46Var9.T);
                    u8a u8aVarM6 = l46Var9.m();
                    j09 j09VarJ6 = m93.J(l46Var9, j09VarA);
                    l46Var9.j0();
                    if (l46Var9.S) {
                        l46Var9.l(ov7Var);
                    } else {
                        l46Var9.s0();
                    }
                    dec.l(he2Var, l46Var9, xn8VarC4);
                    dec.l(he2Var2, l46Var9, u8aVarM6);
                    ib8.s(iHashCode6, l46Var9, he2Var3, l46Var9);
                    dec.l(he2Var4, l46Var9, j09VarJ6);
                    nte.b(ub3.g((int) (((Number) h0eVar.getValue()).floatValue() * 100.0f), "%"), null, l8b.d(l46Var9), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var9), l46Var9, 0, 0, 131066);
                    l46Var9.r(true);
                    l46Var9.r(true);
                    o5c.f(l46Var9, b.d(g09Var, 4.0f));
                    boolean zG4 = l46Var9.g(h0eVar);
                    Object objR10 = l46Var9.R();
                    if (zG4) {
                        i8cVar = i8cVar2;
                    } else {
                        i8cVar = i8cVar2;
                        if (objR10 == i8cVar) {
                        }
                        x16 x16Var4 = (x16) objR10;
                        j09 j09VarD2 = b.d(b.c(g09Var, 1.0f), 8.0f);
                        objR = l46Var9.R();
                        if (objR == i8cVar) {
                            objR = new oz5(3);
                            l46Var9.p0(objR);
                        }
                        axa.c(x16Var4, j09VarD2, 0L, 0L, 0, -8.0f, (a26) objR, l46Var9, 1769520, 28);
                        ib8.t(l46Var9, true, g09Var, 8.0f, l46Var9);
                        nte.b(afc.q(R.string.annual_generating_exit_tip, l46Var9), null, l8b.c(l46Var9), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var9), l46Var9, 0, 0, 131066);
                        tec.u(g09Var, 24.0f, l46Var9, true);
                    }
                    objR10 = new zk1(4, h0eVar);
                    l46Var9.p0(objR10);
                    x16 x16Var5 = (x16) objR10;
                    j09 j09VarD3 = b.d(b.c(g09Var, 1.0f), 8.0f);
                    objR = l46Var9.R();
                    if (objR == i8cVar) {
                        objR = new oz5(3);
                        l46Var9.p0(objR);
                    }
                    axa.c(x16Var5, j09VarD3, 0L, 0L, 0, -8.0f, (a26) objR, l46Var9, 1769520, 28);
                    ib8.t(l46Var9, true, g09Var, 8.0f, l46Var9);
                    nte.b(afc.q(R.string.annual_generating_exit_tip, l46Var9), null, l8b.c(l46Var9), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var9), l46Var9, 0, 0, 131066);
                    tec.u(g09Var, 24.0f, l46Var9, true);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 8:
                z63 z63Var = (z63) obj11;
                LocalDate localDate = (LocalDate) obj10;
                LocalDate localDate2 = (LocalDate) obj9;
                a26 a26Var3 = (a26) obj8;
                l46 l46Var10 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var10.W(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    j09 j09VarO = tm7.o(oa7.E(androidx.compose.ui.platform.b.a(b.c(b.d(g09Var, 130.0f), 1.0f), "calendar_daily_fortune_drawn"), eze.a(l46Var10).e.c.a), kn2.J(l46Var10), g21.f);
                    boolean zIsAfter = localDate.isAfter(localDate2);
                    boolean zG5 = l46Var10.g(a26Var3) | l46Var10.i(z63Var);
                    Object objR11 = l46Var10.R();
                    if (zG5 || objR11 == i8cVar2) {
                        objR11 = new jf6(2, a26Var3, z63Var);
                        l46Var10.p0(objR11);
                    }
                    n16.i(j09VarO, z63Var, zIsAfter, (x16) objR11, l46Var10, 64);
                    jgb.p(fbf.Block, l46Var10, 6, 0);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case 9:
                x16 x16Var6 = (x16) obj11;
                p29 p29Var = (p29) obj10;
                x16 x16Var7 = (x16) obj9;
                x16 x16Var8 = (x16) obj8;
                l46 l46Var11 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var11.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    xdc.a(b.c, af1.b0(-1663850884, new m65(x16Var6, p29Var, x16Var7, 17), l46Var11), af1.b0(133599579, new fi4(12, x16Var8), l46Var11), null, null, 0, y72.j, 0L, null, af1.b0(-790109871, new g20(20, p29Var), l46Var11), l46Var11, 806879670, 440);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                final gj9 gj9Var = (gj9) obj11;
                final Context context = (Context) obj10;
                uo uoVar = (uo) obj9;
                h0e h0eVar2 = (h0e) obj8;
                xw9 xw9Var4 = (xw9) obj;
                l46 l46Var12 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                xw9Var4.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= l46Var12.g(xw9Var4) ? 4 : 2;
                }
                if (l46Var12.W(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    j09 j09VarG = k8b.g(mh3.d0(ynb.Y(g09Var, xw9Var4), mh3.T(l46Var12), false, 14), new ie2(22), l46Var12, 0);
                    c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var12, 6);
                    int iHashCode7 = Long.hashCode(l46Var12.T);
                    u8a u8aVarM7 = l46Var12.m();
                    j09 j09VarJ7 = m93.J(l46Var12, j09VarG);
                    lf2.q.getClass();
                    l46Var12.j0();
                    if (l46Var12.S) {
                        l46Var12.l(ov7Var2);
                    } else {
                        l46Var12.s0();
                    }
                    dec.l(hj6.z, l46Var12, c92VarA3);
                    dec.l(hj6.y, l46Var12, u8aVarM7);
                    dec.l(hj6.X, l46Var12, Integer.valueOf(iHashCode7));
                    dec.k(l46Var12);
                    dec.l(hj6.x, l46Var12, j09VarJ7);
                    String strQ = afc.q(R.string.notification_settings_daily_title, l46Var12);
                    boolean z2 = ((qi9) h0eVar2.getValue()).b;
                    boolean z3 = ((qi9) h0eVar2.getValue()).a;
                    int i3 = ((qi9) h0eVar2.getValue()).c;
                    int i4 = ((qi9) h0eVar2.getValue()).d;
                    boolean z4 = ((qi9) h0eVar2.getValue()).e;
                    boolean zI2 = l46Var12.i(gj9Var) | l46Var12.i(context);
                    Object objR12 = l46Var12.R();
                    if (zI2 || objR12 == i8cVar2) {
                        final int i5 = 0;
                        obj5 = new a26() { // from class: oi9
                            @Override // defpackage.a26
                            public final Object d(Object obj13) {
                                int i6 = i5;
                                wef wefVar2 = wef.a;
                                Context context2 = context;
                                gj9 gj9Var2 = gj9Var;
                                boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                                switch (i6) {
                                    case 0:
                                        context2.getClass();
                                        a62 a62VarA = hwf.a(gj9Var2);
                                        js3 js3Var = ga4.a;
                                        ynb.V(a62VarA, hr3.c, null, new dj9(gj9Var2, zBooleanValue, context2, null), 2);
                                        break;
                                    default:
                                        context2.getClass();
                                        a62 a62VarA2 = hwf.a(gj9Var2);
                                        js3 js3Var2 = ga4.a;
                                        ynb.V(a62VarA2, hr3.c, null, new fj9(gj9Var2, zBooleanValue, context2, null), 2);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var12.p0(obj5);
                    } else {
                        obj5 = objR12;
                    }
                    a26 a26Var4 = (a26) obj5;
                    boolean zI3 = l46Var12.i(gj9Var);
                    Object objR13 = l46Var12.R();
                    if (zI3 || objR13 == i8cVar2) {
                        objR13 = new sk3(0, gj9Var, gj9.class, "onTodayTimeClicked", "onTodayTimeClicked()V", 0, 24);
                        l46Var12.p0(objR13);
                    }
                    x16 x16Var9 = (x16) ((ym7) objR13);
                    boolean zI4 = l46Var12.i(gj9Var) | l46Var12.i(context);
                    Object objR14 = l46Var12.R();
                    if (zI4 || objR14 == i8cVar2) {
                        final int i6 = 1;
                        obj6 = new l26() { // from class: li9
                            @Override // defpackage.l26
                            public final Object z(Object obj13, Object obj14) {
                                iy9 iy9Var;
                                int i7 = i6;
                                wef wefVar2 = wef.a;
                                Integer num = (Integer) obj13;
                                switch (i7) {
                                    case 0:
                                        int iIntValue11 = num.intValue();
                                        int iIntValue12 = ((Integer) obj14).intValue();
                                        Context context2 = context;
                                        context2.getClass();
                                        if (iIntValue11 < 18) {
                                            iy9Var = new iy9(18, 0);
                                        } else {
                                            iy9Var = iIntValue11 > 23 ? new iy9(23, 59) : new iy9(num, Integer.valueOf(mh3.o(iIntValue12, 0, 59)));
                                        }
                                        int iIntValue13 = ((Number) iy9Var.a()).intValue();
                                        int iIntValue14 = ((Number) iy9Var.b()).intValue();
                                        gj9 gj9Var2 = gj9Var;
                                        a62 a62VarA = hwf.a(gj9Var2);
                                        js3 js3Var = ga4.a;
                                        ynb.V(a62VarA, hr3.c, null, new yi9(context2, iIntValue13, iIntValue14, gj9Var2, null), 2);
                                        break;
                                    default:
                                        int iIntValue15 = num.intValue();
                                        int iIntValue16 = ((Integer) obj14).intValue();
                                        Context context3 = context;
                                        context3.getClass();
                                        gj9 gj9Var3 = gj9Var;
                                        a62 a62VarA2 = hwf.a(gj9Var3);
                                        js3 js3Var2 = ga4.a;
                                        ynb.V(a62VarA2, hr3.c, null, new xi9(context3, iIntValue15, iIntValue16, gj9Var3, null), 2);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var12.p0(obj6);
                    } else {
                        obj6 = objR14;
                    }
                    pi9.c(strQ, z2, z3, i3, i4, z4, a26Var4, x16Var9, (l26) obj6, null, l46Var12, 0, 512);
                    String strQ2 = afc.q(R.string.notification_settings_tomorrow_title, l46Var12);
                    boolean z5 = ((qi9) h0eVar2.getValue()).f;
                    boolean z6 = ((qi9) h0eVar2.getValue()).a;
                    int i7 = ((qi9) h0eVar2.getValue()).g;
                    int i8 = ((qi9) h0eVar2.getValue()).h;
                    boolean z7 = ((qi9) h0eVar2.getValue()).i;
                    boolean zI5 = l46Var12.i(gj9Var) | l46Var12.i(context);
                    Object objR15 = l46Var12.R();
                    if (zI5 || objR15 == i8cVar2) {
                        final int i9 = 1;
                        obj7 = new a26() { // from class: oi9
                            @Override // defpackage.a26
                            public final Object d(Object obj13) {
                                int i10 = i9;
                                wef wefVar2 = wef.a;
                                Context context2 = context;
                                gj9 gj9Var2 = gj9Var;
                                boolean zBooleanValue = ((Boolean) obj13).booleanValue();
                                switch (i10) {
                                    case 0:
                                        context2.getClass();
                                        a62 a62VarA = hwf.a(gj9Var2);
                                        js3 js3Var = ga4.a;
                                        ynb.V(a62VarA, hr3.c, null, new dj9(gj9Var2, zBooleanValue, context2, null), 2);
                                        break;
                                    default:
                                        context2.getClass();
                                        a62 a62VarA2 = hwf.a(gj9Var2);
                                        js3 js3Var2 = ga4.a;
                                        ynb.V(a62VarA2, hr3.c, null, new fj9(gj9Var2, zBooleanValue, context2, null), 2);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var12.p0(obj7);
                    } else {
                        obj7 = objR15;
                    }
                    a26 a26Var5 = (a26) obj7;
                    boolean zI6 = l46Var12.i(gj9Var);
                    Object objR16 = l46Var12.R();
                    if (zI6 || objR16 == i8cVar2) {
                        objR16 = new sk3(0, gj9Var, gj9.class, "onTomorrowTimeClicked", "onTomorrowTimeClicked()V", 0, 25);
                        l46Var12.p0(objR16);
                    }
                    x16 x16Var10 = (x16) ((ym7) objR16);
                    boolean zI7 = l46Var12.i(gj9Var) | l46Var12.i(context);
                    Object objR17 = l46Var12.R();
                    if (zI7 || objR17 == i8cVar2) {
                        final int i10 = 0;
                        objR17 = new l26() { // from class: li9
                            @Override // defpackage.l26
                            public final Object z(Object obj13, Object obj14) {
                                iy9 iy9Var;
                                int i11 = i10;
                                wef wefVar2 = wef.a;
                                Integer num = (Integer) obj13;
                                switch (i11) {
                                    case 0:
                                        int iIntValue11 = num.intValue();
                                        int iIntValue12 = ((Integer) obj14).intValue();
                                        Context context2 = context;
                                        context2.getClass();
                                        if (iIntValue11 < 18) {
                                            iy9Var = new iy9(18, 0);
                                        } else {
                                            iy9Var = iIntValue11 > 23 ? new iy9(23, 59) : new iy9(num, Integer.valueOf(mh3.o(iIntValue12, 0, 59)));
                                        }
                                        int iIntValue13 = ((Number) iy9Var.a()).intValue();
                                        int iIntValue14 = ((Number) iy9Var.b()).intValue();
                                        gj9 gj9Var2 = gj9Var;
                                        a62 a62VarA = hwf.a(gj9Var2);
                                        js3 js3Var = ga4.a;
                                        ynb.V(a62VarA, hr3.c, null, new yi9(context2, iIntValue13, iIntValue14, gj9Var2, null), 2);
                                        break;
                                    default:
                                        int iIntValue15 = num.intValue();
                                        int iIntValue16 = ((Integer) obj14).intValue();
                                        Context context3 = context;
                                        context3.getClass();
                                        gj9 gj9Var3 = gj9Var;
                                        a62 a62VarA2 = hwf.a(gj9Var3);
                                        js3 js3Var2 = ga4.a;
                                        ynb.V(a62VarA2, hr3.c, null, new xi9(context3, iIntValue15, iIntValue16, gj9Var3, null), 2);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var12.p0(objR17);
                    }
                    pi9.c(strQ2, z5, z6, i7, i8, z7, a26Var5, x16Var10, (l26) objR17, new z67(18, 23, 1), l46Var12, 0, 0);
                    b4d.j(null, null, af1.b0(-876953298, new s19(2, gj9Var, h0eVar2), l46Var12), l46Var12, 384, 3);
                    if (((qi9) h0eVar2.getValue()).a) {
                        l46Var12.f0(-852262637);
                        l46Var12.r(false);
                    } else {
                        l46Var12.f0(-852347205);
                        boolean zI8 = l46Var12.i(uoVar);
                        Object objR18 = l46Var12.R();
                        if (zI8 || objR18 == i8cVar2) {
                            objR18 = new q83(uoVar, 2);
                            l46Var12.p0(objR18);
                        }
                        pi9.d((x16) objR18, l46Var12, 0);
                        l46Var12.r(false);
                    }
                    tec.u(g09Var, 24.0f, l46Var12, true);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return a(obj, obj2, obj3);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return e(obj, obj2, obj3);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return f(obj, obj2, obj3);
            case 14:
                return g(obj, obj2, obj3);
            case 15:
                return h(obj, obj2, obj3);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return i(obj, obj2, obj3);
            case 17:
                return j(obj, obj2, obj3);
            case 18:
                return k(obj, obj2, obj3);
            case 19:
                return l(obj, obj2, obj3);
            default:
                x16 x16Var11 = (x16) obj11;
                aw2 aw2Var2 = (aw2) obj10;
                ted tedVar = (ted) obj9;
                x16 x16Var12 = (x16) obj8;
                c31 c31Var = (c31) obj;
                l46 l46Var13 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                c31Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= l46Var13.g(c31Var) ? 4 : 2;
                }
                if (l46Var13.W(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    j09 j09VarZ = ynb.Z(g09Var, 32.0f);
                    c92 c92VarA4 = a92.a(new uc0(24.0f, true, new qc0(0)), ndb.Y, l46Var13, 6);
                    int iHashCode8 = Long.hashCode(l46Var13.T);
                    u8a u8aVarM8 = l46Var13.m();
                    j09 j09VarJ8 = m93.J(l46Var13, j09VarZ);
                    lf2.q.getClass();
                    l46Var13.j0();
                    if (l46Var13.S) {
                        l46Var13.l(ov7Var2);
                    } else {
                        l46Var13.s0();
                    }
                    dec.l(hj6.z, l46Var13, c92VarA4);
                    dec.l(hj6.y, l46Var13, u8aVarM8);
                    dec.l(hj6.X, l46Var13, Integer.valueOf(iHashCode8));
                    dec.k(l46Var13);
                    dec.l(hj6.x, l46Var13, j09VarJ8);
                    t4c.f(0, 3, l46Var13, null, false);
                    String strQ3 = afc.q(R.string.widget_onboarding_guide_cta_popup, l46Var13);
                    boolean zI9 = l46Var13.i(aw2Var2) | l46Var13.g(tedVar) | l46Var13.g(x16Var12);
                    Object objR19 = l46Var13.R();
                    if (zI9 || objR19 == i8cVar2) {
                        objR19 = new m50(aw2Var2, tedVar, x16Var12, 9);
                        l46Var13.p0(objR19);
                    }
                    t4c.g(strQ3, (x16) objR19, null, l46Var13, 0, 4);
                    l46Var13.r(true);
                    c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, c31Var.a(g09Var, ndb.d)), false, 0L, 0L, null, x16Var11, l46Var13, 0, 30);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ sz7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
