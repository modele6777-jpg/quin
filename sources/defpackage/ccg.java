package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ccg {
    public final lbg a;
    public final Context b;
    public final String c;
    public final bbg d;
    public final si2 e;
    public final vva f;
    public final WorkDatabase g;
    public final nbg h;
    public final bx3 i;
    public final ArrayList j;
    public final String k;
    public final fg7 l;

    public ccg(hc2 hc2Var) {
        lbg lbgVar = (lbg) hc2Var.f;
        this.a = lbgVar;
        this.b = (Context) hc2Var.v;
        String str = lbgVar.a;
        this.c = str;
        this.d = (bbg) hc2Var.c;
        this.e = (si2) hc2Var.b;
        this.f = (vva) hc2Var.d;
        WorkDatabase workDatabase = (WorkDatabase) hc2Var.e;
        this.g = workDatabase;
        this.h = workDatabase.x();
        this.i = workDatabase.s();
        ArrayList arrayList = (ArrayList) hc2Var.g;
        this.j = arrayList;
        this.k = ks0.l(tec.p("Work [ id=", str, ", tags={ "), s72.D0(arrayList, ",", null, null, null, 62), " } ]");
        this.l = tq.d();
    }

    public final void a(int i) {
        nbg nbgVar = this.h;
        vag vagVar = vag.a;
        String str = this.c;
        nbgVar.h(vagVar, str);
        nbgVar.g(System.currentTimeMillis(), str);
        nbgVar.f(this.a.v, str);
        nbgVar.e(-1L, str);
        nbgVar.i(i, str);
    }

    public final void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        nbg nbgVar = this.h;
        String str = this.c;
        nbgVar.g(jCurrentTimeMillis, str);
        nbgVar.h(vag.a, str);
        w5c w5cVar = nbgVar.a;
        ((Number) urg.I(w5cVar, false, true, new alc(str, 23))).intValue();
        nbgVar.f(this.a.v, str);
        urg.I(w5cVar, false, true, new alc(str, 24));
        nbgVar.e(-1L, str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object c(zn2 zn2Var) throws Throwable {
        acg acgVar;
        OverwritingInputMerger overwritingInputMerger;
        bb3 bb3VarI;
        lbg lbgVar = this.a;
        String str = lbgVar.c;
        String str2 = lbgVar.d;
        if (zn2Var instanceof acg) {
            acgVar = (acg) zn2Var;
            int i = acgVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                acgVar.label = i - Integer.MIN_VALUE;
            } else {
                acgVar = new acg(this, zn2Var);
            }
        } else {
            acgVar = new acg(this, zn2Var);
        }
        acg acgVar2 = acgVar;
        Object objP0 = acgVar2.result;
        int i2 = acgVar2.label;
        String str3 = this.k;
        try {
            if (i2 == 0) {
                jzb.q(objP0);
                boolean zR = xdc.r();
                String str4 = lbgVar.x;
                if (zR && str4 != null) {
                    xdc.f(lbgVar.hashCode(), str4);
                }
                final int i3 = 0;
                hla hlaVar = new hla(10, new Callable(this) { // from class: tbg
                    public final /* synthetic */ ccg b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i4 = i3;
                        vag vagVar = vag.a;
                        ccg ccgVar = this.b;
                        switch (i4) {
                            case 0:
                                lbg lbgVar2 = ccgVar.a;
                                String str5 = lbgVar2.c;
                                if (lbgVar2.b != vagVar) {
                                    String str6 = dcg.a;
                                    ff8.h().e(str6, str5 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if ((!lbgVar2.b() && (lbgVar2.b != vagVar || lbgVar2.k <= 0)) || System.currentTimeMillis() >= lbgVar2.a()) {
                                    return Boolean.FALSE;
                                }
                                ff8.h().e(dcg.a, "Delaying execution for " + str5 + " because it is being executed before schedule.");
                                return Boolean.TRUE;
                            default:
                                nbg nbgVar = ccgVar.h;
                                String str7 = ccgVar.c;
                                boolean z = false;
                                if (nbgVar.c(str7) == vagVar) {
                                    nbgVar.h(vag.b, str7);
                                    ((Number) urg.I(nbgVar.a, false, true, new alc(str7, 26))).intValue();
                                    nbgVar.i(-256, str7);
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                });
                WorkDatabase workDatabase = this.g;
                if (((Boolean) workDatabase.p(hlaVar)).booleanValue()) {
                    return new wbg();
                }
                boolean zB = lbgVar.b();
                String str5 = this.c;
                if (zB) {
                    bb3VarI = lbgVar.e;
                } else {
                    str2.getClass();
                    String str6 = i47.a;
                    try {
                        Object objNewInstance = Class.forName(str2).getDeclaredConstructor(null).newInstance(null);
                        objNewInstance.getClass();
                        overwritingInputMerger = (OverwritingInputMerger) objNewInstance;
                    } catch (Exception e) {
                        ff8.h().g(i47.a, "Trouble instantiating ".concat(str2), e);
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger == null) {
                        String str7 = dcg.a;
                        ff8.h().f(str7, "Could not create Input Merger " + str2);
                        return new ubg();
                    }
                    List listH = t72.H(lbgVar.e);
                    nbg nbgVar = this.h;
                    nbgVar.getClass();
                    str5.getClass();
                    ArrayList arrayListQ0 = s72.Q0(listH, (List) urg.I(nbgVar.a, true, false, new alc(str5, 25)));
                    kb6 kb6Var = new kb6(11);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayListQ0.iterator();
                    while (it.hasNext()) {
                        Map mapUnmodifiableMap = Collections.unmodifiableMap(((bb3) it.next()).a);
                        mapUnmodifiableMap.getClass();
                        linkedHashMap.putAll(mapUnmodifiableMap);
                    }
                    kb6Var.p(linkedHashMap);
                    bb3VarI = kb6Var.i();
                }
                UUID uuidFromString = UUID.fromString(str5);
                int i4 = lbgVar.k;
                si2 si2Var = this.e;
                ExecutorService executorService = si2Var.a;
                js3 js3Var = si2Var.b;
                bbg bbgVar = this.d;
                gbg gbgVar = new gbg(workDatabase, bbgVar);
                sag sagVar = new sag(workDatabase, this.f, bbgVar);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.a = uuidFromString;
                workerParameters.b = bb3VarI;
                new HashSet(this.j);
                workerParameters.c = i4;
                workerParameters.d = executorService;
                workerParameters.e = js3Var;
                workerParameters.f = gbgVar;
                try {
                    v88 v88VarT = af8.v.t(this.b, str, workerParameters);
                    final int i5 = 1;
                    v88VarT.d = true;
                    nv2 nv2VarF0 = acgVar2.getContext().F0(ndb.Y0);
                    nv2VarF0.getClass();
                    dg7 dg7Var = (dg7) nv2VarF0;
                    dg7Var.E(new xu(v88VarT, zR, str4, this, 6));
                    Object objP = workDatabase.p(new hla(10, new Callable(this) { // from class: tbg
                        public final /* synthetic */ ccg b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i6 = i5;
                            vag vagVar = vag.a;
                            ccg ccgVar = this.b;
                            switch (i6) {
                                case 0:
                                    lbg lbgVar2 = ccgVar.a;
                                    String str8 = lbgVar2.c;
                                    if (lbgVar2.b != vagVar) {
                                        String str9 = dcg.a;
                                        ff8.h().e(str9, str8 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if ((!lbgVar2.b() && (lbgVar2.b != vagVar || lbgVar2.k <= 0)) || System.currentTimeMillis() >= lbgVar2.a()) {
                                        return Boolean.FALSE;
                                    }
                                    ff8.h().e(dcg.a, "Delaying execution for " + str8 + " because it is being executed before schedule.");
                                    return Boolean.TRUE;
                                default:
                                    nbg nbgVar2 = ccgVar.h;
                                    String str10 = ccgVar.c;
                                    boolean z = false;
                                    if (nbgVar2.c(str10) == vagVar) {
                                        nbgVar2.h(vag.b, str10);
                                        ((Number) urg.I(nbgVar2.a, false, true, new alc(str10, 26))).intValue();
                                        nbgVar2.i(-256, str10);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    }));
                    objP.getClass();
                    if (!((Boolean) objP).booleanValue()) {
                        return new wbg();
                    }
                    if (dg7Var.isCancelled()) {
                        return new wbg();
                    }
                    dd7 dd7Var = bbgVar.d;
                    dd7Var.getClass();
                    sv2 sv2VarZ = t72.z(dd7Var);
                    bcg bcgVar = new bcg(this, v88VarT, sagVar, null);
                    acgVar2.L$0 = workerParameters;
                    acgVar2.label = 1;
                    objP0 = ynb.p0(sv2VarZ, bcgVar, acgVar2);
                    bw2 bw2Var = bw2.a;
                    if (objP0 == bw2Var) {
                        return bw2Var;
                    }
                } catch (Throwable unused) {
                    String str8 = dcg.a;
                    ff8.h().f(str8, "Could not create Worker " + str);
                    return new ubg();
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objP0);
            }
            u88 u88Var = (u88) objP0;
            u88Var.getClass();
            return new vbg(u88Var);
        } catch (CancellationException e2) {
            String str9 = dcg.a;
            ff8 ff8VarH = ff8.h();
            String strConcat = str3.concat(" was cancelled");
            if (ff8VarH.b <= 4) {
                Log.i(str9, strConcat, e2);
            }
            throw e2;
        } catch (Throwable th) {
            ff8.h().g(dcg.a, str3.concat(" failed because it threw an exception/error"), th);
            return new ubg();
        }
    }

    public final void d(u88 u88Var) {
        String str = this.c;
        ArrayList arrayListK = t72.K(str);
        while (true) {
            boolean zIsEmpty = arrayListK.isEmpty();
            nbg nbgVar = this.h;
            if (zIsEmpty) {
                bb3 bb3Var = ((r88) u88Var).a;
                bb3Var.getClass();
                nbgVar.f(this.a.v, str);
                urg.I(nbgVar.a, false, true, new p0g(8, bb3Var, str));
                return;
            }
            String str2 = (String) x72.k0(arrayListK);
            if (nbgVar.c(str2) != vag.f) {
                nbgVar.h(vag.d, str2);
            }
            arrayListK.addAll(this.i.a(str2));
        }
    }
}
