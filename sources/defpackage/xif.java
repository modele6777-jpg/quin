package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xif implements pif {
    public final ckf a;
    public final lkf b;
    public final ajf c;
    public final h1b d;
    public final h1b e;
    public final h1b f;
    public final int g;
    public final sh0 h;
    public final ace i;
    public final ace j;
    public final ace k;

    public xif(ckf ckfVar, lkf lkfVar, ajf ajfVar, h1b h1bVar, h1b h1bVar2, h1b h1bVar3) {
        ckfVar.getClass();
        lkfVar.getClass();
        ajfVar.getClass();
        h1bVar.getClass();
        h1bVar2.getClass();
        h1bVar3.getClass();
        this.a = ckfVar;
        this.b = lkfVar;
        this.c = ajfVar;
        this.d = h1bVar;
        this.e = h1bVar2;
        this.f = h1bVar3;
        wh0 wh0Var = yif.a;
        wh0Var.getClass();
        this.g = wh0.b.incrementAndGet(wh0Var);
        final int i = 0;
        this.h = vpf.m(false);
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        this.i = new ace(new x16(this) { // from class: tif
            public final /* synthetic */ xif b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                xif xifVar = this.b;
                switch (i2) {
                    case 0:
                        return (kkf) xifVar.d.get();
                    case 1:
                        return (c0d) xifVar.e.get();
                    default:
                        return (pm1) xifVar.f.get();
                }
            }
        });
        final int i2 = 1;
        this.j = new ace(new x16(this) { // from class: tif
            public final /* synthetic */ xif b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                xif xifVar = this.b;
                switch (i3) {
                    case 0:
                        return (kkf) xifVar.d.get();
                    case 1:
                        return (c0d) xifVar.e.get();
                    default:
                        return (pm1) xifVar.f.get();
                }
            }
        });
        final int i3 = 2;
        this.k = new ace(new x16(this) { // from class: tif
            public final /* synthetic */ xif b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                xif xifVar = this.b;
                switch (i4) {
                    case 0:
                        return (kkf) xifVar.d.get();
                    case 1:
                        return (c0d) xifVar.e.get();
                    default:
                        return (pm1) xifVar.f.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.g;
    }
}
