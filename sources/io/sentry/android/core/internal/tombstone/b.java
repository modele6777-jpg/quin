package io.sentry.android.core.internal.tombstone;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.bwe;
import defpackage.fsf;
import defpackage.fze;
import defpackage.gec;
import defpackage.ir8;
import defpackage.je9;
import defpackage.jr8;
import defpackage.jy4;
import defpackage.mr8;
import defpackage.oc0;
import defpackage.p90;
import defpackage.qfc;
import defpackage.scc;
import defpackage.tob;
import defpackage.y21;
import defpackage.y25;
import defpackage.ys0;
import defpackage.yx4;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.d;
import io.sentry.h2;
import io.sentry.i5;
import io.sentry.p;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.protocol.f;
import io.sentry.protocol.v;
import io.sentry.q5;
import io.sentry.transport.o;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Closeable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final List d;
    public final Serializable e;
    public final Object f;

    public b(InputStream inputStream, List list, List list2, String str) {
        this.a = 0;
        HashMap map = new HashMap();
        this.f = map;
        this.b = inputStream;
        this.c = list;
        this.d = list2;
        this.e = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    public void b(p pVar, Date date, long j) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        ArrayList arrayList = (ArrayList) this.e;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Date date2 = (Date) concurrentHashMap.get(pVar);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(pVar, date);
            Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
            while (it.hasNext()) {
                ((o) it.next()).U(this);
            }
            io.sentry.util.a aVar = (io.sentry.util.a) this.f;
            aVar.b();
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((Future) it2.next()).isDone()) {
                        it2.remove();
                    }
                }
                try {
                    arrayList.add(sentryAndroidOptions.getTimerExecutorService().schedule(new bwe(25, this), j));
                } catch (RejectedExecutionException e) {
                    sentryAndroidOptions.getLogger().d(q5.WARNING, "Failed to schedule rate limit lifted notification.", e);
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                ((InputStream) this.b).close();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.e;
                io.sentry.util.a aVar = (io.sentry.util.a) this.f;
                aVar.b();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Future) it.next()).cancel(false);
                    }
                    arrayList.clear();
                    aVar.close();
                    ((CopyOnWriteArrayList) this.d).clear();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public boolean h(p pVar) {
        Date date;
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Date date3 = (Date) concurrentHashMap.get(p.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (p.Unknown.equals(pVar) || (date = (Date) concurrentHashMap.get(pVar)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public i5 l() throws IOException {
        DebugImage debugImageL;
        Map map;
        Iterator it;
        DebugImage debugImageL2;
        fsf fsfVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap map2;
        int i;
        ArrayList arrayList3;
        HashMap map3;
        ArrayList arrayList4;
        HashMap map4;
        fsf fsfVar2;
        fsf fsfVar3;
        fsf fsfVar4;
        InputStream inputStream = (InputStream) this.b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
        fsf fsfVar5 = new fsf(byteArrayOutputStream.toByteArray());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String str = "";
        int i3 = 0;
        int i4 = 0;
        String strF = "";
        p90 p90Var = null;
        while (true) {
            int iG = fsfVar5.g();
            if (iG == 0) {
                String str2 = str;
                int i5 = i4;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                Collections.unmodifiableList(arrayList6);
                Collections.unmodifiableList(arrayList7);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map5);
                Collections.unmodifiableMap(map6);
                List listUnmodifiableList2 = Collections.unmodifiableList(arrayList8);
                Collections.unmodifiableList(arrayList9);
                Collections.unmodifiableList(arrayList10);
                i5 i5Var = new i5();
                i5Var.J0 = q5.FATAL;
                i5Var.v = "native";
                io.sentry.protocol.p pVar = new io.sentry.protocol.p();
                String strJoin = String.join(" ", listUnmodifiableList);
                if (p90Var != null) {
                    Locale locale = Locale.ROOT;
                    String strConcat = !strF.isEmpty() ? strF.concat(": ") : str2;
                    pVar.a = strConcat + "Fatal signal " + ((String) p90Var.d) + " (" + p90Var.b + "), " + ((String) p90Var.e) + " (" + p90Var.c + "), pid = " + i3 + " (" + strJoin + ")";
                } else {
                    Locale locale2 = Locale.ROOT;
                    pVar.a = "Fatal exit pid = " + i3 + " (" + strJoin + ")";
                }
                i5Var.F0 = pVar;
                ArrayList arrayList11 = new ArrayList();
                Iterator it2 = listUnmodifiableList2.iterator();
                y21 y21Var = null;
                while (it2.hasNext()) {
                    mr8 mr8Var = (mr8) it2.next();
                    boolean z = mr8Var.d;
                    String str3 = mr8Var.f;
                    String str4 = mr8Var.e;
                    long j = mr8Var.b;
                    if (!z || str4.isEmpty() || str4.startsWith("/dev/")) {
                        map = mapUnmodifiableMap;
                        it = it2;
                    } else {
                        boolean zIsEmpty = str3.isEmpty();
                        map = mapUnmodifiableMap;
                        it = it2;
                        boolean z2 = mr8Var.c == 0;
                        if (zIsEmpty || !z2) {
                            if (y21Var != null && str4.equals((String) y21Var.c)) {
                                y21Var.b = j;
                            }
                        } else if (y21Var == null || !str4.equals((String) y21Var.c)) {
                            if (y21Var != null && (debugImageL2 = y21Var.l()) != null) {
                                arrayList11.add(debugImageL2);
                            }
                            y21 y21Var2 = new y21();
                            y21Var2.c = str4;
                            y21Var2.d = str3;
                            y21Var2.a = mr8Var.a;
                            y21Var2.b = j;
                            y21Var = y21Var2;
                        } else {
                            y21Var.b = j;
                        }
                    }
                    mapUnmodifiableMap = map;
                    it2 = it;
                }
                Map map7 = mapUnmodifiableMap;
                if (y21Var != null && (debugImageL = y21Var.l()) != null) {
                    arrayList11.add(debugImageL);
                }
                f fVar = new f();
                fVar.b(arrayList11);
                i5Var.Y = fVar;
                v vVar = new v();
                if (p90Var != null) {
                    String str5 = (String) p90Var.d;
                    vVar.a = str5;
                    vVar.b = (String) ((HashMap) this.f).get(str5);
                    io.sentry.protocol.o oVar = new io.sentry.protocol.o();
                    oVar.a = a.TOMBSTONE.getValue();
                    oVar.d = Boolean.FALSE;
                    oVar.g = Boolean.TRUE;
                    HashMap map8 = new HashMap();
                    map8.put("number", Integer.valueOf(p90Var.b));
                    map8.put("name", (String) p90Var.d);
                    map8.put("code", Integer.valueOf(p90Var.c));
                    map8.put("code_name", (String) p90Var.e);
                    oVar.e = new HashMap(map8);
                    vVar.f = oVar;
                }
                vVar.d = Long.valueOf(i5);
                ArrayList arrayList12 = new ArrayList(1);
                arrayList12.add(vVar);
                i5Var.I0 = new h2(arrayList12);
                ArrayList arrayListD = i5Var.d();
                Objects.requireNonNull(arrayListD);
                v vVar2 = (v) arrayListD.get(0);
                ArrayList arrayList13 = new ArrayList();
                Iterator it3 = map7.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    fze fzeVar = (fze) entry.getValue();
                    e0 e0Var = new e0();
                    e0Var.a = Long.valueOf(((Integer) entry.getKey()).intValue());
                    e0Var.c = fzeVar.b;
                    ArrayList arrayList14 = new ArrayList();
                    Iterator it4 = fzeVar.d.iterator();
                    while (it4.hasNext()) {
                        ys0 ys0Var = (ys0) it4.next();
                        String str6 = ys0Var.c;
                        String str7 = ys0Var.b;
                        if (!str6.endsWith("libart.so") && (!str6.startsWith("<anonymous") || !str7.isEmpty())) {
                            a0 a0Var = new a0();
                            a0Var.z = str6;
                            a0Var.e = str7;
                            Iterator it5 = it4;
                            a0Var.F0 = String.format("0x%x", Long.valueOf(ys0Var.a));
                            Boolean boolG = str7.isEmpty() ? Boolean.FALSE : d.g(str7, (List) this.c, this.d);
                            String str8 = (String) this.e;
                            a0Var.y = Boolean.valueOf((boolG != null && boolG.booleanValue()) || (str8 != null && str6.startsWith(str8)));
                            arrayList14.add(0, a0Var);
                            it4 = it5;
                        }
                    }
                    c0 c0Var = new c0();
                    c0Var.a = arrayList14;
                    c0Var.d = b0.NONE;
                    HashMap map9 = new HashMap();
                    for (tob tobVar : fzeVar.c) {
                        map9.put(tobVar.a, String.format("0x%x", Long.valueOf(tobVar.b)));
                        i5Var = i5Var;
                        it3 = it3;
                    }
                    Iterator it6 = it3;
                    i5 i5Var2 = i5Var;
                    c0Var.b = map9;
                    e0Var.w = c0Var;
                    int i6 = fzeVar.a;
                    if (i5 == i6) {
                        e0Var.e = Boolean.TRUE;
                        vVar2.e = c0Var;
                    }
                    if (i3 == i6) {
                        e0Var.c = "main";
                        e0Var.v = Boolean.TRUE;
                    }
                    arrayList13.add(e0Var);
                    i5Var = i5Var2;
                    it3 = it6;
                }
                i5 i5Var3 = i5Var;
                i5Var3.H0 = new h2(arrayList13);
                return i5Var3;
            }
            int i7 = iG >>> 3;
            int i8 = iG & 7;
            String str9 = str;
            switch (i7) {
                case 1:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    fsf.b(i7, 0, i8);
                    oc0.a((int) fsfVar.i());
                    break;
                case 2:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    fsf.b(i7, 2, i8);
                    fsfVar.f();
                    break;
                case 3:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    fsf.b(i7, 2, i8);
                    fsfVar.f();
                    break;
                case 4:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    fsf.b(i7, 2, i8);
                    fsfVar.f();
                    break;
                case 5:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    fsf.b(i7, 0, i8);
                    i3 = (int) fsfVar.i();
                    break;
                case 6:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    fsf.b(i7, 0, i8);
                    i4 = (int) fsfVar.i();
                    break;
                case 7:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    fsf.b(i7, 0, i8);
                    fsfVar.i();
                    break;
                case 8:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    fsf.b(i7, 2, i8);
                    fsfVar.f();
                    break;
                case 9:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    i = i4;
                    fsf.b(i7, 2, i8);
                    arrayList5.add(fsfVar.f());
                    i4 = i;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    map2 = map5;
                    i = i4;
                    ArrayList arrayList15 = arrayList5;
                    fsf.b(i7, 2, i8);
                    fsf fsfVarE = fsfVar.e();
                    String strF2 = str9;
                    String strF3 = strF2;
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        int iG2 = fsfVarE.g();
                        if (iG2 == 0) {
                            arrayList2 = arrayList7;
                            p90Var = new p90(strF2, i9, strF3, i10);
                            arrayList5 = arrayList15;
                            i4 = i;
                        } else {
                            int i11 = iG2 >>> 3;
                            int i12 = iG2 & 7;
                            switch (i11) {
                                case 1:
                                    fsf.b(i11, 0, i12);
                                    i9 = (int) fsfVarE.i();
                                    break;
                                case 2:
                                    fsf.b(i11, 2, i12);
                                    strF2 = fsfVarE.f();
                                    break;
                                case 3:
                                    fsf.b(i11, 0, i12);
                                    i10 = (int) fsfVarE.i();
                                    break;
                                case 4:
                                    fsf.b(i11, 2, i12);
                                    strF3 = fsfVarE.f();
                                    break;
                                case 5:
                                    fsf.b(i11, 0, i12);
                                    fsfVarE.c();
                                    break;
                                case 6:
                                    fsf.b(i11, 0, i12);
                                    fsfVarE.i();
                                    break;
                                case 7:
                                    fsf.b(i11, 0, i12);
                                    fsfVarE.i();
                                    break;
                                case 8:
                                    fsf.b(i11, 0, i12);
                                    fsfVarE.c();
                                    break;
                                case 9:
                                    fsf.b(i11, 0, i12);
                                    fsfVarE.i();
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    fsf.b(i11, 2, i12);
                                    scc.g(fsfVarE.e());
                                    break;
                                default:
                                    fsfVarE.j(i12);
                                    break;
                            }
                            arrayList15 = arrayList15;
                            arrayList7 = arrayList7;
                        }
                        break;
                    }
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                default:
                    fsfVar5.j(i8);
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    i = i4;
                    i4 = i;
                    break;
                case 14:
                    fsfVar = fsfVar5;
                    arrayList = arrayList6;
                    map2 = map5;
                    fsf.b(i7, 2, i8);
                    strF = fsfVar.f();
                    arrayList2 = arrayList7;
                    break;
                case 15:
                    fsfVar = fsfVar5;
                    int i13 = 2;
                    i = i4;
                    fsf.b(i7, 2, i8);
                    fsf fsfVarE2 = fsfVar.e();
                    while (true) {
                        int iG3 = fsfVarE2.g();
                        if (iG3 == 0) {
                            arrayList = arrayList6;
                            map2 = map5;
                            arrayList7.add(new gec(17));
                            arrayList5 = arrayList5;
                            arrayList2 = arrayList7;
                            i4 = i;
                        } else {
                            int i14 = iG3 >>> 3;
                            int i15 = iG3 & 7;
                            if (i14 != 1) {
                                if (i14 != i13) {
                                    fsfVarE2.j(i15);
                                } else {
                                    fsf.b(i14, i13, i15);
                                    fsf fsfVarE3 = fsfVarE2.e();
                                    while (true) {
                                        int iG4 = fsfVarE3.g();
                                        if (iG4 != 0) {
                                            int i16 = iG4 >>> 3;
                                            int i17 = iG4 & 7;
                                            ArrayList arrayList16 = arrayList6;
                                            if (i16 == 1) {
                                                map4 = map5;
                                                fsf.b(i16, 0, i17);
                                                ir8.a((int) fsfVarE3.i());
                                            } else if (i16 == i13) {
                                                map4 = map5;
                                                fsf.b(i16, 0, i17);
                                                jr8.a((int) fsfVarE3.i());
                                            } else if (i16 != 3) {
                                                fsfVarE3.j(i17);
                                                map4 = map5;
                                            } else {
                                                fsf.b(i16, i13, i17);
                                                fsf fsfVarE4 = fsfVarE3.e();
                                                ArrayList arrayList17 = new ArrayList();
                                                ArrayList arrayList18 = new ArrayList();
                                                while (true) {
                                                    int iG5 = fsfVarE4.g();
                                                    if (iG5 != 0) {
                                                        int i18 = iG5 >>> 3;
                                                        HashMap map10 = map5;
                                                        int i19 = iG5 & 7;
                                                        switch (i18) {
                                                            case 1:
                                                                fsfVar2 = fsfVarE4;
                                                                fsf.b(i18, 0, i19);
                                                                fsfVar2.i();
                                                                break;
                                                            case 2:
                                                                fsfVar2 = fsfVarE4;
                                                                fsf.b(i18, 0, i19);
                                                                fsfVar2.i();
                                                                break;
                                                            case 3:
                                                                fsfVar2 = fsfVarE4;
                                                                fsf.b(i18, 0, i19);
                                                                fsfVar2.i();
                                                                break;
                                                            case 4:
                                                                fsfVar2 = fsfVarE4;
                                                                fsf.b(i18, 2, i19);
                                                                arrayList17.add(scc.f(fsfVar2.e()));
                                                                break;
                                                            case 5:
                                                                fsfVar2 = fsfVarE4;
                                                                fsf.b(i18, 0, i19);
                                                                fsfVar2.i();
                                                                break;
                                                            case 6:
                                                                fsfVar2 = fsfVarE4;
                                                                fsf.b(i18, 2, i19);
                                                                arrayList18.add(scc.f(fsfVar2.e()));
                                                                break;
                                                            default:
                                                                fsfVarE4.j(i19);
                                                                fsfVar2 = fsfVarE4;
                                                                break;
                                                        }
                                                        fsfVarE4 = fsfVar2;
                                                        map5 = map10;
                                                    } else {
                                                        map4 = map5;
                                                        Collections.unmodifiableList(arrayList17);
                                                        Collections.unmodifiableList(arrayList18);
                                                    }
                                                }
                                            }
                                            arrayList5 = arrayList5;
                                            arrayList6 = arrayList16;
                                            map5 = map4;
                                            i13 = 2;
                                        }
                                    }
                                }
                                arrayList3 = arrayList6;
                                map3 = map5;
                                arrayList4 = arrayList5;
                            } else {
                                arrayList3 = arrayList6;
                                map3 = map5;
                                arrayList4 = arrayList5;
                                fsf.b(i14, i13, i15);
                                fsfVarE2.f();
                            }
                            arrayList5 = arrayList4;
                            arrayList6 = arrayList3;
                            map5 = map3;
                        }
                        break;
                    }
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 2, i8);
                    scc.h(fsfVar.e(), map5);
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    i4 = i;
                    break;
                case 17:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 2, i8);
                    fsf fsfVarE5 = fsfVar.e();
                    String strF4 = str9;
                    String strF5 = strF4;
                    long jI = 0;
                    long jI2 = 0;
                    long jI3 = 0;
                    boolean zC = false;
                    while (true) {
                        int iG6 = fsfVarE5.g();
                        if (iG6 == 0) {
                            arrayList8.add(new mr8(jI, jI2, jI3, strF4, strF5, zC));
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map2 = map5;
                            i4 = i;
                            break;
                        } else {
                            int i20 = iG6 >>> 3;
                            int i21 = iG6 & 7;
                            switch (i20) {
                                case 1:
                                    fsf.b(i20, 0, i21);
                                    jI = fsfVarE5.i();
                                    break;
                                case 2:
                                    fsf.b(i20, 0, i21);
                                    jI2 = fsfVarE5.i();
                                    break;
                                case 3:
                                    fsf.b(i20, 0, i21);
                                    jI3 = fsfVarE5.i();
                                    break;
                                case 4:
                                    fsf.b(i20, 0, i21);
                                    zC = fsfVarE5.c();
                                    break;
                                case 5:
                                    fsf.b(i20, 0, i21);
                                    fsfVarE5.c();
                                    break;
                                case 6:
                                    fsf.b(i20, 0, i21);
                                    fsfVarE5.c();
                                    break;
                                case 7:
                                    fsf.b(i20, 2, i21);
                                    strF4 = fsfVarE5.f();
                                    break;
                                case 8:
                                    fsf.b(i20, 2, i21);
                                    strF5 = fsfVarE5.f();
                                    break;
                                case 9:
                                    fsf.b(i20, 0, i21);
                                    fsfVarE5.i();
                                    break;
                                default:
                                    fsfVarE5.j(i21);
                                    break;
                            }
                        }
                    }
                    break;
                case 18:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 2, i8);
                    fsf fsfVarE6 = fsfVar.e();
                    ArrayList arrayList19 = new ArrayList();
                    while (true) {
                        int iG7 = fsfVarE6.g();
                        if (iG7 == 0) {
                            yx4 yx4Var = new yx4(12);
                            Collections.unmodifiableList(arrayList19);
                            arrayList9.add(yx4Var);
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map2 = map5;
                            i4 = i;
                        } else {
                            int i22 = iG7 >>> 3;
                            int i23 = iG7 & 7;
                            if (i22 == 1) {
                                fsfVar3 = fsfVarE6;
                                fsf.b(i22, 2, i23);
                                fsfVar3.f();
                            } else if (i22 != 2) {
                                fsfVarE6.j(i23);
                                fsfVar3 = fsfVarE6;
                            } else {
                                fsf.b(i22, 2, i23);
                                fsf fsfVarE7 = fsfVarE6.e();
                                while (true) {
                                    int iG8 = fsfVarE7.g();
                                    if (iG8 != 0) {
                                        int i24 = iG8 >>> 3;
                                        int i25 = iG8 & 7;
                                        switch (i24) {
                                            case 1:
                                                fsfVarE6 = fsfVarE6;
                                                fsf.b(i24, 2, i25);
                                                fsfVarE7.f();
                                                break;
                                            case 2:
                                                fsf.b(i24, 0, i25);
                                                fsfVarE7.i();
                                                break;
                                            case 3:
                                                fsf.b(i24, 0, i25);
                                                fsfVarE7.i();
                                                break;
                                            case 4:
                                                fsf.b(i24, 0, i25);
                                                fsfVarE7.i();
                                                break;
                                            case 5:
                                                fsf.b(i24, 2, i25);
                                                fsfVarE7.f();
                                                break;
                                            case 6:
                                                fsfVarE6 = fsfVarE6;
                                                fsf.b(i24, 2, i25);
                                                fsfVarE7.f();
                                                break;
                                            default:
                                                fsfVarE7.j(i25);
                                                break;
                                        }
                                        fsfVarE6 = fsfVarE6;
                                    } else {
                                        fsfVar3 = fsfVarE6;
                                        arrayList19.add(new jy4(12));
                                    }
                                }
                            }
                            fsfVarE6 = fsfVar3;
                        }
                        break;
                    }
                    break;
                case 19:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 2, i8);
                    fsf fsfVarE8 = fsfVar.e();
                    while (true) {
                        int iG9 = fsfVarE8.g();
                        if (iG9 == 0) {
                            arrayList10.add(new jy4(1));
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map2 = map5;
                            i4 = i;
                            break;
                        } else {
                            int i26 = iG9 >>> 3;
                            int i27 = iG9 & 7;
                            if (i26 == 1) {
                                fsf.b(i26, 0, i27);
                                fsfVarE8.i();
                            } else if (i26 == 2) {
                                fsf.b(i26, 2, i27);
                                fsfVarE8.f();
                            } else if (i26 == 3) {
                                fsf.b(i26, 2, i27);
                                fsfVarE8.f();
                            } else if (i26 != 4) {
                                fsfVarE8.j(i27);
                            } else {
                                fsf.b(i26, 0, i27);
                                fsfVarE8.i();
                            }
                        }
                    }
                    break;
                case 20:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 0, i8);
                    fsfVar.i();
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    i4 = i;
                    break;
                case 21:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 2, i8);
                    fsf fsfVarE9 = fsfVar.e();
                    while (true) {
                        int iG10 = fsfVarE9.g();
                        if (iG10 == 0) {
                            arrayList6.add(new qfc());
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map2 = map5;
                            i4 = i;
                            break;
                        } else {
                            int i28 = iG10 >>> 3;
                            int i29 = iG10 & 7;
                            if (i28 == 1) {
                                fsf.b(i28, 2, i29);
                                fsfVarE9.d();
                            } else if (i28 != 2) {
                                fsfVarE9.j(i29);
                            } else {
                                fsf.b(i28, 2, i29);
                                fsfVarE9.d();
                            }
                        }
                    }
                    break;
                case 22:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 0, i8);
                    fsfVar.i();
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    i4 = i;
                    break;
                case 23:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 0, i8);
                    fsfVar.c();
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    i4 = i;
                    break;
                case 24:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 0, i8);
                    oc0.a((int) fsfVar.i());
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    i4 = i;
                    break;
                case 25:
                    fsfVar = fsfVar5;
                    i = i4;
                    fsf.b(i7, 2, i8);
                    scc.h(fsfVar.e(), map6);
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map2 = map5;
                    i4 = i;
                    break;
                case 26:
                    fsf.b(i7, 2, i8);
                    fsf fsfVarE10 = fsfVar5.e();
                    ArrayList arrayList20 = new ArrayList();
                    while (true) {
                        int iG11 = fsfVarE10.g();
                        if (iG11 == 0) {
                            fsfVar = fsfVar5;
                            i = i4;
                            Collections.unmodifiableList(arrayList20);
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map2 = map5;
                            i4 = i;
                        } else {
                            int i30 = iG11 >>> 3;
                            fsf fsfVar6 = fsfVar5;
                            int i31 = iG11 & 7;
                            int i32 = i4;
                            if (i30 == 1) {
                                fsfVar4 = fsfVarE10;
                                fsf.b(i30, 0, i31);
                                fsfVar4.i();
                            } else if (i30 != 2) {
                                fsfVarE10.j(i31);
                                fsfVar4 = fsfVarE10;
                            } else {
                                fsf.b(i30, 2, i31);
                                fsf fsfVarE11 = fsfVarE10.e();
                                while (true) {
                                    int iG12 = fsfVarE11.g();
                                    if (iG12 != 0) {
                                        int i33 = iG12 >>> 3;
                                        int i34 = iG12 & 7;
                                        fsf fsfVar7 = fsfVarE10;
                                        if (i33 == 1) {
                                            fsf.b(i33, 2, i34);
                                            scc.f(fsfVarE11.e());
                                        } else if (i33 == 2) {
                                            fsf.b(i33, 0, i34);
                                            fsfVarE11.i();
                                        } else if (i33 != 3) {
                                            fsfVarE11.j(i34);
                                        } else {
                                            fsf.b(i33, 0, i34);
                                            fsfVarE11.i();
                                        }
                                        fsfVarE10 = fsfVar7;
                                    } else {
                                        fsfVar4 = fsfVarE10;
                                        arrayList20.add(new y25(29));
                                    }
                                }
                            }
                            fsfVarE10 = fsfVar4;
                            fsfVar5 = fsfVar6;
                            i4 = i32;
                        }
                        break;
                    }
                    break;
            }
            str = str9;
            arrayList7 = arrayList2;
            fsfVar5 = fsfVar;
            arrayList6 = arrayList;
            map5 = map2;
        }
    }

    public b(SentryAndroidOptions sentryAndroidOptions) {
        this.a = 1;
        this.c = new ConcurrentHashMap();
        this.d = new CopyOnWriteArrayList();
        this.e = new ArrayList();
        this.f = new io.sentry.util.a();
        this.b = sentryAndroidOptions;
    }
}
