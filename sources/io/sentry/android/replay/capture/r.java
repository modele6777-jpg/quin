package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import defpackage.bg8;
import defpackage.cgg;
import defpackage.dg8;
import defpackage.mh3;
import defpackage.mmb;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.s72;
import defpackage.ub3;
import defpackage.z7f;
import io.sentry.a4;
import io.sentry.g1;
import io.sentry.l4;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.r6;
import io.sentry.s6;
import io.sentry.u6;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:129:0x026e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0276  */
    /* JADX WARN: Code duplicated, block: B:133:0x0281  */
    /* JADX WARN: Code duplicated, block: B:135:0x028f  */
    /* JADX WARN: Code duplicated, block: B:139:0x030a  */
    /* JADX WARN: Code duplicated, block: B:155:0x035e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0396  */
    /* JADX WARN: Code duplicated, block: B:166:0x039a  */
    /* JADX WARN: Code duplicated, block: B:168:0x039d  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:174:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:179:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:188:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:192:0x040c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0424  */
    /* JADX WARN: Code duplicated, block: B:197:0x0485  */
    /* JADX WARN: Code duplicated, block: B:198:0x0488  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:203:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:273:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f7 A[LOOP:2: B:47:0x0139->B:96:0x01f7, LOOP_END] */
    public static u a(g1 g1Var, q6 q6Var, long j, Date date, io.sentry.protocol.w wVar, int i, int i2, int i3, r6 r6Var, io.sentry.android.replay.k kVar, int i4, int i5, String str, List list, Deque deque, List list2, List list3) {
        Throwable th;
        ArrayList arrayList;
        io.sentry.util.a aVar;
        int i6;
        boolean z;
        io.sentry.android.replay.k kVar2;
        int i7;
        io.sentry.android.replay.d dVar;
        Object obj;
        long j2;
        Object obj2;
        long j3;
        List list4;
        io.sentry.util.a aVar2;
        List<io.sentry.g> list5;
        ArrayList arrayList2;
        LinkedList linkedList;
        io.sentry.g gVar;
        long time;
        p pVar;
        Iterator it;
        HashMap map;
        io.sentry.protocol.u sdkVersion;
        u6 sessionReplay;
        String str2;
        io.sentry.rrweb.b bVar;
        boolean z2;
        io.sentry.rrweb.b bVarA;
        io.sentry.rrweb.a aVar3;
        String str3;
        io.sentry.rrweb.a aVar4;
        ConcurrentHashMap concurrentHashMap;
        Object obj3;
        mmb mmbVar;
        q6Var.getClass();
        wVar.getClass();
        list2.getClass();
        list3.getClass();
        if (kVar != null) {
            q6 q6Var2 = kVar.a;
            long jMin = Math.min(j, 300000L);
            long time2 = date.getTime();
            File file = new File(kVar.l(), ub3.g(i, ".mp4"));
            io.sentry.util.a aVar5 = kVar.f;
            ArrayList arrayList3 = kVar.w;
            io.sentry.util.a aVar6 = kVar.d;
            long j4 = 0;
            if (file.exists() && file.length() > 0) {
                file.delete();
            }
            aVar5.b();
            try {
                if (arrayList3.isEmpty()) {
                    try {
                        arrayList = new ArrayList();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            cgg.t(aVar5, th);
                            throw th3;
                        }
                    }
                } else {
                    arrayList = s72.l1(arrayList3);
                }
                List list6 = arrayList;
                cgg.t(aVar5, null);
                if (list6.isEmpty()) {
                    q6Var2.getLogger().i(q5.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                    i6 = i4;
                    z = true;
                } else {
                    aVar6.b();
                    try {
                        io.sentry.util.a aVar7 = aVar5;
                        i6 = i4;
                        try {
                            io.sentry.android.replay.video.e eVar = new io.sentry.android.replay.video.e(q6Var2, new io.sentry.android.replay.video.a(file, i3, i2, i6, i5));
                            try {
                                MediaCodec mediaCodec = eVar.c;
                                mediaCodec.configure((MediaFormat) eVar.d.getValue(), (Surface) null, (MediaCrypto) null, 1);
                                eVar.g = mediaCodec.createInputSurface();
                                mediaCodec.start();
                                eVar.a(false);
                                cgg.t(aVar6, null);
                                kVar.g = eVar;
                                long j5 = 1000 / ((long) i6);
                                Object objX0 = s72.x0(list6);
                                z = true;
                                long j6 = time2 + jMin;
                                dg8 dg8Var = j6 <= Long.MIN_VALUE ? dg8.d : new dg8(time2, j6 - 1);
                                dg8Var.getClass();
                                mh3.k(j5 > 0, Long.valueOf(j5));
                                long j7 = dg8Var.a;
                                long j8 = dg8Var.b;
                                long j9 = dg8Var.c > 0 ? j5 : -j5;
                                long j10 = new bg8(j7, j8, j9).b;
                                if ((j9 > 0 && j7 <= j10) || (j9 < 0 && j10 <= j7)) {
                                    Object obj4 = objX0;
                                    long j11 = j7;
                                    int i8 = 0;
                                    while (true) {
                                        Iterator it2 = list6.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj = obj4;
                                                io.sentry.android.replay.l lVar = (io.sentry.android.replay.l) it2.next();
                                                long j12 = j11 + j5;
                                                j2 = j11;
                                                long j13 = lVar.b;
                                                if (j2 <= j13 && j13 <= j12) {
                                                    obj2 = lVar;
                                                    break;
                                                }
                                                if (j13 <= j12) {
                                                    obj4 = obj;
                                                    j11 = j2;
                                                }
                                            } else {
                                                obj = obj4;
                                                j2 = j11;
                                            }
                                            obj2 = obj;
                                            break;
                                        }
                                        io.sentry.android.replay.l lVar2 = (io.sentry.android.replay.l) obj2;
                                        if (lVar2 != null) {
                                            try {
                                                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(lVar2.a.getAbsolutePath());
                                                aVar6.b();
                                                kVar2 = kVar;
                                                j3 = j10;
                                                try {
                                                    io.sentry.android.replay.video.e eVar2 = kVar2.g;
                                                    if (eVar2 != null) {
                                                        bitmapDecodeFile.getClass();
                                                        eVar2.b(bitmapDecodeFile);
                                                    }
                                                    try {
                                                        cgg.t(aVar6, null);
                                                        bitmapDecodeFile.recycle();
                                                        i8++;
                                                        list4 = list6;
                                                        obj4 = obj2;
                                                        j5 = j5;
                                                        aVar2 = aVar7;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        q6Var2.getLogger().d(q5.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
                                                        if (obj2 != null) {
                                                            kVar2.h(((io.sentry.android.replay.l) obj2).a);
                                                            aVar7.b();
                                                            try {
                                                                z7f.p(arrayList3).remove(obj2);
                                                                aVar2 = aVar7;
                                                                cgg.t(aVar2, null);
                                                                list4 = list6;
                                                                list4.remove(obj2);
                                                                obj4 = null;
                                                            } catch (Throwable th5) {
                                                                io.sentry.util.a aVar8 = aVar7;
                                                                try {
                                                                    throw th5;
                                                                } catch (Throwable th6) {
                                                                    cgg.t(aVar8, th5);
                                                                    throw th6;
                                                                }
                                                            }
                                                        } else {
                                                            list4 = list6;
                                                            aVar2 = aVar7;
                                                            obj4 = obj2;
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    try {
                                                        throw th7;
                                                    } catch (Throwable th8) {
                                                        cgg.t(aVar6, th7);
                                                        throw th8;
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                kVar2 = kVar;
                                                j3 = j10;
                                            }
                                            if (j2 != j3) {
                                                i7 = i8;
                                                break;
                                            }
                                            aVar7 = aVar2;
                                            list6 = list4;
                                            j11 = j2 + j9;
                                            j10 = j3;
                                            j5 = j5;
                                        } else {
                                            kVar2 = kVar;
                                            j3 = j10;
                                        }
                                        if (obj2 != null) {
                                            kVar2.h(((io.sentry.android.replay.l) obj2).a);
                                            aVar7.b();
                                            z7f.p(arrayList3).remove(obj2);
                                            aVar2 = aVar7;
                                            cgg.t(aVar2, null);
                                            list4 = list6;
                                            list4.remove(obj2);
                                            obj4 = null;
                                        } else {
                                            list4 = list6;
                                            aVar2 = aVar7;
                                            obj4 = obj2;
                                        }
                                        if (j2 != j3) {
                                            i7 = i8;
                                            break;
                                        }
                                        aVar7 = aVar2;
                                        list6 = list4;
                                        j11 = j2 + j9;
                                        j10 = j3;
                                        j5 = j5;
                                    }
                                } else {
                                    kVar2 = kVar;
                                    i7 = 0;
                                }
                                if (i7 == 0) {
                                    q6Var2.getLogger().i(q5.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                                    aVar6.b();
                                    try {
                                        io.sentry.android.replay.video.e eVar3 = kVar2.g;
                                        if (eVar3 != null) {
                                            eVar3.c();
                                        }
                                        kVar2.g = null;
                                        cgg.t(aVar6, null);
                                        kVar2.h(file);
                                    } catch (Throwable th10) {
                                        try {
                                            throw th10;
                                        } catch (Throwable th11) {
                                            cgg.t(aVar6, th10);
                                            throw th11;
                                        }
                                    }
                                } else {
                                    aVar6.b();
                                    try {
                                        io.sentry.android.replay.video.e eVar4 = kVar2.g;
                                        if (eVar4 != null) {
                                            eVar4.c();
                                        }
                                        io.sentry.android.replay.video.e eVar5 = kVar2.g;
                                        if (eVar5 != null) {
                                            io.sentry.android.replay.video.b bVar2 = eVar5.f;
                                            if (bVar2.e != 0) {
                                                j4 = (bVar2.f + bVar2.a) / 1000;
                                            }
                                        }
                                        long j14 = j4;
                                        kVar2.g = null;
                                        cgg.t(aVar6, null);
                                        kVar2.x(j6);
                                        dVar = new io.sentry.android.replay.d(file, i7, j14);
                                    } catch (Throwable th12) {
                                        try {
                                            throw th12;
                                        } catch (Throwable th13) {
                                            cgg.t(aVar6, th12);
                                            throw th13;
                                        }
                                    }
                                }
                                if (dVar != null) {
                                    File file2 = dVar.a;
                                    int i9 = dVar.b;
                                    long j15 = dVar.c;
                                    if (list == null) {
                                        mmbVar = new mmb();
                                        mmbVar.element = pu4.a;
                                        if (g1Var != null) {
                                            g1Var.n(new io.sentry.android.fragment.c(mmbVar, 2));
                                        }
                                        list5 = (List) mmbVar.element;
                                    } else {
                                        list5 = list;
                                    }
                                    Date date2 = new Date(date.getTime() + j15);
                                    s6 s6Var = new s6();
                                    s6Var.a = wVar;
                                    s6Var.H0 = wVar;
                                    s6Var.I0 = i;
                                    s6Var.J0 = date2;
                                    s6Var.K0 = date;
                                    s6Var.G0 = r6Var;
                                    s6Var.E0 = file2;
                                    s6Var.N0 = list2;
                                    s6Var.O0 = list3;
                                    arrayList2 = new ArrayList();
                                    io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
                                    jVar.b = date.getTime();
                                    jVar.d = i2;
                                    jVar.e = i3;
                                    arrayList2.add(jVar);
                                    io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
                                    mVar.b = date.getTime();
                                    mVar.d = i;
                                    mVar.f = j15;
                                    mVar.y = i9;
                                    mVar.e = file2.length();
                                    mVar.X = i6;
                                    mVar.w = i2;
                                    mVar.x = i3;
                                    mVar.Y = 0;
                                    mVar.Z = 0;
                                    arrayList2.add(mVar);
                                    linkedList = new LinkedList();
                                    gVar = null;
                                    for (io.sentry.g gVar2 : list5) {
                                        if (gVar == null && pa7.t(gVar.g, "network.event")) {
                                            Map mapB = gVar.b();
                                            mapB.getClass();
                                            Object obj5 = mapB.get("action");
                                            if (obj5 == null) {
                                                obj5 = null;
                                            }
                                            if (pa7.t(obj5, "NETWORK_AVAILABLE") && pa7.t(gVar2.g, "network.event") && gVar2.b().containsKey("network_type") && gVar2.c().getTime() + 5000 >= date.getTime()) {
                                                z2 = z;
                                            } else {
                                                z2 = false;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                        if ((gVar2.c().getTime() < date.getTime() || z2) && gVar2.c().getTime() < date2.getTime() && (bVarA = q6Var.getReplayController().getZ().a(gVar2)) != null) {
                                            arrayList2.add(bVarA);
                                            if (bVarA instanceof io.sentry.rrweb.a) {
                                                aVar3 = (io.sentry.rrweb.a) bVarA;
                                            } else {
                                                aVar3 = null;
                                            }
                                            if (aVar3 != null) {
                                                str3 = aVar3.f;
                                            } else {
                                                str3 = null;
                                            }
                                            if (pa7.t(str3, "navigation")) {
                                                aVar4 = (io.sentry.rrweb.a) bVarA;
                                                concurrentHashMap = aVar4.w;
                                                if (concurrentHashMap != null || (obj3 = concurrentHashMap.get("to")) == null) {
                                                    obj3 = null;
                                                }
                                                if (obj3 instanceof String) {
                                                    ConcurrentHashMap concurrentHashMap2 = aVar4.w;
                                                    concurrentHashMap2.getClass();
                                                    Object obj6 = concurrentHashMap2.get("to");
                                                    obj6.getClass();
                                                    linkedList.add((String) obj6);
                                                }
                                            }
                                        }
                                        gVar = gVar2;
                                    }
                                    if (str != null && !pa7.t(s72.x0(linkedList), str)) {
                                        linkedList.addFirst(str);
                                    }
                                    time = date2.getTime();
                                    pVar = new p(date, arrayList2);
                                    it = deque.iterator();
                                    it.getClass();
                                    while (it.hasNext()) {
                                        bVar = (io.sentry.rrweb.b) it.next();
                                        if (bVar.b < time) {
                                            pVar.d(bVar);
                                            it.remove();
                                        }
                                    }
                                    if (i == 0) {
                                        io.sentry.rrweb.k kVar3 = new io.sentry.rrweb.k(io.sentry.rrweb.c.Custom);
                                        map = new HashMap();
                                        kVar3.d = map;
                                        kVar3.c = "options";
                                        sdkVersion = q6Var.getSdkVersion();
                                        if (sdkVersion != null) {
                                            map.put("nativeSdkName", sdkVersion.a);
                                            map.put("nativeSdkVersion", sdkVersion.b);
                                        }
                                        sessionReplay = q6Var.getSessionReplay();
                                        Double d = sessionReplay.e;
                                        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) sessionReplay.a;
                                        map.put("errorSampleRate", d);
                                        map.put("sessionSampleRate", sessionReplay.d);
                                        map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
                                        map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.TextView")));
                                        map.put("quality", sessionReplay.f.serializedName());
                                        map.put("maskedViewClasses", copyOnWriteArraySet);
                                        map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.b);
                                        if (sessionReplay.n == l4.PIXEL_COPY) {
                                            str2 = "pixelCopy";
                                        } else {
                                            str2 = "canvas";
                                        }
                                        map.put("screenshotStrategy", str2);
                                        map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.p.isEmpty()));
                                        if (!sessionReplay.p.isEmpty()) {
                                            map.put("networkDetailAllowUrls", sessionReplay.p);
                                            map.put("networkRequestHeaders", sessionReplay.s);
                                            map.put("networkResponseHeaders", sessionReplay.t);
                                            map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.r));
                                            if (!sessionReplay.q.isEmpty()) {
                                                map.put("networkDetailDenyUrls", sessionReplay.q);
                                            }
                                        }
                                        arrayList2.add(kVar3);
                                    }
                                    a4 a4Var = new a4();
                                    a4Var.a = Integer.valueOf(i);
                                    a4Var.b = s72.b1(arrayList2, new q());
                                    s6Var.L0 = linkedList;
                                    return new s(s6Var, a4Var);
                                }
                            } catch (Throwable th14) {
                                aVar = aVar6;
                                try {
                                    eVar.c();
                                    throw th14;
                                } catch (Throwable th15) {
                                    th = th15;
                                    Throwable th16 = th;
                                    try {
                                        throw th16;
                                    } catch (Throwable th17) {
                                        cgg.t(aVar, th16);
                                        throw th17;
                                    }
                                }
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            aVar = aVar6;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        aVar = aVar6;
                    }
                }
                dVar = null;
                if (dVar != null) {
                    File file3 = dVar.a;
                    int i10 = dVar.b;
                    long j16 = dVar.c;
                    if (list == null) {
                        mmbVar = new mmb();
                        mmbVar.element = pu4.a;
                        if (g1Var != null) {
                            g1Var.n(new io.sentry.android.fragment.c(mmbVar, 2));
                        }
                        list5 = (List) mmbVar.element;
                    } else {
                        list5 = list;
                    }
                    Date date3 = new Date(date.getTime() + j16);
                    s6 s6Var2 = new s6();
                    s6Var2.a = wVar;
                    s6Var2.H0 = wVar;
                    s6Var2.I0 = i;
                    s6Var2.J0 = date3;
                    s6Var2.K0 = date;
                    s6Var2.G0 = r6Var;
                    s6Var2.E0 = file3;
                    s6Var2.N0 = list2;
                    s6Var2.O0 = list3;
                    arrayList2 = new ArrayList();
                    io.sentry.rrweb.j jVar2 = new io.sentry.rrweb.j();
                    jVar2.b = date.getTime();
                    jVar2.d = i2;
                    jVar2.e = i3;
                    arrayList2.add(jVar2);
                    io.sentry.rrweb.m mVar2 = new io.sentry.rrweb.m();
                    mVar2.b = date.getTime();
                    mVar2.d = i;
                    mVar2.f = j16;
                    mVar2.y = i10;
                    mVar2.e = file3.length();
                    mVar2.X = i6;
                    mVar2.w = i2;
                    mVar2.x = i3;
                    mVar2.Y = 0;
                    mVar2.Z = 0;
                    arrayList2.add(mVar2);
                    linkedList = new LinkedList();
                    gVar = null;
                    while (r1.hasNext()) {
                        if (gVar == null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (gVar2.c().getTime() < date.getTime()) {
                            arrayList2.add(bVarA);
                            if (bVarA instanceof io.sentry.rrweb.a) {
                                aVar3 = (io.sentry.rrweb.a) bVarA;
                            } else {
                                aVar3 = null;
                            }
                            if (aVar3 != null) {
                                str3 = aVar3.f;
                            } else {
                                str3 = null;
                            }
                            if (pa7.t(str3, "navigation")) {
                                aVar4 = (io.sentry.rrweb.a) bVarA;
                                concurrentHashMap = aVar4.w;
                                if (concurrentHashMap != null) {
                                    obj3 = null;
                                } else {
                                    obj3 = null;
                                }
                                if (obj3 instanceof String) {
                                    ConcurrentHashMap concurrentHashMap3 = aVar4.w;
                                    concurrentHashMap3.getClass();
                                    Object obj7 = concurrentHashMap3.get("to");
                                    obj7.getClass();
                                    linkedList.add((String) obj7);
                                }
                            }
                        } else {
                            arrayList2.add(bVarA);
                            if (bVarA instanceof io.sentry.rrweb.a) {
                                aVar3 = (io.sentry.rrweb.a) bVarA;
                            } else {
                                aVar3 = null;
                            }
                            if (aVar3 != null) {
                                str3 = aVar3.f;
                            } else {
                                str3 = null;
                            }
                            if (pa7.t(str3, "navigation")) {
                                aVar4 = (io.sentry.rrweb.a) bVarA;
                                concurrentHashMap = aVar4.w;
                                if (concurrentHashMap != null) {
                                    obj3 = null;
                                } else {
                                    obj3 = null;
                                }
                                if (obj3 instanceof String) {
                                    ConcurrentHashMap concurrentHashMap4 = aVar4.w;
                                    concurrentHashMap4.getClass();
                                    Object obj8 = concurrentHashMap4.get("to");
                                    obj8.getClass();
                                    linkedList.add((String) obj8);
                                }
                            }
                        }
                        gVar = gVar2;
                    }
                    if (str != null) {
                        linkedList.addFirst(str);
                    }
                    time = date3.getTime();
                    pVar = new p(date, arrayList2);
                    it = deque.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        bVar = (io.sentry.rrweb.b) it.next();
                        if (bVar.b < time) {
                            pVar.d(bVar);
                            it.remove();
                        }
                    }
                    if (i == 0) {
                        io.sentry.rrweb.k kVar4 = new io.sentry.rrweb.k(io.sentry.rrweb.c.Custom);
                        map = new HashMap();
                        kVar4.d = map;
                        kVar4.c = "options";
                        sdkVersion = q6Var.getSdkVersion();
                        if (sdkVersion != null) {
                            map.put("nativeSdkName", sdkVersion.a);
                            map.put("nativeSdkVersion", sdkVersion.b);
                        }
                        sessionReplay = q6Var.getSessionReplay();
                        Double d2 = sessionReplay.e;
                        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) sessionReplay.a;
                        map.put("errorSampleRate", d2);
                        map.put("sessionSampleRate", sessionReplay.d);
                        map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet2.contains("android.widget.ImageView")));
                        map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet2.contains("android.widget.TextView")));
                        map.put("quality", sessionReplay.f.serializedName());
                        map.put("maskedViewClasses", copyOnWriteArraySet2);
                        map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.b);
                        if (sessionReplay.n == l4.PIXEL_COPY) {
                            str2 = "pixelCopy";
                        } else {
                            str2 = "canvas";
                        }
                        map.put("screenshotStrategy", str2);
                        map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.p.isEmpty()));
                        if (!sessionReplay.p.isEmpty()) {
                            map.put("networkDetailAllowUrls", sessionReplay.p);
                            map.put("networkRequestHeaders", sessionReplay.s);
                            map.put("networkResponseHeaders", sessionReplay.t);
                            map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.r));
                            if (!sessionReplay.q.isEmpty()) {
                                map.put("networkDetailDenyUrls", sessionReplay.q);
                            }
                        }
                        arrayList2.add(kVar4);
                    }
                    a4 a4Var2 = new a4();
                    a4Var2.a = Integer.valueOf(i);
                    a4Var2.b = s72.b1(arrayList2, new q());
                    s6Var2.L0 = linkedList;
                    return new s(s6Var2, a4Var2);
                }
            } catch (Throwable th20) {
                th = th20;
            }
        }
        return t.a;
    }
}
