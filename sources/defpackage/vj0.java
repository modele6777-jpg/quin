package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vj0 {
    public final jy6 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public vj0(jy6 jy6Var) {
        this.a = jy6Var;
        wj0 wj0Var = wj0.e;
        this.d = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final boolean b() {
        return this.d && ((ak0) this.b.get(a())).c() && !this.c[a()].hasRemaining();
    }

    public final boolean c() {
        return !this.b.isEmpty();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= a(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    ak0 ak0Var = (ak0) arrayList.get(i);
                    if (!ak0Var.c()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : ak0.a;
                        long jRemaining = byteBuffer2.remaining();
                        ak0Var.f(byteBuffer2);
                        this.c[i] = ak0Var.d();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < a()) {
                        ((ak0) arrayList.get(i + 1)).h();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj0)) {
            return false;
        }
        jy6 jy6Var = ((vj0) obj).a;
        jy6 jy6Var2 = this.a;
        if (jy6Var2.size() != jy6Var.size()) {
            return false;
        }
        for (int i = 0; i < jy6Var2.size(); i++) {
            if (jy6Var2.get(i) != jy6Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
