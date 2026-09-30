package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0a {
    public final et4 a;
    public final float b;
    public final Random c;
    public float d;
    public float e;

    public t0a(et4 et4Var, float f) {
        Random random = new Random();
        et4Var.getClass();
        this.a = et4Var;
        this.b = f;
        this.c = random;
    }

    public final rna a(dj6 dj6Var, ju2 ju2Var) {
        if (dj6Var instanceof rna) {
            rna rnaVar = (rna) dj6Var;
            return new rna(rnaVar.j, rnaVar.k);
        }
        if (dj6Var instanceof tna) {
            tna tnaVar = (tna) dj6Var;
            return new rna(ju2Var.a * ((float) tnaVar.j), ju2Var.b * ((float) tnaVar.k));
        }
        if (!(dj6Var instanceof sna)) {
            ap.c();
            return null;
        }
        sna snaVar = (sna) dj6Var;
        rna rnaVarA = a(snaVar.j, ju2Var);
        rna rnaVarA2 = a(snaVar.k, ju2Var);
        Random random = this.c;
        float fNextFloat = random.nextFloat();
        float f = rnaVarA2.j;
        float f2 = rnaVarA.j;
        float fA = ks0.a(f, f2, fNextFloat, f2);
        float fNextFloat2 = random.nextFloat();
        float f3 = rnaVarA2.k;
        float f4 = rnaVarA.k;
        return new rna(fA, ks0.a(f3, f4, fNextFloat2, f4));
    }

    public final float b(r6c r6cVar) {
        r6cVar.getClass();
        return (((this.c.nextFloat() * 2.0f) - 1.0f) * 0.5f) + 1.0f;
    }
}
