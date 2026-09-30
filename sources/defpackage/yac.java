package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yac implements s9c {
    public final ArrayList a;
    public float b;
    public float c;
    public zac d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public yac(hbc hbcVar, p90 p90Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (p90Var == null) {
            return;
        }
        p90Var.A(this);
        if (this.h) {
            this.d.b((zac) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        zac zacVar = this.d;
        if (zacVar != null) {
            arrayList.add(zacVar);
        }
    }

    @Override // defpackage.s9c
    public final void a(float f, float f2, float f3, float f4) {
        this.d.a(f, f2);
        this.a.add(this.d);
        this.d = new zac(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }

    @Override // defpackage.s9c
    public final void b(float f, float f2) {
        boolean z = this.h;
        ArrayList arrayList = this.a;
        if (z) {
            this.d.b((zac) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        zac zacVar = this.d;
        if (zacVar != null) {
            arrayList.add(zacVar);
        }
        this.b = f;
        this.c = f2;
        this.d = new zac(f, f2, 0.0f, 0.0f);
        this.g = arrayList.size();
    }

    @Override // defpackage.s9c
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new zac(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // defpackage.s9c
    public final void close() {
        this.a.add(this.d);
        e(this.b, this.c);
        this.h = true;
    }

    @Override // defpackage.s9c
    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        zac zacVar = this.d;
        hbc.v(zacVar.a, zacVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // defpackage.s9c
    public final void e(float f, float f2) {
        this.d.a(f, f2);
        this.a.add(this.d);
        zac zacVar = this.d;
        this.d = new zac(f, f2, f - zacVar.a, f2 - zacVar.b);
        this.h = false;
    }
}
