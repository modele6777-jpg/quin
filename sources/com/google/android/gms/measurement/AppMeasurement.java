package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.afc;
import defpackage.atg;
import defpackage.e8h;
import defpackage.gwg;
import defpackage.oa7;
import defpackage.qrg;
import defpackage.rjg;
import defpackage.w3h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement b;
    public final atg a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(w3h w3hVar) {
        this.a = new rjg(w3hVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                if (b == null) {
                    e8h e8hVar = (e8h) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (e8hVar != null) {
                        b = new AppMeasurement(e8hVar);
                    } else {
                        b = new AppMeasurement(w3h.m(context, new gwg(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return b;
    }

    public void beginAdUnitExposure(String str) {
        this.a.h(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.j(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.a.g(str);
    }

    public long generateEventId() {
        return this.a.i();
    }

    public String getAppInstanceId() {
        return this.a.m();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listK = this.a.k(str, str2);
        ArrayList arrayList = new ArrayList(listK == null ? 0 : listK.size());
        for (Bundle bundle : listK) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            oa7.A(bundle);
            conditionalUserProperty.mAppId = (String) afc.v(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) afc.v(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) afc.v(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = afc.v(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) afc.v(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) afc.v(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) afc.v(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) afc.v(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) afc.v(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) afc.v(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) afc.v(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) afc.v(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) afc.v(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) afc.v(bundle, UsageBillingBalance.STATUS_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) afc.v(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) afc.v(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.a.e();
    }

    public String getCurrentScreenName() {
        return this.a.d();
    }

    public String getGmpAppId() {
        return this.a.n();
    }

    public int getMaxUserProperties(String str) {
        return this.a.l(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.a.o(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.a.c(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        oa7.A(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            afc.u(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(UsageBillingBalance.STATUS_ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.a.f(bundle);
    }

    public AppMeasurement(e8h e8hVar) {
        this.a = new qrg(e8hVar);
    }
}
