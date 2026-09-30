package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ot9 {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final nt9 f;
    public final sh0 g = vpf.m(false);

    public ot9(boolean z, long j, long j2, long j3, long j4, nt9 nt9Var) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = nt9Var;
    }

    public final void a(long j, Object obj) {
        if (this.g.a()) {
            this.f.b(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Output ");
        sb.append(this.d);
        sb.append(" at ");
        sb.append((Object) yy5.a(this.b));
        sb.append(" for ");
        ho7.j(tec.h(j, " was completed multiple times!", sb));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ot9) {
            ot9 ot9Var = (ot9) obj;
            if (this.a == ot9Var.a && this.b == ot9Var.b && this.c == ot9Var.c && this.d == ot9Var.d && this.e == ot9Var.e && this.f.equals(ot9Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ib8.b(ib8.b(ib8.b(ib8.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.a + ", cameraFrameNumber=" + ((Object) yy5.a(this.b)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.c + ')')) + ", cameraOutputSequence=" + this.d + ", cameraOutputNumber=" + this.e + ", outputListener=" + this.f + ')';
    }
}
