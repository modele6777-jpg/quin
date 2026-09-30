package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n3f {
    public final s3f a;
    public final n3f b;
    public final String c;
    public final vz9 d;
    public final vz9 f;
    public final vz9 i;
    public final jsd j;
    public final jsd k;
    public final vz9 l;
    public final mx3 m;
    public final vz9 e = q1c.f(null);
    public final tz9 g = new tz9(0);
    public final tz9 h = new tz9(Long.MIN_VALUE);

    public n3f(s3f s3fVar, n3f n3fVar, String str) {
        this.a = s3fVar;
        this.b = n3fVar;
        this.c = str;
        this.d = q1c.f(s3fVar.a());
        this.f = q1c.f(new j3f(s3fVar.a(), s3fVar.a()));
        Boolean bool = Boolean.FALSE;
        this.i = q1c.f(bool);
        this.j = new jsd();
        this.k = new jsd();
        this.l = q1c.f(bool);
        this.m = zrd.b(new e3f(this, 1));
        s3fVar.d(this);
    }

    public final void a(Object obj, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(obj) : l46Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(this) ? 32 : 16;
        }
        int i3 = 0;
        if (!l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            l46Var.Z();
        } else if (h()) {
            l46Var.f0(467722849);
            l46Var.r(false);
        } else {
            l46Var.f0(466062241);
            s(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = zrd.b(new e3f(this, i3));
                l46Var.p0(objR);
            }
            if (((Boolean) ((h0e) objR).getValue()).booleanValue()) {
                l46Var.f0(466470356);
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = af1.E(l46Var);
                    l46Var.p0(objR2);
                }
                aw2 aw2Var = (aw2) objR2;
                boolean zI = l46Var.i(aw2Var) | (i4 == 32);
                Object objR3 = l46Var.R();
                if (zI || objR3 == i8cVar) {
                    objR3 = new i2e(13, aw2Var, this);
                    l46Var.p0(objR3);
                }
                af1.h(aw2Var, this, (a26) objR3, l46Var);
                l46Var.r(false);
            } else {
                l46Var.f0(467712929);
                l46Var.r(false);
            }
            l46Var.r(false);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(this, obj, i, 14);
        }
    }

    public final long b() {
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((k3f) jsdVar.get(i)).z.j());
        }
        jsd jsdVar2 = this.k;
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((n3f) jsdVar2.get(i2)).b());
        }
        return jMax;
    }

    public final void c() {
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        for (int i = 0; i < size; i++) {
            k3f k3fVar = (k3f) jsdVar.get(i);
            k3fVar.f = null;
            k3fVar.e = null;
            k3fVar.w = false;
        }
        jsd jsdVar2 = this.k;
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((n3f) jsdVar2.get(i2)).c();
        }
    }

    public final boolean d() {
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        for (int i = 0; i < size; i++) {
            if (((k3f) jsdVar.get(i)).e != null) {
                return true;
            }
        }
        jsd jsdVar2 = this.k;
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((n3f) jsdVar2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        n3f n3fVar = this.b;
        return n3fVar != null ? n3fVar.e() : this.g.j();
    }

    public final i3f f() {
        return (i3f) this.f.getValue();
    }

    public final boolean g() {
        return this.h.j() != Long.MIN_VALUE;
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void i(long j, boolean z) {
        tz9 tz9Var = this.h;
        long j2 = tz9Var.j();
        s3f s3fVar = this.a;
        if (j2 == Long.MIN_VALUE) {
            tz9Var.k(j);
            s3fVar.a.setValue(Boolean.TRUE);
        } else if (!((Boolean) s3fVar.a.getValue()).booleanValue()) {
            s3fVar.a.setValue(Boolean.TRUE);
        }
        p(false);
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            k3f k3fVar = (k3f) jsdVar.get(i);
            vz9 vz9Var = k3fVar.g;
            vz9 vz9Var2 = k3fVar.g;
            if (!((Boolean) vz9Var.getValue()).booleanValue()) {
                long jC = z ? k3fVar.c().c() : j;
                k3fVar.f(k3fVar.c().g(jC));
                k3fVar.y = k3fVar.c().e(jC);
                if (k3fVar.c().f(jC)) {
                    vz9Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) vz9Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        jsd jsdVar2 = this.k;
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            n3f n3fVar = (n3f) jsdVar2.get(i2);
            vz9 vz9Var3 = n3fVar.d;
            s3f s3fVar2 = n3fVar.a;
            if (!pa7.t(vz9Var3.getValue(), s3fVar2.a())) {
                n3fVar.i(j, z);
            }
            if (!pa7.t(n3fVar.d.getValue(), s3fVar2.a())) {
                z2 = false;
            }
        }
        if (z2) {
            j();
        }
    }

    public final void j() {
        this.h.k(Long.MIN_VALUE);
        s3f s3fVar = this.a;
        if (s3fVar instanceof o89) {
            s3fVar.c(this.d.getValue());
        }
        o(0L);
        s3fVar.a.setValue(Boolean.FALSE);
        jsd jsdVar = this.k;
        int size = jsdVar.size();
        for (int i = 0; i < size; i++) {
            ((n3f) jsdVar.get(i)).j();
        }
    }

    public final void k(float f) {
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        for (int i = 0; i < size; i++) {
            k3f k3fVar = (k3f) jsdVar.get(i);
            k3fVar.getClass();
            if (f == -4.0f || f == -5.0f) {
                jfe jfeVar = k3fVar.f;
                if (jfeVar != null) {
                    k3fVar.c().a(jfeVar.c);
                    k3fVar.e = null;
                    k3fVar.f = null;
                }
                Object obj = f == -4.0f ? k3fVar.c().d : k3fVar.c().c;
                k3fVar.c().a(obj);
                k3fVar.c().i(obj);
                k3fVar.f(obj);
                k3fVar.z.k(k3fVar.c().c());
            } else {
                k3fVar.v.k(f);
            }
        }
        jsd jsdVar2 = this.k;
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((n3f) jsdVar2.get(i2)).k(f);
        }
    }

    public final void l(Object obj, Object obj2) {
        this.h.k(Long.MIN_VALUE);
        s3f s3fVar = this.a;
        s3fVar.a.setValue(Boolean.FALSE);
        boolean zH = h();
        vz9 vz9Var = this.d;
        if (!zH || !pa7.t(s3fVar.a(), obj) || !pa7.t(vz9Var.getValue(), obj2)) {
            if (!pa7.t(s3fVar.a(), obj) && (s3fVar instanceof o89)) {
                s3fVar.c(obj);
            }
            vz9Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new j3f(obj, obj2));
        }
        jsd jsdVar = this.k;
        int size = jsdVar.size();
        for (int i = 0; i < size; i++) {
            n3f n3fVar = (n3f) jsdVar.get(i);
            n3fVar.getClass();
            if (n3fVar.h()) {
                n3fVar.l(n3fVar.a.a(), n3fVar.d.getValue());
            }
        }
        jsd jsdVar2 = this.j;
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((k3f) jsdVar2.get(i2)).d(0L);
        }
    }

    public final void m(long j) {
        tz9 tz9Var = this.h;
        if (tz9Var.j() == Long.MIN_VALUE) {
            tz9Var.k(j);
        }
        o(j);
        p(false);
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        for (int i = 0; i < size; i++) {
            ((k3f) jsdVar.get(i)).d(j);
        }
        jsd jsdVar2 = this.k;
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            n3f n3fVar = (n3f) jsdVar2.get(i2);
            if (!pa7.t(n3fVar.d.getValue(), n3fVar.a.a())) {
                n3fVar.m(j);
            }
        }
    }

    public final void n(btc btcVar) {
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        for (int i = 0; i < size; i++) {
            k3f k3fVar = (k3f) jsdVar.get(i);
            vz9 vz9Var = k3fVar.x;
            if (!pa7.t(k3fVar.c().c, k3fVar.c().d)) {
                k3fVar.f = k3fVar.c();
                k3fVar.e = btcVar;
            }
            k3fVar.d.setValue(new jfe(k3fVar.Y, k3fVar.a, vz9Var.getValue(), vz9Var.getValue(), k3fVar.y.c()));
            k3fVar.z.k(k3fVar.c().c());
            k3fVar.w = true;
        }
        jsd jsdVar2 = this.k;
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((n3f) jsdVar2.get(i2)).n(btcVar);
        }
    }

    public final void o(long j) {
        if (this.b == null) {
            this.g.k(j);
        }
    }

    public final void p(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void q() {
        jfe jfeVar;
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        for (int i = 0; i < size; i++) {
            k3f k3fVar = (k3f) jsdVar.get(i);
            btc btcVar = k3fVar.e;
            if (btcVar != null && (jfeVar = k3fVar.f) != null) {
                long jM = ym8.M(btcVar.g * ((double) btcVar.d));
                Object objG = jfeVar.g(jM);
                if (k3fVar.w) {
                    k3fVar.c().i(objG);
                }
                k3fVar.c().a(objG);
                k3fVar.z.k(k3fVar.c().c());
                if (k3fVar.v.j() == -2.0f || k3fVar.w) {
                    k3fVar.f(objG);
                } else {
                    k3fVar.d(k3fVar.Z.e());
                }
                if (jM >= btcVar.g) {
                    k3fVar.e = null;
                    k3fVar.f = null;
                } else {
                    btcVar.c = false;
                }
            }
        }
        jsd jsdVar2 = this.k;
        int size2 = jsdVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((n3f) jsdVar2.get(i2)).q();
        }
    }

    public final void r(Object obj) {
        vz9 vz9Var = this.e;
        Object value = vz9Var.getValue();
        s3f s3fVar = this.a;
        vz9 vz9Var2 = this.d;
        boolean z = value != null && obj == null && pa7.t(vz9Var2.getValue(), s3fVar.a());
        vz9Var.setValue(obj);
        if (z) {
            this.f.setValue(new j3f(value, vz9Var2.getValue()));
            s3fVar.c(value);
            if (!g()) {
                p(true);
            }
            jsd jsdVar = this.j;
            int size = jsdVar.size();
            for (int i = 0; i < size; i++) {
                ((k3f) jsdVar.get(i)).v.k(-2.0f);
            }
        }
    }

    public final void s(Object obj) {
        vz9 vz9Var = this.d;
        if (pa7.t(vz9Var.getValue(), obj)) {
            return;
        }
        this.f.setValue(new j3f(vz9Var.getValue(), obj));
        s3f s3fVar = this.a;
        if (!pa7.t(s3fVar.a(), vz9Var.getValue())) {
            s3fVar.c(vz9Var.getValue());
        }
        vz9Var.setValue(obj);
        if (!g()) {
            p(true);
        }
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        for (int i = 0; i < size; i++) {
            ((k3f) jsdVar.get(i)).v.k(-2.0f);
        }
    }

    public final String toString() {
        jsd jsdVar = this.j;
        int size = jsdVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((k3f) jsdVar.get(i)) + ", ";
        }
        return str;
    }
}
