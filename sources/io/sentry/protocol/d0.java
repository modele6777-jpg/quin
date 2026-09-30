package io.sentry.protocol;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.je9;
import io.sentry.l3;
import io.sentry.q5;
import io.sentry.t5;
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

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements y1 {
    public final /* synthetic */ int a;

    public /* synthetic */ d0(int i) {
        this.a = i;
    }

    public static io.sentry.rrweb.a b(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap map = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                l3Var.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = l3Var.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("payload")) {
                        l3Var.beginObject();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strNextName3 = l3Var.nextName();
                            strNextName3.getClass();
                            switch (strNextName3) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapO = io.sentry.util.b.o((Map) l3Var.D0());
                                    if (concurrentHashMapO == null) {
                                        break;
                                    } else {
                                        aVar.w = concurrentHashMapO;
                                        break;
                                    }
                                    break;
                                case "type":
                                    aVar.e = l3Var.O();
                                    break;
                                case "category":
                                    aVar.f = l3Var.O();
                                    break;
                                case "timestamp":
                                    aVar.d = l3Var.nextDouble();
                                    break;
                                case "level":
                                    try {
                                        aVar.v = q5.valueOf(l3Var.nextString().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e) {
                                        z0Var.c(q5.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                    break;
                                case "message":
                                    aVar.g = l3Var.O();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    l3Var.F(z0Var, concurrentHashMap2, strNextName3);
                                    break;
                            }
                        }
                        aVar.y = concurrentHashMap2;
                        l3Var.endObject();
                    } else if (strNextName2.equals("tag")) {
                        String strO = l3Var.O();
                        if (strO == null) {
                            strO = "";
                        }
                        aVar.c = strO;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        l3Var.F(z0Var, concurrentHashMap, strNextName2);
                    }
                }
                aVar.z = concurrentHashMap;
                l3Var.endObject();
            } else if (strNextName.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) l3Var.A0(z0Var, new d0(10));
                io.sentry.util.b.r(cVar, "");
                aVar.a = cVar;
            } else if (strNextName.equals("timestamp")) {
                aVar.b = l3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                l3Var.F(z0Var, map, strNextName);
            }
        }
        aVar.x = map;
        l3Var.endObject();
        return aVar;
    }

    public static io.sentry.rrweb.g c(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap map = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                l3Var.beginObject();
                HashMap map2 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = l3Var.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "x":
                            gVar.f = l3Var.nextFloat();
                            break;
                        case "y":
                            gVar.g = l3Var.nextFloat();
                            break;
                        case "id":
                            gVar.e = l3Var.nextInt();
                            break;
                        case "type":
                            gVar.d = (io.sentry.rrweb.f) l3Var.A0(z0Var, new d0(13));
                            break;
                        case "pointerType":
                            gVar.v = l3Var.nextInt();
                            break;
                        case "pointerId":
                            gVar.w = l3Var.nextInt();
                            break;
                        default:
                            if (!strNextName2.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                l3Var.F(z0Var, map2, strNextName2);
                                break;
                            } else {
                                io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) l3Var.A0(z0Var, new d0(11));
                                io.sentry.util.b.r(dVar, "");
                                gVar.c = dVar;
                                break;
                            }
                            break;
                    }
                }
                gVar.y = map2;
                l3Var.endObject();
            } else if (strNextName.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) l3Var.A0(z0Var, new d0(10));
                io.sentry.util.b.r(cVar, "");
                gVar.a = cVar;
            } else if (strNextName.equals("timestamp")) {
                gVar.b = l3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                l3Var.F(z0Var, map, strNextName);
            }
        }
        gVar.x = map;
        l3Var.endObject();
        return gVar;
    }

    public static io.sentry.rrweb.i d(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap map = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                l3Var.beginObject();
                HashMap map2 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = l3Var.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("pointerId")) {
                        iVar.d = l3Var.nextInt();
                    } else if (strNextName2.equals("positions")) {
                        iVar.e = l3Var.N0(z0Var, new d0(15));
                    } else if (strNextName2.equals("source")) {
                        io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) l3Var.A0(z0Var, new d0(11));
                        io.sentry.util.b.r(dVar, "");
                        iVar.c = dVar;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        l3Var.F(z0Var, map2, strNextName2);
                    }
                }
                iVar.g = map2;
                l3Var.endObject();
            } else if (strNextName.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) l3Var.A0(z0Var, new d0(10));
                io.sentry.util.b.r(cVar, "");
                iVar.a = cVar;
            } else if (strNextName.equals("timestamp")) {
                iVar.b = l3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                l3Var.F(z0Var, map, strNextName);
            }
        }
        iVar.f = map;
        l3Var.endObject();
        return iVar;
    }

    public static io.sentry.rrweb.j e(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap map = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                l3Var.beginObject();
                AbstractMap concurrentHashMap = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = l3Var.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "height":
                            Integer numB = l3Var.B();
                            jVar.d = numB != null ? numB.intValue() : 0;
                            break;
                        case "href":
                            String strO = l3Var.O();
                            if (strO == null) {
                                strO = "";
                            }
                            jVar.c = strO;
                            break;
                        case "width":
                            Integer numB2 = l3Var.B();
                            jVar.e = numB2 != null ? numB2.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap, strNextName2);
                            break;
                    }
                }
                l3Var.endObject();
            } else if (strNextName.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) l3Var.A0(z0Var, new d0(10));
                io.sentry.util.b.r(cVar, "");
                jVar.a = cVar;
            } else if (strNextName.equals("timestamp")) {
                jVar.b = l3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                l3Var.F(z0Var, map, strNextName);
            }
        }
        jVar.f = map;
        l3Var.endObject();
        return jVar;
    }

    public static io.sentry.rrweb.l f(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        HashMap map = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                l3Var.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = l3Var.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("payload")) {
                        l3Var.beginObject();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strNextName3 = l3Var.nextName();
                            strNextName3.getClass();
                            switch (strNextName3) {
                                case "description":
                                    lVar.e = l3Var.O();
                                    break;
                                case "endTimestamp":
                                    lVar.g = l3Var.nextDouble();
                                    break;
                                case "startTimestamp":
                                    lVar.f = l3Var.nextDouble();
                                    break;
                                case "op":
                                    lVar.d = l3Var.O();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapO = io.sentry.util.b.o((Map) l3Var.D0());
                                    if (concurrentHashMapO == null) {
                                        break;
                                    } else {
                                        lVar.v = concurrentHashMapO;
                                        break;
                                    }
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    l3Var.F(z0Var, concurrentHashMap2, strNextName3);
                                    break;
                            }
                        }
                        lVar.x = concurrentHashMap2;
                        l3Var.endObject();
                    } else if (strNextName2.equals("tag")) {
                        String strO = l3Var.O();
                        if (strO == null) {
                            strO = "";
                        }
                        lVar.c = strO;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        l3Var.F(z0Var, concurrentHashMap, strNextName2);
                    }
                }
                lVar.y = concurrentHashMap;
                l3Var.endObject();
            } else if (strNextName.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) l3Var.A0(z0Var, new d0(10));
                io.sentry.util.b.r(cVar, "");
                lVar.a = cVar;
            } else if (strNextName.equals("timestamp")) {
                lVar.b = l3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                l3Var.F(z0Var, map, strNextName);
            }
        }
        lVar.w = map;
        l3Var.endObject();
        return lVar;
    }

    public static io.sentry.rrweb.m g(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
        HashMap map = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            int i = 10;
            if (strNextName.equals("data")) {
                l3Var.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = l3Var.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("payload")) {
                        l3Var.beginObject();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strNextName3 = l3Var.nextName();
                            strNextName3.getClass();
                            switch (strNextName3) {
                                case "duration":
                                    mVar.f = l3Var.nextLong();
                                    break;
                                case "segmentId":
                                    mVar.d = l3Var.nextInt();
                                    break;
                                case "height":
                                    Integer numB = l3Var.B();
                                    mVar.w = numB != null ? numB.intValue() : 0;
                                    break;
                                case "container":
                                    String strO = l3Var.O();
                                    if (strO == null) {
                                        strO = "";
                                    }
                                    mVar.v = strO;
                                    break;
                                case "frameCount":
                                    Integer numB2 = l3Var.B();
                                    mVar.y = numB2 != null ? numB2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numB3 = l3Var.B();
                                    mVar.Z = numB3 != null ? numB3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numB4 = l3Var.B();
                                    mVar.Y = numB4 != null ? numB4.intValue() : 0;
                                    break;
                                case "size":
                                    Long lH = l3Var.H();
                                    mVar.e = lH == null ? 0L : lH.longValue();
                                    break;
                                case "width":
                                    Integer numB5 = l3Var.B();
                                    mVar.x = numB5 != null ? numB5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numB6 = l3Var.B();
                                    mVar.X = numB6 != null ? numB6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strO2 = l3Var.O();
                                    if (strO2 == null) {
                                        strO2 = "";
                                    }
                                    mVar.g = strO2;
                                    break;
                                case "frameRateType":
                                    String strO3 = l3Var.O();
                                    if (strO3 == null) {
                                        strO3 = "";
                                    }
                                    mVar.z = strO3;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    l3Var.F(z0Var, concurrentHashMap2, strNextName3);
                                    break;
                            }
                        }
                        mVar.F0 = concurrentHashMap2;
                        l3Var.endObject();
                    } else if (strNextName2.equals("tag")) {
                        String strO4 = l3Var.O();
                        if (strO4 == null) {
                            strO4 = "";
                        }
                        mVar.c = strO4;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        l3Var.F(z0Var, concurrentHashMap, strNextName2);
                    }
                }
                mVar.G0 = concurrentHashMap;
                l3Var.endObject();
            } else if (strNextName.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) l3Var.A0(z0Var, new d0(i));
                io.sentry.util.b.r(cVar, "");
                mVar.a = cVar;
            } else if (strNextName.equals("timestamp")) {
                mVar.b = l3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                l3Var.F(z0Var, map, strNextName);
            }
        }
        mVar.E0 = map;
        l3Var.endObject();
        return mVar;
    }

    @Override // io.sentry.y1
    public final Object a(l3 l3Var, z0 z0Var) {
        int i = 7;
        int i2 = 8;
        int i3 = 6;
        switch (this.a) {
            case 0:
                e0 e0Var = new e0();
                l3Var.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName = l3Var.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "daemon":
                            e0Var.g = l3Var.r0();
                            break;
                        case "priority":
                            e0Var.b = l3Var.B();
                            break;
                        case "held_locks":
                            HashMap mapP = l3Var.P(z0Var, new io.sentry.f(12));
                            if (mapP != null) {
                                e0Var.x = new HashMap(mapP);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "id":
                            e0Var.a = l3Var.H();
                            break;
                        case "main":
                            e0Var.v = l3Var.r0();
                            break;
                        case "name":
                            e0Var.c = l3Var.O();
                            break;
                        case "state":
                            e0Var.d = l3Var.O();
                            break;
                        case "crashed":
                            e0Var.e = l3Var.r0();
                            break;
                        case "current":
                            e0Var.f = l3Var.r0();
                            break;
                        case "stacktrace":
                            e0Var.w = (c0) l3Var.A0(z0Var, new io.sentry.clientreport.a(28));
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap, strNextName);
                            break;
                    }
                }
                e0Var.y = concurrentHashMap;
                l3Var.endObject();
                return e0Var;
            case 1:
                l3Var.beginObject();
                f0 f0Var = new f0(new ArrayList(), new HashMap(), new t5(1, h0.CUSTOM.apiName()));
                ConcurrentHashMap concurrentHashMap2 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = l3Var.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "start_timestamp":
                            try {
                                Double dE0 = l3Var.e0();
                                if (dE0 != null) {
                                    f0Var.F0 = dE0;
                                }
                                break;
                            } catch (NumberFormatException unused) {
                                Date dateO0 = l3Var.o0(z0Var);
                                if (dateO0 != null) {
                                    f0Var.F0 = Double.valueOf(dateO0.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapP2 = l3Var.P(z0Var, new io.sentry.clientreport.a(15));
                            if (mapP2 != null) {
                                f0Var.I0.putAll(mapP2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "type":
                            l3Var.nextString();
                            break;
                        case "timestamp":
                            try {
                                Double dE1 = l3Var.e0();
                                if (dE1 != null) {
                                    f0Var.G0 = dE1;
                                }
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateO1 = l3Var.o0(z0Var);
                                if (dateO1 != null) {
                                    f0Var.G0 = Double.valueOf(dateO1.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "spans":
                            ArrayList arrayListN0 = l3Var.N0(z0Var, new io.sentry.clientreport.a(26));
                            if (arrayListN0 != null) {
                                f0Var.H0.addAll(arrayListN0);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "transaction_info":
                            l3Var.beginObject();
                            String strO = null;
                            AbstractMap concurrentHashMap3 = null;
                            while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strNextName3 = l3Var.nextName();
                                strNextName3.getClass();
                                if (strNextName3.equals("source")) {
                                    strO = l3Var.O();
                                } else {
                                    if (concurrentHashMap3 == null) {
                                        concurrentHashMap3 = new ConcurrentHashMap();
                                    }
                                    l3Var.F(z0Var, concurrentHashMap3, strNextName3);
                                }
                            }
                            t5 t5Var = new t5(1, strO);
                            t5Var.c = concurrentHashMap3;
                            l3Var.endObject();
                            f0Var.J0 = t5Var;
                            break;
                        case "transaction":
                            f0Var.E0 = l3Var.O();
                            break;
                        default:
                            if (io.sentry.config.a.f(f0Var, strNextName2, l3Var, z0Var)) {
                                break;
                            } else {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                l3Var.F(z0Var, concurrentHashMap2, strNextName2);
                                break;
                            }
                            break;
                    }
                }
                f0Var.K0 = concurrentHashMap2;
                l3Var.endObject();
                return f0Var;
            case 2:
                l3Var.beginObject();
                i0 i0Var = new i0();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName4 = l3Var.nextName();
                    strNextName4.getClass();
                    switch (strNextName4) {
                        case "username":
                            i0Var.c = l3Var.O();
                            break;
                        case "id":
                            i0Var.b = l3Var.O();
                            break;
                        case "geo":
                            l3Var.beginObject();
                            l lVar = new l();
                            ConcurrentHashMap concurrentHashMap5 = null;
                            while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strNextName5 = l3Var.nextName();
                                strNextName5.getClass();
                                switch (strNextName5) {
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
                                        l3Var.F(z0Var, concurrentHashMap5, strNextName5);
                                        break;
                                }
                            }
                            lVar.d = concurrentHashMap5;
                            l3Var.endObject();
                            i0Var.f = lVar;
                            break;
                        case "data":
                            i0Var.g = io.sentry.util.b.o((Map) l3Var.D0());
                            break;
                        case "name":
                            i0Var.e = l3Var.O();
                            break;
                        case "email":
                            i0Var.a = l3Var.O();
                            break;
                        case "ip_address":
                            i0Var.d = l3Var.O();
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap4, strNextName4);
                            break;
                    }
                }
                i0Var.v = concurrentHashMap4;
                l3Var.endObject();
                return i0Var;
            case 3:
                l3Var.beginObject();
                String strO2 = null;
                ArrayList arrayListN1 = null;
                HashMap map = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName6 = l3Var.nextName();
                    strNextName6.getClass();
                    if (strNextName6.equals("rendering_system")) {
                        strO2 = l3Var.O();
                    } else if (strNextName6.equals("windows")) {
                        arrayListN1 = l3Var.N0(z0Var, new d0(4));
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        l3Var.F(z0Var, map, strNextName6);
                    }
                }
                l3Var.endObject();
                j0 j0Var = new j0(strO2, arrayListN1);
                j0Var.c = map;
                return j0Var;
            case 4:
                k0 k0Var = new k0();
                l3Var.beginObject();
                HashMap map2 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName7 = l3Var.nextName();
                    strNextName7.getClass();
                    switch (strNextName7) {
                        case "rendering_system":
                            k0Var.a = l3Var.O();
                            break;
                        case "identifier":
                            k0Var.c = l3Var.O();
                            break;
                        case "height":
                            k0Var.f = l3Var.e0();
                            break;
                        case "x":
                            k0Var.g = l3Var.e0();
                            break;
                        case "y":
                            k0Var.v = l3Var.e0();
                            break;
                        case "tag":
                            k0Var.d = l3Var.O();
                            break;
                        case "type":
                            k0Var.b = l3Var.O();
                            break;
                        case "alpha":
                            k0Var.x = l3Var.e0();
                            break;
                        case "width":
                            k0Var.e = l3Var.e0();
                            break;
                        case "children":
                            k0Var.y = l3Var.N0(z0Var, this);
                            break;
                        case "visibility":
                            k0Var.w = l3Var.O();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            l3Var.F(z0Var, map2, strNextName7);
                            break;
                    }
                }
                l3Var.endObject();
                k0Var.z = map2;
                return k0Var;
            case 5:
                l3Var.beginObject();
                io.sentry.protocol.profiling.a aVar = new io.sentry.protocol.profiling.a();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName8 = l3Var.nextName();
                    strNextName8.getClass();
                    switch (strNextName8) {
                        case "frames":
                            ArrayList arrayListN2 = l3Var.N0(z0Var, new io.sentry.clientreport.a(27));
                            if (arrayListN2 != null) {
                                aVar.c = arrayListN2;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "stacks":
                            List list = (List) l3Var.A0(z0Var, new d0(i3));
                            if (list != null) {
                                aVar.b = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "samples":
                            ArrayList arrayListN3 = l3Var.N0(z0Var, new d0(i));
                            if (arrayListN3 != null) {
                                aVar.a = arrayListN3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "thread_metadata":
                            HashMap mapP3 = l3Var.P(z0Var, new d0(i2));
                            if (mapP3 != null) {
                                aVar.d = mapP3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            l3Var.F(z0Var, concurrentHashMap6, strNextName8);
                            break;
                    }
                }
                aVar.e = concurrentHashMap6;
                l3Var.endObject();
                return aVar;
            case 6:
                ArrayList arrayList = new ArrayList();
                l3Var.beginArray();
                while (l3Var.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    l3Var.beginArray();
                    while (l3Var.hasNext()) {
                        arrayList2.add(Integer.valueOf(l3Var.nextInt()));
                    }
                    l3Var.endArray();
                    arrayList.add(arrayList2);
                }
                l3Var.endArray();
                return arrayList;
            case 7:
                l3Var.beginObject();
                io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
                AbstractMap map3 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName9 = l3Var.nextName();
                    strNextName9.getClass();
                    switch (strNextName9) {
                        case "thread_id":
                            bVar.c = l3Var.O();
                            break;
                        case "timestamp":
                            bVar.a = l3Var.nextDouble();
                            break;
                        case "stack_id":
                            bVar.b = l3Var.nextInt();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            l3Var.F(z0Var, map3, strNextName9);
                            break;
                    }
                }
                bVar.d = map3;
                l3Var.endObject();
                return bVar;
            case 8:
                l3Var.beginObject();
                io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
                HashMap map4 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName10 = l3Var.nextName();
                    strNextName10.getClass();
                    if (strNextName10.equals("priority")) {
                        cVar.b = l3Var.nextInt();
                    } else if (strNextName10.equals("name")) {
                        cVar.a = l3Var.O();
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        l3Var.F(z0Var, map4, strNextName10);
                    }
                }
                cVar.c = map4;
                l3Var.endObject();
                return cVar;
            case 9:
                return b(l3Var, z0Var);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return io.sentry.rrweb.c.values()[l3Var.nextInt()];
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return io.sentry.rrweb.d.values()[l3Var.nextInt()];
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return c(l3Var, z0Var);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return io.sentry.rrweb.f.values()[l3Var.nextInt()];
            case 14:
                return d(l3Var, z0Var);
            case 15:
                l3Var.beginObject();
                io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                HashMap map5 = null;
                while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName11 = l3Var.nextName();
                    strNextName11.getClass();
                    switch (strNextName11) {
                        case "x":
                            hVar.b = l3Var.nextFloat();
                            break;
                        case "y":
                            hVar.c = l3Var.nextFloat();
                            break;
                        case "id":
                            hVar.a = l3Var.nextInt();
                            break;
                        case "timeOffset":
                            hVar.d = l3Var.nextLong();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            l3Var.F(z0Var, map5, strNextName11);
                            break;
                    }
                }
                hVar.e = map5;
                l3Var.endObject();
                return hVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return e(l3Var, z0Var);
            case 17:
                return f(l3Var, z0Var);
            default:
                return g(l3Var, z0Var);
        }
    }
}
