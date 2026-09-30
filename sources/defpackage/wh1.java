package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wh1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0e b;

    public /* synthetic */ wh1(int i, h0e h0eVar) {
        this.a = i;
        this.b = h0eVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        h0e h0eVar = this.b;
        switch (i) {
            case 0:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.p(((Number) h0eVar.getValue()).floatValue());
                return wefVar;
            case 1:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.q(((Number) h0eVar.getValue()).floatValue());
                g0cVar2.r(((Number) h0eVar.getValue()).floatValue());
                return wefVar;
            case 2:
                g0c g0cVar3 = (g0c) obj;
                g0cVar3.getClass();
                g0cVar3.b(1.0f - xj3.g(h0eVar));
                return wefVar;
            case 3:
                g0c g0cVar4 = (g0c) obj;
                g0cVar4.getClass();
                g0cVar4.b(xj3.g(h0eVar));
                return wefVar;
            case 4:
                g0c g0cVar5 = (g0c) obj;
                g0cVar5.getClass();
                g0cVar5.b(xj3.g(h0eVar));
                return wefVar;
            case 5:
                sn4 sn4Var = (sn4) obj;
                long j = ((y72) h0eVar.getValue()).a;
                if (!faf.a(j, y72.k)) {
                    sn4.y0(sn4Var, j, 0L, 0L, 0.0f, null, 0, 126);
                }
                return wefVar;
            case 6:
                g0c g0cVar6 = (g0c) obj;
                g0cVar6.getClass();
                g0cVar6.n(((Number) h0eVar.getValue()).floatValue());
                g0cVar6.e(g0cVar6.I0.getDensity() * 8.0f);
                return wefVar;
            case 7:
                g0c g0cVar7 = (g0c) obj;
                g0cVar7.getClass();
                g0cVar7.q(((Number) h0eVar.getValue()).floatValue());
                g0cVar7.r(((Number) h0eVar.getValue()).floatValue());
                g0cVar7.D(sfc.d(0.5f, 0.0f));
                return wefVar;
            case 8:
                g0c g0cVar8 = (g0c) obj;
                g0cVar8.getClass();
                g0cVar8.q(((Number) h0eVar.getValue()).floatValue());
                g0cVar8.r(((Number) h0eVar.getValue()).floatValue());
                g0cVar8.D(sfc.d(0.0f, 0.0f));
                return wefVar;
            case 9:
                g0c g0cVar9 = (g0c) obj;
                g0cVar9.getClass();
                g0cVar9.n(((Number) h0eVar.getValue()).floatValue());
                g0cVar9.e(12.0f);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                g0c g0cVar10 = (g0c) obj;
                g0cVar10.getClass();
                g0cVar10.b(0.5f);
                g0cVar10.j(1);
                g0cVar10.d(17);
                fxe fxeVar = (fxe) h0eVar.getValue();
                g0cVar10.q(1.12f);
                g0cVar10.r(1.12f);
                g0cVar10.E(g0cVar10.I0.getDensity() * 28.0f * fxeVar.b);
                float f = fxeVar.a;
                g0cVar10.G(g0cVar10.I0.getDensity() * 28.0f * f);
                g0cVar10.l(f * 8.0f);
                g0cVar10.n((-fxeVar.b) * 8.0f);
                g0cVar10.e(g0cVar10.I0.getDensity() * 12.0f);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                sw3 sw3Var = (sw3) obj;
                sw3Var.getClass();
                fxe fxeVar2 = (fxe) h0eVar.getValue();
                return new w67((((long) ((int) (sw3Var.p0(10.0f) * (-fxeVar2.b)))) << 32) | (((long) ((int) (sw3Var.p0(10.0f) * (-fxeVar2.a)))) & 4294967295L));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new w67(((long) ((sw3) obj).D0(((yi4) h0eVar.getValue()).a)) << 32);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((g0c) obj).b(((Number) h0eVar.getValue()).floatValue());
                return wefVar;
            case 14:
                ((g0c) obj).b(((Number) h0eVar.getValue()).floatValue());
                return wefVar;
            default:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "next_step", "pathway", "onboarding_topic_select");
                Set set = (Set) h0eVar.getValue();
                ArrayList arrayList = new ArrayList(t72.u(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(hfc.d((rzf) it.next()));
                }
                l1fVar.a(arrayList, "choice");
                return wefVar;
        }
    }
}
