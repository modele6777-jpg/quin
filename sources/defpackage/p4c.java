package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.b;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p4c implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p4c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        eue eueVar = null;
        i8c i8cVar = sf2.a;
        int i2 = 1;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                q4c.a((o4c) obj4, (dd2) obj3, (l46) obj, k99.P(385));
                return wefVar;
            case 1:
                jmb jmbVar = (jmb) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                float f = jmbVar.element;
                jmbVar.element = ((fhc) obj3).a(fFloatValue - f) + f;
                return wefVar;
            case 2:
                a26 a26Var = (a26) obj4;
                erc ercVar = (erc) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = l46Var.g(a26Var) | l46Var.i(ercVar);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new ykc(0, a26Var, ercVar);
                        l46Var.p0(objR);
                    }
                    j09 j09VarC = b.c(g09.a, false, null, null, (x16) objR, 15);
                    String strQ = afc.q(R.string.seasonal_follow_up_error, l46Var);
                    mue mueVar = pue.a;
                    nte.b(strQ, j09VarC, ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var), l46Var, 0, 0, 131064);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 3:
                ((Integer) obj2).getClass();
                ((aoc) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                o7c.h((fpc) obj4, (j09) obj3, (l46) obj, k99.P(49));
                return wefVar;
            case 5:
                String str = (String) obj;
                mue mueVar2 = (mue) obj2;
                str.getClass();
                mueVar2.getClass();
                return new yi4(((sw3) obj4).Z((int) (aue.a((aue) obj3, str, mueVar2, 0L, 1020).c >> 32)));
            case 6:
                ((Integer) obj2).getClass();
                d8c.e((fy9) obj4, (x16) obj3, (l46) obj, k99.P(9));
                return wefVar;
            case 7:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                tarotCardChoice.getClass();
                ((l26) obj4).z(tarotCardChoice, num);
                ((e89) obj3).setValue(null);
                return wefVar;
            case 8:
                a26 a26Var2 = (a26) obj4;
                rde rdeVar = (rde) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    s21.a((j09) a26Var2.d(rdeVar), l46Var2, 0);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 9:
                x16 x16Var = (x16) obj4;
                ii6 ii6Var = (ii6) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pa7.a(k8b.g(g09.a, new en6(ii6Var, i2), l46Var3, 6), y72.j, 0L, null, null, null, false, false, x16Var, l46Var3, 48, 252);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                tgc.b((zke) obj4, (a26) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                iwd iwdVar = (iwd) obj4;
                x16 x16Var2 = (x16) obj3;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dd2 dd2Var = m93.d;
                    dd2 dd2Var2 = m93.e;
                    boolean zI = l46Var4.i(iwdVar) | l46Var4.g(x16Var2);
                    Object objR2 = l46Var4.R();
                    if (zI || objR2 == i8cVar) {
                        objR2 = new ykc(14, iwdVar, x16Var2);
                        l46Var4.p0(objR2);
                    }
                    pa7.a(null, 0L, 0L, null, dd2Var, dd2Var2, false, false, (x16) objR2, l46Var4, 221184, 207);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                iwd iwdVar2 = (iwd) obj4;
                a26 a26Var3 = (a26) obj3;
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean z = iwdVar2.c;
                    boolean z2 = iwdVar2.d.j() == 0;
                    boolean zH = iwdVar2.h();
                    boolean z3 = !v4e.Q(iwdVar2.f());
                    boolean zI2 = l46Var5.i(iwdVar2);
                    Object objR3 = l46Var5.R();
                    if (zI2 || objR3 == i8cVar) {
                        objR3 = new hla(29, iwdVar2);
                        l46Var5.p0(objR3);
                    }
                    x16 x16Var3 = (x16) objR3;
                    boolean zI3 = l46Var5.i(iwdVar2) | l46Var5.g(a26Var3);
                    Object objR4 = l46Var5.R();
                    if (zI3 || objR4 == i8cVar) {
                        objR4 = new cwd(iwdVar2, a26Var3, 2);
                        l46Var5.p0(objR4);
                    }
                    x16 x16Var4 = (x16) objR4;
                    boolean zG2 = l46Var5.g(a26Var3) | l46Var5.i(iwdVar2);
                    Object objR5 = l46Var5.R();
                    if (zG2 || objR5 == i8cVar) {
                        objR5 = new cwd(a26Var3, iwdVar2);
                        l46Var5.p0(objR5);
                    }
                    o8c.e(z, z2, zH, z3, x16Var3, x16Var4, (x16) objR5, l46Var5, 0);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                ((psd) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 14:
                a26 a26Var4 = (a26) obj3;
                Bitmap bitmap = (Bitmap) obj;
                bitmap.getClass();
                if (((s7d) obj4).a() == null) {
                    a26Var4.d(bitmap);
                } else {
                    bitmap.recycle();
                }
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                ((gfa) obj4).e((Drawable) obj3, (l46) obj, k99.P(49));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                ((th2) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 17:
                cre creVar = (cre) obj4;
                aw2 aw2Var = (aw2) obj3;
                rme rmeVar = (rme) obj;
                Context context = (Context) obj2;
                boolean zH2 = creVar.h();
                k00 k00VarK = creVar.k();
                String str2 = k00VarK != null ? k00VarK.b : null;
                eue eueVar2 = creVar.v;
                if (eueVar2 != null) {
                    long j = eueVar2.a;
                    sl9 sl9Var = creVar.b;
                    eueVar = new eue(u3c.b(sl9Var.v((int) (j >> 32)), sl9Var.v((int) (j & 4294967295L))));
                }
                zfa.a(rmeVar, context, zH2, str2, eueVar, creVar.i, new bv9(creVar, aw2Var, context, 18));
                return wefVar;
            case 18:
                jse jseVar = (jse) obj4;
                Context context2 = (Context) obj2;
                boolean zM = jseVar.m();
                z2f z2fVar = jseVar.a;
                zfa.a((rme) obj, context2, zM, z2fVar.d().c, new eue(z2fVar.d().d), jseVar.f, new bv9(jseVar, (aw2) obj3, context2, 21));
                return wefVar;
            case 19:
                m82 m82Var = (m82) obj4;
                dd2 dd2Var3 = (dd2) obj3;
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    s5d s5dVar = i5d.a;
                    p9f p9fVar = (p9f) l46Var6.k(r9f.a);
                    pr4 pr4Var = x8b.a;
                    p9fVar.getClass();
                    yp5 yp5Var = ((y8b) l46Var6.k(x8b.a)).b;
                    byte b = 0;
                    vm8.b(m82Var, s5dVar, new p9f(mue.a(p9fVar.a, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.b, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.c, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.d, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.e, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.f, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.g, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.h, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.i, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.j, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.k, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.l, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.m, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.n, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), mue.a(p9fVar.o, 0L, 0L, null, yp5Var, 0L, null, 0, 0L, null, null, 16777183), p9fVar.p, p9fVar.q, p9fVar.r, p9fVar.s, p9fVar.t, p9fVar.u, p9fVar.v, p9fVar.w, p9fVar.x, p9fVar.y, p9fVar.z, p9fVar.A, p9fVar.B, p9fVar.C, p9fVar.D), af1.b0(437353223, new dve(dd2Var3, b, b), l46Var6), l46Var6, 3072, 0);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 20:
                r0 r0Var = (r0) obj3;
                TarotCardChoice tarotCardChoice2 = (TarotCardChoice) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tarotCardChoice2.getClass();
                ((rcf) obj4).l(tarotCardChoice2, iIntValue7);
                if (r0Var != null) {
                    ConcurrentHashMap concurrentHashMap = xfb.a;
                    xfb.d(r0Var.I0);
                }
                return wefVar;
            case 21:
                ((Integer) obj2).getClass();
                ief.e((j09) obj4, (cv6) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 22:
                ((Integer) obj2).getClass();
                ((ws4) obj4).V((dd2) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 23:
                ((Integer) obj2).getClass();
                o8c.h((qmf) obj4, (x16) obj3, (l46) obj, k99.P(9));
                return wefVar;
            case 24:
                ((Integer) obj2).getClass();
                ((b1g) obj4).a((x16) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 25:
                ((Integer) obj2).getClass();
                rrb.g((x16) obj4, (x2g) obj3, (l46) obj, k99.P(1));
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                q1c.d((r4g) obj4, (x16) obj3, (l46) obj, k99.P(7));
                return wefVar;
        }
    }

    public /* synthetic */ p4c(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
