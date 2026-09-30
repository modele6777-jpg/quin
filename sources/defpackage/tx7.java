package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tx7 implements x16 {
    public final /* synthetic */ int a;
    public final wx7 b;

    public /* synthetic */ tx7(wx7 wx7Var, int i) {
        this.a = i;
        this.b = wx7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wx7 wx7Var = this.b;
        switch (i) {
            case 0:
                Class<?>[] declaredClasses = wx7Var.o.a.getDeclaredClasses();
                declaredClasses.getClass();
                return s72.o1(fyc.A(fyc.y(new ve5(qd0.S(declaredClasses), false, d5a.X), d5a.Y)));
            case 1:
                List listB = wx7Var.o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((lnb) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iF = bm8.F(t72.u(arrayList, 10));
                if (iF < 16) {
                    iF = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((lnb) obj2).c(), obj2);
                }
                return linkedHashMap;
            default:
                return n3d.m(wx7Var.c(), wx7Var.g());
        }
    }
}
