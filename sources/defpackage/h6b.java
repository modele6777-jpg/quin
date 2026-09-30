package defpackage;

import ai.askquin.R;
import ai.askquin.data.SeasonalDraftStore$Draft;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.services.InAppMessagePollingService;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$GraphEntry;
import ai.askquin.ui.share.ShareActivity;
import ai.askquin.ui.skin.download.SkinDownloadWorker;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinGraphEntryRoute;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.work.WorkerParameters;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.zip.ZipInputStream;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h6b implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h6b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        boolean z;
        vuc vucVar;
        int i = 26;
        int i2 = 7;
        int i3 = 13;
        int i4 = 28;
        int i5 = 27;
        int i6 = 2;
        int i7 = 1;
        int i8 = 0;
        byte b = 0;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                n6b n6bVar = (n6b) this.c;
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("SELECT * FROM quick_decision WHERE accountId = ? ORDER BY drawnAt DESC");
                try {
                    x8cVarW0.Q(1, str);
                    int iK = y8c.k(x8cVarW0, "id");
                    int iK2 = y8c.k(x8cVarW0, "cardKey");
                    int iK3 = y8c.k(x8cVarW0, "isReversed");
                    int iK4 = y8c.k(x8cVarW0, "answer");
                    int iK5 = y8c.k(x8cVarW0, "tagline");
                    int iK6 = y8c.k(x8cVarW0, "reading");
                    int iK7 = y8c.k(x8cVarW0, "drawnAt");
                    int iK8 = y8c.k(x8cVarW0, "chatId");
                    int iK9 = y8c.k(x8cVarW0, "syncedAt");
                    int iK10 = y8c.k(x8cVarW0, "accountId");
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW0.R0()) {
                        long j = x8cVarW0.getLong(iK);
                        String strT0 = x8cVarW0.t0(iK2);
                        boolean z2 = ((int) x8cVarW0.getLong(iK3)) != 0;
                        String strT1 = x8cVarW0.t0(iK4);
                        String strT2 = x8cVarW0.t0(iK5);
                        String strT3 = x8cVarW0.t0(iK6);
                        String strT4 = x8cVarW0.isNull(iK7) ? null : x8cVarW0.t0(iK7);
                        yx4 yx4Var = n6bVar.c;
                        Instant instantI = yx4.i(strT4);
                        if (instantI == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        arrayList.add(new x6b(j, strT0, z2, strT1, strT2, strT3, instantI, x8cVarW0.t0(iK8), yx4.i(x8cVarW0.isNull(iK9) ? null : x8cVarW0.t0(iK9)), x8cVarW0.t0(iK10)));
                    }
                    x8cVarW0.close();
                    return arrayList;
                } catch (Throwable th) {
                    x8cVarW0.close();
                    throw th;
                }
            case 1:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.b;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) this.c;
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "playcard_tap_card", "pathway", "quick_decision");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                l1fVar.a(tarotCardChoice.getCard().getCardKey(), "card_id");
                return wef.a;
            case 2:
                t7 t7Var = (t7) this.b;
                Context context = (Context) this.c;
                x16 x16Var = (x16) obj;
                x16Var.getClass();
                y41.N(t7Var, context, new p9(i5, x16Var), 2);
                return wef.a;
            case 3:
                h0e h0eVar = (h0e) this.b;
                h0e h0eVar2 = (h0e) this.c;
                sn4 sn4Var = (sn4) obj;
                float fP0 = sn4Var.p0(2.0f);
                float f = fP0 / 2.0f;
                sn4.w0(sn4Var, ((y72) h0eVar.getValue()).a, sn4Var.p0(kj0.l / 2.0f) - f, 0L, new d5e(fP0, 0.0f, 0, 0, null, 30), 108);
                if (yi4.a(((yi4) h0eVar2.getValue()).a, 0.0f) > 0) {
                    sn4.w0(sn4Var, ((y72) h0eVar.getValue()).a, sn4Var.p0(((yi4) h0eVar2.getValue()).a) - f, 0L, oe5.a, 108);
                }
                return wef.a;
            case 4:
                ufb ufbVar = (ufb) this.b;
                qwc qwcVar = (qwc) this.c;
                ((ra4) obj).getClass();
                return new oe0(i, ufbVar, qwcVar);
            case 5:
                ufb ufbVar2 = (ufb) this.b;
                e89 e89Var = (e89) this.c;
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                long jN = bv7Var.N(0L);
                hl9 hl9Var = ufbVar2.d;
                if (hl9Var != null && !hl9.c(hl9Var.a, jN)) {
                    ufbVar2.a();
                }
                ufbVar2.d = new hl9(jN);
                e89Var.setValue(bv7Var);
                return wef.a;
            case 6:
                phb phbVar = (phb) this.b;
                lhb lhbVar = (lhb) this.c;
                ((ra4) obj).getClass();
                if (phbVar != null) {
                    lhbVar.getClass();
                    phbVar.a.add(lhbVar);
                }
                return new oe0(i5, phbVar, lhbVar);
            case 7:
                rg2 rg2Var = (rg2) this.b;
                x79 x79Var = (x79) this.c;
                rg2Var.A(obj);
                if (x79Var != null) {
                    x79Var.e(obj);
                }
                return wef.a;
            case 8:
                xjb xjbVar = (xjb) this.b;
                Throwable th2 = (Throwable) this.c;
                Throwable th3 = (Throwable) obj;
                synchronized (xjbVar.c) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th3 != null) {
                        try {
                            if (th3 instanceof CancellationException) {
                                th3 = null;
                            }
                            if (th3 != null) {
                                bzd.m(th2, th3);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    xjbVar.e = th2;
                    s0e s0eVar = xjbVar.u;
                    sjb sjbVar = sjb.a;
                    s0eVar.getClass();
                    s0eVar.n(null, sjbVar);
                }
                return wef.a;
            case 9:
                u2c u2cVar = (u2c) this.c;
                String str2 = (String) this.b;
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "popup", "review_reward_snackbar", "triggered_by", "app_store_return");
                l1fVar2.a(Long.valueOf(u2cVar.b), "time");
                l1fVar2.a(str2, "distinct_id");
                l1fVar2.a(u2cVar.a, "$insert_id");
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((r89) this.b).a.setValue(new w25((g7g) this.c, (g7g) obj));
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                dic dicVar = (dic) this.b;
                gic gicVar = (gic) this.c;
                uj4 uj4Var = (uj4) obj;
                float f2 = uj4Var.b ? -1.0f : 1.0f;
                long j2 = uj4Var.a;
                dicVar.a(1, hl9.h(gicVar.d == ks9.b ? hl9.a(0.0f, 1, j2) : hl9.a(0.0f, 2, j2), f2));
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                q7b q7bVar = (q7b) this.b;
                csc cscVar = (csc) this.c;
                ((ra4) obj).getClass();
                q7bVar.a.a(cscVar);
                return new oe0(i4, q7bVar, cscVar);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                zlc zlcVar = (zlc) this.b;
                a26 a26Var = (a26) this.c;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                List list = ((wlc) zlcVar).a;
                v08Var.X(list.size(), new d5(i5, new pdc(i), list), new gj(i3, list, b == true ? 1 : 0), new dd2(new a07(list, a26Var, i7), true, 802480018));
                return wef.a;
            case 14:
                x16 x16Var2 = (x16) this.b;
                Context context2 = (Context) this.c;
                if (((Boolean) obj).booleanValue()) {
                    x16Var2.invoke();
                } else {
                    Toast.makeText(context2, R.string.camera_permission_denied, 0).show();
                }
                return wef.a;
            case 15:
                lsc lscVar = (lsc) this.c;
                String str3 = (String) this.b;
                SeasonalDraftStore$Draft seasonalDraftStore$Draft = (SeasonalDraftStore$Draft) obj;
                a56 a56Var = lscVar.a;
                String strA = a56Var != null ? a56Var.a() : null;
                pu1 pu1Var = lscVar.b;
                String strA2 = pu1Var != null ? pu1Var.a() : null;
                kpb kpbVar = lscVar.c;
                return SeasonalDraftStore$Draft.copy$default(seasonalDraftStore$Draft, strA, strA2, kpbVar != null ? kpbVar.a() : null, str3, null, null, 48, null);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ynb.V((aw2) this.b, null, dw2.d, new dvc((c52) this.c, (k00) obj, null), 1);
                return wef.a;
            case 17:
                fwc fwcVar = (fwc) this.b;
                a26 a26Var2 = (a26) this.c;
                vuc vucVar2 = (vuc) obj;
                fwcVar.p(vucVar2);
                a26Var2.d(vucVar2);
                return wef.a;
            case 18:
                fwc fwcVar2 = (fwc) this.b;
                Context context3 = (Context) this.c;
                rme rmeVar = (rme) obj;
                rmeVar.a();
                ynb.i0(rmeVar, context3.getResources(), cne.b, fwcVar2.l(), new hwc(new yuc(fwcVar2, i2), null, 0));
                cne cneVar = cne.d;
                owc owcVar = fwcVar2.a;
                ArrayList arrayListE = owcVar.e(fwcVar2.n());
                if (arrayListE.isEmpty()) {
                    z = true;
                } else {
                    int size = arrayListE.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        x59 x59Var = (x59) arrayListE.get(i9);
                        k00 k00VarE = x59Var.e();
                        if (k00VarE.b.length() != 0 && ((vucVar = (vuc) owcVar.a().e(x59Var.a)) == null || Math.abs(vucVar.a.b - vucVar.b.b) != k00VarE.b.length())) {
                            z = false;
                        }
                    }
                    z = true;
                }
                ynb.i0(rmeVar, context3.getResources(), cneVar, !z, new hwc(new yuc(fwcVar2, 9), new yuc(fwcVar2, 8), 0));
                rmeVar.a();
                return wef.a;
            case 19:
                Context context4 = (Context) this.b;
                pzc pzcVar = (pzc) this.c;
                ((ra4) obj).getClass();
                context4.bindService(new Intent(context4, (Class<?>) InAppMessagePollingService.class), pzcVar, 1);
                return new ozc(i8, context4, pzcVar);
            case 20:
                aw6 aw6Var = (aw6) this.b;
                aw6 aw6Var2 = (aw6) this.c;
                int i10 = ShareActivity.T0;
                ((ra4) obj).getClass();
                return new ozc(i7, aw6Var, aw6Var2);
            case 21:
                x48 x48Var = (x48) this.b;
                mmb mmbVar = (mmb) this.c;
                ((ra4) obj).getClass();
                y6 y6Var = new y6(6, mmbVar);
                x48Var.k().a(y6Var);
                return new ozc(i6, x48Var, y6Var);
            case 22:
                imb imbVar = (imb) this.b;
                lmb lmbVar = (lmb) this.c;
                imbVar.element = false;
                lmbVar.element = 0L;
                return wef.a;
            case 23:
                egd egdVar = (egd) this.b;
                zk1 zk1Var = (zk1) this.c;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (((Boolean) egdVar.g.getValue()).booleanValue()) {
                    vz9 vz9Var = egdVar.g;
                    Boolean bool = Boolean.FALSE;
                    vz9Var.setValue(bool);
                    vz9 vz9Var2 = egdVar.f;
                    if (zBooleanValue) {
                        vz9Var2.setValue(bool);
                        sz9 sz9Var = egdVar.c;
                        sz9Var.k(sz9Var.j() + 1);
                        egdVar.d(false);
                        zk1Var.invoke();
                    } else {
                        vz9Var2.setValue(bool);
                        egdVar.d(false);
                    }
                }
                return wef.a;
            case 24:
                x16 x16Var3 = (x16) this.b;
                e89 e89Var2 = (e89) this.c;
                ((Integer) obj).getClass();
                if (!((Boolean) e89Var2.getValue()).booleanValue()) {
                    e89Var2.setValue(Boolean.TRUE);
                    x16Var3.invoke();
                }
                return wef.a;
            case 25:
                bea.q((bea) obj, (cea) this.b, 0, 0, ((ijd) this.c).X0, 4);
                return wef.a;
            case 26:
                ZipInputStream zipInputStream = (ZipInputStream) this.b;
                pv2 pv2Var = (pv2) this.c;
                File file = (File) obj;
                file.getClass();
                FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file), file);
                try {
                    byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
                    for (int i11 = zipInputStream.read(bArr); i11 != -1; i11 = zipInputStream.read(bArr)) {
                        tq.v(pv2Var);
                        fileOutputStreamE.write(bArr, 0, i11);
                    }
                    fileOutputStreamE.close();
                    zipInputStream.closeEntry();
                    return wef.a;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        ym8.t(fileOutputStreamE, th5);
                        throw th6;
                    }
                }
            case 27:
                SkinDownloadWorker skinDownloadWorker = (SkinDownloadWorker) this.b;
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) this.c;
                Float f3 = (Float) obj;
                float fFloatValue = f3.floatValue();
                int i12 = SkinDownloadWorker.x;
                ((ys3) ((cmd) skinDownloadWorker.g.getValue())).f(tarotSkinIdentify2, fFloatValue);
                iy9[] iy9VarArr = {new iy9("progress", f3)};
                kb6 kb6Var = new kb6(11);
                iy9 iy9Var = iy9VarArr[0];
                kb6Var.o(iy9Var.e(), (String) iy9Var.d());
                bb3 bb3VarI = kb6Var.i();
                WorkerParameters workerParameters = skinDownloadWorker.b;
                gbg gbgVar = workerParameters.f;
                UUID uuid = workerParameters.a;
                h80 h80Var = gbgVar.b.a;
                smc smcVar = new smc(gbgVar, uuid, bb3VarI, i3);
                h80Var.getClass();
                y41.t(new gi2(h80Var, "updateProgress", smcVar, i2));
                return wef.a;
            case 28:
                and andVar = (and) this.b;
                ka9 ka9Var = (ka9) this.c;
                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) obj;
                tarotSkinIdentify3.getClass();
                andVar.a0(null);
                ka9Var.f(job.a.b(SkinNavigationRoute$SkinGraphEntryRoute.class), true);
                ka9Var.d(new e2d(i4), new ExploreTarotRoute$GraphEntry(tarotSkinIdentify3));
                return wef.a;
            default:
                List list2 = (List) this.b;
                n0e n0eVar = (n0e) this.c;
                Throwable th7 = (Throwable) obj;
                if (th7 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((za2) ((ya2) it.next())).i0(th7);
                    }
                } else {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((za2) ((ya2) it2.next())).R(wef.a);
                    }
                }
                synchronized (n0eVar.d) {
                    n0eVar.f.removeAll(list2);
                }
                return wef.a;
        }
    }

    public /* synthetic */ h6b(int i, Object obj, String str) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }
}
