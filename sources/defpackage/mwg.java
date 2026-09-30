package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mwg implements msg {
    public final /* synthetic */ int a;
    public static final /* synthetic */ mwg b = new mwg(0);
    public static final /* synthetic */ mwg c = new mwg(1);
    public static final /* synthetic */ mwg d = new mwg(2);
    public static final /* synthetic */ mwg e = new mwg(3);
    public static final /* synthetic */ mwg f = new mwg(4);
    public static final /* synthetic */ mwg g = new mwg(5);
    public static final /* synthetic */ mwg v = new mwg(6);
    public static final /* synthetic */ mwg w = new mwg(7);
    public static final /* synthetic */ mwg x = new mwg(8);
    public static final /* synthetic */ mwg y = new mwg(9);
    public static final /* synthetic */ mwg z = new mwg(10);
    public static final /* synthetic */ mwg X = new mwg(11);
    public static final /* synthetic */ mwg Y = new mwg(12);
    public static final /* synthetic */ mwg Z = new mwg(13);
    public static final /* synthetic */ mwg E0 = new mwg(14);
    public static final /* synthetic */ mwg F0 = new mwg(15);
    public static final /* synthetic */ mwg G0 = new mwg(16);
    public static final /* synthetic */ mwg H0 = new mwg(17);
    public static final /* synthetic */ mwg I0 = new mwg(18);

    public /* synthetic */ mwg(int i) {
        this.a = i;
    }

    @Override // defpackage.msg
    public Object b() {
        switch (this.a) {
            case 0:
                List list = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(73, 518400000L, "measurement.upload.max_queue_time").get();
            case 1:
                List list2 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(36, 5000L, "measurement.service_client.idle_disconnect_millis").get();
            case 2:
                List list3 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 3:
                List list4 = bzg.a;
                spg.b.get().getClass();
                m7h m7hVar = tpg.a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) m7hVar.a;
                jbh jbhVar = (jbh) atomicReferenceArray.get(2);
                if (jbhVar == null) {
                    yah yahVar = new yah("measurement.test.double_flag", (gn2) ((ysd) m7hVar.b).b);
                    while (!atomicReferenceArray.compareAndSet(2, null, yahVar)) {
                        if (atomicReferenceArray.get(2) != null) {
                            jbhVar = (jbh) atomicReferenceArray.get(2);
                            jbhVar.getClass();
                        }
                    }
                    jbhVar = yahVar;
                }
                return (Double) jbhVar.get();
            case 4:
                List list5 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 5:
                List list6 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(67, 100L, "measurement.upload.max_bundles").get()).longValue());
            case 6:
                List list7 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case 7:
                List list8 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 8:
                List list9 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(75, 65536L, "measurement.upload.max_batch_size").get()).longValue());
            case 9:
                List list10 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                List list11 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(30, 3000L, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                List list12 = bzg.a;
                ((ipg) hpg.b.a.get()).getClass();
                return (Boolean) ipg.b.get();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                List list13 = bzg.a;
                ((lqg) kqg.b.a.get()).getClass();
                return (Boolean) lqg.a.get();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                List list14 = bzg.a;
                ((gpg) fpg.b.a.get()).getClass();
                return (Boolean) gpg.a.get();
            case 14:
                List list15 = bzg.a;
                ((hqg) gqg.b.a.get()).getClass();
                return (Boolean) hqg.a.get();
            case 15:
                List list16 = bzg.a;
                upg.b.get().getClass();
                return (Boolean) vpg.a.a(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                List list17 = bzg.a;
                ((zpg) ypg.b.a.get()).getClass();
                return (Boolean) zpg.b.get();
            case 17:
                ((mpg) lpg.b.a.get()).getClass();
                return new Boolean(((Boolean) mpg.a.get()).booleanValue());
            default:
                ((fqg) eqg.b.a.get()).getClass();
                return new Boolean(((Boolean) fqg.a.get()).booleanValue());
        }
    }
}
