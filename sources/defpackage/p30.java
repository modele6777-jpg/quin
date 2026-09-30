package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.personality.TarotCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p30 implements xj5 {
    public final /* synthetic */ xj5 a;

    public p30(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        o30 o30Var;
        Object next;
        if (xn2Var instanceof o30) {
            o30Var = (o30) xn2Var;
            int i = o30Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                o30Var.label = i - Integer.MIN_VALUE;
            } else {
                o30Var = new o30(this, xn2Var);
            }
        } else {
            o30Var = new o30(this, xn2Var);
        }
        Object obj2 = o30Var.result;
        int i2 = o30Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            f30 f30Var = (f30) obj;
            List list = f30Var.c;
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(r8c.p((TarotCard) it.next()));
            }
            List list2 = f30Var.b;
            ArrayList arrayList2 = new ArrayList(t72.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(r8c.p((TarotCard) it2.next()));
            }
            String str = f30Var.g;
            String str2 = f30Var.h;
            String str3 = f30Var.i;
            if (str3 == null) {
                str3 = "";
            }
            fj8.a.getClass();
            Iterator it3 = fj8.d.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!pa7.t(((fj8) next).a(), str3));
            k40 k40Var = new k40(arrayList, arrayList2, str, str2, (fj8) next);
            o30Var.L$0 = null;
            o30Var.L$1 = null;
            o30Var.L$2 = null;
            o30Var.L$3 = null;
            o30Var.label = 1;
            Object objA = this.a.a(k40Var, o30Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
