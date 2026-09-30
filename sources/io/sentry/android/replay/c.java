package io.sentry.android.replay;

import com.adjust.sdk.sig.r3;
import defpackage.bq3;
import defpackage.c5e;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.pa7;
import defpackage.rob;
import defpackage.v4e;
import defpackage.z18;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.q5;
import io.sentry.x3;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements x3 {
    public static final lw7 c = eb3.N(z18.c, a.b);
    public static final HashSet d;
    public String a;
    public final Map b = Collections.synchronizedMap(new bq3());

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        d = hashSet;
    }

    public c(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setBeforeBreadcrumb(new io.sentry.d(this, sentryAndroidOptions.getBeforeBreadcrumb()));
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01b6  */
    @Override // io.sentry.x3
    public final io.sentry.rrweb.b a(io.sentry.g gVar) {
        String str;
        q5 q5Var;
        Object obj;
        String strG0;
        double dLongValue;
        double dLongValue2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (pa7.t(gVar.g, "http")) {
            Object obj2 = gVar.b().get("url");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null || str2.length() == 0) {
                return null;
            }
            Map mapB = gVar.b();
            mapB.getClass();
            if (!mapB.containsKey("http.start_timestamp")) {
                return null;
            }
            Map mapB2 = gVar.b();
            mapB2.getClass();
            if (!mapB2.containsKey("http.end_timestamp")) {
                return null;
            }
            Object obj3 = gVar.b().get("http.start_timestamp");
            Object obj4 = gVar.b().get("http.end_timestamp");
            io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
            lVar.b = gVar.c().getTime();
            lVar.d = "resource.http";
            Object obj5 = gVar.b().get("url");
            obj5.getClass();
            lVar.e = (String) obj5;
            if (obj3 instanceof Double) {
                dLongValue = ((Number) obj3).doubleValue();
            } else {
                obj3.getClass();
                dLongValue = ((Long) obj3).longValue();
            }
            lVar.f = dLongValue / 1000.0d;
            if (obj4 instanceof Double) {
                dLongValue2 = ((Number) obj4).doubleValue();
            } else {
                obj4.getClass();
                dLongValue2 = ((Long) obj4).longValue();
            }
            lVar.g = dLongValue2 / 1000.0d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (this.b.remove(gVar) != null) {
                r3.f();
                return null;
            }
            Map mapB3 = gVar.b();
            mapB3.getClass();
            for (Map.Entry entry : mapB3.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (d.contains(str3)) {
                    str3.getClass();
                    String strA = c5e.A(str3, "content_length", "body_size");
                    linkedHashMap2.put(((rob) c.getValue()).i(v4e.f0(strA, ".", strA), b.b), value);
                }
            }
            lVar.v = new ConcurrentHashMap(linkedHashMap2);
            return lVar;
        }
        String str4 = "navigation";
        if (pa7.t(gVar.e, "navigation") && pa7.t(gVar.g, "app.lifecycle")) {
            str4 = "app." + gVar.b().get("state");
        } else if (pa7.t(gVar.e, "navigation") && pa7.t(gVar.g, "device.orientation")) {
            str4 = gVar.g;
            str4.getClass();
            Object obj6 = gVar.b().get("position");
            if (!pa7.t(obj6, "landscape") && !pa7.t(obj6, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj6);
        } else {
            if (!pa7.t(gVar.e, "navigation")) {
                if (pa7.t(gVar.g, "ui.click")) {
                    Object obj7 = gVar.b().get("view.id");
                    if (obj7 == null && (obj7 = gVar.b().get("view.tag")) == null) {
                        obj7 = gVar.b().get("view.class");
                    }
                    str = obj7 instanceof String ? (String) obj7 : null;
                    if (str == null) {
                        return null;
                    }
                    Map mapB4 = gVar.b();
                    mapB4.getClass();
                    linkedHashMap.putAll(mapB4);
                    str4 = "ui.tap";
                    q5Var = null;
                } else if (pa7.t(gVar.e, "system") && pa7.t(gVar.g, "network.event")) {
                    if (pa7.t(gVar.b().get("action"), "NETWORK_LOST")) {
                        obj = "offline";
                    } else {
                        Map mapB5 = gVar.b();
                        mapB5.getClass();
                        if (!mapB5.containsKey("network_type")) {
                            return null;
                        }
                        Object obj8 = gVar.b().get("network_type");
                        String str5 = obj8 instanceof String ? (String) obj8 : null;
                        if (str5 == null || str5.length() == 0) {
                            return null;
                        }
                        obj = gVar.b().get("network_type");
                    }
                    linkedHashMap.put("state", obj);
                    if (pa7.t(this.a, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj9 = linkedHashMap.get("state");
                    this.a = obj9 instanceof String ? (String) obj9 : null;
                    str4 = "device.connectivity";
                } else if (pa7.t(gVar.b().get("action"), "BATTERY_CHANGED")) {
                    Map mapB6 = gVar.b();
                    mapB6.getClass();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry2 : mapB6.entrySet()) {
                        String str6 = (String) entry2.getKey();
                        if (pa7.t(str6, "level") || pa7.t(str6, "charging")) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap3);
                    str4 = "device.battery";
                } else {
                    str4 = gVar.g;
                    str = gVar.d;
                    q5Var = gVar.w;
                    Map mapB7 = gVar.b();
                    mapB7.getClass();
                    linkedHashMap.putAll(mapB7);
                }
                if (str4 == null && str4.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.b = gVar.c().getTime();
                    aVar.d = gVar.c().getTime() / 1000.0d;
                    aVar.e = "default";
                    aVar.f = str4;
                    aVar.g = str;
                    aVar.v = q5Var;
                    aVar.w = new ConcurrentHashMap(linkedHashMap);
                    return aVar;
                }
            }
            if (pa7.t(gVar.b().get("state"), "resumed")) {
                Object obj10 = gVar.b().get("screen");
                String str7 = obj10 instanceof String ? (String) obj10 : null;
                if (str7 != null) {
                    strG0 = v4e.g0('.', str7, str7);
                } else {
                    strG0 = null;
                }
            } else {
                Map mapB8 = gVar.b();
                mapB8.getClass();
                if (mapB8.containsKey("to")) {
                    Object obj11 = gVar.b().get("to");
                    if (obj11 instanceof String) {
                        strG0 = (String) obj11;
                    } else {
                        strG0 = null;
                    }
                } else {
                    strG0 = null;
                }
            }
            if (strG0 == null) {
                return null;
            }
            linkedHashMap.put("to", strG0);
        }
        str = null;
        q5Var = null;
        return str4 == null ? null : null;
    }
}
