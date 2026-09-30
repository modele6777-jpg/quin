package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class eua extends q72 {
    public final dua b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eua(xn7 xn7Var) {
        super(xn7Var);
        xn7Var.getClass();
        this.b = new dua(xn7Var.e());
    }

    @Override // defpackage.q72, defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        int i = i(obj);
        dua duaVar = this.b;
        ag2 ag2VarC = ev4Var.c(duaVar);
        p(ag2VarC, obj, i);
        ag2VarC.b(duaVar);
    }

    @Override // defpackage.e1, defpackage.xn7
    public final Object c(om3 om3Var) {
        return j(om3Var);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Object f() {
        return (cua) l(o());
    }

    @Override // defpackage.e1
    public final int g(Object obj) {
        cua cuaVar = (cua) obj;
        cuaVar.getClass();
        return cuaVar.d();
    }

    @Override // defpackage.e1
    public final Iterator h(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.e1
    public final Object m(Object obj) {
        cua cuaVar = (cua) obj;
        cuaVar.getClass();
        return cuaVar.a();
    }

    @Override // defpackage.q72
    public final void n(int i, Object obj, Object obj2) {
        ((cua) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object o();

    public abstract void p(ag2 ag2Var, Object obj, int i);
}
