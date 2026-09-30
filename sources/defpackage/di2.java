package defpackage;

import android.content.Context;
import android.os.Trace;
import android.text.format.DateUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.k;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class di2 implements cfg {
    public static final int[] w = {2, 4, 8, 16, 32, 64, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 256};
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public final Object v;

    public di2(int i) {
        switch (i) {
            case 3:
                Boolean bool = Boolean.FALSE;
                this.a = q1c.f(bool);
                this.b = new qz9(1.0f);
                this.c = q1c.f(bool);
                this.d = new qz9(1.0f);
                this.e = q1c.f(bool);
                this.f = q1c.f(new r2f(r2f.b));
                this.g = q1c.f(bool);
                this.v = q1c.f(new y72(y72.j));
                break;
            default:
                this.a = new Object();
                this.c = tx6.c;
                this.g = new HashMap();
                this.v = new HashSet();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[Catch: all -> 0x00a4, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:9:0x0070, B:11:0x0083, B:13:0x008f, B:15:0x0093, B:19:0x009e, B:20:0x00a1, B:24:0x00a7), top: B:78:0x0070, outer: #2 }] */
    public static i48 b(di2 di2Var, x48 x48Var, xi1 xi1Var, hc2 hc2Var) {
        vf vfVarH;
        pg1 pg1VarC;
        i48 i48VarB;
        Collection collectionUnmodifiableCollection;
        vf vfVar;
        boolean zContains;
        wf wfVar;
        k47 k47Var = k47.d;
        Trace.beginSection(xdc.v("CX:bindToLifecycle-internal"));
        try {
            p8c.m();
            iy9 iy9Var = new iy9(xi1Var, null);
            xi1 xi1Var2 = (xi1) iy9Var.a();
            xi1 xi1Var3 = (xi1) iy9Var.b();
            rk1 rk1Var = (rk1) di2Var.d;
            rk1Var.getClass();
            pg1 pg1VarC2 = xi1Var2.c(rk1Var.a.c());
            pg1VarC2.getClass();
            pg1VarC2.p(true);
            vf vfVarH2 = di2Var.h(xi1Var2);
            boolean z = false;
            if (xi1Var3 != null) {
                rk1 rk1Var2 = (rk1) di2Var.d;
                rk1Var2.getClass();
                pg1VarC = xi1Var3.c(rk1Var2.a.c());
                pg1VarC.p(false);
                vfVarH = di2Var.h(xi1Var3);
            } else {
                vfVarH = null;
                pg1VarC = null;
            }
            jg1 jg1VarD = m93.D(vfVarH2, vfVarH);
            m48 m48Var = (m48) di2Var.e;
            m48Var.getClass();
            synchronized (m48Var.a) {
                try {
                    i48 i48Var = (i48) m48Var.b.get(new kp0(System.identityHashCode(x48Var), jg1VarD));
                    if (i48Var != null) {
                        lk1 lk1Var = i48Var.c;
                        if (lk1Var.a.a.k() || ((wfVar = lk1Var.b) != null && wfVar.a.k())) {
                            z = true;
                        }
                        if (z) {
                            m48Var.k(i48Var);
                            i48VarB = null;
                        } else {
                            i48VarB = i48Var;
                        }
                    } else {
                        i48VarB = i48Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m48 m48Var2 = (m48) di2Var.e;
            m48Var2.getClass();
            synchronized (m48Var2.a) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(m48Var2.b.values());
            }
            for (oif oifVar : (List) hc2Var.f) {
                for (Object obj : collectionUnmodifiableCollection) {
                    obj.getClass();
                    i48 i48Var2 = (i48) obj;
                    synchronized (i48Var2.a) {
                        vfVar = vfVarH;
                        zContains = ((ArrayList) i48Var2.c.y()).contains(oifVar);
                    }
                    if (zContains && !pa7.t(i48Var2.e(), x48Var)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{oifVar}, 1)));
                    }
                    vfVarH = vfVar;
                }
            }
            vf vfVar2 = vfVarH;
            if (i48VarB == null) {
                m48 m48Var3 = (m48) di2Var.e;
                m48Var3.getClass();
                rk1 rk1Var3 = (rk1) di2Var.d;
                rk1Var3.getClass();
                szc szcVar = rk1Var3.k;
                if (szcVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                lk1 lk1Var2 = new lk1(pg1VarC2, pg1VarC, vfVarH2, vfVar2, k47Var, k47Var, (if1) szcVar.c, (vea) szcVar.e, (akf) szcVar.d);
                rk1 rk1Var4 = (rk1) di2Var.d;
                rk1Var4.getClass();
                i48VarB = m48Var3.b(x48Var, lk1Var2, (u6c) rk1Var4.o.getValue());
            }
            if (!((List) hc2Var.f).isEmpty()) {
                m48 m48Var4 = (m48) di2Var.e;
                m48Var4.getClass();
                rk1 rk1Var5 = (rk1) di2Var.d;
                rk1Var5.getClass();
                wo0 wo0Var = rk1Var5.g;
                if (wo0Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                m48Var4.a(i48VarB, hc2Var, (if1) wo0Var.f);
                ((HashSet) di2Var.v).add(new kp0(System.identityHashCode(x48Var), jg1VarD));
            }
            Trace.endSection();
            return i48VarB;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // defpackage.cfg
    public Object a() {
        Object objA = ((bfg) this.a).a();
        Object objA2 = ((bfg) this.b).a();
        Object objA3 = ((bfg) this.c).a();
        Object objA4 = ((bfg) this.d).a();
        return new zfg((k) objA, (egg) objA2, (vgg) objA3, (sfg) objA4, new bfg(new fnb((bfg) this.e)), new bfg(new fnb((yea) this.f)), (kfg) ((bfg) this.g).a(), new bfg(new fnb((bfg) this.v)));
    }

    public mib c() {
        lw7 lw7Var;
        ec2 ec2Var;
        Context context = (Context) this.a;
        qw6 qw6Var = (qw6) this.b;
        qw6 qw6Var2 = new qw6(qw6Var.a, qw6Var.b, qw6Var.c, qw6Var.d, qw6Var.e, qw6Var.f, qw6Var.g, qw6Var.h, qw6Var.i, qw6Var.j, qw6Var.k, qw6Var.l, qw6Var.m, new r95(vpf.U(((p95) this.v).a)));
        lw7 aceVar = (lw7) this.c;
        int i = 0;
        if (aceVar == null) {
            aceVar = new ace(new yv6(i));
        }
        lw7 aceVar2 = (lw7) this.d;
        if (aceVar2 == null) {
            aceVar2 = new ace(new zv6(i, this));
        }
        lw7 aceVar3 = (lw7) this.e;
        if (aceVar3 == null) {
            aceVar3 = new ace(new yv6(1));
        }
        l81 l81Var = (l81) this.f;
        if (l81Var == null) {
            l81Var = l81.d;
        }
        ec2 ec2Var2 = (ec2) this.g;
        if (ec2Var2 == null) {
            pu4 pu4Var = pu4.a;
            ec2Var = new ec2(pu4Var, pu4Var, pu4Var, pu4Var, pu4Var);
            lw7Var = aceVar3;
        } else {
            lw7Var = aceVar3;
            ec2Var = ec2Var2;
        }
        return new mib(new hib(context, qw6Var2, aceVar, aceVar2, lw7Var, l81Var, ec2Var));
    }

    public bi2 d(String str, String str2, Date date, HashMap map) throws hg5, kg5, mg5 {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = ((ConfigFetchHttpClient) this.f).b();
            ConfigFetchHttpClient configFetchHttpClient = (ConfigFetchHttpClient) this.f;
            HashMap mapI = i();
            String string = ((li2) this.g).a.getString("last_fetch_etag", null);
            ml mlVar = (ml) ((i1b) this.b).get();
            bi2 bi2VarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapI, string, map, mlVar != null ? (Long) ((nl) mlVar).a.a.a(null, null, true).get("_fot") : null, date, ((li2) this.g).b());
            yh2 yh2Var = bi2VarFetch.b;
            if (yh2Var != null) {
                li2 li2Var = (li2) this.g;
                long j = yh2Var.f;
                synchronized (li2Var.b) {
                    li2Var.a.edit().putLong("last_template_version", j).apply();
                }
            }
            String str4 = bi2VarFetch.c;
            if (str4 != null) {
                li2 li2Var2 = (li2) this.g;
                synchronized (li2Var2.b) {
                    li2Var2.a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            ((li2) this.g).d(0, li2.f);
            return bi2VarFetch;
        } catch (mg5 e) {
            int iA = e.a();
            li2 li2Var3 = (li2) this.g;
            if (iA == 429 || iA == 502 || iA == 503 || iA == 504) {
                int i = li2Var3.a().a + 1;
                long millis = TimeUnit.MINUTES.toMillis(w[Math.min(i, 8) - 1]);
                li2Var3.d(i, new Date(date.getTime() + (millis / 2) + ((long) ((Random) this.d).nextInt((int) millis))));
            }
            ki2 ki2VarA = li2Var3.a();
            int iA2 = e.a();
            if (ki2VarA.a > 1 || iA2 == 429) {
                throw new kg5("Fetch was throttled.", ki2VarA.b.getTime());
            }
            int iA3 = e.a();
            if (iA3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (iA3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (iA3 == 429) {
                    throw new hg5("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (iA3 != 500) {
                    switch (iA3) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new mg5(e.a(), "Fetch failed: ".concat(str3), e);
        }
    }

    public Task e(Task task, long j, HashMap map) {
        di2 di2Var;
        Task taskG;
        Executor executor = (Executor) this.c;
        of5 of5Var = (of5) this.a;
        li2 li2Var = (li2) this.g;
        Date date = new Date(System.currentTimeMillis());
        if (task.m()) {
            Date date2 = new Date(li2Var.a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(li2.e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()))) {
                return Tasks.d(new bi2(2, null, null));
            }
        }
        Date date3 = li2Var.a().b;
        Date date4 = date.before(date3) ? date3 : null;
        if (date4 != null) {
            taskG = Tasks.c(new kg5(ub3.i("Fetch is throttled. Please wait before calling fetch again: ", DateUtils.formatElapsedTime((date4.getTime() - date.getTime()) / 1000)), date4.getTime()));
            di2Var = this;
        } else {
            nf5 nf5Var = (nf5) of5Var;
            gfh gfhVarC = nf5Var.c();
            gfh gfhVarD = nf5Var.d();
            di2Var = this;
            taskG = Tasks.f(gfhVarC, gfhVarD).g(executor, new ai2(di2Var, gfhVarC, gfhVarD, date, map));
        }
        return taskG.g(executor, new bo1(3, di2Var, date));
    }

    public Task f(int i) {
        HashMap map = new HashMap((Map) this.v);
        map.put("X-Firebase-RC-Fetch-Type", ci2.REALTIME.a() + "/" + i);
        return ((wh2) this.e).b().g((Executor) this.c, new bo1(4, this, map));
    }

    public we1 g(xi1 xi1Var) {
        Iterator it = xi1Var.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ep0 ep0Var = x38.b;
            if (!pa7.t(ep0Var, ep0Var)) {
                synchronized (f85.a) {
                }
                ((Context) this.f).getClass();
            }
        }
        return xe1.a;
    }

    public vf h(xi1 xi1Var) {
        Object vfVar;
        Trace.beginSection(xdc.v("CX:getCameraInfo"));
        try {
            rk1 rk1Var = (rk1) this.d;
            rk1Var.getClass();
            ng1 ng1VarQ = xi1Var.c(rk1Var.a.c()).q();
            ng1VarQ.getClass();
            we1 we1VarG = g(xi1Var);
            String strD = ng1VarQ.d();
            strD.getClass();
            jg1 jg1VarV = m93.v(strD, null, we1VarG.a);
            synchronized (this.a) {
                vfVar = ((HashMap) this.g).get(jg1VarV);
                if (vfVar == null) {
                    vfVar = new vf(ng1VarQ, we1VarG);
                    ((HashMap) this.g).put(jg1VarV, vfVar);
                }
            }
            vf vfVar2 = (vf) vfVar;
            Trace.endSection();
            return vfVar2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public HashMap i() {
        HashMap map = new HashMap();
        ml mlVar = (ml) ((i1b) this.b).get();
        if (mlVar != null) {
            for (Map.Entry entry : ((nl) mlVar).a.a.a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    public void j(rk1 rk1Var, Context context) {
        uh1 uh1Var;
        synchronized (this.a) {
            this.d = rk1Var;
            this.f = context;
            if (rk1Var != null && (uh1Var = rk1Var.n) != null) {
                ScheduledExecutorService scheduledExecutorServiceW = ok8.w();
                scheduledExecutorServiceW.getClass();
                uh1Var.n.add(new th1(this, scheduledExecutorServiceW));
                ((ah6) scheduledExecutorServiceW).execute(new qh1(uh1Var, this));
            }
        }
    }

    public void k(int i) {
        vi1 vi1Var;
        rk1 rk1Var = (rk1) this.d;
        if (rk1Var != null) {
            rk1Var.getClass();
            wo0 wo0Var = rk1Var.g;
            if (wo0Var == null) {
                qc0.p("CameraX not initialized yet.");
                return;
            }
            if1 if1Var = (if1) wo0Var.f;
            synchronized (if1Var.b) {
                if1Var.e = i;
                vi1Var = if1Var.c;
            }
            if (vi1Var == null) {
                return;
            }
            if1Var.f = i == 2;
            Iterator it = vi1Var.c().iterator();
            it.getClass();
            while (it.hasNext()) {
                pg1 pg1Var = (pg1) it.next();
                sg1 sg1Var = pg1Var instanceof sg1 ? (sg1) pg1Var : null;
                if (sg1Var != null) {
                    if (i == 1) {
                        ekf ekfVar = sg1Var.a;
                        synchronized (ekfVar.k) {
                            ekfVar.o = true;
                        }
                    } else if (i != 2) {
                        continue;
                    } else {
                        ekf ekfVar2 = sg1Var.a;
                        synchronized (ekfVar2.k) {
                            ekfVar2.o = false;
                        }
                    }
                }
            }
        }
    }

    public void l() {
        Trace.beginSection(xdc.v("CX:unbindAll"));
        try {
            p8c.m();
            k(0);
            m48 m48Var = (m48) this.e;
            m48Var.getClass();
            m48Var.j((HashSet) this.v);
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ di2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.v = obj8;
    }

    public di2(Context context) {
        this.a = context.getApplicationContext();
        this.b = qw6.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.v = new p95();
    }

    public di2(hib hibVar) {
        this.a = hibVar.a;
        qw6 qw6Var = hibVar.b;
        this.b = qw6Var;
        this.c = hibVar.c;
        this.d = hibVar.d;
        this.e = hibVar.e;
        this.f = hibVar.f;
        this.g = hibVar.g;
        r95 r95Var = qw6Var.n;
        r95Var.getClass();
        this.v = new p95(r95Var);
    }
}
