package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class im7 implements x16 {
    public final /* synthetic */ int a;
    public final jm7 b;

    public /* synthetic */ im7(jm7 jm7Var, int i) {
        this.a = i;
        this.b = jm7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        jm7 jm7Var = this.b;
        switch (i) {
            case 0:
                boolean zE = jm7Var.e();
                if (zE) {
                    fob fobVar = jm7Var.m;
                    wn7[] wn7VarArr = jm7.w;
                    wn7 wn7Var = wn7VarArr[10];
                    Object objInvoke = fobVar.invoke();
                    objInvoke.getClass();
                    fob fobVar2 = jm7Var.o;
                    wn7 wn7Var2 = wn7VarArr[12];
                    Object objInvoke2 = fobVar2.invoke();
                    objInvoke2.getClass();
                    return s72.Q0((Collection) objInvoke, (Collection) objInvoke2);
                }
                if (zE) {
                    ap.c();
                    return null;
                }
                Collection collectionA = jm7Var.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionA) {
                    if (!ia5.e((wnb) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                boolean zE2 = jm7Var.e();
                if (zE2) {
                    fob fobVar3 = jm7Var.n;
                    wn7[] wn7VarArr2 = jm7.w;
                    wn7 wn7Var3 = wn7VarArr2[11];
                    Object objInvoke3 = fobVar3.invoke();
                    objInvoke3.getClass();
                    fob fobVar4 = jm7Var.p;
                    wn7 wn7Var4 = wn7VarArr2[13];
                    Object objInvoke4 = fobVar4.invoke();
                    objInvoke4.getClass();
                    return s72.Q0((Collection) objInvoke3, (Collection) objInvoke4);
                }
                if (zE2) {
                    ap.c();
                    return null;
                }
                Collection collectionA2 = jm7Var.a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionA2) {
                    if (ia5.e((wnb) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            default:
                fob fobVar5 = jm7Var.m;
                wn7[] wn7VarArr3 = jm7.w;
                wn7 wn7Var5 = wn7VarArr3[10];
                Object objInvoke5 = fobVar5.invoke();
                objInvoke5.getClass();
                fob fobVar6 = jm7Var.n;
                wn7 wn7Var6 = wn7VarArr3[11];
                Object objInvoke6 = fobVar6.invoke();
                objInvoke6.getClass();
                return s72.Q0((Collection) objInvoke5, (Collection) objInvoke6);
        }
    }
}
