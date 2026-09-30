package defpackage;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pwg implements msg, as4, bs4, vmg {
    public final /* synthetic */ int a;
    public static final /* synthetic */ pwg b = new pwg(0);
    public static final /* synthetic */ pwg c = new pwg(1);
    public static final /* synthetic */ pwg d = new pwg(2);
    public static final /* synthetic */ pwg e = new pwg(3);
    public static final /* synthetic */ pwg f = new pwg(4);
    public static final /* synthetic */ pwg g = new pwg(5);
    public static final /* synthetic */ pwg v = new pwg(7);
    public static final /* synthetic */ pwg w = new pwg(8);
    public static final /* synthetic */ pwg x = new pwg(9);
    public static final /* synthetic */ pwg y = new pwg(10);
    public static final /* synthetic */ pwg z = new pwg(11);
    public static final /* synthetic */ pwg X = new pwg(13);
    public static final /* synthetic */ pwg Y = new pwg(14);
    public static final /* synthetic */ pwg Z = new pwg(15);
    public static final /* synthetic */ pwg E0 = new pwg(16);
    public static final /* synthetic */ pwg F0 = new pwg(17);

    public /* synthetic */ pwg(int i) {
        this.a = i;
    }

    @Override // defpackage.as4
    public int a(Context context, String str, boolean z2) {
        return cs4.d(context, str, z2);
    }

    @Override // defpackage.msg
    public Object b() {
        switch (this.a) {
            case 0:
                List list = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case 1:
                List list2 = bzg.a;
                spg.b.get().getClass();
                return (Boolean) tpg.a.a(0, "measurement.test.boolean_flag", false).get();
            case 2:
                List list3 = bzg.a;
                spg.b.get().getClass();
                return (Long) tpg.a.b(1, -1L, "measurement.test.cached_long_flag").get();
            case 3:
                List list4 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 4:
                List list5 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get();
            case 5:
                List list6 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 6:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                ((rpg) ppg.b.a.get()).getClass();
                return new Boolean(((Boolean) rpg.a.get()).booleanValue());
            case 7:
                List list7 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case 8:
                List list8 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case 9:
                List list9 = bzg.a;
                pog.b.get().getClass();
                return (Boolean) qog.a.a(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                List list10 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(11, 3600000L, "45769094").get();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                List list11 = bzg.a;
                ((ipg) hpg.b.a.get()).getClass();
                return (Boolean) ipg.c.get();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                List list12 = bzg.a;
                ((dqg) cqg.b.a.get()).getClass();
                return (Boolean) dqg.a.get();
            case 14:
                List list13 = bzg.a;
                upg.b.get().getClass();
                return (Boolean) vpg.a.a(1, "measurement.rb.attribution.client2", true).get();
            case 15:
                List list14 = bzg.a;
                ((xpg) wpg.b.a.get()).getClass();
                return (Boolean) xpg.a.get();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                List list15 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue());
        }
    }

    @Override // defpackage.bs4
    public e6 c(Context context, String str, as4 as4Var) {
        int iA;
        int i = -1;
        switch (this.a) {
            case 18:
                e6 e6Var = new e6();
                int iD = as4Var.d(context, str);
                e6Var.a = iD;
                if (iD != 0) {
                    e6Var.c = -1;
                } else {
                    int iA2 = as4Var.a(context, str, true);
                    e6Var.b = iA2;
                    if (iA2 != 0) {
                        e6Var.c = 1;
                    }
                }
                return e6Var;
            default:
                e6 e6Var2 = new e6();
                int iD2 = as4Var.d(context, str);
                e6Var2.a = iD2;
                int i2 = 0;
                if (iD2 != 0) {
                    iA = as4Var.a(context, str, false);
                    e6Var2.b = iA;
                } else {
                    iA = as4Var.a(context, str, true);
                    e6Var2.b = iA;
                }
                int i3 = e6Var2.a;
                if (i3 == 0) {
                    if (iA == 0) {
                        i = 0;
                    }
                    e6Var2.c = i;
                    return e6Var2;
                }
                i2 = i3;
                if (i2 < iA) {
                    i = 1;
                }
                e6Var2.c = i;
                return e6Var2;
        }
    }

    @Override // defpackage.as4
    public int d(Context context, String str) {
        return cs4.a(context, str);
    }
}
