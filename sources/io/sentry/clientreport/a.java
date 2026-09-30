package io.sentry.clientreport;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.ib8;
import defpackage.je9;
import io.sentry.g7;
import io.sentry.h7;
import io.sentry.l3;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.g;
import io.sentry.protocol.g0;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.q5;
import io.sentry.r5;
import io.sentry.s3;
import io.sentry.y1;
import io.sentry.z0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements y1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static io.sentry.protocol.a b(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        io.sentry.protocol.a aVar = new io.sentry.protocol.a();
        ConcurrentHashMap concurrentHashMap = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "split_names":
                    List list = (List) l3Var.D0();
                    if (list == null) {
                        break;
                    } else {
                        aVar.X = list;
                        break;
                    }
                    break;
                case "device_app_hash":
                    aVar.c = l3Var.O();
                    break;
                case "start_type":
                    aVar.x = l3Var.O();
                    break;
                case "view_names":
                    List list2 = (List) l3Var.D0();
                    if (list2 == null) {
                        break;
                    } else {
                        aVar.w = list2;
                        break;
                    }
                    break;
                case "app_version":
                    aVar.f = l3Var.O();
                    break;
                case "in_foreground":
                    aVar.y = l3Var.r0();
                    break;
                case "build_type":
                    aVar.d = l3Var.O();
                    break;
                case "app_identifier":
                    aVar.a = l3Var.O();
                    break;
                case "app_start_time":
                    aVar.b = l3Var.o0(z0Var);
                    break;
                case "permissions":
                    aVar.v = io.sentry.util.b.o((Map) l3Var.D0());
                    break;
                case "app_name":
                    aVar.e = l3Var.O();
                    break;
                case "app_build":
                    aVar.g = l3Var.O();
                    break;
                case "is_split_apks":
                    aVar.z = l3Var.r0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    l3Var.F(z0Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        aVar.Y = concurrentHashMap;
        l3Var.endObject();
        return aVar;
    }

    public static io.sentry.protocol.e c(l3 l3Var, z0 z0Var) {
        byte b;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        l3Var.beginObject();
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            int i = 11;
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "spring":
                    b = 1;
                    break;
                case "response":
                    b = 2;
                    break;
                case "profile":
                    b = 3;
                    break;
                case "feedback":
                    b = 4;
                    break;
                case "os":
                    b = 5;
                    break;
                case "app":
                    b = 6;
                    break;
                case "art":
                    b = 7;
                    break;
                case "gpu":
                    b = 8;
                    break;
                case "flags":
                    b = 9;
                    break;
                case "trace":
                    b = 10;
                    break;
                case "browser":
                    b = 11;
                    break;
                case "runtime":
                    b = 12;
                    break;
                default:
                    b = -1;
                    break;
            }
            ArrayList arrayList = null;
            switch (b) {
                case 0:
                    eVar.p(d(l3Var, z0Var));
                    break;
                case 1:
                    l3Var.beginObject();
                    g0 g0Var = new g0();
                    ConcurrentHashMap concurrentHashMap = null;
                    while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName2 = l3Var.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("active_profiles")) {
                            List list = (List) l3Var.D0();
                            if (list != null) {
                                String[] strArr = new String[list.size()];
                                list.toArray(strArr);
                                g0Var.a = strArr;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap, strNextName2);
                        }
                    }
                    g0Var.b = concurrentHashMap;
                    l3Var.endObject();
                    eVar.v(g0Var);
                    break;
                case 2:
                    l3Var.beginObject();
                    s sVar = new s();
                    ConcurrentHashMap concurrentHashMap2 = null;
                    while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName3 = l3Var.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "status_code":
                                sVar.c = l3Var.B();
                                break;
                            case "data":
                                sVar.e = l3Var.D0();
                                break;
                            case "headers":
                                Map map = (Map) l3Var.D0();
                                if (map != null) {
                                    sVar.b = io.sentry.util.b.o(map);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "cookies":
                                sVar.a = l3Var.O();
                                break;
                            case "body_size":
                                sVar.d = l3Var.H();
                                break;
                            default:
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                l3Var.F(z0Var, concurrentHashMap2, strNextName3);
                                break;
                        }
                    }
                    sVar.f = concurrentHashMap2;
                    l3Var.endObject();
                    eVar.t(sVar);
                    break;
                case 3:
                    l3Var.beginObject();
                    s3 s3Var = new s3(w.b);
                    ConcurrentHashMap concurrentHashMap3 = null;
                    while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName4 = l3Var.nextName();
                        strNextName4.getClass();
                        if (strNextName4.equals("profiler_id")) {
                            w wVar = (w) l3Var.A0(z0Var, new a(23));
                            if (wVar != null) {
                                s3Var.a = wVar;
                            }
                        } else {
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap3, strNextName4);
                        }
                    }
                    s3Var.b = concurrentHashMap3;
                    l3Var.endObject();
                    eVar.l(s3Var, "profile");
                    break;
                case 4:
                    eVar.l(e(l3Var, z0Var), "feedback");
                    break;
                case 5:
                    eVar.s(g(l3Var, z0Var));
                    break;
                case 6:
                    eVar.n(b(l3Var, z0Var));
                    break;
                case 7:
                    l3Var.beginObject();
                    io.sentry.protocol.c cVar = new io.sentry.protocol.c();
                    ConcurrentHashMap concurrentHashMap4 = null;
                    while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName5 = l3Var.nextName();
                        strNextName5.getClass();
                        switch (strNextName5) {
                            case "gc.total_time":
                                cVar.b = l3Var.e0();
                                break;
                            case "memory.free_until_gc":
                                cVar.v = l3Var.H();
                                break;
                            case "gc.blocking_time":
                                cVar.d = l3Var.e0();
                                break;
                            case "gc.waiting_time":
                                cVar.f = l3Var.e0();
                                break;
                            case "memory.free_until_oome":
                                cVar.w = l3Var.H();
                                break;
                            case "memory.total":
                                cVar.x = l3Var.H();
                                break;
                            case "gc.pre_oome_count":
                                cVar.e = l3Var.H();
                                break;
                            case "memory.free":
                                cVar.g = l3Var.H();
                                break;
                            case "gc.blocking_count":
                                cVar.c = l3Var.H();
                                break;
                            case "gc.total_count":
                                cVar.a = l3Var.H();
                                break;
                            case "memory.max":
                                cVar.y = l3Var.H();
                                break;
                            default:
                                if (concurrentHashMap4 == null) {
                                    concurrentHashMap4 = new ConcurrentHashMap();
                                }
                                l3Var.F(z0Var, concurrentHashMap4, strNextName5);
                                break;
                        }
                    }
                    cVar.z = concurrentHashMap4;
                    l3Var.endObject();
                    eVar.l(cVar, "art");
                    break;
                case 8:
                    eVar.r(f(l3Var, z0Var));
                    break;
                case 9:
                    l3Var.beginObject();
                    ConcurrentHashMap concurrentHashMap5 = null;
                    while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName6 = l3Var.nextName();
                        strNextName6.getClass();
                        if (strNextName6.equals("values")) {
                            arrayList = l3Var.N0(z0Var, new a(i));
                        } else {
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap5, strNextName6);
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    j jVar = new j(arrayList);
                    jVar.b = concurrentHashMap5;
                    l3Var.endObject();
                    eVar.q(jVar);
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    eVar.w(io.sentry.f.c(l3Var, z0Var));
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    l3Var.beginObject();
                    io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                    ConcurrentHashMap concurrentHashMap6 = null;
                    while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName7 = l3Var.nextName();
                        strNextName7.getClass();
                        if (strNextName7.equals("name")) {
                            dVar.a = l3Var.O();
                        } else if (strNextName7.equals("version")) {
                            dVar.b = l3Var.O();
                        } else {
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap6, strNextName7);
                        }
                    }
                    dVar.c = concurrentHashMap6;
                    l3Var.endObject();
                    eVar.o(dVar);
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    l3Var.beginObject();
                    y yVar = new y();
                    ConcurrentHashMap concurrentHashMap7 = null;
                    while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName8 = l3Var.nextName();
                        strNextName8.getClass();
                        switch (strNextName8) {
                            case "raw_description":
                                yVar.c = l3Var.O();
                                break;
                            case "name":
                                yVar.a = l3Var.O();
                                break;
                            case "version":
                                yVar.b = l3Var.O();
                                break;
                            default:
                                if (concurrentHashMap7 == null) {
                                    concurrentHashMap7 = new ConcurrentHashMap();
                                }
                                l3Var.F(z0Var, concurrentHashMap7, strNextName8);
                                break;
                        }
                    }
                    yVar.d = concurrentHashMap7;
                    l3Var.endObject();
                    eVar.u(yVar);
                    break;
                default:
                    Object objD0 = l3Var.D0();
                    if (objD0 != null) {
                        eVar.l(objD0, strNextName);
                    }
                    break;
            }
        }
        l3Var.endObject();
        return eVar;
    }

    public static h d(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        h hVar = new h();
        ConcurrentHashMap concurrentHashMap = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            int i = 10;
            switch (strNextName) {
                case "timezone":
                    hVar.O0 = l3Var.M(z0Var);
                    break;
                case "boot_time":
                    if (l3Var.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                        break;
                    } else {
                        hVar.N0 = l3Var.o0(z0Var);
                        break;
                    }
                    break;
                case "simulator":
                    hVar.z = l3Var.r0();
                    break;
                case "manufacturer":
                    hVar.b = l3Var.O();
                    break;
                case "processor_count":
                    hVar.T0 = l3Var.B();
                    break;
                case "orientation":
                    hVar.y = (g) l3Var.A0(z0Var, new a(i));
                    break;
                case "battery_temperature":
                    hVar.S0 = l3Var.y0();
                    break;
                case "family":
                    hVar.d = l3Var.O();
                    break;
                case "locale":
                    hVar.Q0 = l3Var.O();
                    break;
                case "online":
                    hVar.x = l3Var.r0();
                    break;
                case "battery_level":
                    hVar.v = l3Var.y0();
                    break;
                case "model_id":
                    hVar.f = l3Var.O();
                    break;
                case "screen_density":
                    hVar.L0 = l3Var.y0();
                    break;
                case "screen_dpi":
                    hVar.M0 = l3Var.B();
                    break;
                case "free_memory":
                    hVar.Y = l3Var.H();
                    break;
                case "id":
                    hVar.P0 = l3Var.O();
                    break;
                case "name":
                    hVar.a = l3Var.O();
                    break;
                case "low_memory":
                    hVar.E0 = l3Var.r0();
                    break;
                case "archs":
                    List list = (List) l3Var.D0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        hVar.g = strArr;
                        break;
                    }
                    break;
                case "brand":
                    hVar.c = l3Var.O();
                    break;
                case "model":
                    hVar.e = l3Var.O();
                    break;
                case "cpu_description":
                    hVar.V0 = l3Var.O();
                    break;
                case "processor_frequency":
                    hVar.U0 = l3Var.e0();
                    break;
                case "connection_type":
                    hVar.R0 = l3Var.O();
                    break;
                case "chipset":
                    hVar.W0 = l3Var.O();
                    break;
                case "screen_width_pixels":
                    hVar.J0 = l3Var.B();
                    break;
                case "external_storage_size":
                    hVar.H0 = l3Var.H();
                    break;
                case "storage_size":
                    hVar.F0 = l3Var.H();
                    break;
                case "usable_memory":
                    hVar.Z = l3Var.H();
                    break;
                case "memory_size":
                    hVar.X = l3Var.H();
                    break;
                case "charging":
                    hVar.w = l3Var.r0();
                    break;
                case "external_free_storage":
                    hVar.I0 = l3Var.H();
                    break;
                case "free_storage":
                    hVar.G0 = l3Var.H();
                    break;
                case "screen_height_pixels":
                    hVar.K0 = l3Var.B();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    l3Var.F(z0Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        hVar.X0 = concurrentHashMap;
        l3Var.endObject();
        return hVar;
    }

    public static k e(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        w wVar = null;
        w wVar2 = null;
        String strO4 = null;
        HashMap map = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "associated_event_id":
                    wVar = new w(l3Var.nextString());
                    break;
                case "replay_id":
                    wVar2 = new w(l3Var.nextString());
                    break;
                case "url":
                    strO4 = l3Var.O();
                    break;
                case "name":
                    strO3 = l3Var.O();
                    break;
                case "contact_email":
                    strO2 = l3Var.O();
                    break;
                case "message":
                    strO = l3Var.O();
                    break;
                default:
                    if (map == null) {
                        map = new HashMap();
                    }
                    l3Var.F(z0Var, map, strNextName);
                    break;
            }
        }
        l3Var.endObject();
        if (strO == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
            z0Var.d(q5.ERROR, "Missing required field \"message\"", illegalStateException);
            throw illegalStateException;
        }
        k kVar = new k(strO);
        kVar.b = strO2;
        kVar.c = strO3;
        kVar.d = wVar;
        kVar.e = wVar2;
        kVar.f = strO4;
        kVar.g = map;
        return kVar;
    }

    public static m f(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        m mVar = new m();
        ConcurrentHashMap concurrentHashMap = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "npot_support":
                    mVar.w = l3Var.O();
                    break;
                case "vendor_id":
                    mVar.c = l3Var.O();
                    break;
                case "multi_threaded_rendering":
                    mVar.g = l3Var.r0();
                    break;
                case "id":
                    mVar.b = l3Var.B();
                    break;
                case "name":
                    mVar.a = l3Var.O();
                    break;
                case "vendor_name":
                    mVar.d = l3Var.O();
                    break;
                case "version":
                    mVar.v = l3Var.O();
                    break;
                case "api_type":
                    mVar.f = l3Var.O();
                    break;
                case "memory_size":
                    mVar.e = l3Var.B();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    l3Var.F(z0Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        mVar.x = concurrentHashMap;
        l3Var.endObject();
        return mVar;
    }

    public static q g(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        q qVar = new q();
        ConcurrentHashMap concurrentHashMap = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "rooted":
                    qVar.f = l3Var.r0();
                    break;
                case "raw_description":
                    qVar.c = l3Var.O();
                    break;
                case "name":
                    qVar.a = l3Var.O();
                    break;
                case "build":
                    qVar.d = l3Var.O();
                    break;
                case "version":
                    qVar.b = l3Var.O();
                    break;
                case "kernel_version":
                    qVar.e = l3Var.O();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    l3Var.F(z0Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        qVar.g = concurrentHashMap;
        l3Var.endObject();
        return qVar;
    }

    public static IllegalStateException h(z0 z0Var, String str) {
        String strJ = ib8.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        z0Var.d(q5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException i(z0 z0Var, String str) {
        String strJ = ib8.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        z0Var.d(q5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException j(z0 z0Var, String str) {
        String strJ = ib8.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        z0Var.d(q5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    @Override // io.sentry.y1
    public final Object a(l3 l3Var, z0 z0Var) {
        Double dValueOf;
        int i = 7;
        int i2 = 3;
        int i3 = 1;
        Boolean boolR0 = null;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                l3Var.beginObject();
                Date dateO0 = null;
                HashMap map = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName = l3Var.nextName();
                    strNextName.getClass();
                    if (strNextName.equals("discarded_events")) {
                        arrayList.addAll(l3Var.N0(z0Var, new a(i3)));
                    } else if (strNextName.equals("timestamp")) {
                        dateO0 = l3Var.o0(z0Var);
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        l3Var.F(z0Var, map, strNextName);
                    }
                }
                l3Var.endObject();
                if (dateO0 == null) {
                    throw h(z0Var, "timestamp");
                }
                if (arrayList.isEmpty()) {
                    throw h(z0Var, "discarded_events");
                }
                b bVar = new b(dateO0, arrayList);
                bVar.c = map;
                return bVar;
            case 1:
                l3Var.beginObject();
                String strO = null;
                String strO2 = null;
                Long lH = null;
                HashMap map2 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = l3Var.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "quantity":
                            lH = l3Var.H();
                            break;
                        case "reason":
                            strO = l3Var.O();
                            break;
                        case "category":
                            strO2 = l3Var.O();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            l3Var.F(z0Var, map2, strNextName2);
                            break;
                    }
                }
                l3Var.endObject();
                if (strO == null) {
                    throw i(z0Var, "reason");
                }
                if (strO2 == null) {
                    throw i(z0Var, "category");
                }
                if (lH == null) {
                    throw i(z0Var, "quantity");
                }
                e eVar = new e(strO, strO2, lH);
                eVar.d = map2;
                return eVar;
            case 2:
                l3Var.beginObject();
                io.sentry.profilemeasurements.a aVar = new io.sentry.profilemeasurements.a("unknown", new ArrayList());
                ConcurrentHashMap concurrentHashMap = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName3 = l3Var.nextName();
                    strNextName3.getClass();
                    if (strNextName3.equals("values")) {
                        ArrayList arrayListN0 = l3Var.N0(z0Var, new a(i2));
                        if (arrayListN0 != null) {
                            aVar.c = arrayListN0;
                        }
                    } else if (strNextName3.equals("unit")) {
                        String strO3 = l3Var.O();
                        if (strO3 != null) {
                            aVar.b = strO3;
                        }
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        l3Var.F(z0Var, concurrentHashMap, strNextName3);
                    }
                }
                aVar.a = concurrentHashMap;
                l3Var.endObject();
                return aVar;
            case 3:
                l3Var.beginObject();
                io.sentry.profilemeasurements.b bVar2 = new io.sentry.profilemeasurements.b(0L, 0, 0L);
                ConcurrentHashMap concurrentHashMap2 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName4 = l3Var.nextName();
                    strNextName4.getClass();
                    switch (strNextName4) {
                        case "elapsed_since_start_ns":
                            String strO4 = l3Var.O();
                            if (strO4 != null) {
                                bVar2.c = strO4;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "timestamp":
                            try {
                                dValueOf = l3Var.e0();
                                break;
                            } catch (NumberFormatException unused) {
                                Date dateO1 = l3Var.o0(z0Var);
                                dValueOf = dateO1 != null ? Double.valueOf(dateO1.getTime() / 1000.0d) : null;
                            }
                            if (dValueOf != null) {
                                bVar2.b = dValueOf.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "value":
                            Double dE0 = l3Var.e0();
                            if (dE0 != null) {
                                bVar2.d = dE0.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap2, strNextName4);
                            break;
                    }
                }
                bVar2.a = concurrentHashMap2;
                l3Var.endObject();
                return bVar2;
            case 4:
                return b(l3Var, z0Var);
            case 5:
                l3Var.beginObject();
                io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                ConcurrentHashMap concurrentHashMap3 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName5 = l3Var.nextName();
                    strNextName5.getClass();
                    if (strNextName5.equals("name")) {
                        dVar.a = l3Var.O();
                    } else if (strNextName5.equals("version")) {
                        dVar.b = l3Var.O();
                    } else {
                        if (concurrentHashMap3 == null) {
                            concurrentHashMap3 = new ConcurrentHashMap();
                        }
                        l3Var.F(z0Var, concurrentHashMap3, strNextName5);
                    }
                }
                dVar.c = concurrentHashMap3;
                l3Var.endObject();
                return dVar;
            case 6:
                return c(l3Var, z0Var);
            case 7:
                DebugImage debugImage = new DebugImage();
                l3Var.beginObject();
                AbstractMap map3 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName6 = l3Var.nextName();
                    strNextName6.getClass();
                    switch (strNextName6) {
                        case "debug_file":
                            debugImage.debugFile = l3Var.O();
                            break;
                        case "image_addr":
                            debugImage.imageAddr = l3Var.O();
                            break;
                        case "image_size":
                            debugImage.imageSize = l3Var.H();
                            break;
                        case "code_file":
                            debugImage.codeFile = l3Var.O();
                            break;
                        case "arch":
                            debugImage.arch = l3Var.O();
                            break;
                        case "type":
                            debugImage.type = l3Var.O();
                            break;
                        case "uuid":
                            debugImage.uuid = l3Var.O();
                            break;
                        case "debug_id":
                            debugImage.debugId = l3Var.O();
                            break;
                        case "code_id":
                            debugImage.codeId = l3Var.O();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            l3Var.F(z0Var, map3, strNextName6);
                            break;
                    }
                }
                l3Var.endObject();
                debugImage.setUnknown(map3);
                return debugImage;
            case 8:
                io.sentry.protocol.f fVar = new io.sentry.protocol.f();
                l3Var.beginObject();
                HashMap map4 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName7 = l3Var.nextName();
                    strNextName7.getClass();
                    if (strNextName7.equals("images")) {
                        fVar.b = l3Var.N0(z0Var, new a(i));
                    } else if (strNextName7.equals("sdk_info")) {
                        fVar.a = (t) l3Var.A0(z0Var, new a(20));
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        l3Var.F(z0Var, map4, strNextName7);
                    }
                }
                l3Var.endObject();
                fVar.c = map4;
                return fVar;
            case 9:
                return d(l3Var, z0Var);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return g.valueOf(l3Var.nextString().toUpperCase(Locale.ROOT));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l3Var.beginObject();
                String strO5 = null;
                ConcurrentHashMap concurrentHashMap4 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName8 = l3Var.nextName();
                    strNextName8.getClass();
                    if (strNextName8.equals("result")) {
                        boolR0 = l3Var.r0();
                    } else if (strNextName8.equals("flag")) {
                        strO5 = l3Var.O();
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        l3Var.F(z0Var, concurrentHashMap4, strNextName8);
                    }
                }
                if (strO5 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                    z0Var.d(q5.ERROR, "Missing required field \"flag\"", illegalStateException);
                    throw illegalStateException;
                }
                if (boolR0 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                    z0Var.d(q5.ERROR, "Missing required field \"result\"", illegalStateException2);
                    throw illegalStateException2;
                }
                i iVar = new i(strO5, boolR0.booleanValue());
                iVar.c = concurrentHashMap4;
                l3Var.endObject();
                return iVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return e(l3Var, z0Var);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l3Var.beginObject();
                l lVar = new l();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName9 = l3Var.nextName();
                    strNextName9.getClass();
                    switch (strNextName9) {
                        case "region":
                            lVar.c = l3Var.O();
                            break;
                        case "city":
                            lVar.a = l3Var.O();
                            break;
                        case "country_code":
                            lVar.b = l3Var.O();
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap5, strNextName9);
                            break;
                    }
                }
                lVar.d = concurrentHashMap5;
                l3Var.endObject();
                return lVar;
            case 14:
                return f(l3Var, z0Var);
            case 15:
                l3Var.beginObject();
                Number number = null;
                String strO6 = null;
                AbstractMap concurrentHashMap6 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName10 = l3Var.nextName();
                    strNextName10.getClass();
                    if (strNextName10.equals("unit")) {
                        strO6 = l3Var.O();
                    } else if (strNextName10.equals("value")) {
                        number = (Number) l3Var.D0();
                    } else {
                        if (concurrentHashMap6 == null) {
                            concurrentHashMap6 = new ConcurrentHashMap();
                        }
                        l3Var.F(z0Var, concurrentHashMap6, strNextName10);
                    }
                }
                l3Var.endObject();
                if (number != null) {
                    n nVar = new n(strO6, number);
                    nVar.d = concurrentHashMap6;
                    return nVar;
                }
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"value\"");
                z0Var.d(q5.ERROR, "Missing required field \"value\"", illegalStateException3);
                throw illegalStateException3;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                o oVar = new o();
                l3Var.beginObject();
                HashMap map5 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName11 = l3Var.nextName();
                    strNextName11.getClass();
                    switch (strNextName11) {
                        case "description":
                            oVar.b = l3Var.O();
                            break;
                        case "exception_id":
                            oVar.v = l3Var.B();
                            break;
                        case "data":
                            oVar.f = io.sentry.util.b.o((Map) l3Var.D0());
                            break;
                        case "meta":
                            oVar.e = io.sentry.util.b.o((Map) l3Var.D0());
                            break;
                        case "type":
                            oVar.a = l3Var.O();
                            break;
                        case "handled":
                            oVar.d = l3Var.r0();
                            break;
                        case "synthetic":
                            oVar.g = l3Var.r0();
                            break;
                        case "is_exception_group":
                            oVar.x = l3Var.r0();
                            break;
                        case "help_link":
                            oVar.c = l3Var.O();
                            break;
                        case "parent_id":
                            oVar.w = l3Var.B();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            l3Var.F(z0Var, map5, strNextName11);
                            break;
                    }
                }
                l3Var.endObject();
                oVar.y = map5;
                return oVar;
            case 17:
                l3Var.beginObject();
                p pVar = new p();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName12 = l3Var.nextName();
                    strNextName12.getClass();
                    switch (strNextName12) {
                        case "params":
                            List list = (List) l3Var.D0();
                            if (list != null) {
                                pVar.c = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "message":
                            pVar.b = l3Var.O();
                            break;
                        case "formatted":
                            pVar.a = l3Var.O();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap7, strNextName12);
                            break;
                    }
                }
                pVar.d = concurrentHashMap7;
                l3Var.endObject();
                return pVar;
            case 18:
                return g(l3Var, z0Var);
            case 19:
                l3Var.beginObject();
                r rVar = new r();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName13 = l3Var.nextName();
                    strNextName13.getClass();
                    switch (strNextName13) {
                        case "fragment":
                            rVar.x = l3Var.O();
                            break;
                        case "method":
                            rVar.b = l3Var.O();
                            break;
                        case "env":
                            Map map6 = (Map) l3Var.D0();
                            if (map6 != null) {
                                rVar.g = io.sentry.util.b.o(map6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "url":
                            rVar.a = l3Var.O();
                            break;
                        case "data":
                            rVar.d = l3Var.D0();
                            break;
                        case "other":
                            Map map7 = (Map) l3Var.D0();
                            if (map7 != null) {
                                rVar.w = io.sentry.util.b.o(map7);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "headers":
                            Map map8 = (Map) l3Var.D0();
                            if (map8 != null) {
                                rVar.f = io.sentry.util.b.o(map8);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "cookies":
                            rVar.e = l3Var.O();
                            break;
                        case "body_size":
                            rVar.v = l3Var.H();
                            break;
                        case "query_string":
                            rVar.c = l3Var.O();
                            break;
                        case "api_target":
                            rVar.y = l3Var.O();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap8, strNextName13);
                            break;
                    }
                }
                rVar.z = concurrentHashMap8;
                l3Var.endObject();
                return rVar;
            case 20:
                t tVar = new t();
                l3Var.beginObject();
                HashMap map9 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName14 = l3Var.nextName();
                    strNextName14.getClass();
                    switch (strNextName14) {
                        case "sdk_name":
                            tVar.a = l3Var.O();
                            break;
                        case "version_patchlevel":
                            tVar.d = l3Var.B();
                            break;
                        case "version_major":
                            tVar.b = l3Var.B();
                            break;
                        case "version_minor":
                            tVar.c = l3Var.B();
                            break;
                        default:
                            if (map9 == null) {
                                map9 = new HashMap();
                            }
                            l3Var.F(z0Var, map9, strNextName14);
                            break;
                    }
                }
                l3Var.endObject();
                tVar.e = map9;
                return tVar;
            case 21:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                l3Var.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                HashMap map10 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName15 = l3Var.nextName();
                    strNextName15.getClass();
                    switch (strNextName15) {
                        case "name":
                            strNextString = l3Var.nextString();
                            break;
                        case "version":
                            strNextString2 = l3Var.nextString();
                            break;
                        case "packages":
                            ArrayList arrayListN1 = l3Var.N0(z0Var, new a(24));
                            if (arrayListN1 != null) {
                                arrayList2.addAll(arrayListN1);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "integrations":
                            List list2 = (List) l3Var.D0();
                            if (list2 != null) {
                                arrayList3.addAll(list2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (map10 == null) {
                                map10 = new HashMap();
                            }
                            l3Var.F(z0Var, map10, strNextName15);
                            break;
                    }
                }
                l3Var.endObject();
                if (strNextString == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    z0Var.d(q5.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (strNextString2 == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                    z0Var.d(q5.ERROR, "Missing required field \"version\"", illegalStateException5);
                    throw illegalStateException5;
                }
                u uVar = new u(strNextString, strNextString2);
                uVar.c = new CopyOnWriteArraySet(arrayList2);
                uVar.d = new CopyOnWriteArraySet(arrayList3);
                uVar.e = map10;
                return uVar;
            case 22:
                v vVar = new v();
                l3Var.beginObject();
                HashMap map11 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName16 = l3Var.nextName();
                    strNextName16.getClass();
                    switch (strNextName16) {
                        case "thread_id":
                            vVar.d = l3Var.H();
                            break;
                        case "module":
                            vVar.c = l3Var.O();
                            break;
                        case "type":
                            vVar.a = l3Var.O();
                            break;
                        case "value":
                            vVar.b = l3Var.O();
                            break;
                        case "mechanism":
                            vVar.f = (o) l3Var.A0(z0Var, new a(16));
                            break;
                        case "stacktrace":
                            vVar.e = (c0) l3Var.A0(z0Var, new a(28));
                            break;
                        default:
                            if (map11 == null) {
                                map11 = new HashMap();
                            }
                            l3Var.F(z0Var, map11, strNextName16);
                            break;
                    }
                }
                l3Var.endObject();
                vVar.g = map11;
                return vVar;
            case 23:
                return new w(l3Var.nextString());
            case 24:
                l3Var.beginObject();
                String strNextString3 = null;
                String strNextString4 = null;
                HashMap map12 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName17 = l3Var.nextName();
                    strNextName17.getClass();
                    if (strNextName17.equals("name")) {
                        strNextString3 = l3Var.nextString();
                    } else if (strNextName17.equals("version")) {
                        strNextString4 = l3Var.nextString();
                    } else {
                        if (map12 == null) {
                            map12 = new HashMap();
                        }
                        l3Var.F(z0Var, map12, strNextName17);
                    }
                }
                l3Var.endObject();
                if (strNextString3 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"name\"");
                    z0Var.d(q5.ERROR, "Missing required field \"name\"", illegalStateException6);
                    throw illegalStateException6;
                }
                if (strNextString4 != null) {
                    x xVar = new x(strNextString3, strNextString4);
                    xVar.c = map12;
                    return xVar;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"version\"");
                z0Var.d(q5.ERROR, "Missing required field \"version\"", illegalStateException7);
                throw illegalStateException7;
            case 25:
                l3Var.beginObject();
                y yVar = new y();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName18 = l3Var.nextName();
                    strNextName18.getClass();
                    switch (strNextName18) {
                        case "raw_description":
                            yVar.c = l3Var.O();
                            break;
                        case "name":
                            yVar.a = l3Var.O();
                            break;
                        case "version":
                            yVar.b = l3Var.O();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap9, strNextName18);
                            break;
                    }
                }
                yVar.d = concurrentHashMap9;
                l3Var.endObject();
                return yVar;
            case 26:
                l3Var.beginObject();
                ConcurrentHashMap concurrentHashMap10 = null;
                Map map13 = null;
                HashMap map14 = null;
                Double dValueOf2 = null;
                Double dValueOf3 = null;
                w wVar = null;
                g7 g7Var = null;
                g7 g7Var2 = null;
                String strO7 = null;
                String strO8 = null;
                h7 h7Var = null;
                String strO9 = null;
                Map map15 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName19 = l3Var.nextName();
                    strNextName19.getClass();
                    switch (strNextName19) {
                        case "span_id":
                            g7Var = new g7(l3Var.nextString());
                            break;
                        case "parent_span_id":
                            g7Var2 = (g7) l3Var.A0(z0Var, new io.sentry.f(23));
                            break;
                        case "description":
                            strO8 = l3Var.O();
                            break;
                        case "start_timestamp":
                            try {
                                dValueOf2 = l3Var.e0();
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateO2 = l3Var.o0(z0Var);
                                dValueOf2 = dateO2 == null ? null : Double.valueOf(dateO2.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "origin":
                            strO9 = l3Var.O();
                            break;
                        case "status":
                            h7Var = (h7) l3Var.A0(z0Var, new io.sentry.f(24));
                            break;
                        case "measurements":
                            map14 = l3Var.P(z0Var, new a(15));
                            break;
                        case "op":
                            strO7 = l3Var.O();
                            break;
                        case "data":
                            map15 = (Map) l3Var.D0();
                            break;
                        case "tags":
                            map13 = (Map) l3Var.D0();
                            break;
                        case "timestamp":
                            try {
                                dValueOf3 = l3Var.e0();
                                break;
                            } catch (NumberFormatException unused3) {
                                Date dateO3 = l3Var.o0(z0Var);
                                dValueOf3 = dateO3 == null ? null : Double.valueOf(dateO3.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "trace_id":
                            wVar = new w(l3Var.nextString());
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap10, strNextName19);
                            break;
                    }
                }
                if (dValueOf2 == null) {
                    throw j(z0Var, "start_timestamp");
                }
                if (wVar == null) {
                    throw j(z0Var, "trace_id");
                }
                if (g7Var == null) {
                    throw j(z0Var, "span_id");
                }
                if (strO7 == null) {
                    throw j(z0Var, "op");
                }
                if (map13 == null) {
                    map13 = new HashMap();
                }
                Map map16 = map13;
                if (map14 == null) {
                    map14 = new HashMap();
                }
                z zVar = new z(dValueOf2, dValueOf3, wVar, g7Var, g7Var2, strO7, strO8, h7Var, strO9, map16, map14, map15);
                zVar.X = concurrentHashMap10;
                l3Var.endObject();
                return zVar;
            case 27:
                a0 a0Var = new a0();
                l3Var.beginObject();
                ConcurrentHashMap concurrentHashMap11 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName20 = l3Var.nextName();
                    strNextName20.getClass();
                    switch (strNextName20) {
                        case "post_context":
                            a0Var.b = (List) l3Var.D0();
                            break;
                        case "image_addr":
                            a0Var.Z = l3Var.O();
                            break;
                        case "in_app":
                            a0Var.y = l3Var.r0();
                            break;
                        case "raw_function":
                            a0Var.J0 = l3Var.O();
                            break;
                        case "lineno":
                            a0Var.g = l3Var.B();
                            break;
                        case "module":
                            a0Var.f = l3Var.O();
                            break;
                        case "native":
                            a0Var.X = l3Var.r0();
                            break;
                        case "symbol":
                            a0Var.H0 = l3Var.O();
                            break;
                        case "package":
                            a0Var.z = l3Var.O();
                            break;
                        case "filename":
                            a0Var.d = l3Var.O();
                            break;
                        case "symbol_addr":
                            a0Var.E0 = l3Var.O();
                            break;
                        case "lock":
                            a0Var.K0 = (r5) l3Var.A0(z0Var, new io.sentry.f(12));
                            break;
                        case "vars":
                            a0Var.c = (Map) l3Var.D0();
                            break;
                        case "colno":
                            a0Var.v = l3Var.B();
                            break;
                        case "instruction_addr":
                            a0Var.F0 = l3Var.O();
                            break;
                        case "pre_context":
                            a0Var.a = (List) l3Var.D0();
                            break;
                        case "addr_mode":
                            a0Var.G0 = l3Var.O();
                            break;
                        case "context_line":
                            a0Var.x = l3Var.O();
                            break;
                        case "function":
                            a0Var.e = l3Var.O();
                            break;
                        case "abs_path":
                            a0Var.w = l3Var.O();
                            break;
                        case "platform":
                            a0Var.Y = l3Var.O();
                            break;
                        default:
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap11, strNextName20);
                            break;
                    }
                }
                a0Var.I0 = concurrentHashMap11;
                l3Var.endObject();
                return a0Var;
            case 28:
                c0 c0Var = new c0();
                l3Var.beginObject();
                ConcurrentHashMap concurrentHashMap12 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName21 = l3Var.nextName();
                    strNextName21.getClass();
                    switch (strNextName21) {
                        case "frames":
                            c0Var.a = l3Var.N0(z0Var, new a(27));
                            break;
                        case "instruction_addr_adjustment":
                            c0Var.d = (b0) l3Var.A0(z0Var, new a(29));
                            break;
                        case "registers":
                            c0Var.b = io.sentry.util.b.o((Map) l3Var.D0());
                            break;
                        case "snapshot":
                            c0Var.c = l3Var.r0();
                            break;
                        default:
                            if (concurrentHashMap12 == null) {
                                concurrentHashMap12 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap12, strNextName21);
                            break;
                    }
                }
                c0Var.e = concurrentHashMap12;
                l3Var.endObject();
                return c0Var;
            default:
                return b0.valueOf(l3Var.nextString().toUpperCase(Locale.ROOT));
        }
    }
}
