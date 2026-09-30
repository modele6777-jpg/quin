package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pyb {
    public btb a;
    public a1b b;
    public String d;
    public bh6 e;
    public rsd h;
    public ryb i;
    public ryb j;
    public ryb k;
    public long l;
    public long m;
    public zi0 n;
    public int c = -1;
    public vyb g = vyb.b;
    public g2f o = g2f.d0;
    public qi6 f = new qi6();

    public static void b(String str, ryb rybVar) {
        if (rybVar != null) {
            if (rybVar.w != null) {
                qc0.o(str.concat(".networkResponse != null"));
            } else if (rybVar.x != null) {
                qc0.o(str.concat(".cacheResponse != null"));
            } else {
                if (rybVar.y == null) {
                    return;
                }
                qc0.o(str.concat(".priorResponse != null"));
            }
        }
    }

    public final ryb a() {
        int i = this.c;
        if (i < 0) {
            cva.t(this.c, "code < 0: ");
            return null;
        }
        btb btbVar = this.a;
        if (btbVar == null) {
            qc0.p("request == null");
            return null;
        }
        a1b a1bVar = this.b;
        if (a1bVar == null) {
            qc0.p("protocol == null");
            return null;
        }
        String str = this.d;
        if (str == null) {
            qc0.p("message == null");
            return null;
        }
        bh6 bh6Var = this.e;
        qi6 qi6Var = this.f;
        qi6Var.getClass();
        return new ryb(btbVar, a1bVar, str, i, bh6Var, xdc.h(qi6Var), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }
}
