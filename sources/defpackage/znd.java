package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class znd implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ znd(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        int i = this.a;
        wef wefVar = wef.a;
        byte b = 0;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                return th.getCause();
            case 1:
                return wefVar;
            case 2:
                return wefVar;
            case 3:
                ((hxc) obj).getClass();
                return wefVar;
            case 4:
                ((Integer) obj).getClass();
                return wefVar;
            case 5:
                kv2.y((l1f) obj, "btn", "input_spread_info", "pathway", "homepage_photoReading_spreadInfoPage");
                return wefVar;
            case 6:
                kv2.y((l1f) obj, "btn", "skip_spread", "pathway", "homepage_photoReading_spreadInfoPage");
                return wefVar;
            case 7:
                kv2.y((l1f) obj, "btn", "spread_info_next", "pathway", "spread_info");
                return wefVar;
            case 8:
                kv2.y((l1f) obj, "btn", "spread_info_prev", "pathway", "spread_info");
                return wefVar;
            case 9:
                kv2.y((l1f) obj, "btn", "confirm_edit_meaning", "pathway", "spread_info_edit");
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj).getClass();
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((qb9) obj).b = true;
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((bea) obj).getClass();
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((bea) obj).getClass();
                return wefVar;
            case 14:
                ((bea) obj).getClass();
                return wefVar;
            case 15:
                l1f l1fVar = (l1f) obj;
                l1fVar.a("wecom_member", "popup");
                l1fVar.a("subscribe_succeeded", "triggered_by");
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((ued) obj).getClass();
                return Boolean.FALSE;
            case 17:
                exc.d((hxc) obj);
                return wefVar;
            case 18:
                ((wae) obj).c();
                return wefVar;
            case 19:
                return wefVar;
            case 20:
                return Float.valueOf(1.0f);
            case 21:
                return Float.valueOf(((Context) obj).getResources().getDisplayMetrics().density);
            case 22:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 23:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 24:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW0.R0()) {
                        arrayList.add(x8cVarW0.t0(0));
                    }
                    x8cVarW0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    x8cVarW0.close();
                    throw th2;
                }
            case 25:
                ((Float) obj).getClass();
                return wefVar;
            case 26:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.q(-1.0f);
                return wefVar;
            case 27:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.q(-1.0f);
                return wefVar;
            case 28:
                t09 t09Var = (t09) obj;
                t09Var.getClass();
                int i2 = 24;
                trd trdVar = new trd(8, new yx4(i2));
                t09 t09Var2 = new t09();
                trdVar.d(t09Var2);
                t09Var.e.addAll(t72.H(t09Var2));
                kob kobVar = job.a;
                mr7 mr7VarQ = oa7.q(t09Var, kobVar.b(ec5.class), null, new dxc(20, b));
                oa7.o(mr7VarQ, kobVar.b(zb5.class));
                oa7.o(mr7VarQ, kobVar.b(hf8.class));
                mr7 mr7VarQ2 = oa7.q(t09Var, kobVar.b(n5b.class), null, new dxc(12, b));
                oa7.o(mr7VarQ2, kobVar.b(hf8.class));
                oa7.o(mr7VarQ2, kobVar.b(k5b.class));
                oa7.q(t09Var, kobVar.b(zgb.class), null, new dxc(14, b));
                oa7.q(t09Var, kobVar.b(emb.class), null, new dxc(15, b));
                mr7 mr7VarQ3 = oa7.q(t09Var, kv2.c(kobVar, yt6.class, oa7.q(t09Var, kv2.c(kobVar, xt6.class, oa7.q(t09Var, kobVar.b(sfe.class), null, new dxc(16, b)), uke.class), null, new dxc(17, b)), npf.class), null, new dxc(18, b));
                oa7.o(mr7VarQ3, kobVar.b(gpf.class));
                oa7.o(mr7VarQ3, kobVar.b(hf8.class));
                mr7 mr7VarQ4 = oa7.q(t09Var, kv2.c(kobVar, hf8.class, oa7.q(t09Var, kv2.c(kobVar, hf8.class, oa7.q(t09Var, kobVar.b(c50.class), null, new dxc(19, b)), d43.class), null, new dxc(21, b)), m05.class), null, new dxc(22, b));
                oa7.o(mr7VarQ4, kobVar.b(it6.class));
                oa7.o(mr7VarQ4, kobVar.b(unf.class));
                mr7 mr7VarQ5 = oa7.q(t09Var, kv2.c(kobVar, p5a.class, oa7.r(t09Var, kv2.c(kobVar, zt8.class, oa7.r(t09Var, kv2.c(kobVar, i2a.class, oa7.q(t09Var, kv2.c(kobVar, zf6.class, oa7.q(t09Var, kv2.c(kobVar, hf8.class, oa7.q(t09Var, kv2.c(kobVar, w55.class, oa7.r(t09Var, kobVar.b(l65.class), new dxc(23, b)), ea6.class), null, new dxc(i2, b)), bg6.class), null, new dxc(25, b)), ds3.class), null, new dxc(26, b)), bu8.class), new dxc(27, b)), u5a.class), new dxc(28, b)), c2g.class), null, new dxc(29, b));
                oa7.o(mr7VarQ5, kobVar.b(x1g.class));
                oa7.o(mr7VarQ5, kobVar.b(hf8.class));
                mr7 mr7VarQ6 = oa7.q(t09Var, kobVar.b(p2g.class), null, new mle(b));
                oa7.o(mr7VarQ6, kobVar.b(o2g.class));
                oa7.o(mr7VarQ6, kobVar.b(hf8.class));
                mr7 mr7VarQ7 = oa7.q(t09Var, kobVar.b(sba.class), null, new dxc(10, b));
                oa7.o(mr7VarQ7, kobVar.b(hba.class));
                oa7.o(mr7VarQ7, kobVar.b(hf8.class));
                oa7.o(oa7.q(t09Var, kv2.c(kobVar, gda.class, oa7.q(t09Var, kobVar.b(ida.class), null, new dxc(11, b)), rqc.class), null, new dxc(13, b)), kobVar.b(mqc.class));
                return wefVar;
            default:
                sle sleVar = (sle) obj;
                sleVar.getClass();
                return sleVar.a;
        }
    }
}
