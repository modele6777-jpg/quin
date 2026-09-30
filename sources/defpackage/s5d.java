package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s5d {
    public final y6c a;
    public final y6c b;
    public final y6c c;
    public final y6c d;
    public final y6c e;
    public final y6c f;
    public final y6c g;
    public final y6c h;

    public s5d(y6c y6cVar, y6c y6cVar2, y6c y6cVar3, y6c y6cVar4, y6c y6cVar5) {
        y6c y6cVar6 = b5d.e;
        y6c y6cVar7 = b5d.g;
        y6c y6cVar8 = b5d.h;
        this.a = y6cVar;
        this.b = y6cVar2;
        this.c = y6cVar3;
        this.d = y6cVar4;
        this.e = y6cVar5;
        this.f = y6cVar6;
        this.g = y6cVar7;
        this.h = y6cVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5d)) {
            return false;
        }
        s5d s5dVar = (s5d) obj;
        return pa7.t(this.a, s5dVar.a) && pa7.t(this.b, s5dVar.b) && pa7.t(this.c, s5dVar.c) && pa7.t(this.d, s5dVar.d) && pa7.t(this.e, s5dVar.e) && pa7.t(this.f, s5dVar.f) && pa7.t(this.g, s5dVar.g) && pa7.t(this.h, s5dVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
