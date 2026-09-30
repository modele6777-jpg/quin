package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dv1 implements y7e {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public bv1 d;
    public long e;
    public long f;
    public long g;

    public dv1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new bv1(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            jv2 jv2Var = new jv2(10, this);
            cv1 cv1Var = new cv1();
            cv1Var.v = jv2Var;
            arrayDeque.add(cv1Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.pm3
    public final void b(long j) {
        this.g = j;
    }

    @Override // defpackage.y7e
    public final void c(long j) {
        this.e = j;
    }

    @Override // defpackage.pm3
    public final Object e() {
        pa7.J(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        bv1 bv1Var = (bv1) arrayDeque.pollFirst();
        this.d = bv1Var;
        return bv1Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // defpackage.pm3
    public final void f(b8e b8eVar) {
        pa7.A(b8eVar == this.d);
        bv1 bv1Var = (bv1) b8eVar;
        if (bv1Var.d(4)) {
            long j = this.f;
            this.f = 1 + j;
            bv1Var.y = j;
            this.c.add(bv1Var);
        } else {
            long j2 = bv1Var.g;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    bv1Var.y = j4;
                    this.c.add(bv1Var);
                } else {
                    bv1Var.e();
                    this.a.add(bv1Var);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                bv1Var.y = j5;
                this.c.add(bv1Var);
            }
        }
        this.d = null;
    }

    @Override // defpackage.pm3
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            bv1 bv1Var = (bv1) arrayDeque2.poll();
            String str = pqf.a;
            bv1Var.e();
            arrayDeque.add(bv1Var);
        }
        bv1 bv1Var2 = this.d;
        if (bv1Var2 != null) {
            bv1Var2.e();
            arrayDeque.add(bv1Var2);
            this.d = null;
        }
    }

    public abstract kd9 g();

    public abstract void h(bv1 bv1Var);

    @Override // defpackage.pm3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public cv1 d() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            bv1 bv1Var = (bv1) arrayDeque2.peek();
            String str = pqf.a;
            if (bv1Var.g > this.e) {
                return null;
            }
            bv1 bv1Var2 = (bv1) arrayDeque2.poll();
            boolean zD = bv1Var2.d(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zD) {
                cv1 cv1Var = (cv1) arrayDeque.pollFirst();
                cv1Var.a(4);
                bv1Var2.e();
                arrayDeque3.add(bv1Var2);
                return cv1Var;
            }
            h(bv1Var2);
            if (j()) {
                kd9 kd9VarG = g();
                cv1 cv1Var2 = (cv1) arrayDeque.pollFirst();
                long j = bv1Var2.g;
                cv1Var2.c = j;
                cv1Var2.e = kd9VarG;
                cv1Var2.f = j;
                bv1Var2.e();
                arrayDeque3.add(bv1Var2);
                return cv1Var2;
            }
            bv1Var2.e();
            arrayDeque3.add(bv1Var2);
        }
    }

    public abstract boolean j();

    @Override // defpackage.pm3
    public void a() {
    }
}
