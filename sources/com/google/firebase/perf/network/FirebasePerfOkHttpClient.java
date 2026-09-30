package com.google.firebase.perf.network;

import defpackage.btb;
import defpackage.cib;
import defpackage.ct6;
import defpackage.da4;
import defpackage.e4f;
import defpackage.ftb;
import defpackage.ia1;
import defpackage.ke9;
import defpackage.le9;
import defpackage.oq8;
import defpackage.oye;
import defpackage.qc0;
import defpackage.ryb;
import defpackage.sea;
import defpackage.v91;
import defpackage.vyb;
import defpackage.ws4;
import defpackage.zhb;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfOkHttpClient {
    public static void a(ryb rybVar, ke9 ke9Var, long j, long j2) {
        btb btbVar = rybVar.a;
        if (btbVar == null) {
            return;
        }
        ke9Var.j(btbVar.a.k().toString());
        ke9Var.c(btbVar.b);
        ftb ftbVar = btbVar.d;
        if (ftbVar != null) {
            long jA = ftbVar.a();
            if (jA != -1) {
                ke9Var.e(jA);
            }
        }
        vyb vybVar = rybVar.g;
        if (vybVar != null) {
            long jH = vybVar.h();
            if (jH != -1) {
                ke9Var.h(jH);
            }
            oq8 oq8VarL = vybVar.l();
            if (oq8VarL != null) {
                ke9Var.g(oq8VarL.a);
            }
        }
        ke9Var.d(rybVar.d);
        ke9Var.f(j);
        ke9Var.i(j2);
        ke9Var.b();
    }

    public static void enqueue(v91 v91Var, ia1 ia1Var) {
        oye oyeVar = new oye();
        ws4 ws4Var = new ws4(ia1Var, e4f.H0, oyeVar, oyeVar.a);
        cib cibVar = (cib) v91Var;
        cibVar.getClass();
        if (!cibVar.f.compareAndSet(false, true)) {
            qc0.p("Already Executed");
            return;
        }
        sea seaVar = sea.a;
        cibVar.g = sea.a.g();
        cibVar.d.getClass();
        da4 da4Var = cibVar.a.a;
        zhb zhbVar = new zhb(cibVar, ws4Var);
        da4Var.getClass();
        da4.e(da4Var, zhbVar, null, null, 6);
    }

    public static ryb execute(v91 v91Var) throws IOException {
        ke9 ke9Var = new ke9(e4f.H0);
        long jE = oye.e();
        long jA = oye.a();
        try {
            ryb rybVarC = ((cib) v91Var).c();
            oye.e();
            a(rybVarC, ke9Var, jE, oye.a() - jA);
            return rybVarC;
        } catch (IOException e) {
            btb btbVar = ((cib) v91Var).b;
            if (btbVar != null) {
                ct6 ct6Var = btbVar.a;
                if (ct6Var != null) {
                    ke9Var.j(ct6Var.k().toString());
                }
                String str = btbVar.b;
                if (str != null) {
                    ke9Var.c(str);
                }
            }
            ke9Var.f(jE);
            oye.e();
            ke9Var.i(oye.a() - jA);
            le9.c(ke9Var);
            throw e;
        }
    }
}
