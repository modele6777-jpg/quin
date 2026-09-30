package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eg2 extends fu0 {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override // defpackage.fu0
    public final void c() {
        for (dg2 dg2Var : this.i.values()) {
            dg2Var.a.b(dg2Var.b);
        }
    }

    @Override // defpackage.fu0
    public final void e() {
        for (dg2 dg2Var : this.i.values()) {
            dg2Var.a.d(dg2Var.b);
        }
    }

    @Override // defpackage.fu0
    public void i() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((dg2) it.next()).a.i();
        }
    }

    @Override // defpackage.fu0
    public void o() {
        HashMap map = this.i;
        for (dg2 dg2Var : map.values()) {
            fu0 fu0Var = dg2Var.a;
            cg2 cg2Var = dg2Var.c;
            fu0Var.n(dg2Var.b);
            fu0Var.q(cg2Var);
            fu0Var.p(cg2Var);
        }
        map.clear();
    }

    public abstract zp8 s(Object obj, zp8 zp8Var);

    public abstract void v(Object obj, fu0 fu0Var, gye gyeVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [aq8, bg2] */
    public final void w(final Integer num, fu0 fu0Var) {
        HashMap map = this.i;
        pa7.A(!map.containsKey(num));
        ?? r1 = new aq8() { // from class: bg2
            @Override // defpackage.aq8
            public final void a(fu0 fu0Var2, gye gyeVar) {
                this.a.v(num, fu0Var2, gyeVar);
            }
        };
        cg2 cg2Var = new cg2(this, num);
        map.put(num, new dg2(fu0Var, r1, cg2Var));
        Handler handler = this.j;
        handler.getClass();
        fu0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = fu0Var.c.c;
        eq8 eq8Var = new eq8();
        eq8Var.a = handler;
        eq8Var.b = cg2Var;
        copyOnWriteArrayList.add(eq8Var);
        this.j.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = fu0Var.d.c;
        zp4 zp4Var = new zp4();
        zp4Var.a = cg2Var;
        copyOnWriteArrayList2.add(zp4Var);
        uha uhaVar = this.g;
        uhaVar.getClass();
        lp3 lp3Var = this.h;
        lp3Var.getClass();
        fu0Var.j(r1, uhaVar, lp3Var);
        if (this.b.isEmpty()) {
            fu0Var.b(r1);
        }
    }

    public long t(long j, Object obj) {
        return j;
    }

    public int u(int i, Object obj) {
        return i;
    }
}
