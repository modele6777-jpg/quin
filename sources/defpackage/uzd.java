package defpackage;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class uzd implements ned, odc, fy2, cfg, an9, jz4, ong, bc2, msg {
    public static uzd b;
    public final /* synthetic */ int a;
    public static final /* synthetic */ uzd c = new uzd(15);
    public static final /* synthetic */ uzd d = new uzd(18);
    public static final /* synthetic */ uzd e = new uzd(19);
    public static final /* synthetic */ uzd f = new uzd(20);
    public static final /* synthetic */ uzd g = new uzd(21);
    public static final /* synthetic */ uzd v = new uzd(22);
    public static final /* synthetic */ uzd w = new uzd(23);
    public static final /* synthetic */ uzd x = new uzd(24);
    public static final /* synthetic */ uzd y = new uzd(25);
    public static final /* synthetic */ uzd z = new uzd(26);
    public static final /* synthetic */ uzd X = new uzd(27);
    public static final /* synthetic */ uzd Y = new uzd(28);
    public static final /* synthetic */ uzd Z = new uzd(29);

    public /* synthetic */ uzd(int i) {
        this.a = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static iif d(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1932488279:
                if (!str.equals("no-subscription")) {
                    return null;
                }
                return iif.NoSubscription;
            case -1628421472:
                if (!str.equals("insufficient_balance")) {
                    return null;
                }
                return iif.InsufficientBalance;
            case -1342601465:
                if (!str.equals("daily-limit")) {
                    return null;
                }
                return iif.DailyLimit;
            case 88856085:
                if (!str.equals("daily_limit")) {
                    return null;
                }
                return iif.DailyLimit;
            case 218671716:
                if (!str.equals("no_followup_permission")) {
                    return null;
                }
                return iif.NoSubscription;
            case 577230555:
                if (!str.equals("no_subscription")) {
                    return null;
                }
                return iif.NoSubscription;
            case 1425374994:
                if (!str.equals("insufficient-balance")) {
                    return null;
                }
                return iif.InsufficientBalance;
            case 1462774781:
                if (!str.equals("monthly_usage_empty")) {
                    return null;
                }
                return iif.InsufficientBalance;
            case 1607297331:
                if (!str.equals("count_insufficient")) {
                    return null;
                }
                return iif.InsufficientBalance;
            default:
                return null;
        }
    }

    @Override // defpackage.odc
    public Object N(pcc pccVar, Object obj) {
        vue vueVar = (vue) obj;
        Integer numValueOf = Integer.valueOf(vueVar.a);
        String str = vueVar.b;
        String str2 = vueVar.c;
        long j = vueVar.d;
        int i = eue.c;
        Integer numValueOf2 = Integer.valueOf((int) (j >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j & 4294967295L));
        long j2 = vueVar.e;
        return t72.I(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(vueVar.f));
    }

    @Override // defpackage.cfg
    public /* synthetic */ Object a() {
        return new kfg();
    }

    @Override // defpackage.msg
    public Object b() {
        switch (this.a) {
            case 19:
                ((apg) zog.b.a.get()).getClass();
                return new Boolean(((Boolean) apg.a.get()).booleanValue());
            case 20:
                List list = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 21:
                List list2 = bzg.a;
                ((cpg) bpg.b.a.get()).getClass();
                return (String) cpg.c.get();
            case 22:
                List list3 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 23:
                List list4 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 24:
                List list5 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get();
            case 25:
                List list6 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case 26:
                List list7 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get();
            case 27:
                List list8 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(79, 3600000L, "measurement.upload.window_interval").get();
            case 28:
                List list9 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(28, 500L, "measurement.upload.minimum_delay").get();
            default:
                List list10 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(64, 15000L, "measurement.upload.initial_upload_delay_time").get();
        }
    }

    @Override // defpackage.bc2
    public /* synthetic */ Object c(hbc hbcVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(hbcVar);
    }

    @Override // defpackage.ong
    public boolean e(Class cls) {
        return false;
    }

    public boolean f(CharSequence charSequence) {
        return charSequence instanceof dpa;
    }

    @Override // defpackage.ong
    public xng l(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.an9
    public void r(Exception exc) {
        dhg.e.f(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "SharingStarted.Lazily";
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                int iHashCode = hashCode();
                tq.o(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return tec.m("CreationExtras.Key@", string, "<", job.a.b(String.class).r(), ">");
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.odc
    public Object v(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        String str = (String) obj3;
        Object obj4 = list.get(2);
        obj4.getClass();
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        obj5.getClass();
        int iIntValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        obj6.getClass();
        long jB = u3c.b(iIntValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        obj7.getClass();
        int iIntValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        obj8.getClass();
        long jB2 = u3c.b(iIntValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        obj9.getClass();
        return new vue(iIntValue, str, str2, jB, jB2, ((Long) obj9).longValue(), false, 64);
    }

    public /* synthetic */ uzd(int i, Object obj) {
        this.a = i;
    }

    @Override // defpackage.ned
    public wj5 a(c7e c7eVar) {
        return new rzd(c7eVar);
    }
}
