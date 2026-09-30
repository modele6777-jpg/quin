package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hxa {
    public final Uri b;
    public final r1e c;
    public final ta0 d;
    public final lxa e;
    public final nh2 f;
    public volatile boolean h;
    public long j;
    public k1f l;
    public boolean m;
    public final /* synthetic */ lxa n;
    public final d82 g = new d82(6);
    public boolean i = true;
    public final long a = v98.a.getAndIncrement();
    public dc3 k = a(0, null);

    public hxa(lxa lxaVar, Uri uri, ac3 ac3Var, ta0 ta0Var, lxa lxaVar2, nh2 nh2Var) {
        this.n = lxaVar;
        this.b = uri;
        this.c = new r1e(ac3Var);
        this.d = ta0Var;
        this.e = lxaVar2;
        this.f = nh2Var;
    }

    public final dc3 a(long j, String str) {
        Map mapE = lxa.i1;
        if (str != null && !str.startsWith("W/")) {
            os osVarB = ny6.b();
            osVarB.r(mapE.entrySet());
            osVarB.q("If-Range", str);
            mapE = osVarB.e(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.b;
        pa7.F(uri, "The uri must be set.");
        return new dc3(uri, 0L, 1, null, mapE, j, -1L, null, 6);
    }

    public final void b() {
        ac3 lu6Var;
        l95 l95Var;
        int i;
        int iE = 0;
        String str = null;
        while (iE == 0 && !this.h) {
            try {
                long j = this.g.b;
                dc3 dc3VarA = a(j, str);
                this.k = dc3VarA;
                long jB = this.c.b(dc3VarA);
                if (this.h) {
                    if (iE != 1 && this.d.t() != -1) {
                        this.g.b = this.d.t();
                    }
                    r1e r1eVar = this.c;
                    if (r1eVar != null) {
                        try {
                            r1eVar.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                List list = (List) this.c.a.i().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jB != -1) {
                    jB += j;
                    lxa lxaVar = this.n;
                    lxaVar.F0.post(new dxa(lxaVar, 0));
                }
                long j2 = jB;
                this.n.H0 = nu6.d(this.c.a.i());
                r1e r1eVar2 = this.c;
                nu6 nu6Var = this.n.H0;
                if (nu6Var == null || (i = nu6Var.f) == -1) {
                    lu6Var = r1eVar2;
                } else {
                    lu6Var = new lu6(r1eVar2, i, this);
                    k1f k1fVarA = this.n.A(new jxa(0, true));
                    this.l = k1fVarA;
                    k1fVarA.g(lxa.j1);
                }
                this.d.H(lu6Var, this.b, this.c.a.i(), j, j2, this.e);
                if (this.n.H0 != null && (l95Var = (l95) this.d.d) != null && (l95Var instanceof i49)) {
                    ((i49) l95Var).s = true;
                }
                if (this.i) {
                    ta0 ta0Var = this.d;
                    long j3 = this.j;
                    l95 l95Var2 = (l95) ta0Var.d;
                    l95Var2.getClass();
                    l95Var2.c(j, j3);
                    this.i = false;
                }
                while (iE == 0 && !this.h) {
                    try {
                        nh2 nh2Var = this.f;
                        synchronized (nh2Var) {
                            while (!nh2Var.b) {
                                try {
                                    nh2Var.a.getClass();
                                    nh2Var.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        ta0 ta0Var2 = this.d;
                        d82 d82Var = this.g;
                        l95 l95Var3 = (l95) ta0Var2.d;
                        l95Var3.getClass();
                        rq3 rq3Var = (rq3) ta0Var2.b;
                        rq3Var.getClass();
                        iE = l95Var3.e(rq3Var, d82Var);
                        long jT = this.d.t();
                        if (jT > this.n.w + j) {
                            nh2 nh2Var2 = this.f;
                            synchronized (nh2Var2) {
                                nh2Var2.b = false;
                            }
                            lxa lxaVar2 = this.n;
                            lxaVar2.F0.post(lxaVar2.E0);
                            j = jT;
                        }
                    } catch (InterruptedException unused2) {
                        throw new InterruptedIOException();
                    }
                }
                if (iE == 1) {
                    iE = 0;
                } else if (this.d.t() != -1) {
                    this.g.b = this.d.t();
                }
                r1e r1eVar3 = this.c;
                if (r1eVar3 != null) {
                    try {
                        r1eVar3.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th2) {
                if (iE != 1 && this.d.t() != -1) {
                    this.g.b = this.d.t();
                }
                r1e r1eVar4 = this.c;
                if (r1eVar4 != null) {
                    try {
                        r1eVar4.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th2;
            }
        }
    }
}
