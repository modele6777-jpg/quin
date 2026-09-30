package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class px3 implements x16 {
    public final /* synthetic */ int a;
    public final rx3 b;
    public final dm7 c;

    public /* synthetic */ px3(rx3 rx3Var, dm7 dm7Var, int i) {
        this.a = i;
        this.b = rx3Var;
        this.c = dm7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                rx3 rx3Var = this.b;
                dm7 dm7Var = this.c;
                zy3 zy3VarF = rx3Var.F();
                fo7 fo7VarB = dm7Var.b(rx3Var.getName(), rx3Var.getTypeParameters());
                fo7 fo7Var = fo7.c;
                yn7 yn7Var = fo7VarB.b(zy3VarF, io7.a).b;
                if (yn7Var != null) {
                    return yn7Var;
                }
                ia5.f(rx3Var.getName());
                throw null;
            default:
                rx3 rx3Var2 = this.b;
                dm7 dm7Var2 = this.c;
                List<c8f> typeParameters = rx3Var2.G().getTypeParameters();
                typeParameters.getClass();
                ArrayList<ao7> arrayList = new ArrayList(t72.u(typeParameters, 10));
                for (c8f c8fVar : typeParameters) {
                    wnb wnbVarO0 = ynb.o0(rx3Var2);
                    c8fVar.getClass();
                    arrayList.add(new ao7(wnbVarO0, c8fVar));
                }
                fo7 fo7VarB2 = dm7Var2.b(rx3Var2.getName(), arrayList);
                for (ao7 ao7Var : arrayList) {
                    List<yn7> upperBounds = ao7Var.getUpperBounds();
                    ArrayList arrayList2 = new ArrayList(t72.u(upperBounds, 10));
                    for (yn7 yn7Var2 : upperBounds) {
                        fo7 fo7Var2 = fo7.c;
                        yn7 yn7Var3 = fo7VarB2.b(yn7Var2, io7.a).b;
                        if (yn7Var3 == null) {
                            ia5.f(rx3Var2.getName());
                            throw null;
                        }
                        arrayList2.add(yn7Var3);
                    }
                    ao7Var.f = arrayList2;
                }
                return arrayList;
        }
    }
}
