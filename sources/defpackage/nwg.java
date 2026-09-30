package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nwg implements msg, bs4, yn2 {
    public final /* synthetic */ int a;
    public static final /* synthetic */ nwg b = new nwg(0);
    public static final /* synthetic */ nwg c = new nwg(1);
    public static final /* synthetic */ nwg d = new nwg(2);
    public static final /* synthetic */ nwg e = new nwg(3);
    public static final /* synthetic */ nwg f = new nwg(4);
    public static final /* synthetic */ nwg g = new nwg(5);
    public static final /* synthetic */ nwg v = new nwg(6);
    public static final /* synthetic */ nwg w = new nwg(7);
    public static final /* synthetic */ nwg x = new nwg(8);
    public static final /* synthetic */ nwg y = new nwg(9);
    public static final /* synthetic */ nwg z = new nwg(10);
    public static final /* synthetic */ nwg X = new nwg(11);
    public static final /* synthetic */ nwg Y = new nwg(12);
    public static final /* synthetic */ nwg Z = new nwg(13);
    public static final /* synthetic */ nwg E0 = new nwg(14);
    public static final /* synthetic */ nwg F0 = new nwg(15);
    public static final /* synthetic */ nwg G0 = new nwg(16);
    public static final /* synthetic */ nwg H0 = new nwg(17);

    public /* synthetic */ nwg(int i) {
        this.a = i;
    }

    @Override // defpackage.msg
    public Object b() {
        switch (this.a) {
            case 0:
                List list = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
            case 1:
                List list2 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(38, 1000L, "measurement.service_client.reconnect_millis").get();
            case 2:
                List list3 = bzg.a;
                spg.b.get().getClass();
                return (Long) tpg.a.b(4, -1L, "measurement.test.long_flag").get();
            case 3:
                List list4 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(21, 50L, "measurement.experiment.max_ids").get()).longValue());
            case 4:
                List list5 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
            case 5:
                List list6 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 6:
                List list7 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case 7:
                List list8 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case 8:
                List list9 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(57, 864000000L, "measurement.rb.attribution.max_queue_time").get();
            case 9:
                List list10 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                List list11 = bzg.a;
                pog.b.get().getClass();
                return (Boolean) qog.a.a(10, "measurement.config.default_flag_values", true).get();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                List list12 = bzg.a;
                ((ipg) hpg.b.a.get()).getClass();
                return (Boolean) ipg.a.get();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                List list13 = bzg.a;
                ((nqg) mqg.b.a.get()).getClass();
                return (Boolean) nqg.a.get();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                List list14 = bzg.a;
                ((gpg) fpg.b.a.get()).getClass();
                return (Boolean) gpg.b.get();
            case 14:
                List list15 = bzg.a;
                upg.b.get().getClass();
                return (Boolean) vpg.a.a(6, "measurement.rb.attribution.service", true).get();
            case 15:
                List list16 = bzg.a;
                upg.b.get().getClass();
                return (Boolean) vpg.a.a(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                List list17 = bzg.a;
                ((zpg) ypg.b.a.get()).getClass();
                return (Boolean) zpg.a.get();
            default:
                ((mpg) lpg.b.a.get()).getClass();
                return new Boolean(((Boolean) mpg.b.get()).booleanValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
  0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // defpackage.bs4
    public e6 c(Context context, String str, as4 as4Var) {
        e6 e6Var = new e6();
        e6Var.a = as4Var.d(context, str);
        int i = 1;
        int iA = as4Var.a(context, str, true);
        e6Var.b = iA;
        int i2 = e6Var.a;
        if (i2 == 0) {
            i2 = 0;
            if (iA == 0) {
                i = 0;
            } else if (i2 >= iA) {
                i = -1;
            }
        } else if (i2 >= iA) {
            i = -1;
        }
        e6Var.c = i;
        return e6Var;
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        omg omgVarE;
        j5h j5hVar = (j5h) task.i();
        j9h j9hVarX = k9h.x();
        String str = j5hVar.a;
        j9hVarX.c();
        ((k9h) j9hVarX.b).y(str);
        String str2 = j5hVar.c;
        j9hVarX.c();
        ((k9h) j9hVarX.b).A(str2);
        boolean z2 = j5hVar.f;
        j9hVarX.c();
        ((k9h) j9hVarX.b).D(z2);
        long j = j5hVar.g;
        j9hVarX.c();
        ((k9h) j9hVarX.b).E(j);
        byte[] bArr = j5hVar.b;
        if (bArr != null) {
            wlg wlgVarK = xlg.k(bArr, 0, bArr.length);
            j9hVarX.c();
            ((k9h) j9hVarX.b).z(wlgVarK);
        }
        for (h5h h5hVar : j5hVar.d) {
            for (u5h u5hVar : h5hVar.b) {
                int i = u5hVar.g;
                String str3 = u5hVar.a;
                if (i == 1) {
                    l9h l9hVarX = m9h.x();
                    l9hVarX.h(str3);
                    if (i != 1) {
                        qc0.j("Not a long type");
                        return null;
                    }
                    long j2 = u5hVar.b;
                    l9hVarX.c();
                    ((m9h) l9hVarX.b).A(j2);
                    omgVarE = l9hVarX.e();
                } else if (i == 2) {
                    l9h l9hVarX2 = m9h.x();
                    l9hVarX2.h(str3);
                    if (i != 2) {
                        qc0.j("Not a boolean type");
                        return null;
                    }
                    boolean z3 = u5hVar.c;
                    l9hVarX2.c();
                    ((m9h) l9hVarX2.b).B(z3);
                    omgVarE = l9hVarX2.e();
                } else if (i == 3) {
                    l9h l9hVarX3 = m9h.x();
                    l9hVarX3.h(str3);
                    if (i != 3) {
                        qc0.j("Not a double type");
                        return null;
                    }
                    double d2 = u5hVar.d;
                    l9hVarX3.c();
                    ((m9h) l9hVarX3.b).C(d2);
                    omgVarE = l9hVarX3.e();
                } else if (i == 4) {
                    l9h l9hVarX4 = m9h.x();
                    l9hVarX4.h(str3);
                    if (i != 4) {
                        qc0.j("Not a String type");
                        return null;
                    }
                    String str4 = u5hVar.e;
                    oa7.A(str4);
                    l9hVarX4.c();
                    ((m9h) l9hVarX4.b).D(str4);
                    omgVarE = l9hVarX4.e();
                } else {
                    if (i != 5) {
                        qc0.j(ub3.h(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
                        return null;
                    }
                    l9h l9hVarX5 = m9h.x();
                    l9hVarX5.h(str3);
                    if (i != 5) {
                        qc0.j("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = u5hVar.f;
                    oa7.A(bArr2);
                    wlg wlgVarK2 = xlg.k(bArr2, 0, bArr2.length);
                    l9hVarX5.c();
                    ((m9h) l9hVarX5.b).E(wlgVarK2);
                    omgVarE = l9hVarX5.e();
                }
                j9hVarX.c();
                ((k9h) j9hVarX.b).B((m9h) omgVarE);
            }
            String[] strArr = h5hVar.c;
            if (strArr != null) {
                for (String str5 : strArr) {
                    j9hVarX.c();
                    ((k9h) j9hVarX.b).C(str5);
                }
            }
        }
        return (k9h) j9hVarX.e();
    }
}
