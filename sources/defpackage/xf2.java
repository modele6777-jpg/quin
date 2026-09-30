package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xf2 extends pk1 {
    public final wg7 d;
    public int e;

    public xf2(sug sugVar, wg7 wg7Var) {
        super(sugVar);
        this.d = wg7Var;
    }

    @Override // defpackage.pk1
    public final void d() {
        this.b = true;
        this.e++;
    }

    @Override // defpackage.pk1
    public final void f() {
        this.b = false;
        sug sugVar = (sug) this.c;
        sugVar.y("\n");
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            sugVar.y(this.d.a.e);
        }
    }

    @Override // defpackage.pk1
    public final void g() {
        if (this.b) {
            this.b = false;
        } else {
            f();
        }
    }

    @Override // defpackage.pk1
    public final void n() {
        i(' ');
    }

    @Override // defpackage.pk1
    public final void o() {
        this.e--;
    }
}
