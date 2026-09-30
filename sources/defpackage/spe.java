package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class spe extends f1e {
    public CharSequence c;
    public List d;
    public eue e;
    public mue f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public cv7 k;
    public xp5 l;
    public long m;
    public ste n;

    public spe() {
        super(qrd.h().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = ll2.b(0, 0, 0, 0, 15);
    }

    @Override // defpackage.f1e
    public final void a(f1e f1eVar) {
        f1eVar.getClass();
        spe speVar = (spe) f1eVar;
        this.c = speVar.c;
        this.d = speVar.d;
        this.e = speVar.e;
        this.f = speVar.f;
        this.g = speVar.g;
        this.h = speVar.h;
        this.i = speVar.i;
        this.j = speVar.j;
        this.k = speVar.k;
        this.l = speVar.l;
        this.m = speVar.m;
        this.n = speVar.n;
    }

    @Override // defpackage.f1e
    public final f1e b() {
        return new spe();
    }

    public final String toString() {
        CharSequence charSequence = this.c;
        List list = this.d;
        eue eueVar = this.e;
        mue mueVar = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        float f = this.i;
        float f2 = this.j;
        cv7 cv7Var = this.k;
        xp5 xp5Var = this.l;
        String strL = kl2.l(this.m);
        ste steVar = this.n;
        StringBuilder sb = new StringBuilder("CacheRecord(visualText=");
        sb.append((Object) charSequence);
        sb.append(", annotations=");
        sb.append(list);
        sb.append(", composition=");
        sb.append(eueVar);
        sb.append(", textStyle=");
        sb.append(mueVar);
        sb.append(", singleLine=");
        ib8.w(sb, z, ", softWrap=", z2, ", densityValue=");
        ks0.w(sb, f, ", fontScale=", f2, ", layoutDirection=");
        sb.append(cv7Var);
        sb.append(", fontFamilyResolver=");
        sb.append(xp5Var);
        sb.append(", constraints=");
        sb.append(strL);
        sb.append(", layoutResult=");
        sb.append(steVar);
        sb.append(")");
        return sb.toString();
    }
}
