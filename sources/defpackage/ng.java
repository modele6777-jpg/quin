package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.repository.b;
import ai.askquin.ui.popup.dailyfortune.v;
import android.app.Application;
import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ ng(int i) {
        this.a = 1;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws nv3 {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    feg.j(od4.A(R.drawable.bg_intercept_paywall, 0, l46Var), null, d31.a.b(g09.a), ndb.c, an2.a, 0.0f, null, l46Var, 27704, 96);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                dj6.c(k99.P(7), (l46) obj);
                return wefVar;
            case 2:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((nz9) obj2).getClass();
                kob kobVar = job.a;
                return new i6a((t7) nfcVar.g(kobVar.b(t7.class), null, null), (yt6) nfcVar.g(kobVar.b(yt6.class), null, null));
            case 3:
                nz9 nz9Var = (nz9) obj2;
                ((nfc) obj).getClass();
                nz9Var.getClass();
                kob kobVar2 = job.a;
                Object objA = nz9Var.a(kobVar2.b(List.class));
                if (objA == null) {
                    throw new nv3(kv2.i(kobVar2, List.class, new StringBuilder("No value found for type '"), '\''));
                }
                List list = (List) objA;
                Object objA2 = nz9Var.a(kobVar2.b(List.class));
                if (objA2 == null) {
                    throw new nv3(kv2.i(kobVar2, List.class, new StringBuilder("No value found for type '"), '\''));
                }
                List list2 = (List) objA2;
                Object objA3 = nz9Var.a(kobVar2.b(Integer.class));
                if (objA3 != null) {
                    return new iwd(list, list2, ((Number) objA3).intValue());
                }
                throw new nv3(kv2.i(kobVar2, Integer.class, new StringBuilder("No value found for type '"), '\''));
            case 4:
                nfc nfcVar2 = (nfc) obj;
                nz9 nz9Var2 = (nz9) obj2;
                nfcVar2.getClass();
                nz9Var2.getClass();
                kob kobVar3 = job.a;
                Object objA4 = nz9Var2.a(kobVar3.b(List.class));
                if (objA4 == null) {
                    throw new nv3(kv2.i(kobVar3, List.class, new StringBuilder("No value found for type '"), '\''));
                }
                List list3 = (List) objA4;
                Object objA5 = nz9Var2.a(kobVar3.b(List.class));
                if (objA5 != null) {
                    return new eda(list3, (List) objA5, (gda) nfcVar2.g(kobVar3.b(gda.class), null, null));
                }
                throw new nv3(kv2.i(kobVar3, List.class, new StringBuilder("No value found for type '"), '\''));
            case 5:
                nfc nfcVar3 = (nfc) obj;
                nfcVar3.getClass();
                ((nz9) obj2).getClass();
                kob kobVar4 = job.a;
                return new m25((it6) nfcVar3.g(kobVar4.b(it6.class), null, null), (gd8) nfcVar3.g(kobVar4.b(gd8.class), null, null));
            case 6:
                nfc nfcVar4 = (nfc) obj;
                nfcVar4.getClass();
                ((nz9) obj2).getClass();
                kob kobVar5 = job.a;
                return new fla((it6) nfcVar4.g(kobVar5.b(it6.class), null, null), (gd8) nfcVar4.g(kobVar5.b(gd8.class), null, null));
            case 7:
                nfc nfcVar5 = (nfc) obj;
                nz9 nz9Var3 = (nz9) obj2;
                nfcVar5.getClass();
                nz9Var3.getClass();
                kob kobVar6 = job.a;
                Object objA6 = nz9Var3.a(kobVar6.b(TarotSkinIdentify.class));
                if (objA6 != null) {
                    return new k75((TarotSkinIdentify) objA6, (nb4) nfcVar5.g(kobVar6.b(nb4.class), null, null), (s7) nfcVar5.g(kobVar6.b(s7.class), null, null), (d43) nfcVar5.g(kobVar6.b(d43.class), null, null), (gd8) nfcVar5.g(kobVar6.b(gd8.class), null, null), (o9) nfcVar5.g(kobVar6.b(o9.class), null, null), (cmd) nfcVar5.g(kobVar6.b(cmd.class), null, null), (xof) nfcVar5.g(kobVar6.b(xof.class), null, null), (gpf) nfcVar5.g(kobVar6.b(gpf.class), null, null));
                }
                throw new nv3(kv2.i(kobVar6, TarotSkinIdentify.class, new StringBuilder("No value found for type '"), '\''));
            case 8:
                nfc nfcVar6 = (nfc) obj;
                nfcVar6.getClass();
                ((nz9) obj2).getClass();
                kob kobVar7 = job.a;
                return new xqc((ckc) nfcVar6.g(kobVar7.b(ckc.class), null, null), (ycc) nfcVar6.g(kobVar7.b(ycc.class), null, null));
            case 9:
                nfc nfcVar7 = (nfc) obj;
                nz9 nz9Var4 = (nz9) obj2;
                nfcVar7.getClass();
                nz9Var4.getClass();
                kob kobVar8 = job.a;
                Object objA7 = nz9Var4.a(kobVar8.b(yic.class));
                if (objA7 != null) {
                    return new vu5((yic) objA7, (t7) nfcVar7.g(kobVar8.b(t7.class), null, null), (rw5) nfcVar7.g(kobVar8.b(rw5.class), null, null), (ckc) nfcVar7.g(kobVar8.b(ckc.class), null, null));
                }
                throw new nv3(kv2.i(kobVar8, yic.class, new StringBuilder("No value found for type '"), '\''));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                nfc nfcVar8 = (nfc) obj;
                nz9 nz9Var5 = (nz9) obj2;
                nfcVar8.getClass();
                nz9Var5.getClass();
                kob kobVar9 = job.a;
                Application application = (Application) nfcVar8.g(kobVar9.b(Application.class), null, null);
                ckc ckcVar = (ckc) nfcVar8.g(kobVar9.b(ckc.class), null, null);
                Object objA8 = nz9Var5.a(kobVar9.b(mic.class));
                if (objA8 != null) {
                    return new jkc(application, ckcVar, (mic) objA8);
                }
                throw new nv3(kv2.i(kobVar9, mic.class, new StringBuilder("No value found for type '"), '\''));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                nfc nfcVar9 = (nfc) obj;
                nz9 nz9Var6 = (nz9) obj2;
                nfcVar9.getClass();
                nz9Var6.getClass();
                kob kobVar10 = job.a;
                ckc ckcVar2 = (ckc) nfcVar9.g(kobVar10.b(ckc.class), null, null);
                Object objA9 = nz9Var6.a(kobVar10.b(mic.class));
                if (objA9 != null) {
                    return new jnc(ckcVar2, (mic) objA9);
                }
                throw new nv3(kv2.i(kobVar10, mic.class, new StringBuilder("No value found for type '"), '\''));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                nfc nfcVar10 = (nfc) obj;
                nfcVar10.getClass();
                ((nz9) obj2).getClass();
                kob kobVar11 = job.a;
                return new sn0((q9b) nfcVar10.g(kobVar11.b(q9b.class), null, null), (fab) nfcVar10.g(kobVar11.b(fab.class), null, null), (x1g) nfcVar10.g(kobVar11.b(x1g.class), null, null), (p5a) nfcVar10.g(kobVar11.b(p5a.class), null, null), (t7) nfcVar10.g(kobVar11.b(t7.class), null, null));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                nfc nfcVar11 = (nfc) obj;
                nfcVar11.getClass();
                ((nz9) obj2).getClass();
                return new gmc((Context) nfcVar11.g(job.a.b(Context.class), null, null));
            case 14:
                nfc nfcVar12 = (nfc) obj;
                nfcVar12.getClass();
                ((nz9) obj2).getClass();
                kob kobVar12 = job.a;
                return new o9((xof) nfcVar12.g(kobVar12.b(xof.class), null, null), (gpf) nfcVar12.g(kobVar12.b(gpf.class), null, null), (s7) nfcVar12.g(kobVar12.b(s7.class), null, null));
            case 15:
                nfc nfcVar13 = (nfc) obj;
                nfcVar13.getClass();
                ((nz9) obj2).getClass();
                y06 y06Var = new y06();
                y06Var.a = v06.a;
                return y06Var;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                nfc nfcVar14 = (nfc) obj;
                nfcVar14.getClass();
                ((nz9) obj2).getClass();
                kob kobVar13 = job.a;
                return new a16((y06) nfcVar14.g(kobVar13.b(y06.class), null, null), (k16) nfcVar14.g(kobVar13.b(k16.class), null, null));
            case 17:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new k16();
            case 18:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new n06();
            case 19:
                nfc nfcVar15 = (nfc) obj;
                nfcVar15.getClass();
                ((nz9) obj2).getClass();
                kob kobVar14 = job.a;
                return new u16((p06) nfcVar15.g(kobVar14.b(p06.class), null, null), (n06) nfcVar15.g(kobVar14.b(n06.class), null, null));
            case 20:
                nfc nfcVar16 = (nfc) obj;
                nfcVar16.getClass();
                ((nz9) obj2).getClass();
                return new u96((ea6) nfcVar16.g(job.a.b(ea6.class), null, null));
            case 21:
                nfc nfcVar17 = (nfc) obj;
                nfcVar17.getClass();
                ((nz9) obj2).getClass();
                kob kobVar15 = job.a;
                return new j96((t7) nfcVar17.g(kobVar15.b(t7.class), null, null), (fab) nfcVar17.g(kobVar15.b(fab.class), null, null), (u96) nfcVar17.g(kobVar15.b(u96.class), null, null));
            case 22:
                nfc nfcVar18 = (nfc) obj;
                nfcVar18.getClass();
                ((nz9) obj2).getClass();
                return new s86((u96) nfcVar18.g(job.a.b(u96.class), null, null));
            case 23:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new kc5();
            case 24:
                nfc nfcVar19 = (nfc) obj;
                nz9 nz9Var7 = (nz9) obj2;
                nfcVar19.getClass();
                nz9Var7.getClass();
                kob kobVar16 = job.a;
                u96 u96Var = (u96) nfcVar19.g(kobVar16.b(u96.class), null, null);
                Object objA10 = nz9Var7.a(kobVar16.b(String.class));
                if (objA10 != null) {
                    return new b86(u96Var, (String) objA10);
                }
                throw new nv3(kv2.i(kobVar16, String.class, new StringBuilder("No value found for type '"), '\''));
            case 25:
                nfc nfcVar20 = (nfc) obj;
                nfcVar20.getClass();
                ((nz9) obj2).getClass();
                kob kobVar17 = job.a;
                return new ol6((tc4) nfcVar20.g(kobVar17.b(tc4.class), null, null), (g6b) nfcVar20.g(kobVar17.b(g6b.class), null, null), (s7) nfcVar20.g(kobVar17.b(s7.class), null, null));
            case 26:
                nfc nfcVar21 = (nfc) obj;
                nfcVar21.getClass();
                ((nz9) obj2).getClass();
                return new v40((c50) nfcVar21.g(job.a.b(c50.class), null, null));
            case 27:
                nfc nfcVar22 = (nfc) obj;
                nfcVar22.getClass();
                ((nz9) obj2).getClass();
                kob kobVar18 = job.a;
                return new kq6((b) nfcVar22.g(kobVar18.b(b.class), null, null), (gd8) nfcVar22.g(kobVar18.b(gd8.class), null, null), (xof) nfcVar22.g(kobVar18.b(xof.class), null, null), (nb4) nfcVar22.g(kobVar18.b(nb4.class), null, null), (g6b) nfcVar22.g(kobVar18.b(g6b.class), null, null), (xt6) nfcVar22.g(kobVar18.b(xt6.class), null, null), (d43) nfcVar22.g(kobVar18.b(d43.class), null, null), (w55) nfcVar22.g(kobVar18.b(w55.class), null, null), (ok6) nfcVar22.g(kobVar18.b(ok6.class), null, null), (s7) nfcVar22.g(kobVar18.b(s7.class), null, null), (e3b) nfcVar22.g(kobVar18.b(e3b.class), null, null), (v) nfcVar22.g(kobVar18.b(v.class), null, null));
            case 28:
                nfc nfcVar23 = (nfc) obj;
                nfcVar23.getClass();
                ((nz9) obj2).getClass();
                kob kobVar19 = job.a;
                return new rn9((t7) nfcVar23.g(kobVar19.b(t7.class), null, null), (fab) nfcVar23.g(kobVar19.b(fab.class), null, null), (m7) nfcVar23.g(kobVar19.b(m7.class), null, null), (o9) nfcVar23.g(kobVar19.b(o9.class), null, null), (gpf) nfcVar23.g(kobVar19.b(gpf.class), null, null));
            default:
                nfc nfcVar24 = (nfc) obj;
                nfcVar24.getClass();
                ((nz9) obj2).getClass();
                kob kobVar20 = job.a;
                return new bo9((ycc) nfcVar24.g(kobVar20.b(ycc.class), null, null), (t7) nfcVar24.g(kobVar20.b(t7.class), null, null), (o9) nfcVar24.g(kobVar20.b(o9.class), null, null));
        }
    }

    public /* synthetic */ ng(int i, byte b) {
        this.a = i;
    }
}
