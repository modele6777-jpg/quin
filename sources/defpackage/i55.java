package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i55 extends gbe implements a26 {
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i55(String str, xn2 xn2Var) {
        super(1, xn2Var);
        this.$url = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        i55 i55Var = new i55(this.$url, (xn2) obj);
        wef wefVar = wef.a;
        i55Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        TreeSet treeSet;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        yid yidVar = k55.b;
        String str = this.$url;
        synchronized (yidVar) {
            synchronized (yidVar) {
                try {
                    t81 t81VarV = yidVar.c.V(str);
                    treeSet = (t81VarV == null || t81VarV.c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) t81VarV.c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return wef.a;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            yidVar.i((zid) it.next());
        }
        return wef.a;
    }
}
