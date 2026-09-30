package defpackage;

import ai.askquin.ui.annual.model.AnnualActionFor;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x50 implements x16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x50(AnnualActionFor annualActionFor, boolean z, int i) {
        this.d = annualActionFor;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        Object obj = this.d;
        boolean z = this.b;
        switch (i) {
            case 0:
                return db6.A0((AnnualActionFor) obj, Boolean.valueOf(z), Integer.valueOf(i2));
            default:
                jp1 jp1Var = (jp1) obj;
                int i3 = 0;
                if (!z) {
                    ArrayList arrayList = new ArrayList(i2);
                    while (i3 < i2) {
                        v6c v6cVar = jp1Var.c;
                        float f = v6cVar.a;
                        float f2 = v6cVar.c;
                        j4 j4Var = mbb.b;
                        float fA = ks0.a(f2, f, j4Var.b(), f);
                        float f3 = v6cVar.b;
                        arrayList.add(new fgd(fA, ks0.a(v6cVar.d, f3, j4Var.b(), f3), (j4Var.b() * 359.9f) + 0.0f));
                        i3++;
                    }
                    return arrayList;
                }
                long j = jp1Var.a;
                float f4 = jp1Var.e;
                float f5 = jp1Var.f;
                if (i2 <= 0) {
                    return pu4.a;
                }
                float fSqrt = (float) Math.sqrt(i2);
                float f6 = f4 * fSqrt * 0.45f;
                float f7 = f5 * fSqrt * 0.27f;
                ArrayList arrayList2 = new ArrayList(i2);
                while (i3 < i2) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    float f8 = -f6;
                    j4 j4Var2 = mbb.b;
                    float f9 = -f7;
                    arrayList2.add(new fgd(((f6 - f8) * j4Var2.b()) + f8 + fIntBitsToFloat, ((f7 - f9) * j4Var2.b()) + f9 + Float.intBitsToFloat((int) (4294967295L & j)), (j4Var2.b() * 359.9f) + 0.0f));
                    i3++;
                }
                return arrayList2;
        }
    }

    public /* synthetic */ x50(boolean z, jp1 jp1Var, int i) {
        this.b = z;
        this.d = jp1Var;
        this.c = i;
    }
}
