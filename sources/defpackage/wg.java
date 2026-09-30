package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.ConversationRoute;
import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.k;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import ai.askquin.ui.persistence.database.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wg implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wg(aw2 aw2Var, ht6 ht6Var, p5a p5aVar, fab fabVar) {
        this.a = 11;
        this.b = aw2Var;
        this.c = ht6Var;
        this.e = p5aVar;
        this.d = fabVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01d9  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        Object dzbVar;
        ycc yccVarA;
        int i = this.a;
        List listH = pu4.a;
        p05 p05Var = p05.a;
        int i2 = 3;
        Throwable th = null;
        int i3 = 0;
        int i4 = 1;
        wef wefVar = wef.a;
        Object obj2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                n07 n07Var = (n07) obj3;
                String str = (String) obj4;
                p5a p5aVar = (p5a) obj2;
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a(ym8.I(n07Var), "action");
                l1fVar.a("paywall_a", "pathway");
                l1fVar.a((String) obj5, "triggered_by");
                l1fVar.a(n07Var.g().a(), "product_id");
                if (str != null) {
                    l1fVar.a(str, "blocked_reason");
                }
                if9.o(l1fVar, p5aVar);
                return wefVar;
            case 1:
                jx jxVar = (jx) obj3;
                wz wzVar = (wz) obj5;
                a26 a26Var = (a26) obj4;
                imb imbVar = (imb) obj2;
                uz uzVar = (uz) obj;
                hkg.S0(uzVar, jxVar.c);
                vz9 vz9Var = uzVar.e;
                Object objC = jxVar.c(vz9Var.getValue());
                if (!pa7.t(objC, vz9Var.getValue())) {
                    jxVar.c.b.setValue(objC);
                    wzVar.b.setValue(objC);
                    if (a26Var != null) {
                        a26Var.d(jxVar);
                    }
                    uzVar.a();
                    imbVar.element = true;
                } else if (a26Var != null) {
                    a26Var.d(jxVar);
                }
                return wefVar;
            case 2:
                s69 s69Var = (s69) obj5;
                e89 e89Var = (e89) obj4;
                e89 e89Var2 = (e89) obj2;
                String str2 = (String) obj;
                str2.getClass();
                ((e89) obj3).setValue(str2);
                try {
                    xh7 xh7Var = gs1.a;
                    xh7Var.getClass();
                    CardLayoutConfig cardLayoutConfig = (CardLayoutConfig) xh7Var.b(CardLayoutConfig.Companion.serializer(), str2);
                    if (cardLayoutConfig.getCardCount() == ((sz9) s69Var).j()) {
                        e89Var.setValue(cardLayoutConfig);
                        e89Var2.setValue(null);
                    } else {
                        e89Var2.setValue("cardCount mismatch: expected " + ((sz9) s69Var).j() + ", got " + cardLayoutConfig.getCardCount());
                    }
                    break;
                } catch (Exception e) {
                    e89Var2.setValue(e.getMessage());
                }
                return wefVar;
            case 3:
                x48 x48Var = (x48) obj3;
                ((ra4) obj).getClass();
                ap2 ap2Var = new ap2((mma) obj5, (e89) obj4, (e89) obj2, 0);
                x48Var.k().a(ap2Var);
                return new oe0(i2, x48Var, ap2Var);
            case 4:
                vb2 vb2Var = (vb2) obj3;
                ((ra4) obj).getClass();
                vo2 vo2Var = new vo2(vb2Var, (aw2) obj5, (q7b) obj4, (gd8) obj2, 0);
                vb2Var.z.add(vo2Var);
                return new oe0(9, vb2Var, vo2Var);
            case 5:
                r38 r38Var = (r38) obj3;
                gte gteVar = (gte) obj5;
                zse zseVar = (zse) obj4;
                rx6 rx6Var = (rx6) obj2;
                if (r38Var.b()) {
                    fz3 fz3Var = r38Var.d;
                    ou2 ou2Var = r38Var.v;
                    ou2 ou2Var2 = r38Var.w;
                    mmb mmbVar = new mmb();
                    bv9 bv9Var = new bv9(fz3Var, ou2Var, mmbVar, 16);
                    gga ggaVar = gteVar.a;
                    ggaVar.h(zseVar, rx6Var, bv9Var, ou2Var2);
                    jte jteVar = new jte(gteVar, ggaVar);
                    gteVar.b.set(jteVar);
                    mmbVar.element = jteVar;
                    r38Var.e = jteVar;
                }
                return new ou(i2);
            case 6:
                y63 y63Var = (y63) obj3;
                Context context = (Context) obj4;
                String str3 = (String) obj5;
                x48 x48Var2 = (x48) obj2;
                ((ra4) obj).getClass();
                y63Var.h(context, str3, false, null);
                ap2 ap2Var2 = new ap2(y63Var, context, str3, i4);
                x48Var2.k().a(ap2Var2);
                return new oe0(11, x48Var2, ap2Var2);
            case 7:
                gh6 gh6Var = (gh6) obj5;
                a26 a26Var2 = (a26) obj4;
                oia oiaVar = (oia) obj;
                z7c.h((ctf) obj3, oiaVar);
                qz9 qz9Var = (qz9) ((n69) obj2);
                float fJ = qz9Var.j();
                qz9Var.k((Float.intBitsToFloat((int) (xo1.H(oiaVar, false) >> 32)) * 0.4f) + fJ);
                if (!(((float) Math.floor((double) (fJ / 90.0f))) == ((float) Math.floor((double) (qz9Var.j() / 90.0f))))) {
                    gh6Var.a();
                }
                a26Var2.d(Float.valueOf(qz9Var.j()));
                oiaVar.a();
                return wefVar;
            case 8:
                a26 a26Var3 = (a26) obj3;
                e89 e89Var3 = (e89) obj5;
                e89 e89Var4 = (e89) obj4;
                e89 e89Var5 = (e89) obj2;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                tarotSkinIdentify.getClass();
                if (((xh3) e89Var3.getValue()) == xh3.a) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05Var, new ri3(i2, tarotSkinIdentify), 2);
                    a26Var3.d(tarotSkinIdentify);
                    e89Var4.setValue(Boolean.TRUE);
                    e89Var5.setValue(Boolean.FALSE);
                    e89Var3.setValue(xh3.b);
                }
                return wefVar;
            case 9:
                a26 a26Var4 = (a26) obj3;
                e89 e89Var6 = (e89) obj5;
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) obj4;
                e89 e89Var7 = (e89) obj2;
                ArcanaGroup arcanaGroup = (ArcanaGroup) obj;
                arcanaGroup.getClass();
                String str4 = ((dwf) e89Var6.getValue()) == dwf.a ? "play_view" : "chart_view";
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new w6(arcanaGroup, str4, tarotSkinIdentify2, 26), 2);
                int iOrdinal = ((dwf) e89Var6.getValue()).ordinal();
                if (iOrdinal == 0) {
                    a26Var4.d(arcanaGroup);
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return null;
                    }
                    e89Var7.setValue(arcanaGroup);
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                jmb jmbVar = (jmb) obj3;
                uq3 uq3Var = (uq3) obj2;
                uz uzVar2 = (uz) obj;
                float fFloatValue = ((Number) uzVar2.e.getValue()).floatValue() - jmbVar.element;
                float fA = ((fhc) obj5).a(fFloatValue);
                jmbVar.element = ((Number) uzVar2.e.getValue()).floatValue();
                ((jmb) obj4).element = ((Number) uzVar2.b()).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    uzVar2.a();
                }
                uq3Var.getClass();
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ynb.V((aw2) obj3, null, null, new h54(((Boolean) obj).booleanValue(), (ht6) obj5, (p5a) obj2, (fab) obj4, null), 3);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                vb4 vb4Var = (vb4) obj2;
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("SELECT id,createAt,updateAt,drawnAt,title,messageCount,hasFeedback,sceneTarot,interruptedDrawing,divinationType,usedSkinType,selectedAiSpreadIndex,physicalDeckReading,previewMessage,readState,summaryCards,isLocalOnly FROM divination WHERE deletedAt IS NULL AND accountId = ? AND createAt BETWEEN ? AND ? ORDER BY createAt DESC");
                try {
                    x8cVarW0.Q(1, str5);
                    x8cVarW0.Q(2, str6);
                    x8cVarW0.Q(3, str7);
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW0.R0()) {
                        String strT0 = x8cVarW0.t0(0);
                        String strT1 = x8cVarW0.isNull(1) ? null : x8cVarW0.t0(1);
                        yx4 yx4Var = vb4Var.b;
                        Instant instantI = yx4.i(strT1);
                        if (instantI == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        Instant instantI2 = yx4.i(x8cVarW0.isNull(2) ? null : x8cVarW0.t0(2));
                        if (instantI2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        Instant instantI3 = yx4.i(x8cVarW0.isNull(3) ? null : x8cVarW0.t0(3));
                        String strT2 = x8cVarW0.t0(4);
                        int i5 = (int) x8cVarW0.getLong(5);
                        boolean z = ((int) x8cVarW0.getLong(6)) != 0;
                        String strT3 = x8cVarW0.isNull(7) ? null : x8cVarW0.t0(7);
                        xh7 xh7Var2 = fzc.a;
                        SceneTarot sceneTarot = strT3 == null ? null : (SceneTarot) xh7Var2.b(SceneTarot.Companion.serializer(), strT3);
                        String strT4 = x8cVarW0.isNull(8) ? null : x8cVarW0.t0(8);
                        InterruptedDrawing interruptedDrawing = strT4 == null ? null : (InterruptedDrawing) xh7Var2.b(InterruptedDrawing.Companion.serializer(), strT4);
                        String strT5 = x8cVarW0.isNull(9) ? null : x8cVarW0.t0(9);
                        String strT6 = x8cVarW0.isNull(10) ? null : x8cVarW0.t0(10);
                        Integer numValueOf = x8cVarW0.isNull(11) ? null : Integer.valueOf((int) x8cVarW0.getLong(11));
                        String strT7 = x8cVarW0.isNull(12) ? null : x8cVarW0.t0(12);
                        PhysicalDeckReading physicalDeckReading = strT7 == null ? null : (PhysicalDeckReading) xh7Var2.b(PhysicalDeckReading.Companion.serializer(), strT7);
                        String strT8 = x8cVarW0.t0(13);
                        String strT9 = x8cVarW0.t0(14);
                        strT9.getClass();
                        try {
                            dzbVar = tdb.valueOf(strT9);
                        } catch (Throwable th2) {
                            dzbVar = new dzb(th2);
                        }
                        Object obj6 = tdb.b;
                        if (dzbVar instanceof dzb) {
                            dzbVar = obj6;
                        }
                        arrayList.add(new lc4(strT0, instantI, instantI2, instantI3, strT2, i5, z, sceneTarot, interruptedDrawing, strT5, strT6, numValueOf, physicalDeckReading, strT8, (tdb) dzbVar, d.b(x8cVarW0.isNull(15) ? null : x8cVarW0.t0(15)), ((int) x8cVarW0.getLong(16)) != 0));
                        break;
                    }
                    x8cVarW0.close();
                    return arrayList;
                } catch (Throwable th3) {
                    x8cVarW0.close();
                    throw th3;
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                fcb fcbVar = (fcb) obj3;
                r0 r0Var = (r0) obj5;
                ka9 ka9Var = (ka9) obj4;
                fo4 fo4Var = (fo4) obj2;
                DrawCardSaves drawCardSaves = (DrawCardSaves) obj;
                drawCardSaves.getClass();
                ynb.V(fcbVar.b, null, null, new ccb(fcbVar, null), 3);
                if (r0Var.g0()) {
                    r0Var.N1();
                    r0Var.z1(null);
                    ka9Var.f(job.a.b(ConversationRoute.Conversation.class), false);
                } else {
                    ((dr2) fo4Var).a(drawCardSaves);
                }
                return wefVar;
            case 14:
                gbd gbdVar = gbd.e;
                e89 e89Var8 = (e89) obj4;
                e89 e89Var9 = (e89) obj2;
                l06 l06Var = (l06) obj;
                l06Var.getClass();
                ((a16) obj3).a.a = v06.b;
                k16.a(t06.OpenSheet);
                ((Context) obj5).getClass();
                try {
                    listH = t72.H(gbdVar);
                    break;
                } catch (Exception unused) {
                }
                Set setO1 = s72.o1(listH);
                c78 c78VarW = t72.w();
                c78VarW.add(u06.CopyLink);
                if (setO1.contains(gbd.c)) {
                    c78VarW.add(u06.WeChat);
                }
                if (setO1.contains(gbd.d)) {
                    c78VarW.add(u06.WeChatMoments);
                }
                if (setO1.contains(gbdVar)) {
                    c78VarW.add(u06.System);
                }
                e89Var8.setValue(c78VarW.n());
                e89Var9.setValue(l06Var);
                return wefVar;
            case 15:
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                z66 z66Var = (z66) obj5;
                Context context2 = z66Var.d;
                Executor executor = (Executor) obj4;
                iy2 iy2Var = (iy2) obj2;
                p6a p6aVar = (p6a) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!yy2.a(cancellationSignal)) {
                    Intent intent = new Intent(context2, (Class<?>) HiddenActivity.class);
                    ry2.a(z66Var.h, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", p6aVar.a);
                    try {
                        context2.startActivity(intent);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!yy2.a(cancellationSignal)) {
                            executor.execute(new vy2(iy2Var, 7));
                        }
                    }
                    break;
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                x48 x48Var3 = (x48) obj3;
                ((ra4) obj).getClass();
                ff ffVar = new ff((aw2) obj5, x48Var3, (mma) obj4, (e89) obj2, 1);
                x48Var3.k().a(ffVar);
                return new oe0(15, x48Var3, ffVar);
            case 17:
                p27 p27Var = (p27) obj5;
                jmb jmbVar2 = (jmb) obj4;
                aw2 aw2Var = (aw2) obj2;
                long jLongValue = ((Long) obj).longValue();
                h0e h0eVar = (h0e) ((e89) obj3).getValue();
                long jLongValue2 = h0eVar != null ? ((Number) h0eVar.getValue()).longValue() : jLongValue;
                long j = p27Var.c;
                p89 p89Var = p27Var.a;
                if (j == Long.MIN_VALUE || jmbVar2.element != hkg.v0(aw2Var.getCoroutineContext())) {
                    p27Var.c = jLongValue;
                    Object[] objArr = p89Var.a;
                    int i6 = p89Var.c;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((m27) objArr[i7]).f = true;
                    }
                    jmbVar2.element = hkg.v0(aw2Var.getCoroutineContext());
                }
                float f = jmbVar2.element;
                if (f == 0.0f) {
                    Object[] objArr2 = p89Var.a;
                    int i8 = p89Var.c;
                    for (int i9 = 0; i9 < i8; i9++) {
                        m27 m27Var = (m27) objArr2[i9];
                        m27Var.c.setValue(m27Var.d.c);
                        m27Var.f = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - p27Var.c) / f);
                    Object[] objArr3 = p89Var.a;
                    int i10 = p89Var.c;
                    boolean z2 = true;
                    for (int i11 = 0; i11 < i10; i11++) {
                        m27 m27Var2 = (m27) objArr3[i11];
                        boolean zF = m27Var2.e;
                        if (!zF) {
                            m27Var2.v.b.setValue(Boolean.FALSE);
                            if (m27Var2.f) {
                                m27Var2.f = false;
                                m27Var2.g = j2;
                            }
                            long j3 = j2 - m27Var2.g;
                            m27Var2.c.setValue(m27Var2.d.g(j3));
                            zF = m27Var2.d.f(j3);
                            m27Var2.e = zF;
                        }
                        if (!zF) {
                            z2 = false;
                        }
                    }
                    p27Var.d.setValue(Boolean.valueOf(!z2));
                }
                return wefVar;
            case 18:
                List list = (List) obj3;
                kmb kmbVar = (kmb) obj5;
                List list2 = (List) obj4;
                zw7 zw7Var = (zw7) obj2;
                vsa vsaVar = (vsa) obj;
                p6e p6eVar = vsaVar.e;
                int iD = p6eVar != null ? p6eVar.d() : 0;
                int iC = 0;
                for (int i12 = 0; i12 < iD; i12++) {
                    ks9 ks9Var = zw7Var.r;
                    p6e p6eVar2 = vsaVar.e;
                    iC += (int) (ks9Var == ks9.a ? (p6eVar2 != null ? p6eVar2.c(i12) : 0L) & 4294967295L : (p6eVar2 != null ? p6eVar2.c(i12) : 0L) >> 32);
                }
                if (list != null) {
                    list.add(Integer.valueOf(iC));
                }
                if (kmbVar.element != list2.size()) {
                    kmbVar.element++;
                }
                return wefVar;
            case 19:
                e08 e08Var = (e08) obj3;
                zi0 zi0Var = new zi0();
                zi0Var.b = (qz7) obj5;
                zi0Var.c = (q6e) obj4;
                zi0Var.d = (wsa) obj2;
                zi0Var.a = true;
                e08Var.c = zi0Var;
                return new lf(15, e08Var);
            case 20:
                y72 y72Var = (y72) obj3;
                List list3 = (List) obj5;
                h0e h0eVar2 = (h0e) obj4;
                h0e h0eVar3 = (h0e) obj2;
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                vv7 vv7Var = (vv7) im2Var;
                xl1 xl1Var = vv7Var.a;
                vv7Var.a();
                if (y72Var != null) {
                    Iterator it = list3.iterator();
                    int i13 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            Throwable th4 = th;
                            t72.Z();
                            throw th4;
                        }
                        iy9 iy9Var = (iy9) next;
                        float fFloatValue2 = ((Number) iy9Var.e()).floatValue() * Float.intBitsToFloat((int) (xl1Var.f() >> 32));
                        float fFloatValue3 = ((Number) iy9Var.d()).floatValue() * Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L));
                        float fP0 = vv7Var.p0(i14);
                        long jB = y72.b(y72Var.a, i13 % 2 == 0 ? ((Number) h0eVar2.getValue()).floatValue() : 1.2f - ((Number) h0eVar2.getValue()).floatValue());
                        float fFloatValue4 = ((Number) h0eVar3.getValue()).floatValue() * fP0;
                        float f2 = fFloatValue4 / 2.5f;
                        zt ztVarA = cu.a();
                        ((vd9) xl1Var.b.c).I(fFloatValue2, fFloatValue3);
                        int i15 = i3;
                        while (i15 < 4) {
                            float f3 = (i15 * 90.0f) + 90.0f;
                            Throwable th5 = th;
                            double d = f3;
                            Iterator it2 = it;
                            vv7 vv7Var2 = vv7Var;
                            float f4 = (-((float) Math.cos(Math.toRadians(d)))) * fFloatValue4;
                            float f5 = (-((float) Math.sin(Math.toRadians(d)))) * fFloatValue4;
                            double d2 = 45.0f + f3;
                            float fCos = ((float) Math.cos(Math.toRadians(d2))) * f2;
                            float fSin = ((float) Math.sin(Math.toRadians(d2))) * f2;
                            if (i15 == 0) {
                                ztVarA.h(f4, f5);
                            } else {
                                ztVarA.g(f4, f5);
                            }
                            ztVarA.g(fCos, fSin);
                            i15++;
                            vv7Var = vv7Var2;
                            it = it2;
                            th = th5;
                        }
                        ztVarA.e();
                        sn4.R(im2Var, ztVarA, jB, null, 60);
                        i13 = i14;
                        i3 = 0;
                    }
                }
                return wefVar;
            case 21:
                jmb jmbVar3 = (jmb) obj3;
                d49 d49Var = (d49) obj5;
                dic dicVar = (dic) obj4;
                kf kfVar = (kf) obj2;
                uz uzVar3 = (uz) obj;
                float fFloatValue5 = ((Number) uzVar3.e.getValue()).floatValue() - jmbVar3.element;
                if (abg.I(fFloatValue5)) {
                    if (((Boolean) kfVar.d(Float.valueOf(jmbVar3.element))).booleanValue()) {
                        uzVar3.a();
                    }
                } else if (abg.I(fFloatValue5 - d49Var.c(dicVar, fFloatValue5))) {
                    jmbVar3.element += fFloatValue5;
                    if (((Boolean) kfVar.d(Float.valueOf(jmbVar3.element))).booleanValue()) {
                        uzVar3.a();
                    }
                } else {
                    uzVar3.a();
                }
                return wefVar;
            case 22:
                da9 da9Var = (da9) obj;
                da9Var.getClass();
                ((imb) obj3).element = true;
                ((ma9) obj5).a((ua9) obj4, (Bundle) obj2, da9Var, listH);
                return wefVar;
            case 23:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                di9 di9Var = di9.a;
                di9.c((Context) obj3, (String) ((AtomicReference) obj5).getAndSet(null), zBooleanValue, false);
                ((a26) ((e89) obj4).getValue()).d(new vh9(zBooleanValue, ((ei9) ((e89) obj2).getValue()).a));
                return wefVar;
            case 24:
                lve lveVar = (lve) obj3;
                mfc mfcVar = (mfc) obj;
                mfcVar.getClass();
                ((e89) obj4).setValue(Boolean.TRUE);
                Context applicationContext = ((Context) obj5).getApplicationContext();
                applicationContext.getClass();
                x16 x16Var = (x16) ((e89) obj2).getValue();
                lveVar.getClass();
                x16Var.getClass();
                lveVar.b.getClass();
                xve.a(mfcVar);
                ynb.V(hwf.a(lveVar), null, null, new fve(x16Var, lveVar, mfcVar, applicationContext, null), 3);
                return wefVar;
            case 25:
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "btn", "playcard_tap_card", "pathway", (String) obj5);
                l1fVar2.a((String) obj4, "state");
                l1fVar2.a(urg.r((TarotSkinIdentify) obj3), "deck_id");
                l1fVar2.a(((TarotCardChoice) obj2).getCard().getCardKey(), "card_id");
                return wefVar;
            case 26:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                tarotCardChoice.getClass();
                x1f x1fVar3 = x1f.a;
                x1f.k(p05Var, new it3((String) obj5, (TarotSkinIdentify) obj3, tarotCardChoice, 29), 2);
                Boolean bool = Boolean.TRUE;
                ((e89) obj4).setValue(bool);
                ((e89) obj2).setValue(bool);
                return wefVar;
            case 27:
                QuotaBlockReason quotaBlockReason = (QuotaBlockReason) obj;
                quotaBlockReason.getClass();
                k.g((j4a) obj3, (t7) obj5, (r0) obj4, (tr2) obj2, quotaBlockReason, "followup_clarifying_card");
                return wefVar;
            case 28:
                cb9 cb9Var = (cb9) obj5;
                PaywallRoute.InterceptPaywall interceptPaywall = (PaywallRoute.InterceptPaywall) obj4;
                dc9 dc9Var = (dc9) obj2;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (((k4a) obj3).a.compareAndSet(false, true)) {
                    da9 da9VarC = cb9Var.c();
                    if (da9VarC != null && (yccVarA = da9VarC.a()) != null) {
                        yccVarA.d(interceptPaywall.getResultKey(), Boolean.TRUE);
                    }
                    ca2.a.getClass();
                    if (ca2.c || !zBooleanValue2) {
                        cb9Var.g();
                        if (zBooleanValue2) {
                            dc9Var.g.setValue(Boolean.TRUE);
                        }
                    } else {
                        cb9Var.d(new q4a(0), new PaywallRoute.Congratulation(true, true));
                    }
                }
                return wefVar;
            default:
                String str8 = (String) obj3;
                p5a p5aVar2 = (p5a) obj2;
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "action", (String) obj5, "pathway", "paywall_d");
                l1fVar3.a((String) obj4, "triggered_by");
                if (str8 != null) {
                    l1fVar3.a(str8, "product_id");
                }
                if9.o(l1fVar3, p5aVar2);
                if9.p(l1fVar3, p5aVar2);
                return wefVar;
        }
    }

    public /* synthetic */ wg(y63 y63Var, Context context, String str, x48 x48Var) {
        this.a = 6;
        this.b = y63Var;
        this.d = context;
        this.c = str;
        this.e = x48Var;
    }

    public /* synthetic */ wg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ wg(String str, TarotSkinIdentify tarotSkinIdentify, e89 e89Var, e89 e89Var2) {
        this.a = 26;
        this.c = str;
        this.b = tarotSkinIdentify;
        this.d = e89Var;
        this.e = e89Var2;
    }

    public /* synthetic */ wg(String str, String str2, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = str;
        this.d = str2;
        this.b = obj;
        this.e = obj2;
    }

    public /* synthetic */ wg(ArrayList arrayList, kmb kmbVar, List list, int i, zw7 zw7Var) {
        this.a = 18;
        this.b = arrayList;
        this.c = kmbVar;
        this.d = list;
        this.e = zw7Var;
    }
}
