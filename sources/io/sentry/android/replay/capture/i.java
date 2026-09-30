package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import defpackage.iy9;
import defpackage.pa7;
import defpackage.q79;
import defpackage.s72;
import defpackage.t72;
import defpackage.wn7;
import defpackage.x72;
import defpackage.y21;
import io.sentry.android.replay.b0;
import io.sentry.g1;
import io.sentry.o2;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.r6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final /* synthetic */ wn7[] u = {new q79(i.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0), new q79(i.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0), new q79(i.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0), new q79(i.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0), new q79(i.class, "currentSegment", "getCurrentSegment()I", 0), new q79(i.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0), new q79(i.class, "isFlushed", "isFlushed()Z", 0)};
    public final q6 a;
    public final g1 b;
    public final io.sentry.transport.f c;
    public final ScheduledExecutorService d;
    public final ScheduledExecutorService e;
    public final y21 f;
    public final AtomicBoolean g;
    public io.sentry.android.replay.k h;
    public final b i;
    public final b j;
    public final AtomicLong k;
    public final b l;
    public final b m;
    public final b n;
    public final b o;
    public final b p;
    public final ConcurrentLinkedDeque q;
    public final Object r;
    public final LinkedHashSet s;
    public final LinkedHashSet t;

    public i(q6 q6Var, g1 g1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        q6Var.getClass();
        scheduledExecutorService.getClass();
        scheduledExecutorService2.getClass();
        this.a = q6Var;
        this.b = g1Var;
        this.c = fVar;
        this.d = scheduledExecutorService;
        this.e = scheduledExecutorService2;
        y21 y21Var = new y21();
        y21Var.c = fVar;
        y21Var.d = new LinkedHashMap(10);
        this.f = y21Var;
        this.g = new AtomicBoolean(false);
        this.i = new b(this, this, 4);
        this.j = new b(this, this, 5);
        this.k = new AtomicLong();
        this.l = new b(this, this, 6);
        this.m = new b(io.sentry.protocol.w.b, this, this);
        this.n = new b(this, this, 1);
        this.o = new b(this, this, 2);
        this.p = new b(this, this, 3);
        this.q = new ConcurrentLinkedDeque();
        this.r = new Object();
        this.s = new LinkedHashSet();
        this.t = new LinkedHashSet();
    }

    public static u c(i iVar, long j, Date date, io.sentry.protocol.w wVar, int i, int i2, int i3, int i4, int i5) {
        iy9 iy9Var;
        b bVar = iVar.o;
        wn7[] wn7VarArr = u;
        r6 r6Var = (r6) bVar.a(wn7VarArr[5], iVar);
        io.sentry.android.replay.k kVar = iVar.h;
        String str = (String) iVar.l.a(wn7VarArr[2], iVar);
        ConcurrentLinkedDeque concurrentLinkedDeque = iVar.q;
        wVar.getClass();
        r6Var.getClass();
        concurrentLinkedDeque.getClass();
        synchronized (iVar.r) {
            iy9Var = new iy9(s72.j1(iVar.s), s72.j1(iVar.t));
            iVar.s.clear();
            iVar.t.clear();
        }
        return r.a(iVar.b, iVar.a, j, date, wVar, i, i2, i3, r6Var, kVar, i4, i5, str, null, concurrentLinkedDeque, (List) iy9Var.a(), (List) iy9Var.b());
    }

    public abstract void a(boolean z, io.sentry.android.replay.n nVar);

    public abstract i b();

    public final io.sentry.protocol.w d() {
        return (io.sentry.protocol.w) this.m.a(u[3], this);
    }

    public final int e() {
        return ((Number) this.n.a(u[4], this)).intValue();
    }

    public final b0 f() {
        return (b0) this.i.a(u[0], this);
    }

    public abstract void g(b0 b0Var);

    public abstract void h(io.sentry.android.replay.q qVar);

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:47:0x0163  */
    /* JADX WARN: Code duplicated, block: B:50:0x0174  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b3  */
    public void i(MotionEvent motionEvent) {
        int pointerId;
        int iFindPointerIndex;
        List listH;
        List list;
        int pointerId2;
        int iFindPointerIndex2;
        List listH2;
        long j;
        List listH3;
        b0 b0VarF = f();
        if (b0VarF != null) {
            y21 y21Var = this.f;
            io.sentry.transport.f fVar = (io.sentry.transport.f) y21Var.c;
            LinkedHashMap linkedHashMap = (LinkedHashMap) y21Var.d;
            float f = b0VarF.d;
            float f2 = b0VarF.c;
            int actionMasked = motionEvent.getActionMasked();
            int i = 10;
            int i2 = -1;
            if (actionMasked == 0) {
                pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex != -1) {
                    list = null;
                } else {
                    linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                    io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
                    gVar.b = fVar.getCurrentTimeMillis();
                    gVar.f = motionEvent.getX(iFindPointerIndex) * f2;
                    gVar.g = motionEvent.getY(iFindPointerIndex) * f;
                    gVar.e = 0;
                    gVar.w = pointerId;
                    gVar.d = io.sentry.rrweb.f.TouchStart;
                    listH = t72.H(gVar);
                }
            } else if (actionMasked == 1) {
                pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                if (iFindPointerIndex2 != -1) {
                    list = null;
                } else {
                    linkedHashMap.remove(Integer.valueOf(pointerId2));
                    io.sentry.rrweb.g gVar2 = new io.sentry.rrweb.g();
                    gVar2.b = fVar.getCurrentTimeMillis();
                    gVar2.f = motionEvent.getX(iFindPointerIndex2) * f2;
                    gVar2.g = motionEvent.getY(iFindPointerIndex2) * f;
                    gVar2.e = 0;
                    gVar2.w = pointerId2;
                    gVar2.d = io.sentry.rrweb.f.TouchEnd;
                    listH2 = t72.H(gVar2);
                }
            } else if (actionMasked == 2) {
                long currentTimeMillis = fVar.getCurrentTimeMillis();
                long j2 = y21Var.b;
                long j3 = 0;
                if (j2 == 0 || j2 + 50 <= currentTimeMillis) {
                    y21Var.b = currentTimeMillis;
                    Set<Integer> setKeySet = linkedHashMap.keySet();
                    setKeySet.getClass();
                    for (Integer num : setKeySet) {
                        num.getClass();
                        int iFindPointerIndex3 = motionEvent.findPointerIndex(num.intValue());
                        if (iFindPointerIndex3 == i2) {
                            j = j3;
                        } else {
                            j = j3;
                            if (y21Var.a == j) {
                                y21Var.a = currentTimeMillis;
                            }
                            Object obj = linkedHashMap.get(num);
                            obj.getClass();
                            io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                            hVar.b = motionEvent.getX(iFindPointerIndex3) * f2;
                            hVar.c = motionEvent.getY(iFindPointerIndex3) * f;
                            hVar.a = 0;
                            hVar.d = currentTimeMillis - y21Var.a;
                            ((Collection) obj).add(hVar);
                        }
                        j3 = j;
                        i2 = -1;
                    }
                    long j4 = j3;
                    long j5 = currentTimeMillis - y21Var.a;
                    if (j5 > 500) {
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            int iIntValue = ((Number) entry.getKey()).intValue();
                            ArrayList<io.sentry.rrweb.h> arrayList2 = (ArrayList) entry.getValue();
                            if (!arrayList2.isEmpty()) {
                                io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
                                iVar.b = currentTimeMillis;
                                ArrayList arrayList3 = new ArrayList(t72.u(arrayList2, i));
                                for (io.sentry.rrweb.h hVar2 : arrayList2) {
                                    hVar2.d -= j5;
                                    arrayList3.add(hVar2);
                                    iVar = iVar;
                                }
                                io.sentry.rrweb.i iVar2 = iVar;
                                iVar2.e = arrayList3;
                                iVar2.d = iIntValue;
                                arrayList.add(iVar2);
                                Object obj2 = linkedHashMap.get(Integer.valueOf(iIntValue));
                                obj2.getClass();
                                ((ArrayList) obj2).clear();
                                i = 10;
                            }
                        }
                        y21Var.a = j4;
                        list = arrayList;
                    } else {
                        list = null;
                    }
                } else {
                    list = null;
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                    if (iFindPointerIndex != -1) {
                        linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                        io.sentry.rrweb.g gVar3 = new io.sentry.rrweb.g();
                        gVar3.b = fVar.getCurrentTimeMillis();
                        gVar3.f = motionEvent.getX(iFindPointerIndex) * f2;
                        gVar3.g = motionEvent.getY(iFindPointerIndex) * f;
                        gVar3.e = 0;
                        gVar3.w = pointerId;
                        gVar3.d = io.sentry.rrweb.f.TouchStart;
                        listH = t72.H(gVar3);
                    }
                } else if (actionMasked == 6) {
                    pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                    if (iFindPointerIndex2 != -1) {
                        linkedHashMap.remove(Integer.valueOf(pointerId2));
                        io.sentry.rrweb.g gVar4 = new io.sentry.rrweb.g();
                        gVar4.b = fVar.getCurrentTimeMillis();
                        gVar4.f = motionEvent.getX(iFindPointerIndex2) * f2;
                        gVar4.g = motionEvent.getY(iFindPointerIndex2) * f;
                        gVar4.e = 0;
                        gVar4.w = pointerId2;
                        gVar4.d = io.sentry.rrweb.f.TouchEnd;
                        listH2 = t72.H(gVar4);
                    }
                }
                list = null;
            } else {
                linkedHashMap.clear();
                io.sentry.rrweb.g gVar5 = new io.sentry.rrweb.g();
                gVar5.b = fVar.getCurrentTimeMillis();
                gVar5.f = motionEvent.getX() * f2;
                gVar5.g = motionEvent.getY() * f;
                gVar5.e = 0;
                gVar5.w = 0;
                gVar5.d = io.sentry.rrweb.f.TouchCancel;
                listH3 = t72.H(gVar5);
            }
            if (list == null) {
                list = listH;
                list = listH2;
                list = listH3;
                return;
            } else {
                list = listH;
                list = listH2;
                list = listH3;
                x72.g0(this.q, list);
            }
        }
    }

    public abstract void j();

    public final void k(int i) {
        wn7 wn7Var = u[4];
        Integer numValueOf = Integer.valueOf(i);
        b bVar = this.n;
        bVar.getClass();
        wn7Var.getClass();
        Object andSet = bVar.b.getAndSet(numValueOf);
        if (pa7.t(andSet, numValueOf)) {
            return;
        }
        c cVar = new c(andSet, numValueOf, bVar.d);
        i iVar = bVar.c;
        q6 q6Var = iVar.a;
        if (q6Var.getThreadChecker().c()) {
            iVar.e.submit(new io.sentry.android.replay.util.h(new o2(3, cVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            cVar.invoke();
        } catch (Throwable th) {
            q6Var.getLogger().d(q5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void l(b0 b0Var) {
        wn7 wn7Var = u[0];
        b bVar = this.i;
        bVar.getClass();
        wn7Var.getClass();
        Object andSet = bVar.b.getAndSet(b0Var);
        if (pa7.t(andSet, b0Var)) {
            return;
        }
        f fVar = new f(andSet, b0Var, bVar.d);
        i iVar = bVar.c;
        q6 q6Var = iVar.a;
        if (q6Var.getThreadChecker().c()) {
            iVar.e.submit(new io.sentry.android.replay.util.h(new o2(6, fVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            fVar.invoke();
        } catch (Throwable th) {
            q6Var.getLogger().d(q5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void m(Date date) {
        wn7 wn7Var = u[1];
        b bVar = this.j;
        bVar.getClass();
        wn7Var.getClass();
        Object andSet = bVar.b.getAndSet(date);
        if (pa7.t(andSet, date)) {
            return;
        }
        g gVar = new g(andSet, date, bVar.d);
        i iVar = bVar.c;
        q6 q6Var = iVar.a;
        if (q6Var.getThreadChecker().c()) {
            iVar.e.submit(new io.sentry.android.replay.util.h(new o2(7, gVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            gVar.invoke();
        } catch (Throwable th) {
            q6Var.getLogger().d(q5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public void n(int i, io.sentry.protocol.w wVar, r6 r6Var) {
        wVar.getClass();
        this.h = new io.sentry.android.replay.k(this.a, wVar);
        wn7[] wn7VarArr = u;
        wn7 wn7Var = wn7VarArr[3];
        b bVar = this.m;
        bVar.getClass();
        wn7Var.getClass();
        Object andSet = bVar.b.getAndSet(wVar);
        if (!pa7.t(andSet, wVar)) {
            a aVar = new a(andSet, wVar, bVar.d);
            i iVar = bVar.c;
            q6 q6Var = iVar.a;
            if (q6Var.getThreadChecker().c()) {
                iVar.e.submit(new io.sentry.android.replay.util.h(new o2(2, aVar), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    aVar.invoke();
                } catch (Throwable th) {
                    q6Var.getLogger().d(q5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
        k(i);
        if (r6Var == null) {
            r6Var = this instanceof z ? r6.SESSION : r6.BUFFER;
        }
        r6Var.getClass();
        wn7 wn7Var2 = wn7VarArr[5];
        b bVar2 = this.o;
        bVar2.getClass();
        wn7Var2.getClass();
        Object andSet2 = bVar2.b.getAndSet(r6Var);
        if (!pa7.t(andSet2, r6Var)) {
            d dVar = new d(andSet2, r6Var, bVar2.d);
            i iVar2 = bVar2.c;
            q6 q6Var2 = iVar2.a;
            if (q6Var2.getThreadChecker().c()) {
                iVar2.e.submit(new io.sentry.android.replay.util.h(new o2(4, dVar), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    dVar.invoke();
                } catch (Throwable th2) {
                    q6Var2.getLogger().d(q5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        m(new Date());
        this.k.set(this.c.getCurrentTimeMillis());
    }

    public abstract void o();
}
