package defpackage;

import com.adjust.sdk.Constants;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jwg implements msg, a3f, ypb {
    public final /* synthetic */ int a;
    public static final /* synthetic */ jwg b = new jwg(0);
    public static final /* synthetic */ jwg c = new jwg(1);
    public static final /* synthetic */ jwg d = new jwg(2);
    public static final /* synthetic */ jwg e = new jwg(3);
    public static final /* synthetic */ jwg f = new jwg(5);
    public static final /* synthetic */ jwg g = new jwg(6);
    public static final /* synthetic */ jwg v = new jwg(7);
    public static final /* synthetic */ jwg w = new jwg(8);
    public static final /* synthetic */ jwg x = new jwg(9);
    public static final /* synthetic */ jwg y = new jwg(10);
    public static final /* synthetic */ jwg z = new jwg(11);
    public static final /* synthetic */ jwg X = new jwg(12);
    public static final /* synthetic */ jwg Y = new jwg(13);
    public static final /* synthetic */ jwg Z = new jwg(14);
    public static final /* synthetic */ jwg E0 = new jwg(15);
    public static final /* synthetic */ jwg F0 = new jwg(16);
    public static final /* synthetic */ jwg G0 = new jwg(17);
    public static final /* synthetic */ jwg H0 = new jwg(18);
    public static final /* synthetic */ jwg I0 = new jwg(20);

    public jwg(AppMeasurementReceiver appMeasurementReceiver) {
        this.a = 19;
    }

    @Override // defpackage.ypb
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = w6h.l;
    }

    @Override // defpackage.a3f
    public Object apply(Object obj) {
        return ((h7h) obj).b();
    }

    @Override // defpackage.msg
    public Object b() {
        switch (this.a) {
            case 0:
                List list = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(76, 6L, "measurement.upload.retry_count").get()).longValue());
            case 1:
                List list2 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue());
            case 2:
                List list3 = bzg.a;
                spg.b.get().getClass();
                return (String) tpg.a.c(5, "measurement.test.string_flag", "---").get();
            case 3:
                List list4 = bzg.a;
                spg.b.get().getClass();
                return Integer.valueOf((int) ((Long) tpg.a.b(3, -2L, "measurement.test.int_flag").get()).longValue());
            case 4:
            default:
                ((bqg) aqg.b.a.get()).getClass();
                return new Boolean(((Boolean) bqg.a.get()).booleanValue());
            case 5:
                List list5 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get();
            case 6:
                List list6 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(60, "measurement.rb.attribution.uri_scheme", Constants.SCHEME).get();
            case 7:
                List list7 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(12, 3600000L, "measurement.session.engagement_interval").get();
            case 8:
                List list8 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case 9:
                List list9 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                List list10 = bzg.a;
                pog.b.get().getClass();
                return (Boolean) qog.a.a(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                List list11 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                List list12 = bzg.a;
                ((opg) npg.b.a.get()).getClass();
                return (Boolean) opg.a.get();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                List list13 = bzg.a;
                ((sog) rog.b.a.get()).getClass();
                return Integer.valueOf((int) ((Long) sog.a.get()).longValue());
            case 14:
                List list14 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 15:
                List list15 = bzg.a;
                upg.b.get().getClass();
                return (Boolean) vpg.a.a(8, "measurement.rb.attribution.uuid_generation", true).get();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                List list16 = bzg.a;
                upg.b.get().getClass();
                return (Boolean) vpg.a.a(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
            case 17:
                List list17 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(0, 10000L, "measurement.ad_id_cache_time").get();
        }
    }

    public /* synthetic */ jwg(int i) {
        this.a = i;
    }
}
