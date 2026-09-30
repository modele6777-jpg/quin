package defpackage;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ yh(i8c i8cVar) {
        this.a = 22;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws nv3 {
        switch (this.a) {
            case 0:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new cb();
            case 1:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((nz9) obj2).getClass();
                kob kobVar = job.a;
                return new eb((t7) nfcVar.g(kobVar.b(t7.class), null, null), (ht6) nfcVar.g(kobVar.b(ht6.class), null, null), (fab) nfcVar.g(kobVar.b(fab.class), null, null));
            case 2:
                nfc nfcVar2 = (nfc) obj;
                nz9 nz9Var = (nz9) obj2;
                nfcVar2.getClass();
                nz9Var.getClass();
                kob kobVar2 = job.a;
                t7 t7Var = (t7) nfcVar2.g(kobVar2.b(t7.class), null, null);
                fab fabVar = (fab) nfcVar2.g(kobVar2.b(fab.class), null, null);
                gd8 gd8Var = (gd8) nfcVar2.g(kobVar2.b(gd8.class), null, null);
                Object objA = nz9Var.a(kobVar2.b(String.class));
                if (objA != null) {
                    return new fh(t7Var, fabVar, gd8Var, (String) objA);
                }
                throw new nv3(kv2.i(kobVar2, String.class, new StringBuilder("No value found for type '"), '\''));
            case 3:
                nfc nfcVar3 = (nfc) obj;
                nz9 nz9Var2 = (nz9) obj2;
                nfcVar3.getClass();
                nz9Var2.getClass();
                kob kobVar3 = job.a;
                t7 t7Var2 = (t7) nfcVar3.g(kobVar3.b(t7.class), null, null);
                fab fabVar2 = (fab) nfcVar3.g(kobVar3.b(fab.class), null, null);
                q9b q9bVar = (q9b) nfcVar3.g(kobVar3.b(q9b.class), null, null);
                p5a p5aVar = (p5a) nfcVar3.g(kobVar3.b(p5a.class), null, null);
                Object objA2 = nz9Var2.a(kobVar3.b(String.class));
                if (objA2 == null) {
                    throw new nv3(kv2.i(kobVar3, String.class, new StringBuilder("No value found for type '"), '\''));
                }
                String str = (String) objA2;
                Object objA3 = nz9Var2.a(kobVar3.b(Boolean.class));
                if (objA3 == null) {
                    throw new nv3(kv2.i(kobVar3, Boolean.class, new StringBuilder("No value found for type '"), '\''));
                }
                return new y3a(t7Var2, fabVar2, q9bVar, p5aVar, str);
            case 4:
                nfc nfcVar4 = (nfc) obj;
                nfcVar4.getClass();
                ((nz9) obj2).getClass();
                kob kobVar4 = job.a;
                return new o3a((t7) nfcVar4.g(kobVar4.b(t7.class), null, null), (fab) nfcVar4.g(kobVar4.b(fab.class), null, null));
            case 5:
                nfc nfcVar5 = (nfc) obj;
                nz9 nz9Var3 = (nz9) obj2;
                nfcVar5.getClass();
                nz9Var3.getClass();
                kob kobVar5 = job.a;
                t7 t7Var3 = (t7) nfcVar5.g(kobVar5.b(t7.class), null, null);
                fab fabVar3 = (fab) nfcVar5.g(kobVar5.b(fab.class), null, null);
                q9b q9bVar2 = (q9b) nfcVar5.g(kobVar5.b(q9b.class), null, null);
                p5a p5aVar2 = (p5a) nfcVar5.g(kobVar5.b(p5a.class), null, null);
                Object objA4 = nz9Var3.a(kobVar5.b(String.class));
                if (objA4 != null) {
                    return new g87(t7Var3, fabVar3, q9bVar2, p5aVar2, (String) objA4);
                }
                throw new nv3(kv2.i(kobVar5, String.class, new StringBuilder("No value found for type '"), '\''));
            case 6:
                nfc nfcVar6 = (nfc) obj;
                nfcVar6.getClass();
                ((nz9) obj2).getClass();
                kob kobVar6 = job.a;
                return new tlb((o9) nfcVar6.g(kobVar6.b(o9.class), null, null), (rw5) nfcVar6.g(kobVar6.b(rw5.class), null, null), (v40) nfcVar6.g(kobVar6.b(v40.class), null, null));
            case 7:
                nfc nfcVar7 = (nfc) obj;
                nz9 nz9Var4 = (nz9) obj2;
                nfcVar7.getClass();
                nz9Var4.getClass();
                kob kobVar7 = job.a;
                t7 t7Var4 = (t7) nfcVar7.g(kobVar7.b(t7.class), null, null);
                q9b q9bVar3 = (q9b) nfcVar7.g(kobVar7.b(q9b.class), null, null);
                Object objA5 = nz9Var4.a(kobVar7.b(Integer.class));
                if (objA5 != null) {
                    return new mhf(t7Var4, q9bVar3, ((Number) objA5).intValue());
                }
                throw new nv3(kv2.i(kobVar7, Integer.class, new StringBuilder("No value found for type '"), '\''));
            case 8:
                nfc nfcVar8 = (nfc) obj;
                nfcVar8.getClass();
                ((nz9) obj2).getClass();
                return new edb((fcb) nfcVar8.g(job.a.b(fcb.class), null, null));
            case 9:
                nfc nfcVar9 = (nfc) obj;
                nfcVar9.getClass();
                ((nz9) obj2).getClass();
                kob kobVar8 = job.a;
                return new p3c((s7) nfcVar9.g(kobVar8.b(s7.class), null, null), (k2c) nfcVar9.g(kobVar8.b(k2c.class), null, null), (xof) nfcVar9.g(kobVar8.b(xof.class), null, null));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                nfc nfcVar10 = (nfc) obj;
                nfcVar10.getClass();
                ((nz9) obj2).getClass();
                return new qna((d56) nfcVar10.g(job.a.b(d56.class), null, null));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                nfc nfcVar11 = (nfc) obj;
                nfcVar11.getClass();
                ((nz9) obj2).getClass();
                return new m07((cz6) nfcVar11.g(job.a.b(cz6.class), null, null));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                nfc nfcVar12 = (nfc) obj;
                nfcVar12.getClass();
                ((nz9) obj2).getClass();
                kob kobVar9 = job.a;
                return new yc7((emb) nfcVar12.g(kobVar9.b(emb.class), null, null), (t7) nfcVar12.g(kobVar9.b(t7.class), null, null), (fab) nfcVar12.g(kobVar9.b(fab.class), null, null), (q9b) nfcVar12.g(kobVar9.b(q9b.class), null, null), (rlb) nfcVar12.g(kobVar9.b(rlb.class), null, null));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                nfc nfcVar13 = (nfc) obj;
                nfcVar13.getClass();
                ((nz9) obj2).getClass();
                kob kobVar10 = job.a;
                return new wb7((bc7) nfcVar13.g(kobVar10.b(bc7.class), null, null), (t7) nfcVar13.g(kobVar10.b(t7.class), null, null));
            case 14:
                nfc nfcVar14 = (nfc) obj;
                nfcVar14.getClass();
                ((nz9) obj2).getClass();
                kob kobVar11 = job.a;
                return new oc7((bc7) nfcVar14.g(kobVar11.b(bc7.class), null, null), (wt6) nfcVar14.g(kobVar11.b(wt6.class), null, null));
            case 15:
                nfc nfcVar15 = (nfc) obj;
                nfcVar15.getClass();
                ((nz9) obj2).getClass();
                rie rieVar = new rie();
                new use((String) null, 3);
                q1c.f(null);
                q1c.f(null);
                return rieVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                nfc nfcVar16 = (nfc) obj;
                nfcVar16.getClass();
                ((nz9) obj2).getClass();
                kob kobVar12 = job.a;
                return new qmf((ht6) nfcVar16.g(kobVar12.b(ht6.class), null, null), (fab) nfcVar16.g(kobVar12.b(fab.class), null, null));
            case 17:
                nfc nfcVar17 = (nfc) obj;
                nfcVar17.getClass();
                ((nz9) obj2).getClass();
                return new gy0((ht6) nfcVar17.g(job.a.b(ht6.class), null, null));
            case 18:
                nfc nfcVar18 = (nfc) obj;
                nfcVar18.getClass();
                ((nz9) obj2).getClass();
                return new ckc((t7) nfcVar18.g(job.a.b(t7.class), null, null));
            case 19:
                nfc nfcVar19 = (nfc) obj;
                nfcVar19.getClass();
                ((nz9) obj2).getClass();
                return new oy0((ht6) nfcVar19.g(job.a.b(ht6.class), null, null));
            case 20:
                nfc nfcVar20 = (nfc) obj;
                nfcVar20.getClass();
                ((nz9) obj2).getClass();
                return new bmc((lqc) nfcVar20.g(job.a.b(lqc.class), null, null));
            case 21:
                nfc nfcVar21 = (nfc) obj;
                nfcVar21.getClass();
                ((nz9) obj2).getClass();
                return new l1g((sv6) nfcVar21.g(job.a.b(sv6.class), null, null));
            case 22:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return lw2.a;
            case 23:
                nfc nfcVar22 = (nfc) obj;
                nfcVar22.getClass();
                ((nz9) obj2).getClass();
                return new epc((t7) nfcVar22.g(job.a.b(t7.class), null, null));
            case 24:
                nfc nfcVar23 = (nfc) obj;
                nfcVar23.getClass();
                ((nz9) obj2).getClass();
                kob kobVar13 = job.a;
                return new lqc((mqc) nfcVar23.g(kobVar13.b(mqc.class), null, null), (epc) nfcVar23.g(kobVar13.b(epc.class), null, null));
            case 25:
                nfc nfcVar24 = (nfc) obj;
                nfcVar24.getClass();
                ((nz9) obj2).getClass();
                return new p06((zf6) nfcVar24.g(job.a.b(zf6.class), null, null));
            case 26:
                nfc nfcVar25 = (nfc) obj;
                nfcVar25.getClass();
                ((nz9) obj2).getClass();
                return new y6b((Context) nfcVar25.g(job.a.b(Context.class), null, null));
            case 27:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new dc9();
            case 28:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new s7();
            default:
                nfc nfcVar26 = (nfc) obj;
                nfcVar26.getClass();
                ((nz9) obj2).getClass();
                return new hod((xof) nfcVar26.g(job.a.b(xof.class), null, null));
        }
    }

    public /* synthetic */ yh(int i) {
        this.a = i;
    }
}
