package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tmg implements kn9, an9, wm9 {
    public final Object a = new Object();
    public final int b;
    public final gfh c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean v;

    public tmg(int i, gfh gfhVar) {
        this.b = i;
        this.c = gfhVar;
    }

    @Override // defpackage.kn9
    public final void a(Object obj) {
        synchronized (this.a) {
            this.d++;
            b();
        }
    }

    public final void b() {
        int i = this.d;
        int i2 = this.e;
        int i3 = i + i2 + this.f;
        int i4 = this.b;
        if (i3 == i4) {
            Exception exc = this.g;
            gfh gfhVar = this.c;
            if (exc == null) {
                if (this.v) {
                    gfhVar.s();
                    return;
                } else {
                    gfhVar.p(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            gfhVar.r(new ExecutionException(sb.toString(), this.g));
        }
    }

    @Override // defpackage.wm9
    public final void c() {
        synchronized (this.a) {
            this.f++;
            this.v = true;
            b();
        }
    }

    @Override // defpackage.an9
    public final void r(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            b();
        }
    }
}
