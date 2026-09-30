package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x3a extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ y3a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3a(y3a y3aVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = y3aVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        x3a x3aVar = new x3a(this.this$0, xn2Var);
        x3aVar.L$0 = obj;
        return x3aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        bwa bwaVar;
        Object next;
        bwa bwaVar2;
        bwa bwaVar3;
        Object next2;
        bwa bwaVar4;
        Object next3;
        bwa bwaVar5;
        x5a x5aVar = (x5a) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        r3a r3aVar = x5aVar.a;
        ArrayList arrayList = x5aVar.g;
        if (r3aVar.c) {
            s0e s0eVar = this.this$0.U0;
            do {
                value = s0eVar.getValue();
                bwaVar = (bwa) value;
                if (!arrayList.contains(bwaVar)) {
                    if (x5aVar.e) {
                        Iterator it = arrayList.iterator();
                        do {
                            if (!it.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it.next();
                            bwaVar5 = (bwa) next3;
                        } while ((bwaVar5 != null ? bwaVar5.getType() : null) != u7e.c);
                        bwaVar2 = (bwa) next3;
                    } else {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            bwaVar3 = (bwa) next;
                        } while ((bwaVar3 != null ? bwaVar3.getType() : null) != u7e.b);
                        bwaVar2 = (bwa) next;
                    }
                    bwaVar = bwaVar2;
                    if (bwaVar == null) {
                        Iterator it3 = arrayList.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                            bwaVar4 = (bwa) next2;
                        } while ((bwaVar4 != null ? bwaVar4.getType() : null) != thb.g);
                        bwaVar = (bwa) next2;
                        if (bwaVar == null) {
                            bwaVar = (bwa) s72.H0(arrayList);
                        }
                    }
                }
            } while (!s0eVar.l(value, bwaVar));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        x3a x3aVar = (x3a) k((xn2) obj2, (x5a) obj);
        wef wefVar = wef.a;
        x3aVar.r(wefVar);
        return wefVar;
    }
}
