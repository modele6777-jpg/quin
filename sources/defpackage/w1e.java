package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1e implements d8e, yrd, j52, hec, ifg, cfg, msg {
    public static w1e b;
    public final /* synthetic */ int a;
    public static final /* synthetic */ w1e c = new w1e(19);
    public static final /* synthetic */ w1e d = new w1e(20);
    public static final /* synthetic */ w1e e = new w1e(21);
    public static final /* synthetic */ w1e f = new w1e(22);
    public static final /* synthetic */ w1e g = new w1e(23);
    public static final /* synthetic */ w1e v = new w1e(24);
    public static final /* synthetic */ w1e w = new w1e(25);
    public static final /* synthetic */ w1e x = new w1e(26);
    public static final /* synthetic */ w1e y = new w1e(27);
    public static final /* synthetic */ w1e z = new w1e(28);
    public static final /* synthetic */ w1e X = new w1e(29);

    public /* synthetic */ w1e(int i) {
        this.a = i;
    }

    public static h9g f(long j) {
        Set set = i9g.b;
        Set set2 = d7g.b;
        float fB = bj4.b(j);
        if (yi4.a(fB, 0.0f) < 0) {
            qc0.j("Width must not be negative");
            return null;
        }
        if (set.isEmpty()) {
            qc0.j("Must support at least one size class");
            return null;
        }
        List list = i9g.c;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i9g i9gVar = (i9g) list.get(i2);
            int i3 = i9gVar.a;
            if (set.contains(i9gVar)) {
                Set set3 = i9g.b;
                if (yi4.a(fB, o8c.i(i3)) >= 0) {
                    i = i3;
                    break;
                }
                i = i3;
            }
        }
        Set set4 = d7g.b;
        float fA = bj4.a(j);
        if (yi4.a(fA, 0.0f) < 0) {
            qc0.j("Width must not be negative");
            return null;
        }
        if (set2.isEmpty()) {
            qc0.j("Must support at least one size class");
            return null;
        }
        List list2 = d7g.c;
        int size2 = list2.size();
        int i4 = 2;
        for (int i5 = 0; i5 < size2; i5++) {
            d7g d7gVar = (d7g) list2.get(i5);
            int i6 = d7gVar.a;
            if (set2.contains(d7gVar)) {
                Set set5 = d7g.b;
                if (yi4.a(fA, w6c.e(i6)) >= 0) {
                    i4 = i6;
                    break;
                }
                i4 = i6;
            }
        }
        return new h9g(i, i4);
    }

    public static Intent h(Context context, int i, boolean z2) {
        context.getClass();
        if (i < 0 || i >= 2) {
            qc0.j("Failed requirement.");
            return null;
        }
        Intent intentAddFlags = new Intent(context, (Class<?>) dhf.class).putExtra("remaining_readings", i).putExtra("has_first_month_offer", z2).addFlags(872415232);
        intentAddFlags.getClass();
        return intentAddFlags;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static tye k(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return tye.d;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return tye.c;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return tye.b;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return tye.e;
            }
        } else if (str.equals("SSLv3")) {
            return tye.f;
        }
        qc0.j("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static final boolean m() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final hng n(Object obj, Object obj2) {
        hng hngVarB = (hng) obj;
        hng hngVar = (hng) obj2;
        if (!hngVar.isEmpty()) {
            if (!hngVarB.d()) {
                hngVarB = hngVarB.b();
            }
            hngVarB.g();
            if (!hngVar.isEmpty()) {
                hngVarB.putAll(hngVar);
            }
        }
        return hngVarB;
    }

    public static final CharSequence o(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
    @Override // defpackage.yrd
    public boolean N(Object obj, Object obj2) {
        tpe tpeVar = (tpe) obj;
        tpe tpeVar2 = (tpe) obj2;
        if (tpeVar == null || tpeVar2 == null) {
            if ((tpeVar == null) ^ (tpeVar2 == null)) {
                return false;
            }
            return true;
        }
        if (tpeVar.e == tpeVar2.e && tpeVar.f == tpeVar2.f && tpeVar.b == tpeVar2.b && pa7.t(tpeVar.c, tpeVar2.c) && kl2.b(tpeVar.d, tpeVar2.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.d8e
    public f8e V(rr5 rr5Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.cfg
    public /* synthetic */ Object a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new mtb(2));
        afc.c(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    @Override // defpackage.msg
    public Object b() {
        switch (this.a) {
            case 19:
                ((epg) dpg.b.a.get()).getClass();
                return new Boolean(((Boolean) epg.a.get()).booleanValue());
            case 20:
                List list = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 21:
                List list2 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 22:
                List list3 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue());
            case 23:
                List list4 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 24:
                List list5 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(41, 1800000L, "measurement.sgtm.batch.retry_interval").get();
            case 25:
                List list6 = bzg.a;
                pog.b.get().getClass();
                return Integer.valueOf((int) ((Long) qog.a.b(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case 26:
                List list7 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get();
            case 27:
                List list8 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(65, 3600000L, "measurement.upload.interval").get();
            case 28:
                List list9 = bzg.a;
                pog.b.get().getClass();
                return (Long) qog.a.b(27, 60000L, "measurement.alarm_manager.minimum_interval").get();
            default:
                List list10 = bzg.a;
                pog.b.get().getClass();
                return (String) qog.a.c(8, "measurement.config.url_scheme", Constants.SCHEME).get();
        }
    }

    @Override // defpackage.d8e
    public boolean c(rr5 rr5Var) {
        return false;
    }

    @Override // defpackage.hec
    public q68 d(CharSequence charSequence, int i, int i2) {
        char cCharAt;
        int i3 = i + 4;
        if (i3 >= charSequence.length() || charSequence.charAt(i + 1) != 'w' || charSequence.charAt(i + 2) != 'w' || charSequence.charAt(i + 3) != '.') {
            return null;
        }
        if (i != i2 && ((cCharAt = charSequence.charAt(i - 1)) == '.' || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= '0' && cCharAt <= '9'))))) {
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        int i4 = iec.i(charSequence, i3);
        if (i4 == -1) {
            i4 = -1;
        } else {
            int i5 = i4;
            while (true) {
                i5--;
                if (i5 <= i3) {
                    break;
                }
                if (charSequence.charAt(i5) != '.' || i5 <= i3) {
                }
            }
            i4 = -1;
        }
        if (i4 == -1) {
            return null;
        }
        return new q68(s68.c, i, i4 + 1);
    }

    @Override // defpackage.j52
    public long e() {
        return System.currentTimeMillis();
    }

    public void g(h10 h10Var, h10 h10Var2) {
        HashSet hashSet = new HashSet();
        Iterator it = h10Var.iterator();
        while (it.hasNext()) {
            hashSet.add(((u00) it.next()).f());
        }
        Iterator it2 = h10Var2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((u00) it2.next()).f());
        }
    }

    public tjd i(kxa kxaVar, e7f e7fVar, boolean z2, int i, boolean z3) {
        e7f e7fVarE;
        s04 s04Var = (s04) kxaVar.b;
        i8f i8fVarJ = j(new dzd(s04Var.F0(), dsf.INVARIANT), kxaVar, null, i);
        tt7 tt7VarB = i8fVarJ.b();
        tt7VarB.getClass();
        tjd tjdVarD = w6c.d(tt7VarB);
        if (i7h.x(tjdVarD)) {
            return tjdVarD;
        }
        i8fVarJ.a();
        g(tjdVarD.getAnnotations(), l10.a(e7fVar));
        if (!i7h.x(tjdVarD)) {
            if (i7h.x(tjdVarD)) {
                e7fVarE = tjdVarD.a0();
            } else {
                e7f e7fVarA0 = tjdVarD.a0();
                lqb lqbVar = e7f.b;
                e7fVarA0.getClass();
                if (e7fVar.isEmpty() && e7fVarA0.isEmpty()) {
                    e7fVarE = e7fVar;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) lqbVar.b).values();
                    collectionValues.getClass();
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        k10 k10Var = (k10) e7fVar.a.get(iIntValue);
                        k10 k10Var2 = (k10) e7fVarA0.a.get(iIntValue);
                        if (k10Var != null) {
                            if (k10Var2 != null) {
                                h10 j10Var = k10Var.a;
                                h10 h10Var = k10Var2.a;
                                j10Var.getClass();
                                h10Var.getClass();
                                if (j10Var.isEmpty()) {
                                    j10Var = h10Var;
                                } else if (!h10Var.isEmpty()) {
                                    j10Var = new j10(new h10[]{j10Var, h10Var});
                                }
                                k10Var = new k10(j10Var);
                            }
                            k10Var2 = k10Var;
                        } else if (k10Var2 == null) {
                            k10Var2 = null;
                        } else if (k10Var != null) {
                            h10 j10Var2 = k10Var2.a;
                            h10 h10Var2 = k10Var.a;
                            j10Var2.getClass();
                            h10Var2.getClass();
                            if (j10Var2.isEmpty()) {
                                j10Var2 = h10Var2;
                            } else if (!h10Var2.isEmpty()) {
                                j10Var2 = new j10(new h10[]{j10Var2, h10Var2});
                            }
                            k10Var2 = new k10(j10Var2);
                        }
                        if (k10Var2 != null) {
                            arrayList.add(k10Var2);
                        }
                    }
                    e7fVarE = lqb.e(arrayList);
                }
            }
            tjdVarD = w6c.u(tjdVarD, null, e7fVarE, 1);
        }
        tjd tjdVarJ = w8f.j(tjdVarD, z2);
        if (!z3) {
            return tjdVarJ;
        }
        k5 k5Var = s04Var.w;
        k5Var.getClass();
        return o7c.E(tjdVarJ, rxg.U(cr8.b, e7fVar, k5Var, (List) kxaVar.c, z2));
    }

    public i8f j(i8f i8fVar, kxa kxaVar, c8f c8fVar, int i) {
        dsf dsfVarX;
        s04 s04Var = (s04) kxaVar.b;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + s04Var.getName());
        }
        if (i8fVar.c()) {
            c8fVar.getClass();
            return w8f.k(c8fVar);
        }
        tt7 tt7VarB = i8fVar.b();
        tt7VarB.getClass();
        j7f j7fVarC0 = tt7VarB.c0();
        j7fVarC0.getClass();
        y22 y22VarM = j7fVarC0.m();
        i8f i8fVar2 = y22VarM instanceof c8f ? (i8f) ((Map) kxaVar.d).get(y22VarM) : null;
        int i2 = 0;
        dsf dsfVar = dsf.INVARIANT;
        if (i8fVar2 == null) {
            tjd tjdVarD = w6c.d(i8fVar.b().k0());
            if (!i7h.x(tjdVarD) && w8f.c(tjdVarD, vic.S0, null)) {
                j7f j7fVarC1 = tjdVarD.c0();
                y22 y22VarM2 = j7fVarC1.m();
                j7fVarC1.getParameters().size();
                tjdVarD.Z().size();
                if (!(y22VarM2 instanceof c8f)) {
                    if (!(y22VarM2 instanceof s04)) {
                        tjd tjdVarL = l(tjdVarD, kxaVar, i);
                        q8f.d(tjdVarL);
                        for (Object obj : tjdVarL.Z()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                t72.Z();
                                throw null;
                            }
                            i8f i8fVar3 = (i8f) obj;
                            if (!i8fVar3.c()) {
                                tt7 tt7VarB2 = i8fVar3.b();
                                tt7VarB2.getClass();
                                if (!w8f.c(tt7VarB2, vic.R0, null)) {
                                }
                            }
                            i2 = i3;
                        }
                        return new dzd(tjdVarL, i8fVar.a());
                    }
                    s04 s04Var2 = (s04) y22VarM2;
                    if (kxaVar.g(s04Var2)) {
                        String str = s04Var2.getName().a;
                        str.getClass();
                        return new dzd(sy4.c(qy4.d, str), dsfVar);
                    }
                    List listZ = tjdVarD.Z();
                    ArrayList arrayList = new ArrayList(t72.u(listZ, 10));
                    for (Object obj2 : listZ) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            t72.Z();
                            throw null;
                        }
                        arrayList.add(j((i8f) obj2, kxaVar, (c8f) j7fVarC1.getParameters().get(i2), i + 1));
                        i2 = i4;
                    }
                    List parameters = s04Var2.w.getParameters();
                    ArrayList arrayList2 = new ArrayList(t72.u(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((c8f) it.next()).a());
                    }
                    return new dzd(o7c.E(i(new kxa(kxaVar, s04Var2, arrayList, bm8.W(s72.r1(arrayList2, arrayList))), tjdVarD.a0(), tjdVarD.i0(), i + 1, false), l(tjdVarD, kxaVar, i)), i8fVar.a());
                }
            }
            return i8fVar;
        }
        if (i8fVar2.c()) {
            c8fVar.getClass();
            return w8f.k(c8fVar);
        }
        jgf jgfVarK0 = i8fVar2.b().k0();
        dsf dsfVarA = i8fVar2.a();
        dsfVarA.getClass();
        dsf dsfVarA2 = i8fVar.a();
        dsfVarA2.getClass();
        if (dsfVarA2 != dsfVarA && dsfVarA2 != dsfVar && dsfVarA == dsfVar) {
            dsfVarA = dsfVarA2;
        }
        if (c8fVar == null || (dsfVarX = c8fVar.x()) == null) {
            dsfVarX = dsfVar;
        }
        if (dsfVarX == dsfVarA || dsfVarX == dsfVar || dsfVarA != dsfVar) {
            dsfVar = dsfVarA;
        }
        g(tt7VarB.getAnnotations(), jgfVarK0.getAnnotations());
        tjd tjdVarJ = w8f.j(w6c.d(jgfVarK0), tt7VarB.i0());
        e7f e7fVarA0 = tt7VarB.a0();
        if (!i7h.x(tjdVarJ)) {
            if (i7h.x(tjdVarJ)) {
                e7fVarA0 = tjdVarJ.a0();
            } else {
                e7f e7fVarA1 = tjdVarJ.a0();
                e7fVarA0.getClass();
                lqb lqbVar = e7f.b;
                e7fVarA1.getClass();
                if (!e7fVarA0.isEmpty() || !e7fVarA1.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) lqbVar.b).values();
                    collectionValues.getClass();
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        k10 k10Var = (k10) e7fVarA0.a.get(iIntValue);
                        k10 k10Var2 = (k10) e7fVarA1.a.get(iIntValue);
                        if (k10Var != null) {
                            if (k10Var2 != null) {
                                h10 j10Var = k10Var.a;
                                h10 h10Var = k10Var2.a;
                                j10Var.getClass();
                                h10Var.getClass();
                                if (j10Var.isEmpty()) {
                                    j10Var = h10Var;
                                } else if (!h10Var.isEmpty()) {
                                    j10Var = new j10(new h10[]{j10Var, h10Var});
                                }
                                k10Var = new k10(j10Var);
                            }
                            k10Var2 = k10Var;
                        } else if (k10Var2 == null) {
                            k10Var2 = null;
                        } else if (k10Var != null) {
                            h10 j10Var2 = k10Var2.a;
                            h10 h10Var2 = k10Var.a;
                            j10Var2.getClass();
                            h10Var2.getClass();
                            if (j10Var2.isEmpty()) {
                                j10Var2 = h10Var2;
                            } else if (!h10Var2.isEmpty()) {
                                j10Var2 = new j10(new h10[]{j10Var2, h10Var2});
                            }
                            k10Var2 = new k10(j10Var2);
                        }
                        if (k10Var2 != null) {
                            arrayList3.add(k10Var2);
                        }
                    }
                    e7fVarA0 = lqb.e(arrayList3);
                }
            }
            tjdVarJ = w6c.u(tjdVarJ, null, e7fVarA0, 1);
        }
        return new dzd(tjdVarJ, dsfVar);
    }

    public tjd l(tjd tjdVar, kxa kxaVar, int i) {
        j7f j7fVarC0 = tjdVar.c0();
        List listZ = tjdVar.Z();
        ArrayList arrayList = new ArrayList(t72.u(listZ, 10));
        int i2 = 0;
        for (Object obj : listZ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                t72.Z();
                throw null;
            }
            i8f i8fVar = (i8f) obj;
            i8f i8fVarJ = j(i8fVar, kxaVar, (c8f) j7fVarC0.getParameters().get(i2), i + 1);
            if (!i8fVarJ.c()) {
                i8fVarJ = new dzd(w8f.i(i8fVarJ.b(), i8fVar.b().i0()), i8fVarJ.a());
            }
            arrayList.add(i8fVarJ);
            i2 = i3;
        }
        return w6c.u(tjdVar, arrayList, null, 2);
    }

    @Override // defpackage.d8e
    public int w0(rr5 rr5Var) {
        return 1;
    }

    @Override // defpackage.ifg
    public int a(int i) {
        return i;
    }
}
