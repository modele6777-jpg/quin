package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i09 implements rv3 {
    public jf6 X;
    public boolean Y;
    public qn2 b;
    public int c;
    public i09 e;
    public i09 f;
    public bl9 g;
    public yf9 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public i09 a = this;
    public int d = -1;

    public final aw2 Z0() {
        qn2 qn2Var = this.b;
        if (qn2Var != null) {
            return qn2Var;
        }
        qn2 qn2VarK = jgb.k(vd0.t0(this).getCoroutineContext().p0(new fg7((dg7) vd0.t0(this).getCoroutineContext().F0(ndb.Y0))));
        this.b = qn2VarK;
        return qn2VarK;
    }

    public boolean a1() {
        return !(this instanceof ss0);
    }

    public void b1() {
        if (this.Y) {
            i37.c("node attached multiple times");
        }
        if (this.v == null) {
            i37.c("attach invoked on a node without a coordinator");
        }
        this.Y = true;
        this.y = true;
    }

    public void c1() {
        if (!this.Y) {
            i37.c("Cannot detach a node that is not attached");
        }
        if (this.y) {
            i37.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.z) {
            i37.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.Y = false;
        qn2 qn2Var = this.b;
        if (qn2Var != null) {
            jgb.I(qn2Var, new r09("The Modifier.Node was detached"));
            this.b = null;
        }
    }

    public void g1() {
        if (!this.Y) {
            i37.c("reset() called on an unattached node");
        }
        f1();
    }

    public void h1() {
        if (!this.Y) {
            i37.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.y) {
            i37.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.y = false;
        d1();
        this.z = true;
    }

    public void i1() {
        if (!this.Y) {
            i37.c("node detached multiple times");
        }
        if (this.v == null) {
            i37.c("detach invoked on a node without a coordinator");
        }
        if (!this.z) {
            i37.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.z = false;
        jf6 jf6Var = this.X;
        if (jf6Var != null) {
            jf6Var.invoke();
        }
        e1();
    }

    public void j1(i09 i09Var) {
        this.a = i09Var;
    }

    public void k1(yf9 yf9Var) {
        this.v = yf9Var;
    }

    public void d1() {
    }

    public void e1() {
    }

    public void f1() {
    }
}
