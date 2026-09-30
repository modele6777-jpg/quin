package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wz implements h0e {
    public final y6f a;
    public final vz9 b;
    public b00 c;
    public long d;
    public long e;
    public boolean f;

    public wz(y6f y6fVar, Object obj, b00 b00Var, long j, long j2, boolean z) {
        b00 b00VarG;
        this.a = y6fVar;
        this.b = q1c.f(obj);
        if (b00Var != null) {
            b00VarG = y41.g(b00Var);
        } else {
            b00VarG = (b00) y6fVar.a.d(obj);
            b00VarG.d();
        }
        this.c = b00VarG;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object c() {
        return this.a.b.d(this.c);
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        return this.b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.b.getValue() + ", velocity=" + c() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ")";
    }

    public /* synthetic */ wz(y6f y6fVar, Object obj, b00 b00Var, int i) {
        this(y6fVar, obj, (i & 4) != 0 ? null : b00Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
