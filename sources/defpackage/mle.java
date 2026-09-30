package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mle implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ mle(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((nz9) obj2).getClass();
                nfcVar.g(job.a.b(n2g.class), null, null);
                throw new ClassCastException();
            case 1:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (wie) ((qzb) rzb.c.getValue()).b(wie.class);
            case 2:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (ije) ((qzb) rzb.d.getValue()).b(ije.class);
            case 3:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (d56) rzb.b().b(d56.class);
            case 4:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (vq1) ((qzb) rzb.c.getValue()).b(vq1.class);
            case 5:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (maa) rzb.b().b(maa.class);
            case 6:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (kb7) rzb.b().b(kb7.class);
            case 7:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (ilb) rzb.b().b(ilb.class);
            case 8:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (r76) rzb.b().b(r76.class);
            case 9:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (mf6) rzb.b().b(mf6.class);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (az4) rzb.b().b(az4.class);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (tgb) rzb.b().b(tgb.class);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (vkf) rzb.b().b(vkf.class);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (n4b) rzb.b().b(n4b.class);
            case 14:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (z23) rzb.b().b(z23.class);
            case 15:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (n10) rzb.b().b(n10.class);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (pic) rzb.b().b(pic.class);
            case 17:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (pt8) rzb.b().b(pt8.class);
            case 18:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                if (rzb.b().b(n2g.class) != null) {
                    r3.f();
                }
                return null;
            case 19:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (w1g) rzb.b().b(w1g.class);
            case 20:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (lfe) ((qzb) rzb.c.getValue()).b(lfe.class);
            case 21:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (vab) rzb.b().b(vab.class);
            case 22:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return (xie) rzb.b().b(xie.class);
            case 23:
                return Integer.valueOf(((tn8) obj).n(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((tn8) obj).q(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((tn8) obj).V(((Integer) obj2).intValue()));
            case 26:
                return Integer.valueOf(((tn8) obj).b(((Integer) obj2).intValue()));
            case 27:
                pqe pqeVar = (pqe) obj2;
                return t72.I(Float.valueOf(pqeVar.a.j()), Boolean.valueOf(((ks9) pqeVar.f.getValue()) == ks9.a));
            case 28:
                pcc pccVar = (pcc) obj;
                zse zseVar = (zse) obj2;
                return t72.q(sdc.a(zseVar.a, sdc.a, pccVar), sdc.a(new eue(zseVar.b), sdc.p, pccVar));
            default:
                nv2 nv2Var = (nv2) obj2;
                if (!(nv2Var instanceof fwe)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? nv2Var : Integer.valueOf(iIntValue + 1);
        }
    }

    public /* synthetic */ mle(yx4 yx4Var, int i) {
        this.a = i;
    }
}
