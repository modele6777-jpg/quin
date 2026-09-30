package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fm9 implements u91 {
    public final otb a;
    public final Object b;
    public final Object[] c;
    public final hm9 d;
    public final cu2 e;
    public volatile boolean f;
    public cib g;
    public Throwable v;
    public boolean w;

    public fm9(otb otbVar, Object obj, Object[] objArr, hm9 hm9Var, cu2 cu2Var) {
        this.a = otbVar;
        this.b = obj;
        this.c = objArr;
        this.d = hm9Var;
        this.e = cu2Var;
    }

    @Override // defpackage.u91
    public final synchronized btb C0() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((cib) b()).b;
    }

    @Override // defpackage.u91
    public final boolean U() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            try {
                cib cibVar = this.g;
                if (cibVar == null || !cibVar.F0) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final cib a() {
        bt6 bt6Var;
        ct6 ct6VarA;
        otb otbVar = this.a;
        n16[] n16VarArr = otbVar.k;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length != n16VarArr.length) {
            qc0.j(tec.g(n16VarArr.length, ")", ub3.n(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        htb htbVar = new htb(otbVar.d, otbVar.c, otbVar.e, otbVar.f, otbVar.g, otbVar.h, otbVar.i, otbVar.j);
        if (otbVar.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            n16VarArr[i].t(htbVar, objArr[i]);
        }
        ct6 ct6Var = htbVar.b;
        bt6 bt6Var2 = htbVar.d;
        if (bt6Var2 != null) {
            ct6VarA = bt6Var2.a();
        } else {
            String str = htbVar.c;
            str.getClass();
            try {
                bt6Var = new bt6();
                bt6Var.d(ct6Var, str);
            } catch (IllegalArgumentException unused) {
                bt6Var = null;
            }
            ct6 ct6VarA2 = bt6Var != null ? bt6Var.a() : null;
            if (ct6VarA2 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(ct6Var);
                s8f.l(sb, ", Relative: ", htbVar.c);
                return null;
            }
            ct6VarA = ct6VarA2;
        }
        ftb gtbVar = htbVar.k;
        if (gtbVar == null) {
            w84 w84Var = htbVar.j;
            if (w84Var != null) {
                gtbVar = new or5((ArrayList) w84Var.b, (ArrayList) w84Var.c);
            } else {
                gg7 gg7Var = htbVar.i;
                if (gg7Var != null) {
                    ArrayList arrayList2 = (ArrayList) gg7Var.d;
                    if (arrayList2.isEmpty()) {
                        qc0.p("Multipart body must have at least one part.");
                        return null;
                    }
                    gtbVar = new f69((a71) gg7Var.b, (oq8) gg7Var.c, keg.j(arrayList2));
                } else if (htbVar.h) {
                    int i2 = ftb.a;
                    ieg.a(0L, 0L, 0L);
                    gtbVar = new etb(null, 0, new byte[0]);
                }
            }
        }
        oq8 oq8Var = htbVar.g;
        qi6 qi6Var = htbVar.f;
        if (oq8Var != null) {
            if (gtbVar != null) {
                gtbVar = new gtb(gtbVar, oq8Var);
            } else {
                qi6Var.a("Content-Type", oq8Var.a);
            }
        }
        zsb zsbVar = htbVar.e;
        zsbVar.a = ct6VarA;
        qi6Var.getClass();
        zsbVar.c = xdc.j(xdc.h(qi6Var));
        zsbVar.b(htbVar.a, gtbVar);
        zsbVar.e = zsbVar.e.p(job.a.b(zc7.class), new zc7(otbVar.a, this.b, otbVar.b, arrayList));
        btb btbVar = new btb(zsbVar);
        hm9 hm9Var = this.d;
        hm9Var.getClass();
        return new cib(hm9Var, btbVar);
    }

    public final v91 b() throws IOException {
        cib cibVar = this.g;
        if (cibVar != null) {
            return cibVar;
        }
        Throwable th = this.v;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            cib cibVarA = a();
            this.g = cibVarA;
            return cibVarA;
        } catch (IOException | Error | RuntimeException e) {
            an1.Q(e);
            this.v = e;
            throw e;
        }
    }

    public final qyb c(ryb rybVar) throws IOException {
        vyb vybVar = rybVar.g;
        pyb pybVarH = rybVar.h();
        pybVarH.g = new em9(vybVar.l(), vybVar.h());
        ryb rybVarA = pybVarH.a();
        boolean z = rybVarA.F0;
        int i = rybVarA.d;
        if (i < 200 || i >= 300) {
            try {
                f41 f41Var = new f41();
                vybVar.P0().a0(f41Var);
                tyb tybVar = new tyb(vybVar.l(), vybVar.h(), f41Var);
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                qyb qybVar = new qyb(rybVarA, null, tybVar);
                vybVar.close();
                return qybVar;
            } catch (Throwable th) {
                vybVar.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            vybVar.close();
            if (z) {
                return new qyb(rybVarA, null, null);
            }
            qc0.j("rawResponse must be successful response");
            return null;
        }
        dm9 dm9Var = new dm9(vybVar);
        try {
            Object objV = this.e.v(dm9Var);
            if (z) {
                return new qyb(rybVarA, objV, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = dm9Var.e;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // defpackage.u91
    public final void cancel() {
        cib cibVar;
        this.f = true;
        synchronized (this) {
            cibVar = this.g;
        }
        if (cibVar != null) {
            cibVar.cancel();
        }
    }

    @Override // defpackage.u91
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final u91 mo16clone() {
        return new fm9(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.u91
    public final void x(ha1 ha1Var) {
        cib cibVar;
        Throwable th;
        synchronized (this) {
            try {
                if (this.w) {
                    throw new IllegalStateException("Already executed.");
                }
                this.w = true;
                cibVar = this.g;
                th = this.v;
                if (cibVar == null && th == null) {
                    try {
                        cib cibVarA = a();
                        this.g = cibVarA;
                        cibVar = cibVarA;
                    } catch (Throwable th2) {
                        th = th2;
                        an1.Q(th);
                        this.v = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            ha1Var.w(this, th);
            return;
        }
        if (this.f) {
            cibVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(cibVar, new fz3(this, ha1Var, 25));
    }

    public final Object clone() {
        return new fm9(this.a, this.b, this.c, this.d, this.e);
    }
}
