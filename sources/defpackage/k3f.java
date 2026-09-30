package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k3f implements h0e {
    public boolean X;
    public final fxd Y;
    public final /* synthetic */ n3f Z;
    public final y6f a;
    public final vz9 b;
    public final vz9 c;
    public final vz9 d;
    public btc e;
    public jfe f;
    public final vz9 g;
    public final qz9 v;
    public boolean w;
    public final vz9 x;
    public b00 y;
    public final tz9 z;

    public k3f(n3f n3fVar, Object obj, b00 b00Var, y6f y6fVar) {
        this.Z = n3fVar;
        this.a = y6fVar;
        vz9 vz9VarF = q1c.f(obj);
        this.b = vz9VarF;
        Object objD = null;
        vz9 vz9VarF2 = q1c.f(b21.P(0.0f, 0.0f, 7, null));
        this.c = vz9VarF2;
        this.d = q1c.f(new jfe((ze5) vz9VarF2.getValue(), y6fVar, obj, vz9VarF.getValue(), b00Var));
        this.g = q1c.f(Boolean.TRUE);
        this.v = new qz9(-1.0f);
        this.x = q1c.f(obj);
        this.y = b00Var;
        this.z = new tz9(c().c());
        Float f = (Float) qyf.b.get(y6fVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            b00 b00Var2 = (b00) y6fVar.a.d(obj);
            int iB = b00Var2.b();
            for (int i = 0; i < iB; i++) {
                b00Var2.e(i, fFloatValue);
            }
            objD = this.a.b.d(b00Var2);
        }
        this.Y = b21.P(0.0f, 0.0f, 3, objD);
    }

    public final jfe c() {
        return (jfe) this.d.getValue();
    }

    public final void d(long j) {
        if (this.v.j() == -1.0f) {
            this.X = true;
            if (pa7.t(c().c, c().d)) {
                f(c().c);
            } else {
                f(c().g(j));
                this.y = c().e(j);
            }
        }
    }

    public final void f(Object obj) {
        this.x.setValue(obj);
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        return this.x.getValue();
    }

    public final void h(Object obj, boolean z) {
        jfe jfeVar = this.f;
        Object obj2 = jfeVar != null ? jfeVar.c : null;
        vz9 vz9Var = this.b;
        boolean zT = pa7.t(obj2, vz9Var.getValue());
        tz9 tz9Var = this.z;
        vz9 vz9Var2 = this.d;
        ze5 ze5Var = this.Y;
        if (zT) {
            vz9Var2.setValue(new jfe(ze5Var, this.a, obj, obj, this.y.c()));
            this.w = true;
            tz9Var.k(c().c());
            return;
        }
        vz9 vz9Var3 = this.c;
        if (!z || this.X || (((ze5) vz9Var3.getValue()) instanceof fxd)) {
            ze5Var = (ze5) vz9Var3.getValue();
        }
        n3f n3fVar = this.Z;
        vz9Var2.setValue(new jfe(n3fVar.e() <= 0 ? ze5Var : new fzd(ze5Var, n3fVar.e()), this.a, obj, vz9Var.getValue(), this.y));
        tz9Var.k(c().c());
        this.w = false;
        n3fVar.p(true);
        if (n3fVar.h()) {
            jsd jsdVar = n3fVar.j;
            int size = jsdVar.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                k3f k3fVar = (k3f) jsdVar.get(i);
                jMax = Math.max(jMax, k3fVar.z.j());
                k3fVar.d(0L);
            }
            n3fVar.p(false);
        }
    }

    public final void i(Object obj, Object obj2, ze5 ze5Var) {
        this.b.setValue(obj2);
        this.c.setValue(ze5Var);
        if (pa7.t(c().d, obj) && pa7.t(c().c, obj2)) {
            return;
        }
        h(obj, false);
    }

    public final void j(Object obj, ze5 ze5Var, Object obj2, b00 b00Var) {
        Object value;
        if (this.w) {
            jfe jfeVar = this.f;
            if (pa7.t(obj, jfeVar != null ? jfeVar.c : null)) {
                return;
            }
        }
        vz9 vz9Var = this.b;
        boolean zT = pa7.t(vz9Var.getValue(), obj);
        qz9 qz9Var = this.v;
        if (zT && qz9Var.j() == -1.0f && (obj2 == null || obj2.equals(c().d))) {
            return;
        }
        vz9Var.setValue(obj);
        this.c.setValue(ze5Var);
        if (obj2 == null) {
            value = qz9Var.j() == -3.0f ? obj : this.x.getValue();
        } else {
            value = obj2;
        }
        if (obj2 != null) {
            f(value);
            if (b00Var != null) {
                this.y = b00Var;
            }
        }
        vz9 vz9Var2 = this.g;
        h(value, !((Boolean) vz9Var2.getValue()).booleanValue());
        vz9Var2.setValue(Boolean.valueOf(qz9Var.j() == -3.0f));
        if (qz9Var.j() >= 0.0f) {
            f(c().g((long) (qz9Var.j() * c().c())));
        } else if (qz9Var.j() == -3.0f) {
            f(obj);
        }
        this.w = false;
        qz9Var.k(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.x.getValue() + ", target: " + this.b.getValue() + ", spec: " + ((ze5) this.c.getValue());
    }
}
