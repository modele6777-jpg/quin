package defpackage;

import ai.askquin.repository.b;
import android.content.Context;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dxc implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ dxc(int i) {
        this.a = 6;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 1:
                if (obj != null || obj2 != null) {
                    r3.f();
                }
                return null;
            case 2:
                return obj == null ? obj2 : obj;
            case 3:
                ywc ywcVar = (ywc) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                twc twcVar = ((ywc) obj).d;
                gxc gxcVar = cxc.u;
                Object objG = twcVar.a.g(gxcVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = ywcVar.d.a.g(gxcVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 4:
                em7 em7Var = (em7) obj;
                List list = (List) obj2;
                em7Var.getClass();
                list.getClass();
                ArrayList arrayListP = hfc.p(izc.a, list, true);
                arrayListP.getClass();
                return hfc.g(em7Var, arrayListP, new h53(list, 7));
            case 5:
                em7 em7Var2 = (em7) obj;
                List list2 = (List) obj2;
                em7Var2.getClass();
                list2.getClass();
                ArrayList arrayListP2 = hfc.p(izc.a, list2, true);
                arrayListP2.getClass();
                xn7 xn7VarG = hfc.g(em7Var2, arrayListP2, new h53(list2, 8));
                if (xn7VarG != null) {
                    return t72.F(xn7VarG);
                }
                return null;
            case 6:
                ((Integer) obj2).getClass();
                p6d.h(k99.P(1), (l46) obj);
                return wefVar;
            case 7:
                return ((ted) obj2).c();
            case 8:
                ((TarotCardChoice) obj).getClass();
                return wefVar;
            case 9:
                Context context = (Context) obj;
                cge cgeVar = (cge) obj2;
                context.getClass();
                cgeVar.getClass();
                return new bhe(new ihe(context, cgeVar), new y3d(context, 6));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((nz9) obj2).getClass();
                return new sba((maa) nfcVar.g(job.a.b(maa.class), null, null));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                nfc nfcVar2 = (nfc) obj;
                nfcVar2.getClass();
                ((nz9) obj2).getClass();
                return new ida((vq1) nfcVar2.g(job.a.b(vq1.class), null, null));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                nfc nfcVar3 = (nfc) obj;
                nfcVar3.getClass();
                ((nz9) obj2).getClass();
                return new n5b((n4b) nfcVar3.g(job.a.b(n4b.class), null, null));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                nfc nfcVar4 = (nfc) obj;
                nfcVar4.getClass();
                ((nz9) obj2).getClass();
                return new rqc((pic) nfcVar4.g(job.a.b(pic.class), null, null));
            case 14:
                nfc nfcVar5 = (nfc) obj;
                nfcVar5.getClass();
                ((nz9) obj2).getClass();
                kob kobVar = job.a;
                return new zgb((tgb) nfcVar5.g(kobVar.b(tgb.class), null, null), (t7) nfcVar5.g(kobVar.b(t7.class), null, null));
            case 15:
                nfc nfcVar6 = (nfc) obj;
                nfcVar6.getClass();
                ((nz9) obj2).getClass();
                return new emb((ilb) nfcVar6.g(job.a.b(ilb.class), null, null));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                nfc nfcVar7 = (nfc) obj;
                nfcVar7.getClass();
                ((nz9) obj2).getClass();
                kob kobVar2 = job.a;
                return new sfe((t7) nfcVar7.g(kobVar2.b(t7.class), null, null), (i2a) nfcVar7.g(kobVar2.b(i2a.class), null, null), (b) nfcVar7.g(kobVar2.b(b.class), null, null), (lfe) nfcVar7.g(kobVar2.b(lfe.class), null, null), (vab) nfcVar7.g(kobVar2.b(vab.class), null, null));
            case 17:
                nfc nfcVar8 = (nfc) obj;
                nfcVar8.getClass();
                ((nz9) obj2).getClass();
                kob kobVar3 = job.a;
                return new uke((xie) nfcVar8.g(kobVar3.b(xie.class), null, null), (wie) nfcVar8.g(kobVar3.b(wie.class), null, null), (ije) nfcVar8.g(kobVar3.b(ije.class), null, null));
            case 18:
                nfc nfcVar9 = (nfc) obj;
                nfcVar9.getClass();
                ((nz9) obj2).getClass();
                kob kobVar4 = job.a;
                return new npf((vkf) nfcVar9.g(kobVar4.b(vkf.class), null, null), (fab) nfcVar9.g(kobVar4.b(fab.class), null, null));
            case 19:
                nfc nfcVar10 = (nfc) obj;
                nfcVar10.getClass();
                ((nz9) obj2).getClass();
                return new c50((n10) nfcVar10.g(job.a.b(n10.class), null, null));
            case 20:
                nfc nfcVar11 = (nfc) obj;
                nfcVar11.getClass();
                ((nz9) obj2).getClass();
                return new ec5((t7) nfcVar11.g(job.a.b(t7.class), null, null));
            case 21:
                nfc nfcVar12 = (nfc) obj;
                nfcVar12.getClass();
                ((nz9) obj2).getClass();
                kob kobVar5 = job.a;
                return new d43((z23) nfcVar12.g(kobVar5.b(z23.class), null, null), (t7) nfcVar12.g(kobVar5.b(t7.class), null, null));
            case 22:
                nfc nfcVar13 = (nfc) obj;
                nfcVar13.getClass();
                ((nz9) obj2).getClass();
                return new m05((az4) nfcVar13.g(job.a.b(az4.class), null, null));
            case 23:
                nfc nfcVar14 = (nfc) obj;
                nfcVar14.getClass();
                ((nz9) obj2).getClass();
                return new l65((az4) nfcVar14.g(job.a.b(az4.class), null, null));
            case 24:
                nfc nfcVar15 = (nfc) obj;
                nfcVar15.getClass();
                ((nz9) obj2).getClass();
                return new ea6((r76) nfcVar15.g(job.a.b(r76.class), null, null));
            case 25:
                nfc nfcVar16 = (nfc) obj;
                nfcVar16.getClass();
                ((nz9) obj2).getClass();
                return new bg6((mf6) nfcVar16.g(job.a.b(mf6.class), null, null));
            case 26:
                nfc nfcVar17 = (nfc) obj;
                nfcVar17.getClass();
                ((nz9) obj2).getClass();
                return new ds3((gg2) nfcVar17.g(job.a.b(gg2.class), null, null));
            case 27:
                nfc nfcVar18 = (nfc) obj;
                nfcVar18.getClass();
                ((nz9) obj2).getClass();
                return new bu8((pt8) nfcVar18.g(job.a.b(pt8.class), null, null));
            case 28:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new u5a();
            default:
                nfc nfcVar19 = (nfc) obj;
                nfcVar19.getClass();
                ((nz9) obj2).getClass();
                return new c2g((w1g) nfcVar19.g(job.a.b(w1g.class), null, null));
        }
    }

    public /* synthetic */ dxc(int i, byte b) {
        this.a = i;
    }
}
