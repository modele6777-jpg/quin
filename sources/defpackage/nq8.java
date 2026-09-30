package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nq8 {
    public final uha a;
    public final lp3 b;
    public final g55 f;
    public final ro3 i;
    public final jce j;
    public boolean l;
    public ggd k = new ggd();
    public final IdentityHashMap d = new IdentityHashMap();
    public final HashMap e = new HashMap();
    public final ArrayList c = new ArrayList();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();

    public nq8(g55 g55Var, ro3 ro3Var, jce jceVar, uha uhaVar, lp3 lp3Var) {
        this.a = uhaVar;
        this.b = lp3Var;
        this.f = g55Var;
        this.i = ro3Var;
        this.j = jceVar;
    }

    public final gye a(int i, ArrayList arrayList, ggd ggdVar) {
        if (!arrayList.isEmpty()) {
            this.k = ggdVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                mq8 mq8Var = (mq8) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.c;
                if (i2 > 0) {
                    mq8 mq8Var2 = (mq8) arrayList2.get(i2 - 1);
                    mq8Var.d = mq8Var2.a.o.b.o() + mq8Var2.d;
                    mq8Var.e = false;
                    mq8Var.c.clear();
                } else {
                    mq8Var.d = 0;
                    mq8Var.e = false;
                    mq8Var.c.clear();
                }
                int iO = mq8Var.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((mq8) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, mq8Var);
                this.e.put(mq8Var.b, mq8Var);
                if (this.l) {
                    e(mq8Var);
                    if (this.d.isEmpty()) {
                        this.h.add(mq8Var);
                    } else {
                        lq8 lq8Var = (lq8) this.g.get(mq8Var);
                        if (lq8Var != null) {
                            lq8Var.a.b(lq8Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final gye b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return gye.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            mq8 mq8Var = (mq8) arrayList.get(i);
            mq8Var.d = iO;
            iO += mq8Var.a.o.b.o();
        }
        return new eia(arrayList, this.k);
    }

    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            mq8 mq8Var = (mq8) it.next();
            if (mq8Var.c.isEmpty()) {
                lq8 lq8Var = (lq8) this.g.get(mq8Var);
                if (lq8Var != null) {
                    lq8Var.a.b(lq8Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(mq8 mq8Var) {
        if (mq8Var.e && mq8Var.c.isEmpty()) {
            lq8 lq8Var = (lq8) this.g.remove(mq8Var);
            lq8Var.getClass();
            kq8 kq8Var = lq8Var.c;
            fu0 fu0Var = lq8Var.a;
            fu0Var.n(lq8Var.b);
            fu0Var.q(kq8Var);
            fu0Var.p(kq8Var);
            this.h.remove(mq8Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aq8, hq8] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(mq8 mq8Var) {
        qm8 qm8Var = mq8Var.a;
        ?? r1 = new aq8() { // from class: hq8
            @Override // defpackage.aq8
            public final void a(fu0 fu0Var, gye gyeVar) {
                jce jceVar = this.a.f.g;
                jceVar.f(2);
                jceVar.g(22);
            }
        };
        kq8 kq8Var = new kq8(this, mq8Var);
        this.g.put(mq8Var, new lq8(qm8Var, r1, kq8Var));
        String str = pqf.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        CopyOnWriteArrayList copyOnWriteArrayList = qm8Var.c.c;
        eq8 eq8Var = new eq8();
        eq8Var.a = handler;
        eq8Var.b = kq8Var;
        copyOnWriteArrayList.add(eq8Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        CopyOnWriteArrayList copyOnWriteArrayList2 = qm8Var.d.c;
        zp4 zp4Var = new zp4();
        zp4Var.a = kq8Var;
        copyOnWriteArrayList2.add(zp4Var);
        qm8Var.j(r1, this.a, this.b);
    }

    public final void f(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.c;
            mq8 mq8Var = (mq8) arrayList.remove(i3);
            this.e.remove(mq8Var.b);
            int i4 = -mq8Var.a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((mq8) arrayList.get(i5)).d += i4;
            }
            mq8Var.e = true;
            if (this.l) {
                d(mq8Var);
            }
        }
    }
}
