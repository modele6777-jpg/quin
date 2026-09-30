package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class brd implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ jmb c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ brd(float f, jmb jmbVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = f;
        this.c = jmbVar;
        this.d = obj;
        this.e = obj2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        float fA = 0.0f;
        wef wefVar = wef.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        jmb jmbVar = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                fhc fhcVar = (fhc) obj3;
                a26 a26Var = (a26) obj2;
                uz uzVar = (uz) obj;
                float fAbs = Math.abs(((Number) uzVar.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                vz9 vz9Var = uzVar.e;
                if (fAbs < fAbs2) {
                    ynb.v(uzVar, fhcVar, a26Var, ((Number) vz9Var.getValue()).floatValue() - jmbVar.element);
                    jmbVar.element = ((Number) vz9Var.getValue()).floatValue();
                } else {
                    float fE = ynb.E(((Number) vz9Var.getValue()).floatValue(), f);
                    ynb.v(uzVar, fhcVar, a26Var, fE - jmbVar.element);
                    uzVar.a();
                    jmbVar.element = fE;
                }
                break;
            case 1:
                fhc fhcVar2 = (fhc) obj3;
                a26 a26Var2 = (a26) obj2;
                uz uzVar2 = (uz) obj;
                float fE2 = ynb.E(((Number) uzVar2.e.getValue()).floatValue(), f);
                float f2 = fE2 - jmbVar.element;
                try {
                    fA = fhcVar2.a(f2);
                } catch (CancellationException unused) {
                    uzVar2.a();
                }
                a26Var2.d(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fE2 != ((Number) uzVar2.e.getValue()).floatValue()) {
                    uzVar2.a();
                }
                jmbVar.element += fA;
                break;
            default:
                ho hoVar = (ho) obj3;
                jmb jmbVar2 = (jmb) obj2;
                uz uzVar3 = (uz) obj;
                vz9 vz9Var2 = uzVar3.e;
                if ((((Number) vz9Var2.getValue()).floatValue() < f && jmbVar.element > f) || (((Number) vz9Var2.getValue()).floatValue() > f && jmbVar.element < f)) {
                    float fFloatValue = ((Number) vz9Var2.getValue()).floatValue();
                    if (f == 0.0f) {
                        f = 0.0f;
                    } else if (f <= 0.0f ? fFloatValue >= f : fFloatValue <= f) {
                        f = fFloatValue;
                    }
                    hoVar.a(f, ((Number) uzVar3.b()).floatValue());
                    jmbVar2.element = Float.isNaN(((Number) uzVar3.b()).floatValue()) ? 0.0f : ((Number) uzVar3.b()).floatValue();
                    jmbVar.element = f;
                    uzVar3.a();
                } else {
                    hoVar.a(((Number) vz9Var2.getValue()).floatValue(), ((Number) uzVar3.b()).floatValue());
                    jmbVar2.element = ((Number) uzVar3.b()).floatValue();
                    jmbVar.element = ((Number) vz9Var2.getValue()).floatValue();
                }
                break;
        }
        return wefVar;
    }
}
