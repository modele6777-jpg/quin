package defpackage;

import android.content.Context;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pd9 implements oc5 {
    public final ace a;
    public final ace b;
    public final lqb c;
    public final ace d;

    public pd9(x16 x16Var) {
        fk8 fk8Var = new fk8(19);
        od9 od9Var = od9.a;
        fk8 fk8Var2 = new fk8(20);
        this.a = new ace(x16Var);
        this.b = eb3.O(fk8Var);
        lqb lqbVar = new lqb(7, false);
        lqbVar.b = od9Var;
        lqbVar.c = i8c.x;
        this.c = lqbVar;
        this.d = eb3.O(fk8Var2);
    }

    @Override // defpackage.oc5
    public final pc5 a(Object obj, as9 as9Var, mib mibVar) {
        qhf qhfVar = (qhf) obj;
        if (!pa7.t(qhfVar.c, "http") && !pa7.t(qhfVar.c, Constants.SCHEME)) {
            return null;
        }
        String str = qhfVar.a;
        ace aceVar = this.a;
        ace aceVar2 = new ace(new zv6(21, mibVar));
        ace aceVar3 = this.b;
        lqb lqbVar = this.c;
        Context context = as9Var.a;
        Object obj2 = lqbVar.c;
        i8c i8cVar = i8c.x;
        if (obj2 == i8cVar) {
            synchronized (lqbVar) {
                obj2 = lqbVar.c;
                if (obj2 == i8cVar) {
                    a26 a26Var = (a26) lqbVar.b;
                    a26Var.getClass();
                    Object objD = a26Var.d(context);
                    lqbVar.c = objD;
                    lqbVar.b = null;
                    obj2 = objD;
                }
            }
        }
        return new wd9(str, as9Var, aceVar, aceVar2, aceVar3, new b37(obj2), this.d);
    }
}
