package defpackage;

import ai.askquin.qa.bridge.a;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aka implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ aka(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = 0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                n16.q(k99.P(1), (l46) obj);
                return wefVar;
            case 1:
                p79 p79Var = (p79) obj;
                String str = (String) obj2;
                p79Var.getClass();
                str.getClass();
                List list = bsa.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        t72.Z();
                        throw null;
                    }
                    boolean zBooleanValue = ((Boolean) bsa.a(p79Var, (hs3) obj3, str, gra.a)).booleanValue();
                    Integer numValueOf = Integer.valueOf(i3);
                    if (!zBooleanValue) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList.add(numValueOf);
                    }
                    i2 = i3;
                }
                return new lj9((String) bsa.a(p79Var, xqa.V0, str, fra.a), s72.o1(arrayList));
            case 2:
                ((Integer) obj2).getClass();
                bzd.e(k99.P(1), (l46) obj);
                return wefVar;
            case 3:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((nz9) obj2).getClass();
                return new em1(nfcVar.c(job.a.b(d3b.class)));
            case 4:
                nfc nfcVar2 = (nfc) obj;
                nfcVar2.getClass();
                ((nz9) obj2).getClass();
                kob kobVar = job.a;
                return new a((em1) nfcVar2.g(kobVar.b(em1.class), null, null), (r3b) nfcVar2.d(kobVar.b(r3b.class), null));
            case 5:
                nfc nfcVar3 = (nfc) obj;
                nfcVar3.getClass();
                ((nz9) obj2).getClass();
                kob kobVar2 = job.a;
                return new x2b((em1) nfcVar3.g(kobVar2.b(em1.class), null, null), (a) nfcVar3.g(kobVar2.b(a.class), null, null));
            case 6:
                nfc nfcVar4 = (nfc) obj;
                nfcVar4.getClass();
                ((nz9) obj2).getClass();
                return new gx8((rw8) nfcVar4.g(job.a.b(rw8.class), null, null));
            case 7:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new iod();
            case 8:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new r1d();
            case 9:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new x66();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new h7b(false);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new h7b(true);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                nfc nfcVar5 = (nfc) obj;
                nfcVar5.getClass();
                ((nz9) obj2).getClass();
                return new qd((u79) nfcVar5.g(job.a.b(u79.class), null, null));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                nfc nfcVar6 = (nfc) obj;
                nfcVar6.getClass();
                ((nz9) obj2).getClass();
                kob kobVar3 = job.a;
                return new p42((u79) nfcVar6.g(kobVar3.b(u79.class), null, null), (rw5) nfcVar6.g(kobVar3.b(rw5.class), null, null));
            case 14:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new st1();
            case 15:
                nfc nfcVar7 = (nfc) obj;
                nfcVar7.getClass();
                ((nz9) obj2).getClass();
                return new o52((u79) nfcVar7.g(job.a.b(u79.class), null, null));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new r3b();
            case 17:
                nfc nfcVar8 = (nfc) obj;
                nfcVar8.getClass();
                ((nz9) obj2).getClass();
                return new n52((u79) nfcVar8.g(job.a.b(u79.class), null, null));
            case 18:
                nfc nfcVar9 = (nfc) obj;
                nfcVar9.getClass();
                ((nz9) obj2).getClass();
                return new l52((u79) nfcVar9.g(job.a.b(u79.class), null, null));
            case 19:
                nfc nfcVar10 = (nfc) obj;
                nfcVar10.getClass();
                ((nz9) obj2).getClass();
                return new m52((u79) nfcVar10.g(job.a.b(u79.class), null, null));
            case 20:
                nfc nfcVar11 = (nfc) obj;
                nfcVar11.getClass();
                ((nz9) obj2).getClass();
                kob kobVar4 = job.a;
                return new asc((s7) nfcVar11.g(kobVar4.b(s7.class), null, null), (gmc) nfcVar11.g(kobVar4.b(gmc.class), null, null));
            case 21:
                nfc nfcVar12 = (nfc) obj;
                nfcVar12.getClass();
                ((nz9) obj2).getClass();
                return new z2d((rw5) nfcVar12.g(job.a.b(rw5.class), null, null));
            case 22:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new m76();
            case 23:
                nfc nfcVar13 = (nfc) obj;
                nfcVar13.getClass();
                ((nz9) obj2).getClass();
                return new z32((rw5) nfcVar13.g(job.a.b(rw5.class), null, null));
            case 24:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new wvb();
            case 25:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new hwb();
            case 26:
                nfc nfcVar14 = (nfc) obj;
                nfcVar14.getClass();
                ((nz9) obj2).getClass();
                return new dvb((k86) nfcVar14.g(job.a.b(k86.class), null, null));
            case 27:
                nfc nfcVar15 = (nfc) obj;
                nfcVar15.getClass();
                ((nz9) obj2).getClass();
                return new rb3((d6c) nfcVar15.g(job.a.b(d6c.class), null, null));
            case 28:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new jxb();
            default:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new zwb();
        }
    }

    public /* synthetic */ aka(int i, int i2) {
        this.a = i2;
    }
}
