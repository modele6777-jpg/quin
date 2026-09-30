package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mk2 implements q8c, d99 {
    public final q8c a;
    public final d99 b;
    public pv2 c;
    public Throwable d;
    public final lk2 e;

    public mk2(q8c q8cVar) {
        f99 f99Var = new f99();
        q8cVar.getClass();
        this.a = q8cVar;
        this.b = f99Var;
        this.e = new lk2(this);
    }

    @Override // defpackage.q8c
    public final x8c W0(String str) {
        str.getClass();
        lk2 lk2Var = this.e;
        if (lk2Var == null) {
            return this.a.W0(str);
        }
        Object objC = lk2Var.c(str);
        objC.getClass();
        return new kk2((x8c) objC);
    }

    @Override // defpackage.d99
    public final Object b(xn2 xn2Var) {
        return this.b.b(xn2Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        lk2 lk2Var = this.e;
        if (lk2Var != null) {
            lk2Var.f(-1);
        }
        this.a.close();
    }

    @Override // defpackage.d99
    public final void h(Object obj) {
        this.b.h(null);
    }

    public final void l(StringBuilder sb) {
        int i;
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            pv2 pv2Var = this.c;
            if (pv2Var != null) {
                sb.append("\t\tCoroutine: " + pv2Var);
                sb.append('\n');
            }
            Throwable th = this.d;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = s72.r0(v4e.U(bzd.I(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.e != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            lk2 lk2Var = this.e;
            synchronized (lk2Var.c) {
                i = lk2Var.d;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // defpackage.q8c
    public final boolean q() {
        return this.a.q();
    }

    public final String toString() {
        return this.a.toString();
    }
}
