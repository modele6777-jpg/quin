package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ed7 implements ly1 {
    public static final ed7 b = new ed7(0);
    public static final ed7 c = new ed7(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ed7(int i) {
        this.a = i;
    }

    @Override // defpackage.ly1
    public final boolean a(if7 if7Var) {
        tjd tjdVarS;
        switch (this.a) {
            case 0:
                xrf xrfVar = (xrf) if7Var.G().get(1);
                eu4 eu4Var = pob.c;
                xrfVar.getClass();
                int i = qz3.a;
                w09 w09VarC = oz3.c(xrfVar);
                w09VarC.getClass();
                eu4Var.getClass();
                u09 u09VarP = od4.p(w09VarC, syd.R);
                if (u09VarP == null) {
                    tjdVarS = null;
                } else {
                    e7f.b.getClass();
                    e7f e7fVar = e7f.c;
                    List parameters = u09VarP.h().getParameters();
                    parameters.getClass();
                    Object objX0 = s72.X0(parameters);
                    objX0.getClass();
                    tjdVarS = rxg.S(e7fVar, u09VarP, t72.H(new dzd((c8f) objX0)));
                }
                if (tjdVarS == null) {
                    return false;
                }
                tt7 type = xrfVar.getType();
                type.getClass();
                return o7c.u(tjdVarS, w8f.h(type, false));
            default:
                List<xrf> listG = if7Var.G();
                listG.getClass();
                if (!listG.isEmpty()) {
                    for (xrf xrfVar2 : listG) {
                        xrfVar2.getClass();
                        if (qz3.a(xrfVar2) || xrfVar2.y != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // defpackage.ly1
    public final /* bridge */ String b(if7 if7Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return b21.E(this, if7Var);
    }

    @Override // defpackage.ly1
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
