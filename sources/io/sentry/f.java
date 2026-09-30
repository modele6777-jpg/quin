package io.sentry;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.ib8;
import defpackage.je9;
import defpackage.uh2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements y1 {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    public static r4 b(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        r4 r4Var = new r4();
        r4Var.c = false;
        ConcurrentHashMap concurrentHashMap = null;
        r4Var.d = null;
        r4Var.a = false;
        r4Var.b = null;
        r4Var.w = false;
        r4Var.e = null;
        r4Var.f = false;
        r4Var.g = false;
        r4Var.X = t3.MANUAL;
        r4Var.v = 0;
        r4Var.x = true;
        r4Var.y = false;
        r4Var.z = true;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "is_enable_app_start_profiling":
                    Boolean boolR0 = l3Var.r0();
                    if (boolR0 != null) {
                        r4Var.x = boolR0.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "trace_sampled":
                    Boolean boolR1 = l3Var.r0();
                    if (boolR1 != null) {
                        r4Var.c = boolR1.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profiling_traces_dir_path":
                    String strO = l3Var.O();
                    if (strO != null) {
                        r4Var.e = strO;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "is_continuous_profiling_enabled":
                    Boolean boolR2 = l3Var.r0();
                    if (boolR2 != null) {
                        r4Var.g = boolR2.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "is_profiling_enabled":
                    Boolean boolR3 = l3Var.r0();
                    if (boolR3 != null) {
                        r4Var.f = boolR3.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "is_start_profiler_on_app_start":
                    Boolean boolR4 = l3Var.r0();
                    if (boolR4 != null) {
                        r4Var.y = boolR4.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profile_sampled":
                    Boolean boolR5 = l3Var.r0();
                    if (boolR5 != null) {
                        r4Var.a = boolR5.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profile_lifecycle":
                    String strO2 = l3Var.O();
                    if (strO2 != null) {
                        try {
                            r4Var.X = t3.valueOf(strO2);
                        } catch (IllegalArgumentException unused) {
                            z0Var.i(q5.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strO2), new Object[0]);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case "continuous_profile_sampled":
                    Boolean boolR6 = l3Var.r0();
                    if (boolR6 != null) {
                        r4Var.w = boolR6.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profiling_traces_hz":
                    Integer numB = l3Var.B();
                    if (numB != null) {
                        r4Var.v = numB.intValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "trace_sample_rate":
                    Double dE0 = l3Var.e0();
                    if (dE0 != null) {
                        r4Var.d = dE0;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "enable_legacy_profiling":
                    Boolean boolR7 = l3Var.r0();
                    if (boolR7 != null) {
                        r4Var.z = boolR7.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profile_sample_rate":
                    Double dE1 = l3Var.e0();
                    if (dE1 != null) {
                        r4Var.b = dE1;
                        break;
                    } else {
                        break;
                    }
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    l3Var.F(z0Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        r4Var.Y = concurrentHashMap;
        l3Var.endObject();
        return r4Var;
    }

    public static e7 c(l3 l3Var, z0 z0Var) {
        l3Var.beginObject();
        io.sentry.protocol.w wVar = null;
        g7 g7Var = null;
        String strNextString = null;
        ConcurrentHashMap concurrentHashMap = null;
        g7 g7Var2 = null;
        String strNextString2 = null;
        h7 h7Var = null;
        String strNextString3 = null;
        ConcurrentHashMap concurrentHashMapO = null;
        Map map = null;
        while (l3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = l3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "span_id":
                    g7Var = new g7(l3Var.nextString());
                    break;
                case "parent_span_id":
                    g7Var2 = (g7) l3Var.A0(z0Var, new f(23));
                    break;
                case "description":
                    strNextString2 = l3Var.nextString();
                    break;
                case "origin":
                    strNextString3 = l3Var.nextString();
                    break;
                case "status":
                    h7Var = (h7) l3Var.A0(z0Var, new f(24));
                    break;
                case "op":
                    strNextString = l3Var.nextString();
                    break;
                case "data":
                    map = (Map) l3Var.D0();
                    break;
                case "tags":
                    concurrentHashMapO = io.sentry.util.b.o((Map) l3Var.D0());
                    break;
                case "trace_id":
                    wVar = new io.sentry.protocol.w(l3Var.nextString());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    l3Var.F(z0Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        if (wVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            z0Var.d(q5.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (g7Var == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            z0Var.d(q5.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (strNextString == null) {
            strNextString = "";
        }
        e7 e7Var = new e7(wVar, g7Var, strNextString, g7Var2);
        e7Var.f = strNextString2;
        e7Var.g = h7Var;
        e7Var.w = strNextString3;
        if (concurrentHashMapO != null) {
            e7Var.v = concurrentHashMapO;
        }
        if (map != null) {
            e7Var.x = map;
        }
        e7Var.y = concurrentHashMap;
        l3Var.endObject();
        return e7Var;
    }

    public static IllegalStateException d(z0 z0Var, String str) {
        String strJ = ib8.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        z0Var.d(q5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException e(z0 z0Var, String str) {
        String strJ = ib8.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        z0Var.d(q5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v69 */
    @Override // io.sentry.y1
    public final Object a(l3 l3Var, z0 z0Var) {
        byte b;
        ?? r10;
        String str;
        ArrayList arrayList;
        l3 l3Var2 = l3Var;
        int i = this.a;
        int i2 = 17;
        int i3 = 10;
        String str2 = BuildConfig.BUILD_TYPE;
        int i4 = 8;
        switch (i) {
            case 0:
                char c = 4;
                String strO = null;
                char c2 = 3;
                l3Var2.beginObject();
                Date date = new Date();
                ConcurrentHashMap concurrentHashMap = null;
                String strO2 = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                String strO3 = null;
                String strO4 = null;
                q5 q5VarValueOf = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName = l3Var2.nextName();
                    strNextName.getClass();
                    switch (strNextName.hashCode()) {
                        case -1008619738:
                            b = strNextName.equals("origin") ? (byte) 0 : (byte) -1;
                            break;
                        case 3076010:
                            b = strNextName.equals("data") ? (byte) 1 : (byte) -1;
                            break;
                        case 3575610:
                            b = strNextName.equals("type") ? (byte) 2 : (byte) -1;
                            break;
                        case 50511102:
                            b = strNextName.equals("category") ? c2 : (byte) -1;
                            break;
                        case 55126294:
                            b = strNextName.equals("timestamp") ? c : (byte) -1;
                            break;
                        case 102865796:
                            b = strNextName.equals("level") ? (byte) 5 : (byte) -1;
                            break;
                        case 954925063:
                            b = strNextName.equals("message") ? (byte) 6 : (byte) -1;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            strO3 = l3Var.O();
                            continue;
                            l3Var2 = l3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 1:
                            ConcurrentHashMap concurrentHashMapO = io.sentry.util.b.o((Map) l3Var.D0());
                            if (concurrentHashMapO == null) {
                                continue;
                            } else if (!concurrentHashMapO.isEmpty()) {
                                concurrentHashMap = concurrentHashMapO;
                            }
                            l3Var2 = l3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 2:
                            strO = l3Var.O();
                            continue;
                            l3Var2 = l3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 3:
                            strO2 = l3Var.O();
                            continue;
                            l3Var2 = l3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 4:
                            Date dateO0 = l3Var.o0(z0Var);
                            if (dateO0 != null) {
                                date = dateO0;
                            } else {
                                continue;
                            }
                            l3Var2 = l3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 5:
                            try {
                                q5VarValueOf = q5.valueOf(l3Var2.nextString().toUpperCase(Locale.ROOT));
                            } catch (Exception e) {
                                z0Var.c(q5.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            }
                            break;
                        case 6:
                            strO4 = l3Var2.O();
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            l3Var2.F(z0Var, concurrentHashMap2, strNextName);
                            break;
                    }
                    l3Var2 = l3Var;
                    c = 4;
                    c2 = 3;
                }
                g gVar = new g(date);
                gVar.d = strO4;
                gVar.e = strO;
                if (concurrentHashMap != null) {
                    gVar.f = concurrentHashMap;
                }
                gVar.g = strO2;
                gVar.v = strO3;
                gVar.w = q5VarValueOf;
                gVar.x = concurrentHashMap2;
                l3Var.endObject();
                return gVar;
            case 1:
                boolean z = true;
                l3Var2.beginObject();
                io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
                r3 r3Var = new r3(wVar, wVar, null, new HashMap(), Double.valueOf(0.0d), q6.empty());
                ConcurrentHashMap concurrentHashMap3 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = l3Var2.nextName();
                    strNextName2.getClass();
                    switch (strNextName2.hashCode()) {
                        case -1840434063:
                            r10 = strNextName2.equals("debug_meta") ? 0 : -1;
                            break;
                        case -362243017:
                            r10 = strNextName2.equals("measurements") ? z : -1;
                            break;
                        case -309425751:
                            r10 = strNextName2.equals("profile") ? 2 : -1;
                            break;
                        case -85904877:
                            r10 = strNextName2.equals("environment") ? 3 : -1;
                            break;
                        case 55126294:
                            r10 = strNextName2.equals("timestamp") ? 4 : -1;
                            break;
                        case 178573617:
                            r10 = strNextName2.equals("profiler_id") ? 5 : -1;
                            break;
                        case 351608024:
                            r10 = strNextName2.equals("version") ? 6 : -1;
                            break;
                        case 831846208:
                            r10 = strNextName2.equals("content_type") ? 7 : -1;
                            break;
                        case 1090594823:
                            r10 = strNextName2.equals(str2) ? 8 : -1;
                            break;
                        case 1102774726:
                            r10 = strNextName2.equals("client_sdk") ? 9 : -1;
                            break;
                        case 1874684019:
                            r10 = strNextName2.equals("platform") ? 10 : -1;
                            break;
                        case 1953158756:
                            r10 = strNextName2.equals("sampled_profile") ? 11 : -1;
                            break;
                        case 2005113901:
                            r10 = strNextName2.equals("chunk_id") ? 12 : -1;
                            break;
                        default:
                            r10 = -1;
                            break;
                    }
                    switch (r10) {
                        case 0:
                            str = str2;
                            io.sentry.protocol.f fVar = (io.sentry.protocol.f) l3Var2.A0(z0Var, new io.sentry.clientreport.a(i4));
                            if (fVar != null) {
                                r3Var.a = fVar;
                            }
                            break;
                        case 1:
                            str = str2;
                            HashMap mapP = l3Var2.P(z0Var, new io.sentry.clientreport.a(2));
                            if (mapP != null) {
                                r3Var.e.putAll(mapP);
                            }
                            break;
                        case 2:
                            str = str2;
                            io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) l3Var2.A0(z0Var, new io.sentry.protocol.d0(5));
                            if (aVar != null) {
                                r3Var.Y = aVar;
                            }
                            break;
                        case 3:
                            str = str2;
                            String strO5 = l3Var2.O();
                            if (strO5 != null) {
                                r3Var.v = strO5;
                            }
                            break;
                        case 4:
                            Double dE0 = l3Var2.e0();
                            if (dE0 != null) {
                                str = str2;
                                r3Var.x = dE0.doubleValue();
                            } else {
                                str = str2;
                            }
                            break;
                        case 5:
                            io.sentry.protocol.w wVar2 = (io.sentry.protocol.w) l3Var2.A0(z0Var, new io.sentry.clientreport.a(23));
                            if (wVar2 != null) {
                                r3Var.b = wVar2;
                            }
                            str = str2;
                            break;
                        case 6:
                            String strO6 = l3Var2.O();
                            if (strO6 != null) {
                                r3Var.w = strO6;
                            }
                            str = str2;
                            break;
                        case 7:
                            String strO7 = l3Var2.O();
                            if (strO7 != null) {
                                r3Var.y = strO7;
                            }
                            str = str2;
                            break;
                        case 8:
                            String strO8 = l3Var2.O();
                            if (strO8 != null) {
                                r3Var.g = strO8;
                            }
                            str = str2;
                            break;
                        case 9:
                            io.sentry.protocol.u uVar = (io.sentry.protocol.u) l3Var2.A0(z0Var, new io.sentry.clientreport.a(21));
                            if (uVar != null) {
                                r3Var.d = uVar;
                            }
                            str = str2;
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            String strO9 = l3Var2.O();
                            if (strO9 != null) {
                                r3Var.f = strO9;
                            }
                            str = str2;
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            String strO10 = l3Var2.O();
                            if (strO10 != null) {
                                r3Var.X = strO10;
                            }
                            str = str2;
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            io.sentry.protocol.w wVar3 = (io.sentry.protocol.w) l3Var2.A0(z0Var, new io.sentry.clientreport.a(23));
                            if (wVar3 != null) {
                                r3Var.c = wVar3;
                            }
                            str = str2;
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            l3Var2.F(z0Var, concurrentHashMap3, strNextName2);
                            str = str2;
                            break;
                    }
                    str2 = str;
                    z = true;
                }
                r3Var.Z = concurrentHashMap3;
                l3Var2.endObject();
                return r3Var;
            case 2:
                l3Var2.beginObject();
                s3 s3Var = new s3(io.sentry.protocol.w.b);
                ConcurrentHashMap concurrentHashMap4 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName3 = l3Var2.nextName();
                    strNextName3.getClass();
                    if (strNextName3.equals("profiler_id")) {
                        io.sentry.protocol.w wVar4 = (io.sentry.protocol.w) l3Var2.A0(z0Var, new io.sentry.clientreport.a(23));
                        if (wVar4 != null) {
                            s3Var.a = wVar4;
                        }
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        l3Var2.F(z0Var, concurrentHashMap4, strNextName3);
                    }
                }
                s3Var.b = concurrentHashMap4;
                l3Var2.endObject();
                return s3Var;
            case 3:
                l3Var2.beginObject();
                File file = new File("dummy");
                Date date2 = new Date();
                ArrayList arrayList2 = new ArrayList();
                io.sentry.protocol.w wVar5 = io.sentry.protocol.w.b;
                u3 u3Var = new u3(file, date2, arrayList2, "", wVar5.a(), new e7(wVar5, g7.b, "op", null).a.a(), "0", 0, "", new m0(1), null, null, null, null, null, null, null, null, Constants.NORMAL, new HashMap());
                ConcurrentHashMap concurrentHashMap5 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName4 = l3Var2.nextName();
                    strNextName4.getClass();
                    switch (strNextName4) {
                        case "device_manufacturer":
                            String strO11 = l3Var2.O();
                            if (strO11 == null) {
                                break;
                            } else {
                                u3Var.e = strO11;
                                break;
                            }
                            break;
                        case "android_api_level":
                            Integer numB = l3Var2.B();
                            if (numB == null) {
                                break;
                            } else {
                                u3Var.c = numB.intValue();
                                break;
                            }
                            break;
                        case "build_id":
                            String strO12 = l3Var2.O();
                            if (strO12 == null) {
                                break;
                            } else {
                                u3Var.Z = strO12;
                                break;
                            }
                            break;
                        case "device_locale":
                            String strO13 = l3Var2.O();
                            if (strO13 == null) {
                                break;
                            } else {
                                u3Var.d = strO13;
                                break;
                            }
                            break;
                        case "profile_id":
                            String strO14 = l3Var2.O();
                            if (strO14 == null) {
                                break;
                            } else {
                                u3Var.L0 = strO14;
                                break;
                            }
                            break;
                        case "device_os_build_number":
                            String strO15 = l3Var2.O();
                            if (strO15 == null) {
                                break;
                            } else {
                                u3Var.g = strO15;
                                break;
                            }
                            break;
                        case "device_model":
                            String strO16 = l3Var2.O();
                            if (strO16 == null) {
                                break;
                            } else {
                                u3Var.f = strO16;
                                break;
                            }
                            break;
                        case "device_is_emulator":
                            Boolean boolR0 = l3Var2.r0();
                            if (boolR0 == null) {
                                break;
                            } else {
                                u3Var.x = boolR0.booleanValue();
                                break;
                            }
                            break;
                        case "duration_ns":
                            String strO17 = l3Var2.O();
                            if (strO17 == null) {
                                break;
                            } else {
                                u3Var.G0 = strO17;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapP2 = l3Var2.P(z0Var, new io.sentry.clientreport.a(2));
                            if (mapP2 == null) {
                                break;
                            } else {
                                u3Var.P0.putAll(mapP2);
                                break;
                            }
                            break;
                        case "device_physical_memory_bytes":
                            String strO18 = l3Var2.O();
                            if (strO18 == null) {
                                break;
                            } else {
                                u3Var.X = strO18;
                                break;
                            }
                            break;
                        case "device_cpu_frequencies":
                            List list = (List) l3Var2.D0();
                            if (list == null) {
                                break;
                            } else {
                                u3Var.z = list;
                                break;
                            }
                            break;
                        case "version_code":
                            String strO19 = l3Var2.O();
                            if (strO19 == null) {
                                break;
                            } else {
                                u3Var.H0 = strO19;
                                break;
                            }
                            break;
                        case "version_name":
                            String strO20 = l3Var2.O();
                            if (strO20 == null) {
                                break;
                            } else {
                                u3Var.I0 = strO20;
                                break;
                            }
                            break;
                        case "environment":
                            String strO21 = l3Var2.O();
                            if (strO21 == null) {
                                break;
                            } else {
                                u3Var.M0 = strO21;
                                break;
                            }
                            break;
                        case "timestamp":
                            Date dateO1 = l3Var.o0(z0Var);
                            if (dateO1 == null) {
                                break;
                            } else {
                                u3Var.O0 = dateO1;
                                break;
                            }
                            break;
                        case "transaction_name":
                            String strO22 = l3Var2.O();
                            if (strO22 == null) {
                                break;
                            } else {
                                u3Var.F0 = strO22;
                                break;
                            }
                            break;
                        case "device_os_name":
                            String strO23 = l3Var2.O();
                            if (strO23 == null) {
                                break;
                            } else {
                                u3Var.v = strO23;
                                break;
                            }
                            break;
                        case "architecture":
                            String strO24 = l3Var2.O();
                            if (strO24 == null) {
                                break;
                            } else {
                                u3Var.y = strO24;
                                break;
                            }
                            break;
                        case "transaction_id":
                            String strO25 = l3Var2.O();
                            if (strO25 == null) {
                                break;
                            } else {
                                u3Var.J0 = strO25;
                                break;
                            }
                            break;
                        case "device_os_version":
                            String strO26 = l3Var2.O();
                            if (strO26 == null) {
                                break;
                            } else {
                                u3Var.w = strO26;
                                break;
                            }
                            break;
                        case "truncation_reason":
                            String strO27 = l3Var2.O();
                            if (strO27 == null) {
                                break;
                            } else {
                                u3Var.N0 = strO27;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strO28 = l3Var2.O();
                            if (strO28 == null) {
                                break;
                            } else {
                                u3Var.K0 = strO28;
                                break;
                            }
                            break;
                        case "platform":
                            String strO29 = l3Var2.O();
                            if (strO29 == null) {
                                break;
                            } else {
                                u3Var.Y = strO29;
                                break;
                            }
                            break;
                        case "sampled_profile":
                            String strO30 = l3Var2.O();
                            if (strO30 == null) {
                                break;
                            } else {
                                u3Var.Q0 = strO30;
                                break;
                            }
                            break;
                        case "transactions":
                            ArrayList arrayListN0 = l3Var2.N0(z0Var, new f(4));
                            if (arrayListN0 == null) {
                                break;
                            } else {
                                u3Var.E0.addAll(arrayListN0);
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            l3Var2.F(z0Var, concurrentHashMap5, strNextName4);
                            break;
                    }
                }
                u3Var.R0 = concurrentHashMap5;
                l3Var2.endObject();
                return u3Var;
            case 4:
                l3Var2.beginObject();
                v3 v3Var = new v3(i3.a, 0L, 0L);
                ConcurrentHashMap concurrentHashMap6 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName5 = l3Var2.nextName();
                    strNextName5.getClass();
                    switch (strNextName5) {
                        case "relative_start_ns":
                            Long lH = l3Var2.H();
                            if (lH == null) {
                                break;
                            } else {
                                v3Var.d = lH;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lH2 = l3Var2.H();
                            if (lH2 == null) {
                                break;
                            } else {
                                v3Var.e = lH2;
                                break;
                            }
                            break;
                        case "id":
                            String strO31 = l3Var2.O();
                            if (strO31 == null) {
                                break;
                            } else {
                                v3Var.a = strO31;
                                break;
                            }
                            break;
                        case "name":
                            String strO32 = l3Var2.O();
                            if (strO32 == null) {
                                break;
                            } else {
                                v3Var.c = strO32;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strO33 = l3Var2.O();
                            if (strO33 == null) {
                                break;
                            } else {
                                v3Var.b = strO33;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lH3 = l3Var2.H();
                            if (lH3 == null) {
                                break;
                            } else {
                                v3Var.g = lH3;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lH4 = l3Var2.H();
                            if (lH4 == null) {
                                break;
                            } else {
                                v3Var.f = lH4;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            l3Var2.F(z0Var, concurrentHashMap6, strNextName5);
                            break;
                    }
                }
                v3Var.v = concurrentHashMap6;
                l3Var2.endObject();
                return v3Var;
            case 5:
                a4 a4Var = new a4();
                l3Var2.beginObject();
                HashMap map = null;
                Integer numB2 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName6 = l3Var2.nextName();
                    strNextName6.getClass();
                    if (strNextName6.equals("segment_id")) {
                        numB2 = l3Var2.B();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        l3Var2.F(z0Var, map, strNextName6);
                    }
                }
                l3Var2.endObject();
                l3Var2.setLenient(true);
                List list2 = (List) l3Var2.D0();
                l3Var2.setLenient(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj : list2) {
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            io.sentry.util.h hVar = new io.sentry.util.h(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str3 = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str3.equals("type")) {
                                    io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                    int i5 = z3.b[cVar.ordinal()];
                                    if (i5 == 1) {
                                        Map map3 = (Map) map2.get("data");
                                        if (map3 == null) {
                                            map3 = Collections.EMPTY_MAP;
                                        }
                                        Integer num = (Integer) map3.get("source");
                                        if (num != null) {
                                            io.sentry.rrweb.d dVar = io.sentry.rrweb.d.values()[num.intValue()];
                                            int i6 = z3.a[dVar.ordinal()];
                                            if (i6 == 1) {
                                                arrayList.add(io.sentry.protocol.d0.c(hVar, z0Var));
                                            } else if (i6 != 2) {
                                                z0Var.i(q5.DEBUG, "Unsupported rrweb incremental snapshot type %s", dVar);
                                            } else {
                                                arrayList.add(io.sentry.protocol.d0.d(hVar, z0Var));
                                            }
                                        }
                                    } else if (i5 == 2) {
                                        arrayList.add(io.sentry.protocol.d0.e(hVar, z0Var));
                                    } else if (i5 != 3) {
                                        z0Var.i(q5.DEBUG, "Unsupported rrweb event type %s", cVar);
                                    } else {
                                        Map map4 = (Map) map2.get("data");
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        String str4 = (String) map4.get("tag");
                                        if (str4 != null) {
                                            switch (str4) {
                                                case "performanceSpan":
                                                    arrayList.add(io.sentry.protocol.d0.f(hVar, z0Var));
                                                    break;
                                                case "video":
                                                    arrayList.add(io.sentry.protocol.d0.g(hVar, z0Var));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList.add(io.sentry.protocol.d0.b(hVar, z0Var));
                                                    break;
                                                default:
                                                    z0Var.i(q5.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                a4Var.a = numB2;
                a4Var.b = arrayList;
                a4Var.c = map;
                return a4Var;
            case 6:
                return b(l3Var, z0Var);
            case 7:
                l3Var2.beginObject();
                io.sentry.protocol.u uVar2 = null;
                k7 k7Var = null;
                Date dateO2 = null;
                HashMap map5 = null;
                io.sentry.protocol.w wVar6 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName7 = l3Var2.nextName();
                    strNextName7.getClass();
                    switch (strNextName7) {
                        case "sdk":
                            uVar2 = (io.sentry.protocol.u) l3Var2.A0(z0Var, new io.sentry.clientreport.a(21));
                            break;
                        case "trace":
                            k7Var = (k7) l3Var2.A0(z0Var, new f(25));
                            break;
                        case "event_id":
                            wVar6 = (io.sentry.protocol.w) l3Var2.A0(z0Var, new io.sentry.clientreport.a(23));
                            break;
                        case "sent_at":
                            dateO2 = l3Var.o0(z0Var);
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            l3Var2.F(z0Var, map5, strNextName7);
                            break;
                    }
                }
                b5 b5Var = new b5(wVar6, uVar2, k7Var);
                b5Var.d = dateO2;
                b5Var.e = map5;
                l3Var2.endObject();
                return b5Var;
            case 8:
                l3Var2.beginObject();
                Integer numB3 = null;
                HashMap map6 = null;
                p5 p5Var = null;
                int iNextInt = 0;
                String strO34 = null;
                String strO35 = null;
                String strO36 = null;
                String strO37 = null;
                Integer numB4 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName8 = l3Var2.nextName();
                    strNextName8.getClass();
                    switch (strNextName8) {
                        case "item_count":
                            numB4 = l3Var2.B();
                            break;
                        case "meta_length":
                            numB3 = l3Var2.B();
                            break;
                        case "length":
                            iNextInt = l3Var2.nextInt();
                            break;
                        case "filename":
                            strO35 = l3Var2.O();
                            break;
                        case "attachment_type":
                            strO36 = l3Var2.O();
                            break;
                        case "type":
                            p5Var = (p5) l3Var2.A0(z0Var, new f(i3));
                            break;
                        case "content_type":
                            strO34 = l3Var2.O();
                            break;
                        case "platform":
                            strO37 = l3Var2.O();
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            l3Var2.F(z0Var, map6, strNextName8);
                            break;
                    }
                }
                if (p5Var == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    z0Var.d(q5.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                h5 h5Var = new h5(p5Var, iNextInt, null, strO34, strO35, strO36, strO37, numB4, numB3 != null ? new uh2(8, numB3) : null);
                h5Var.x = map6;
                l3Var2.endObject();
                return h5Var;
            case 9:
                l3Var2.beginObject();
                i5 i5Var = new i5();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName9 = l3Var2.nextName();
                    strNextName9.getClass();
                    switch (strNextName9) {
                        case "fingerprint":
                            List list3 = (List) l3Var2.D0();
                            if (list3 == null) {
                                break;
                            } else {
                                i5Var.L0 = list3;
                                break;
                            }
                            break;
                        case "threads":
                            l3Var2.beginObject();
                            l3Var2.nextName();
                            i5Var.H0 = new h2(l3Var2.N0(z0Var, new io.sentry.protocol.d0(0)));
                            l3Var2.endObject();
                            break;
                        case "logger":
                            i5Var.G0 = l3Var2.O();
                            break;
                        case "timestamp":
                            Date dateO3 = l3Var.o0(z0Var);
                            if (dateO3 == null) {
                                break;
                            } else {
                                i5Var.E0 = dateO3;
                                break;
                            }
                            break;
                        case "level":
                            i5Var.J0 = (q5) l3Var2.A0(z0Var, new f(11));
                            break;
                        case "message":
                            i5Var.F0 = (io.sentry.protocol.p) l3Var2.A0(z0Var, new io.sentry.clientreport.a(i2));
                            break;
                        case "modules":
                            i5Var.N0 = io.sentry.util.b.o((Map) l3Var2.D0());
                            break;
                        case "exception":
                            l3Var2.beginObject();
                            l3Var2.nextName();
                            i5Var.I0 = new h2(l3Var2.N0(z0Var, new io.sentry.clientreport.a(22)));
                            l3Var2.endObject();
                            break;
                        case "transaction":
                            i5Var.K0 = l3Var2.O();
                            break;
                        default:
                            if (!io.sentry.config.a.f(i5Var, strNextName9, l3Var2, z0Var)) {
                                if (concurrentHashMap7 == null) {
                                    concurrentHashMap7 = new ConcurrentHashMap();
                                }
                                l3Var2.F(z0Var, concurrentHashMap7, strNextName9);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                i5Var.M0 = concurrentHashMap7;
                l3Var2.endObject();
                return i5Var;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return p5.valueOfLabel(l3Var2.nextString().toLowerCase(Locale.ROOT));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return q5.valueOf(l3Var2.nextString().toUpperCase(Locale.ROOT));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                r5 r5Var = new r5();
                l3Var2.beginObject();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName10 = l3Var2.nextName();
                    strNextName10.getClass();
                    switch (strNextName10) {
                        case "package_name":
                            r5Var.c = l3Var2.O();
                            break;
                        case "thread_id":
                            r5Var.e = l3Var2.H();
                            break;
                        case "address":
                            r5Var.b = l3Var2.O();
                            break;
                        case "class_name":
                            r5Var.d = l3Var2.O();
                            break;
                        case "type":
                            r5Var.a = l3Var2.nextInt();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            l3Var2.F(z0Var, concurrentHashMap8, strNextName10);
                            break;
                    }
                }
                r5Var.f = concurrentHashMap8;
                l3Var2.endObject();
                return r5Var;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l3Var2.beginObject();
                Double dE1 = null;
                String strO38 = null;
                HashMap map7 = null;
                u5 u5Var = null;
                HashMap mapP3 = null;
                Integer numB5 = null;
                g7 g7Var = null;
                io.sentry.protocol.w wVar7 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName11 = l3Var2.nextName();
                    strNextName11.getClass();
                    switch (strNextName11) {
                        case "span_id":
                            g7Var = (g7) l3Var2.A0(z0Var, new f(23));
                            break;
                        case "severity_number":
                            numB5 = l3Var2.B();
                            break;
                        case "body":
                            strO38 = l3Var2.O();
                            break;
                        case "timestamp":
                            dE1 = l3Var2.e0();
                            break;
                        case "level":
                            u5Var = (u5) l3Var2.A0(z0Var, new f(16));
                            break;
                        case "attributes":
                            mapP3 = l3Var2.P(z0Var, new f(14));
                            break;
                        case "trace_id":
                            wVar7 = (io.sentry.protocol.w) l3Var2.A0(z0Var, new io.sentry.clientreport.a(23));
                            break;
                        default:
                            if (map7 == null) {
                                map7 = new HashMap();
                            }
                            l3Var2.F(z0Var, map7, strNextName11);
                            break;
                    }
                }
                l3Var2.endObject();
                if (wVar7 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
                    z0Var.d(q5.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (dE1 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"timestamp\"");
                    z0Var.d(q5.ERROR, "Missing required field \"timestamp\"", illegalStateException3);
                    throw illegalStateException3;
                }
                if (strO38 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"body\"");
                    z0Var.d(q5.ERROR, "Missing required field \"body\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (u5Var == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"level\"");
                    z0Var.d(q5.ERROR, "Missing required field \"level\"", illegalStateException5);
                    throw illegalStateException5;
                }
                s5 s5Var = new s5(wVar7, dE1, strO38, u5Var);
                s5Var.g = mapP3;
                s5Var.f = numB5;
                s5Var.b = g7Var;
                s5Var.v = map7;
                return s5Var;
            case 14:
                l3Var2.beginObject();
                Object objD0 = null;
                HashMap map8 = null;
                String strO39 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName12 = l3Var2.nextName();
                    strNextName12.getClass();
                    if (strNextName12.equals("type")) {
                        strO39 = l3Var2.O();
                    } else if (strNextName12.equals("value")) {
                        objD0 = l3Var2.D0();
                    } else {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        l3Var2.F(z0Var, map8, strNextName12);
                    }
                }
                l3Var2.endObject();
                if (strO39 != null) {
                    io.sentry.protocol.n nVar = new io.sentry.protocol.n(objD0, strO39);
                    nVar.d = map8;
                    return nVar;
                }
                IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"type\"");
                z0Var.d(q5.ERROR, "Missing required field \"type\"", illegalStateException6);
                throw illegalStateException6;
            case 15:
                l3Var2.beginObject();
                HashMap map9 = null;
                ArrayList arrayListN1 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName13 = l3Var2.nextName();
                    strNextName13.getClass();
                    if (strNextName13.equals("items")) {
                        arrayListN1 = l3Var2.N0(z0Var, new f(13));
                    } else {
                        if (map9 == null) {
                            map9 = new HashMap();
                        }
                        l3Var2.F(z0Var, map9, strNextName13);
                    }
                }
                l3Var2.endObject();
                if (arrayListN1 != null) {
                    t5 t5Var = new t5(0, arrayListN1);
                    t5Var.c = map9;
                    return t5Var;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"items\"");
                z0Var.d(q5.ERROR, "Missing required field \"items\"", illegalStateException7);
                throw illegalStateException7;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return u5.valueOf(l3Var2.nextString().toUpperCase(Locale.ROOT));
            case 17:
                l3Var2.beginObject();
                Double dE2 = null;
                String strO40 = null;
                HashMap map10 = null;
                String strO41 = null;
                Double dE3 = null;
                io.sentry.protocol.w wVar8 = null;
                HashMap mapP4 = null;
                g7 g7Var2 = null;
                String strO42 = null;
                while (true) {
                    HashMap map11 = map10;
                    if (l3Var2.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        l3Var2.endObject();
                        if (wVar8 == null) {
                            IllegalStateException illegalStateException8 = new IllegalStateException("Missing required field \"trace_id\"");
                            z0Var.d(q5.ERROR, "Missing required field \"trace_id\"", illegalStateException8);
                            throw illegalStateException8;
                        }
                        if (dE2 == null) {
                            IllegalStateException illegalStateException9 = new IllegalStateException("Missing required field \"timestamp\"");
                            z0Var.d(q5.ERROR, "Missing required field \"timestamp\"", illegalStateException9);
                            throw illegalStateException9;
                        }
                        if (strO40 == null) {
                            IllegalStateException illegalStateException10 = new IllegalStateException("Missing required field \"type\"");
                            z0Var.d(q5.ERROR, "Missing required field \"type\"", illegalStateException10);
                            throw illegalStateException10;
                        }
                        if (strO41 == null) {
                            IllegalStateException illegalStateException11 = new IllegalStateException("Missing required field \"name\"");
                            z0Var.d(q5.ERROR, "Missing required field \"name\"", illegalStateException11);
                            throw illegalStateException11;
                        }
                        if (dE3 == null) {
                            IllegalStateException illegalStateException12 = new IllegalStateException("Missing required field \"value\"");
                            z0Var.d(q5.ERROR, "Missing required field \"value\"", illegalStateException12);
                            throw illegalStateException12;
                        }
                        w5 w5Var = new w5();
                        w5Var.a = wVar8;
                        w5Var.c = dE2;
                        w5Var.d = strO41;
                        w5Var.f = strO40;
                        w5Var.g = dE3;
                        w5Var.v = mapP4;
                        w5Var.b = g7Var2;
                        w5Var.e = strO42;
                        w5Var.w = map11;
                        return w5Var;
                    }
                    String strNextName14 = l3Var2.nextName();
                    strNextName14.getClass();
                    switch (strNextName14) {
                        case "span_id":
                            map10 = map11;
                            g7Var2 = (g7) l3Var2.A0(z0Var, new f(23));
                            break;
                        case "name":
                            map10 = map11;
                            strO41 = l3Var2.O();
                            break;
                        case "type":
                            map10 = map11;
                            strO40 = l3Var2.O();
                            break;
                        case "unit":
                            map10 = map11;
                            strO42 = l3Var2.O();
                            break;
                        case "timestamp":
                            dE2 = l3Var2.e0();
                            map10 = map11;
                            break;
                        case "value":
                            map10 = map11;
                            dE3 = l3Var2.e0();
                            break;
                        case "attributes":
                            map10 = map11;
                            mapP4 = l3Var2.P(z0Var, new f(14));
                            break;
                        case "trace_id":
                            map10 = map11;
                            wVar8 = (io.sentry.protocol.w) l3Var2.A0(z0Var, new io.sentry.clientreport.a(23));
                            break;
                        default:
                            map10 = map11 == null ? new HashMap() : map11;
                            l3Var2.F(z0Var, map10, strNextName14);
                            break;
                    }
                }
                break;
            case 18:
                l3Var2.beginObject();
                HashMap map12 = null;
                ArrayList arrayListN2 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName15 = l3Var2.nextName();
                    strNextName15.getClass();
                    if (strNextName15.equals("items")) {
                        arrayListN2 = l3Var2.N0(z0Var, new f(i2));
                    } else {
                        if (map12 == null) {
                            map12 = new HashMap();
                        }
                        l3Var2.F(z0Var, map12, strNextName15);
                    }
                }
                l3Var2.endObject();
                if (arrayListN2 != null) {
                    x5 x5Var = new x5(arrayListN2);
                    x5Var.b = map12;
                    return x5Var;
                }
                IllegalStateException illegalStateException13 = new IllegalStateException("Missing required field \"items\"");
                z0Var.d(q5.ERROR, "Missing required field \"items\"", illegalStateException13);
                throw illegalStateException13;
            case 19:
                s6 s6Var = new s6();
                l3Var2.beginObject();
                r6 r6Var = null;
                Date dateO4 = null;
                HashMap map13 = null;
                io.sentry.protocol.w wVar9 = null;
                Date dateO5 = null;
                List list4 = null;
                String strO43 = null;
                List list5 = null;
                List list6 = null;
                List list7 = null;
                Integer numB6 = null;
                while (true) {
                    HashMap map14 = map13;
                    if (l3Var2.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        l3Var2.endObject();
                        if (strO43 != null) {
                            s6Var.F0 = strO43;
                        }
                        if (r6Var != null) {
                            s6Var.G0 = r6Var;
                        }
                        if (numB6 != null) {
                            s6Var.I0 = numB6.intValue();
                        }
                        if (dateO4 != null) {
                            s6Var.J0 = dateO4;
                        }
                        s6Var.H0 = wVar9;
                        s6Var.K0 = dateO5;
                        s6Var.L0 = list4;
                        s6Var.M0 = list5;
                        s6Var.N0 = list6;
                        s6Var.O0 = list7;
                        s6Var.P0 = map14;
                        return s6Var;
                    }
                    String strNextName16 = l3Var2.nextName();
                    strNextName16.getClass();
                    switch (strNextName16) {
                        case "segment_names":
                            list7 = (List) l3Var2.D0();
                            map13 = map14;
                            break;
                        case "replay_id":
                            wVar9 = (io.sentry.protocol.w) l3Var2.A0(z0Var, new io.sentry.clientreport.a(23));
                            map13 = map14;
                            break;
                        case "replay_start_timestamp":
                            dateO5 = l3Var.o0(z0Var);
                            map13 = map14;
                            break;
                        case "type":
                            strO43 = l3Var2.O();
                            map13 = map14;
                            break;
                        case "urls":
                            list4 = (List) l3Var2.D0();
                            map13 = map14;
                            break;
                        case "timestamp":
                            dateO4 = l3Var.o0(z0Var);
                            map13 = map14;
                            break;
                        case "error_ids":
                            list5 = (List) l3Var2.D0();
                            map13 = map14;
                            break;
                        case "trace_ids":
                            list6 = (List) l3Var2.D0();
                            map13 = map14;
                            break;
                        case "replay_type":
                            r6Var = (r6) l3Var2.A0(z0Var, new f(20));
                            map13 = map14;
                            break;
                        case "segment_id":
                            numB6 = l3Var2.B();
                            map13 = map14;
                            break;
                        default:
                            if (!io.sentry.config.a.f(s6Var, strNextName16, l3Var2, z0Var)) {
                                HashMap map15 = map14 == null ? new HashMap() : map14;
                                l3Var2.F(z0Var, map15, strNextName16);
                                map13 = map15;
                                break;
                            } else {
                                map13 = map14;
                                break;
                            }
                            break;
                    }
                }
                break;
            case 20:
                return r6.valueOf(l3Var2.nextString().toUpperCase(Locale.ROOT));
            case 21:
                l3Var2.beginObject();
                ConcurrentHashMap concurrentHashMap9 = null;
                Integer numB7 = null;
                b7 b7VarValueOf = null;
                Date dateO6 = null;
                Date dateO7 = null;
                String strO44 = null;
                String str5 = null;
                Boolean boolR1 = null;
                Long lH5 = null;
                Double dE4 = null;
                String strO45 = null;
                String strO46 = null;
                String strO47 = null;
                String strO48 = null;
                String strO49 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName17 = l3Var2.nextName();
                    strNextName17.getClass();
                    switch (strNextName17) {
                        case "duration":
                            dE4 = l3Var2.e0();
                            break;
                        case "started":
                            dateO6 = l3Var.o0(z0Var);
                            break;
                        case "errors":
                            numB7 = l3Var2.B();
                            break;
                        case "status":
                            String strB = io.sentry.util.p.b(l3Var2.O());
                            if (strB == null) {
                                break;
                            } else {
                                b7VarValueOf = b7.valueOf(strB);
                                break;
                            }
                            break;
                        case "did":
                            strO44 = l3Var2.O();
                            break;
                        case "seq":
                            lH5 = l3Var2.H();
                            break;
                        case "sid":
                            String strO50 = l3Var2.O();
                            if (strO50 != null && (strO50.length() == 36 || strO50.length() == 32)) {
                                str5 = strO50;
                                break;
                            } else {
                                z0Var.i(q5.ERROR, "%s sid is not valid.", strO50);
                                break;
                            }
                            break;
                        case "init":
                            boolR1 = l3Var2.r0();
                            break;
                        case "timestamp":
                            dateO7 = l3Var.o0(z0Var);
                            break;
                        case "attrs":
                            l3Var2.beginObject();
                            while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strNextName18 = l3Var2.nextName();
                                strNextName18.getClass();
                                switch (strNextName18) {
                                    case "environment":
                                        strO47 = l3Var2.O();
                                        break;
                                    case "release":
                                        strO48 = l3Var2.O();
                                        break;
                                    case "ip_address":
                                        strO45 = l3Var2.O();
                                        break;
                                    case "user_agent":
                                        strO46 = l3Var2.O();
                                        break;
                                    default:
                                        l3Var2.skipValue();
                                        break;
                                }
                            }
                            l3Var2.endObject();
                            break;
                        case "abnormal_mechanism":
                            strO49 = l3Var2.O();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            l3Var2.F(z0Var, concurrentHashMap9, strNextName17);
                            break;
                    }
                }
                if (b7VarValueOf == null) {
                    throw d(z0Var, "status");
                }
                if (dateO6 == null) {
                    throw d(z0Var, "started");
                }
                if (numB7 == null) {
                    throw d(z0Var, "errors");
                }
                if (strO48 == null) {
                    throw d(z0Var, BuildConfig.BUILD_TYPE);
                }
                c7 c7Var = new c7(b7VarValueOf, dateO6, dateO7, numB7.intValue(), strO44, str5, boolR1, lH5, dE4, strO45, strO46, strO47, strO48, strO49);
                c7Var.E0 = concurrentHashMap9;
                l3Var2.endObject();
                return c7Var;
            case 22:
                return c(l3Var, z0Var);
            case 23:
                return new g7(l3Var2.nextString());
            case 24:
                return h7.valueOf(l3Var2.nextString().toUpperCase(Locale.ROOT));
            case 25:
                l3Var2.beginObject();
                String strO51 = null;
                String strO52 = null;
                io.sentry.protocol.w wVar10 = null;
                String strO53 = null;
                String strO54 = null;
                String strO55 = null;
                io.sentry.protocol.w wVar11 = null;
                String strO56 = null;
                ConcurrentHashMap concurrentHashMap10 = null;
                String strO57 = null;
                String strNextString = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName19 = l3Var2.nextName();
                    strNextName19.getClass();
                    switch (strNextName19) {
                        case "replay_id":
                            wVar11 = new io.sentry.protocol.w(l3Var2.nextString());
                            break;
                        case "user_id":
                            strO53 = l3Var2.O();
                            break;
                        case "environment":
                            strO51 = l3Var2.O();
                            break;
                        case "sample_rand":
                            strO56 = l3Var2.O();
                            break;
                        case "sample_rate":
                            strO54 = l3Var2.O();
                            break;
                        case "release":
                            strO57 = l3Var2.O();
                            break;
                        case "trace_id":
                            wVar10 = new io.sentry.protocol.w(l3Var2.nextString());
                            break;
                        case "sampled":
                            strO55 = l3Var2.O();
                            break;
                        case "public_key":
                            strNextString = l3Var2.nextString();
                            break;
                        case "transaction":
                            strO52 = l3Var2.O();
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            l3Var2.F(z0Var, concurrentHashMap10, strNextName19);
                            break;
                    }
                }
                if (wVar10 == null) {
                    throw e(z0Var, "trace_id");
                }
                if (strNextString == null) {
                    throw e(z0Var, "public_key");
                }
                k7 k7Var2 = new k7(wVar10, strNextString, strO57, strO51, strO53, strO52, strO54, strO55, wVar11, strO56);
                k7Var2.y = concurrentHashMap10;
                l3Var2.endObject();
                return k7Var2;
            default:
                l3Var2.beginObject();
                io.sentry.protocol.w wVar12 = null;
                String strO58 = null;
                String strO59 = null;
                String strO60 = null;
                HashMap map16 = null;
                while (l3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName20 = l3Var2.nextName();
                    strNextName20.getClass();
                    switch (strNextName20) {
                        case "comments":
                            strO60 = l3Var2.O();
                            break;
                        case "name":
                            strO58 = l3Var2.O();
                            break;
                        case "email":
                            strO59 = l3Var2.O();
                            break;
                        case "event_id":
                            wVar12 = new io.sentry.protocol.w(l3Var2.nextString());
                            break;
                        default:
                            if (map16 == null) {
                                map16 = new HashMap();
                            }
                            l3Var2.F(z0Var, map16, strNextName20);
                            break;
                    }
                }
                l3Var2.endObject();
                if (wVar12 != null) {
                    p7 p7Var = new p7(wVar12, strO58, strO59, strO60);
                    p7Var.e = map16;
                    return p7Var;
                }
                IllegalStateException illegalStateException14 = new IllegalStateException("Missing required field \"event_id\"");
                z0Var.d(q5.ERROR, "Missing required field \"event_id\"", illegalStateException14);
                throw illegalStateException14;
        }
    }
}
